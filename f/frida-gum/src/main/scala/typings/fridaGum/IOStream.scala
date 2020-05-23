package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOStream extends js.Object {
  /**
    * The `InputStream` to read from.
    */
  var input: InputStream
  /**
    * The `OutputStream` to write to.
    */
  var output: OutputStream
  /**
    * Closes the stream, releasing resources related to it. This will also close the individual input and output
    * streams. Once the stream is closed, all other operations will fail. Closing a stream multiple times is allowed
    * and will not result in an error.
    */
  def close(): js.Promise[Unit]
}

object IOStream {
  @scala.inline
  def apply(close: () => js.Promise[Unit], input: InputStream, output: OutputStream): IOStream = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOStream]
  }
}

