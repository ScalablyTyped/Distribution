package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTextStyleRequest extends js.Object {
  var fields: js.UndefOr[java.lang.String] = js.undefined
  var range: js.UndefOr[Range] = js.undefined
  var textStyle: js.UndefOr[TextStyle] = js.undefined
}

object UpdateTextStyleRequest {
  @scala.inline
  def apply(fields: java.lang.String = null, range: Range = null, textStyle: TextStyle = null): UpdateTextStyleRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (range != null) __obj.updateDynamic("range")(range)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    __obj.asInstanceOf[UpdateTextStyleRequest]
  }
}

