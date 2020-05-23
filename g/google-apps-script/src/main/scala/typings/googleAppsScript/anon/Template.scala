package typings.googleAppsScript.anon

import typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Sheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  var template: js.UndefOr[Sheet] = js.undefined
}

object Template {
  @scala.inline
  def apply(template: Sheet = null): Template = {
    val __obj = js.Dynamic.literal()
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
}

