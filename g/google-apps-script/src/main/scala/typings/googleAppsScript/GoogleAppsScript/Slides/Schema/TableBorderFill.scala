package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableBorderFill extends js.Object {
  var solidFill: js.UndefOr[SolidFill] = js.undefined
}

object TableBorderFill {
  @scala.inline
  def apply(solidFill: SolidFill = null): TableBorderFill = {
    val __obj = js.Dynamic.literal()
    if (solidFill != null) __obj.updateDynamic("solidFill")(solidFill.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBorderFill]
  }
}

