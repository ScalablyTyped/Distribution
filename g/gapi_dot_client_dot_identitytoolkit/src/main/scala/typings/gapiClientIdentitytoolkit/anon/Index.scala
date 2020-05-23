package typings.gapiClientIdentitytoolkit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  /** The index of the malformed account, starting from 0. */
  var index: js.UndefOr[Double] = js.undefined
  /** Detailed error message for the account info. */
  var message: js.UndefOr[String] = js.undefined
}

object Index {
  @scala.inline
  def apply(index: js.UndefOr[Double] = js.undefined, message: String = null): Index = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
}

