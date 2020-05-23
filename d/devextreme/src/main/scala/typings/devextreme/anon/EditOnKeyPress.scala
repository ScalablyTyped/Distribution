package typings.devextreme.anon

import typings.devextreme.devextremeStrings.column
import typings.devextreme.devextremeStrings.moveFocus
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.row
import typings.devextreme.devextremeStrings.startEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditOnKeyPress extends js.Object {
  var editOnKeyPress: js.UndefOr[Boolean] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var enterKeyAction: js.UndefOr[startEdit | moveFocus] = js.undefined
  var enterKeyDirection: js.UndefOr[none | column | row] = js.undefined
}

object EditOnKeyPress {
  @scala.inline
  def apply(
    editOnKeyPress: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    enterKeyAction: startEdit | moveFocus = null,
    enterKeyDirection: none | column | row = null
  ): EditOnKeyPress = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(editOnKeyPress)) __obj.updateDynamic("editOnKeyPress")(editOnKeyPress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (enterKeyAction != null) __obj.updateDynamic("enterKeyAction")(enterKeyAction.asInstanceOf[js.Any])
    if (enterKeyDirection != null) __obj.updateDynamic("enterKeyDirection")(enterKeyDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditOnKeyPress]
  }
}

