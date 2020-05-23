package typings.getStream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Maximum length of the returned string. If it exceeds this value before the stream ends, the promise will be rejected with a `MaxBufferError` error.
  		@default Infinity
  		*/
  val maxBuffer: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(maxBuffer: js.UndefOr[Double] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxBuffer)) __obj.updateDynamic("maxBuffer")(maxBuffer.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

