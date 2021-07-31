package typings.fileType

import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.std.ArrayBuffer
import typings.std.Set
import typings.std.Uint8Array
import typings.strtok3.typesMod.ITokenizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("file-type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Supported file extensions.
  	*/
  @JSImport("file-type", "extensions")
  @js.native
  val extensions: Set[typings.fileType.coreMod.FileExtension] = js.native
  
  /**
  	Detect the file type of a `Buffer`, `Uint8Array`, or `ArrayBuffer`.
  	The file type is detected by checking the [magic number](https://en.wikipedia.org/wiki/Magic_number_(programming)#Magic_numbers_in_files) of the buffer.
  	If file access is available, it is recommended to use `.fromFile()` instead.
  	@param buffer - A buffer representing file data. It works best if the buffer contains the entire file, it may work with a smaller portion as well.
  	@returns The detected file type and MIME type, or `undefined` when there is no match.
  	*/
  @scala.inline
  def fromBuffer(buffer: Buffer): js.Promise[js.UndefOr[typings.fileType.coreMod.FileTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[typings.fileType.coreMod.FileTypeResult]]]
  @scala.inline
  def fromBuffer(buffer: ArrayBuffer): js.Promise[js.UndefOr[typings.fileType.coreMod.FileTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[typings.fileType.coreMod.FileTypeResult]]]
  @scala.inline
  def fromBuffer(buffer: Uint8Array): js.Promise[js.UndefOr[typings.fileType.coreMod.FileTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[typings.fileType.coreMod.FileTypeResult]]]
  
  @scala.inline
  def fromFile(path: String): js.Promise[js.UndefOr[typings.fileType.coreMod.FileTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[typings.fileType.coreMod.FileTypeResult]]]
  
  /**
  	Detect the file type of a Node.js [readable stream](https://nodejs.org/api/stream.html#stream_class_stream_readable).
  	The file type is detected by checking the [magic number](https://en.wikipedia.org/wiki/Magic_number_(programming)#Magic_numbers_in_files) of the buffer.
  	@param stream - A readable stream representing file data.
  	@returns The detected file type and MIME type, or `undefined` when there is no match.
  	*/
  @scala.inline
  def fromStream(stream: Readable): js.Promise[js.UndefOr[typings.fileType.coreMod.FileTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStream")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[typings.fileType.coreMod.FileTypeResult]]]
  
  /**
  	Detect the file type from an [`ITokenizer`](https://github.com/Borewit/strtok3#tokenizer) source.
  	This method is used internally, but can also be used for a special "tokenizer" reader.
  	A tokenizer propagates the internal read functions, allowing alternative transport mechanisms, to access files, to be implemented and used.
  	An example is [`@tokenizer/http`](https://github.com/Borewit/tokenizer-http), which requests data using [HTTP-range-requests](https://developer.mozilla.org/en-US/docs/Web/HTTP/Range_requests). A difference with a conventional stream and the [*tokenizer*](https://github.com/Borewit/strtok3#tokenizer), is that it is able to *ignore* (seek, fast-forward) in the stream. For example, you may only need and read the first 6 bytes, and the last 128 bytes, which may be an advantage in case reading the entire file would take longer.
  	```
  	import {makeTokenizer} = require('@tokenizer/http');
  	import FileType = require('file-type');
  	const audioTrackUrl = 'https://test-audio.netlify.com/Various%20Artists%20-%202009%20-%20netBloc%20Vol%2024_%20tiuqottigeloot%20%5BMP3-V2%5D/01%20-%20Diablo%20Swing%20Orchestra%20-%20Heroines.mp3';
  	(async () => {
  		const httpTokenizer = await makeTokenizer(audioTrackUrl);
  		const fileType = await FileType.fromTokenizer(httpTokenizer);
  		console.log(fileType);
  		//=> {ext: 'mp3', mime: 'audio/mpeg'}
  	})();
  	```
  	@param tokenizer - File source implementing the tokenizer interface.
  	@returns The detected file type and MIME type, or `undefined` when there is no match.
  	*/
  @scala.inline
  def fromTokenizer(tokenizer: ITokenizer): js.Promise[js.UndefOr[typings.fileType.coreMod.FileTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTokenizer")(tokenizer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[typings.fileType.coreMod.FileTypeResult]]]
  
  /**
  	Supported MIME types.
  	*/
  @JSImport("file-type", "mimeTypes")
  @js.native
  val mimeTypes: js.Array[typings.fileType.coreMod.MimeType] = js.native
  
  /**
  	Detect the file type of a readable stream.
  	@param readableStream - A [readable stream](https://nodejs.org/api/stream.html#stream_class_stream_readable) containing a file to examine.
  	@returns A `Promise` which resolves to the original readable stream argument, but with an added `fileType` property, which is an object like the one returned from `FileType.fromFile()`.
  	@example
  	```
  	import * as fs from 'fs';
  	import * as crypto from 'crypto';
  	import fileType = require('file-type');
  	(async () => {
  		const read = fs.createReadStream('encrypted.enc');
  		const decipher = crypto.createDecipheriv(alg, key, iv);
  		const stream = await fileType.stream(read.pipe(decipher));
  		console.log(stream.fileType);
  		//=> {ext: 'mov', mime: 'video/quicktime'}
  		const write = fs.createWriteStream(`decrypted.${stream.fileType.ext}`);
  		stream.pipe(write);
  	})();
  	```
  	*/
  @scala.inline
  def stream(readableStream: Readable): js.Promise[typings.fileType.coreMod.ReadableStreamWithFileType] = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")(readableStream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.fileType.coreMod.ReadableStreamWithFileType]]
  
  type FileExtension = typings.fileType.coreMod.FileExtension
  
  type FileTypeResult = typings.fileType.coreMod.FileTypeResult
  
  type MimeType = typings.fileType.coreMod.MimeType
  
  type ReadableStreamWithFileType = typings.fileType.coreMod.ReadableStreamWithFileType
}
