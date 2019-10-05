package typings.googleDashAppsDashScript

import typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Sheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Template extends js.Object {
  var template: js.UndefOr[Sheet] = js.undefined
}

object Anon_Template {
  @scala.inline
  def apply(template: Sheet = null): Anon_Template = {
    val __obj = js.Dynamic.literal()
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[Anon_Template]
  }
}

