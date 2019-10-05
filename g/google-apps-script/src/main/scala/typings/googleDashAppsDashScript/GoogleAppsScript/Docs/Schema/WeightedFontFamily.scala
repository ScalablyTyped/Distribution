package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeightedFontFamily extends js.Object {
  var fontFamily: js.UndefOr[String] = js.undefined
  var weight: js.UndefOr[Double] = js.undefined
}

object WeightedFontFamily {
  @scala.inline
  def apply(fontFamily: String = null, weight: Int | Double = null): WeightedFontFamily = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightedFontFamily]
  }
}

