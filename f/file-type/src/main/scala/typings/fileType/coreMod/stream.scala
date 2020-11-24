package typings.fileType.coreMod

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("file-type/core", "stream")
@js.native
object stream extends js.Object {
  
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
  def apply(readableStream: Readable): js.Promise[ReadableStreamWithFileType] = js.native
}
