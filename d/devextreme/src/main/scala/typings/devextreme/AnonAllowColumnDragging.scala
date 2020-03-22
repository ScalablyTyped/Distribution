package typings.devextreme

import typings.devextreme.devextremeStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowColumnDragging extends js.Object {
  var allowColumnDragging: js.UndefOr[Boolean] = js.undefined
  var emptyPanelText: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean | auto] = js.undefined
}

object AnonAllowColumnDragging {
  @scala.inline
  def apply(
    allowColumnDragging: js.UndefOr[Boolean] = js.undefined,
    emptyPanelText: String = null,
    visible: Boolean | auto = null
  ): AnonAllowColumnDragging = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowColumnDragging)) __obj.updateDynamic("allowColumnDragging")(allowColumnDragging.asInstanceOf[js.Any])
    if (emptyPanelText != null) __obj.updateDynamic("emptyPanelText")(emptyPanelText.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowColumnDragging]
  }
}

