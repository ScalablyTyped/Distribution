package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Title extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var weightIn: js.UndefOr[Double] = js.undefined
  var weightOut: js.UndefOr[Double] = js.undefined
}

object Title {
  @scala.inline
  def apply(
    label: String = null,
    title: String = null,
    weightIn: js.UndefOr[Double] = js.undefined,
    weightOut: js.UndefOr[Double] = js.undefined
  ): Title = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(weightIn)) __obj.updateDynamic("weightIn")(weightIn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weightOut)) __obj.updateDynamic("weightOut")(weightOut.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
}

