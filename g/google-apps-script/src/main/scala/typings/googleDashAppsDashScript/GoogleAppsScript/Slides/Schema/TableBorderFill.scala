package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableBorderFill extends js.Object {
  var solidFill: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.SolidFill] = js.undefined
}

object TableBorderFill {
  @scala.inline
  def apply(solidFill: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.SolidFill = null): TableBorderFill = {
    val __obj = js.Dynamic.literal()
    if (solidFill != null) __obj.updateDynamic("solidFill")(solidFill)
    __obj.asInstanceOf[TableBorderFill]
  }
}

