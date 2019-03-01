package typings
package gapiDotClientDotIdentitytoolkitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  /** The index of the malformed account, starting from 0. */
  var index: js.UndefOr[scala.Double] = js.undefined
  /** Detailed error message for the account info. */
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Index {
  @scala.inline
  def apply(index: scala.Int | scala.Double = null, message: java.lang.String = null): Anon_Index = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Anon_Index]
  }
}

