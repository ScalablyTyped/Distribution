package typings
package gapiDotClientDotAdminLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  /** Machine readable code / warning type. */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /** Key-Value pairs to give detailed information on the warning. */
  var data: js.UndefOr[js.Array[Anon_Key]] = js.undefined
  /** Human readable message for the warning. */
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Code {
  @scala.inline
  def apply(code: java.lang.String = null, data: js.Array[Anon_Key] = null, message: java.lang.String = null): Anon_Code = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (data != null) __obj.updateDynamic("data")(data)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Anon_Code]
  }
}

