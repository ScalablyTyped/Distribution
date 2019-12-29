package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutlineFill extends js.Object {
  var solidFill: js.UndefOr[SolidFill] = js.undefined
}

object OutlineFill {
  @scala.inline
  def apply(solidFill: SolidFill = null): OutlineFill = {
    val __obj = js.Dynamic.literal()
    if (solidFill != null) __obj.updateDynamic("solidFill")(solidFill.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlineFill]
  }
}

