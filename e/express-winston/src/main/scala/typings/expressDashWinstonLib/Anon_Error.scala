package typings
package expressDashWinstonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: js.UndefOr[java.lang.String] = js.undefined
  var success: js.UndefOr[java.lang.String] = js.undefined
  var warn: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Error {
  @scala.inline
  def apply(error: java.lang.String = null, success: java.lang.String = null, warn: java.lang.String = null): Anon_Error = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (success != null) __obj.updateDynamic("success")(success)
    if (warn != null) __obj.updateDynamic("warn")(warn)
    __obj.asInstanceOf[Anon_Error]
  }
}

