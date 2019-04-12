package typings
package fileDashTypeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BufferDefault extends js.Object {
  // TODO: Remove this for the next major release
  @JSName("default")
  val default_Original: Anon_Buffer = js.native
  /**
  	The minimum amount of bytes needed to detect a file type. Currently, it's 4100 bytes, but it can change, so don't hard-code it.
  	*/
  val minimumBytes: scala.Double = js.native
  /**
  	Detect the file type of a `Buffer`/`Uint8Array`/`ArrayBuffer`. The file type is detected by checking the [magic number](https://en.wikipedia.org/wiki/Magic_number_(programming)#Magic_numbers_in_files) of the buffer.
  	@param buffer - It only needs the first `.minimumBytes` bytes. The exception is detection of `docx`, `pptx`, and `xlsx` which potentially requires reading the whole file.
  	@returns An object with the detected file type and MIME type or `null` when there was no match.
  	@example
  	```
  	import readChunk = require('read-chunk');
  	import fileType = require('file-type');
  	const buffer = readChunk.sync('unicorn.png', 0, fileType.minimumBytes);
  	fileType(buffer);
  	//=> {ext: 'png', mime: 'image/png'}
  	// Or from a remote location:
  	import * as http from 'http';
  	const url = 'https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif';
  	http.get(url, response => {
  		response.on('readable', () => {
  			const chunk = response.read(fileType.minimumBytes);
  			response.destroy();
  			console.log(fileType(chunk));
  			//=> {ext: 'gif', mime: 'image/gif'}
  		});
  	});
  	```
  	*/
  def apply(buffer: nodeLib.Buffer): fileDashTypeLib.fileDashTypeMod.fileTypeNs.FileTypeResult | scala.Null = js.native
  def apply(buffer: stdLib.ArrayBuffer): fileDashTypeLib.fileDashTypeMod.fileTypeNs.FileTypeResult | scala.Null = js.native
  def apply(buffer: stdLib.Uint8Array): fileDashTypeLib.fileDashTypeMod.fileTypeNs.FileTypeResult | scala.Null = js.native
  /**
  	Detect the file type of a `Buffer`/`Uint8Array`/`ArrayBuffer`. The file type is detected by checking the [magic number](https://en.wikipedia.org/wiki/Magic_number_(programming)#Magic_numbers_in_files) of the buffer.
  	@param buffer - It only needs the first `.minimumBytes` bytes. The exception is detection of `docx`, `pptx`, and `xlsx` which potentially requires reading the whole file.
  	@returns An object with the detected file type and MIME type or `null` when there was no match.
  	@example
  	```
  	import readChunk = require('read-chunk');
  	import fileType = require('file-type');
  	const buffer = readChunk.sync('unicorn.png', 0, fileType.minimumBytes);
  	fileType(buffer);
  	//=> {ext: 'png', mime: 'image/png'}
  	// Or from a remote location:
  	import * as http from 'http';
  	const url = 'https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif';
  	http.get(url, response => {
  		response.on('readable', () => {
  			const chunk = response.read(fileType.minimumBytes);
  			response.destroy();
  			console.log(fileType(chunk));
  			//=> {ext: 'gif', mime: 'image/gif'}
  		});
  	});
  	```
  	*/
  // TODO: Remove this for the next major release
  def default(buffer: nodeLib.Buffer): fileDashTypeLib.fileDashTypeMod.fileTypeNs.FileTypeResult | scala.Null = js.native
  def default(buffer: stdLib.ArrayBuffer): fileDashTypeLib.fileDashTypeMod.fileTypeNs.FileTypeResult | scala.Null = js.native
  def default(buffer: stdLib.Uint8Array): fileDashTypeLib.fileDashTypeMod.fileTypeNs.FileTypeResult | scala.Null = js.native
  /**
  	Detect the file type of a readable stream.
  	@param readableStream - A readable stream containing a file to examine, see: [`stream.Readable`](https://nodejs.org/api/stream.html#stream_class_stream_readable).
  	@returns A `Promise` which resolves to the original readable stream argument, but with an added `fileType` property, which is an object like the one returned from `fileType()`.
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
  def stream(readableStream: nodeLib.streamMod.Readable): js.Promise[fileDashTypeLib.fileDashTypeMod.fileTypeNs.ReadableStreamWithFileType] = js.native
}

