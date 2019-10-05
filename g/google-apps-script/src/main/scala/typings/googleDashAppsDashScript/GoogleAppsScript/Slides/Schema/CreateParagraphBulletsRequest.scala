package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateParagraphBulletsRequest extends js.Object {
  var bulletPreset: js.UndefOr[String] = js.undefined
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
  var textRange: js.UndefOr[Range] = js.undefined
}

object CreateParagraphBulletsRequest {
  @scala.inline
  def apply(
    bulletPreset: String = null,
    cellLocation: TableCellLocation = null,
    objectId: String = null,
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

