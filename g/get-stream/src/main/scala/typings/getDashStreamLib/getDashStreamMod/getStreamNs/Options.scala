package typings
package getDashStreamLib.getDashStreamMod.getStreamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Maximum length of the returned string. If it exceeds this value before the stream ends, the promise will be rejected with a `MaxBufferError` error.
  		@default Infinity
  		*/
  val maxBuffer: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(maxBuffer: scala.Int | scala.Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (maxBuffer != null) __obj.updateDynamic("maxBuffer")(maxBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

