package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  var code: js.UndefOr[Double] = js.undefined
  var errors: js.UndefOr[js.Array[Error]] = js.undefined
  var message: js.UndefOr[String] = js.undefined
}

object Errors {
  @scala.inline
  def apply(code: Int | Double = null, errors: js.Array[Error] = null, message: String = null): Errors = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Errors]
  }
}

