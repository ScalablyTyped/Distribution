package typings
package fileDashTypeLib.fileDashTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileTypeModule extends js.Object {
  /**
  	 * The minimum amount of bytes needed to detect a file type. Currently, it's 4100 bytes, but it can change, so don't hard-code it.
  	 */
  val minimumBytes: scala.Double = js.native
  def apply(buffer: nodeLib.Buffer): FileTypeResult | scala.Null = js.native
  def apply(buffer: stdLib.Uint8Array): FileTypeResult | scala.Null = js.native
  /**
  	 * Detect the file type of a readable stream.
  	 *
  	 * @param readableStream - A readable stream containing a file to examine, see: [`stream.Readable`](https://nodejs.org/api/stream.html#stream_class_stream_readable).
  	 * @returns A `Promise` which resolves to the original readable stream argument, but with an added `fileType` property, which is an object like the one returned from `fileType()`.
  	 */
  def stream(readableStream: nodeLib.streamMod.Readable): js.Promise[ReadableStreamWithFileType] = js.native
}

