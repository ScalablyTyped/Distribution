package typings.fileType.coreMod

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("file-type/core", "fromStream")
@js.native
object fromStream extends js.Object {
  
  /**
  	Detect the file type of a Node.js [readable stream](https://nodejs.org/api/stream.html#stream_class_stream_readable).
  	The file type is detected by checking the [magic number](https://en.wikipedia.org/wiki/Magic_number_(programming)#Magic_numbers_in_files) of the buffer.
  	@param stream - A readable stream representing file data.
  	@returns The detected file type and MIME type, or `undefined` when there is no match.
  	*/
  def apply(stream: Readable): js.Promise[js.UndefOr[FileTypeResult]] = js.native
}
