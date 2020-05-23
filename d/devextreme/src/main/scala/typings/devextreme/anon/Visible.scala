package typings.devextreme.anon

import typings.devextreme.devextremeStrings.autoLayout
import typings.devextreme.devextremeStrings.bold
import typings.devextreme.devextremeStrings.bringToFront
import typings.devextreme.devextremeStrings.connectorLineEnd
import typings.devextreme.devextremeStrings.connectorLineStart
import typings.devextreme.devextremeStrings.connectorLineType
import typings.devextreme.devextremeStrings.copy
import typings.devextreme.devextremeStrings.cut
import typings.devextreme.devextremeStrings.delete
import typings.devextreme.devextremeStrings.deleteShapeImage
import typings.devextreme.devextremeStrings.editShapeImage
import typings.devextreme.devextremeStrings.export
import typings.devextreme.devextremeStrings.fillColor
import typings.devextreme.devextremeStrings.fontColor
import typings.devextreme.devextremeStrings.fontName
import typings.devextreme.devextremeStrings.fontSize
import typings.devextreme.devextremeStrings.fullScreen
import typings.devextreme.devextremeStrings.insertShapeImage
import typings.devextreme.devextremeStrings.italic
import typings.devextreme.devextremeStrings.lineColor
import typings.devextreme.devextremeStrings.lock
import typings.devextreme.devextremeStrings.paste
import typings.devextreme.devextremeStrings.redo
import typings.devextreme.devextremeStrings.selectAll
import typings.devextreme.devextremeStrings.sendToBack
import typings.devextreme.devextremeStrings.separator
import typings.devextreme.devextremeStrings.textAlignCenter
import typings.devextreme.devextremeStrings.textAlignLeft
import typings.devextreme.devextremeStrings.textAlignRight
import typings.devextreme.devextremeStrings.underline
import typings.devextreme.devextremeStrings.undo
import typings.devextreme.devextremeStrings.unlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visible extends js.Object {
  var commands: js.UndefOr[
    js.Array[
      separator | export | undo | redo | cut | copy | paste | selectAll | delete | fontName | fontSize | bold | italic | underline | fontColor | lineColor | fillColor | textAlignLeft | textAlignCenter | textAlignRight | lock | unlock | sendToBack | bringToFront | insertShapeImage | editShapeImage | deleteShapeImage | connectorLineType | connectorLineStart | connectorLineEnd | autoLayout | fullScreen
    ]
  ] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Visible {
  @scala.inline
  def apply(
    commands: js.Array[
      separator | export | undo | redo | cut | copy | paste | selectAll | delete | fontName | fontSize | bold | italic | underline | fontColor | lineColor | fillColor | textAlignLeft | textAlignCenter | textAlignRight | lock | unlock | sendToBack | bringToFront | insertShapeImage | editShapeImage | deleteShapeImage | connectorLineType | connectorLineStart | connectorLineEnd | autoLayout | fullScreen
    ] = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Visible = {
    val __obj = js.Dynamic.literal()
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Visible]
  }
}

