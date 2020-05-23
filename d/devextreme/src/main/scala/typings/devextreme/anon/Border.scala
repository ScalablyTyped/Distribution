package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Border extends js.Object {
  var border: js.UndefOr[ColorVisible] = js.undefined
  var hatching: js.UndefOr[Step] = js.undefined
}

object Border {
  @scala.inline
  def apply(border: ColorVisible = null, hatching: Step = null): Border = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (hatching != null) __obj.updateDynamic("hatching")(hatching.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
}

