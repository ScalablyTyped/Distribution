package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableBorderProperties extends js.Object {
  var dashStyle: js.UndefOr[String] = js.undefined
  var tableBorderFill: js.UndefOr[TableBorderFill] = js.undefined
  var weight: js.UndefOr[Dimension] = js.undefined
}

object TableBorderProperties {
  @scala.inline
  def apply(dashStyle: String = null, tableBorderFill: TableBorderFill = null, weight: Dimension = null): TableBorderProperties = {
    val __obj = js.Dynamic.literal()
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (tableBorderFill != null) __obj.updateDynamic("tableBorderFill")(tableBorderFill.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBorderProperties]
  }
}

