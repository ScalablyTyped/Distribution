package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiasettingsRequestGmbAccessResponse extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object LiasettingsRequestGmbAccessResponse {
  @scala.inline
  def apply(kind: java.lang.String = null): LiasettingsRequestGmbAccessResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[LiasettingsRequestGmbAccessResponse]
  }
}

