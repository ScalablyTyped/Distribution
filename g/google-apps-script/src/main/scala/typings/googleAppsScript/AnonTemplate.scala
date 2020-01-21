package typings.googleAppsScript

import typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Sheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTemplate extends js.Object {
  var template: js.UndefOr[Sheet] = js.undefined
}

object AnonTemplate {
  @scala.inline
  def apply(template: Sheet = null): AnonTemplate = {
    val __obj = js.Dynamic.literal()
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTemplate]
  }
}

