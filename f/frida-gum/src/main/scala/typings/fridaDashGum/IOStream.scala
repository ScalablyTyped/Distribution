package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("IOStream")
@js.native
abstract class IOStream () extends js.Object {
  /**
    * The `InputStream` to read from.
    */
  var input: InputStream = js.native
  /**
    * The `OutputStream` to write to.
    */
  var output: OutputStream = js.native
  /**
    * Closes the stream, releasing resources related to it. This will also close the individual input and output
    * streams. Once the stream is closed, all other operations will fail. Closing a stream multiple times is allowed
    * and will not result in an error.
    */
  def close(): js.Promise[Unit] = js.native
}

