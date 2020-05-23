package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hatching extends js.Object {
  var border: js.UndefOr[ColorDashStyle] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var hatching: js.UndefOr[Step] = js.undefined
}

object Hatching {
  @scala.inline
  def apply(border: ColorDashStyle = null, color: String = null, hatching: Step = null): Hatching = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (hatching != null) __obj.updateDynamic("hatching")(hatching.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hatching]
  }
}

