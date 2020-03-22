package typings.devextreme

import typings.devextreme.devextremeStrings.bringToFront
import typings.devextreme.devextremeStrings.copy
import typings.devextreme.devextremeStrings.cut
import typings.devextreme.devextremeStrings.delete
import typings.devextreme.devextremeStrings.deleteShapeImage
import typings.devextreme.devextremeStrings.editShapeImage
import typings.devextreme.devextremeStrings.insertShapeImage
import typings.devextreme.devextremeStrings.lock
import typings.devextreme.devextremeStrings.paste
import typings.devextreme.devextremeStrings.selectAll
import typings.devextreme.devextremeStrings.sendToBack
import typings.devextreme.devextremeStrings.unlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommands extends js.Object {
  var commands: js.UndefOr[
    js.Array[
      cut | copy | paste | selectAll | delete | bringToFront | sendToBack | lock | unlock | insertShapeImage | editShapeImage | deleteShapeImage
    ]
  ] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object AnonCommands {
  @scala.inline
  def apply(
    commands: js.Array[
      cut | copy | paste | selectAll | delete | bringToFront | sendToBack | lock | unlock | insertShapeImage | editShapeImage | deleteShapeImage
    ] = null,
    enabled: js.UndefOr[Boolean] = js.undefined
  ): AnonCommands = {
    val __obj = js.Dynamic.literal()
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommands]
  }
}

