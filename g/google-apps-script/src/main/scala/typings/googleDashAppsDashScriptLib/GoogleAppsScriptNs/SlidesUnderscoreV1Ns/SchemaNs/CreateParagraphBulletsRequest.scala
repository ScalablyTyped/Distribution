package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateParagraphBulletsRequest extends js.Object {
  var bulletPreset: js.UndefOr[java.lang.String] = js.undefined
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  var textRange: js.UndefOr[Range] = js.undefined
}

object CreateParagraphBulletsRequest {
  @scala.inline
  def apply(
    bulletPreset: java.lang.String = null,
    cellLocation: TableCellLocation = null,
    objectId: java.lang.String = null,
    textRange: Range = null
  ): CreateParagraphBulletsRequest = {
    val __obj = js.Dynamic.literal()
    if (bulletPreset != null) __obj.updateDynamic("bulletPreset")(bulletPreset)
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (textRange != null) __obj.updateDynamic("textRange")(textRange)
    __obj.asInstanceOf[CreateParagraphBulletsRequest]
  }
}

