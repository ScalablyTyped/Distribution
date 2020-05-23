package typings.devextreme.anon

import typings.devextreme.devextremeStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowColumnDragging extends js.Object {
  var allowColumnDragging: js.UndefOr[Boolean] = js.undefined
  var emptyPanelText: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean | auto] = js.undefined
}

object AllowColumnDragging {
  @scala.inline
  def apply(
    allowColumnDragging: js.UndefOr[Boolean] = js.undefined,
    emptyPanelText: String = null,
    visible: Boolean | auto = null
  ): AllowColumnDragging = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowColumnDragging)) __obj.updateDynamic("allowColumnDragging")(allowColumnDragging.get.asInstanceOf[js.Any])
    if (emptyPanelText != null) __obj.updateDynamic("emptyPanelText")(emptyPanelText.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowColumnDragging]
  }
}

