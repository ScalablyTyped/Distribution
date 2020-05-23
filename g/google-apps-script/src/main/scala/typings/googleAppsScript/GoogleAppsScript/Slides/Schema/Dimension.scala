package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimension extends js.Object {
  var magnitude: js.UndefOr[Double] = js.undefined
  var unit: js.UndefOr[String] = js.undefined
}

object Dimension {
  @scala.inline
  def apply(magnitude: js.UndefOr[Double] = js.undefined, unit: String = null): Dimension = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(magnitude)) __obj.updateDynamic("magnitude")(magnitude.get.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimension]
  }
}

