package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Status extends js.Object {
  var code: js.UndefOr[scala.Double] = js.undefined
  var details: js.UndefOr[js.Array[js.Object]] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object Status {
  @scala.inline
  def apply(
    code: scala.Int | scala.Double = null,
    details: js.Array[js.Object] = null,
    message: java.lang.String = null
  ): Status = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Status]
  }
}

