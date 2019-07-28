package typings.gapiDotClientDotIdentitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  /** The index of the malformed account, starting from 0. */
  var index: js.UndefOr[Double] = js.undefined
  /** Detailed error message for the account info. */
  var message: js.UndefOr[String] = js.undefined
}

object Anon_Index {
  @scala.inline
  def apply(index: Int | Double = null, message: String = null): Anon_Index = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Anon_Index]
  }
}

