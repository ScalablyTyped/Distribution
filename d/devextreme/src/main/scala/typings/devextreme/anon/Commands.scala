package typings.devextreme.anon

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
import typings.devextreme.devextremeStrings.exportJpg
import typings.devextreme.devextremeStrings.exportPng
import typings.devextreme.devextremeStrings.exportSvg
import typings.devextreme.devextremeStrings.fillColor
import typings.devextreme.devextremeStrings.fontColor
import typings.devextreme.devextremeStrings.fontName
import typings.devextreme.devextremeStrings.fontSize
import typings.devextreme.devextremeStrings.fullScreen
import typings.devextreme.devextremeStrings.gridSize
import typings.devextreme.devextremeStrings.insertShapeImage
import typings.devextreme.devextremeStrings.italic
import typings.devextreme.devextremeStrings.layoutLayeredBottomToTop
import typings.devextreme.devextremeStrings.layoutLayeredLeftToRight
import typings.devextreme.devextremeStrings.layoutLayeredRightToLeft
import typings.devextreme.devextremeStrings.layoutLayeredTopToBottom
import typings.devextreme.devextremeStrings.layoutTreeBottomToTop
import typings.devextreme.devextremeStrings.layoutTreeLeftToRight
import typings.devextreme.devextremeStrings.layoutTreeRightToLeft
import typings.devextreme.devextremeStrings.layoutTreeTopToBottom
import typings.devextreme.devextremeStrings.lineColor
import typings.devextreme.devextremeStrings.lock
import typings.devextreme.devextremeStrings.pageColor
import typings.devextreme.devextremeStrings.pageOrientation
import typings.devextreme.devextremeStrings.pageSize
import typings.devextreme.devextremeStrings.paste
import typings.devextreme.devextremeStrings.redo
import typings.devextreme.devextremeStrings.selectAll
import typings.devextreme.devextremeStrings.sendToBack
import typings.devextreme.devextremeStrings.separator
import typings.devextreme.devextremeStrings.showGrid
import typings.devextreme.devextremeStrings.snapToGrid
import typings.devextreme.devextremeStrings.textAlignCenter
import typings.devextreme.devextremeStrings.textAlignLeft
import typings.devextreme.devextremeStrings.textAlignRight
import typings.devextreme.devextremeStrings.underline
import typings.devextreme.devextremeStrings.undo
import typings.devextreme.devextremeStrings.units
import typings.devextreme.devextremeStrings.unlock
import typings.devextreme.devextremeStrings.zoomLevel
import typings.devextreme.mod.DevExpress.ui.dxDiagramCustomCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commands extends StObject {
  
  var commands: js.UndefOr[
    js.Array[
      separator | exportSvg | exportPng | exportJpg | undo | redo | cut | copy | paste | selectAll | delete | fontName | fontSize | bold | italic | underline | fontColor | lineColor | fillColor | textAlignLeft | textAlignCenter | textAlignRight | lock | unlock | sendToBack | bringToFront | insertShapeImage | editShapeImage | deleteShapeImage | connectorLineType | connectorLineStart | connectorLineEnd | layoutTreeTopToBottom | layoutTreeBottomToTop | layoutTreeLeftToRight | layoutTreeRightToLeft | layoutLayeredTopToBottom | layoutLayeredBottomToTop | layoutLayeredLeftToRight | layoutLayeredRightToLeft | fullScreen | zoomLevel | showGrid | snapToGrid | gridSize | units | pageSize | pageOrientation | pageColor | dxDiagramCustomCommand
    ]
  ] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object Commands {
  
  inline def apply(): Commands = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Commands]
  }
  
  extension [Self <: Commands](x: Self) {
    
    inline def setCommands(
      value: js.Array[
          separator | exportSvg | exportPng | exportJpg | undo | redo | cut | copy | paste | selectAll | delete | fontName | fontSize | bold | italic | underline | fontColor | lineColor | fillColor | textAlignLeft | textAlignCenter | textAlignRight | lock | unlock | sendToBack | bringToFront | insertShapeImage | editShapeImage | deleteShapeImage | connectorLineType | connectorLineStart | connectorLineEnd | layoutTreeTopToBottom | layoutTreeBottomToTop | layoutTreeLeftToRight | layoutTreeRightToLeft | layoutLayeredTopToBottom | layoutLayeredBottomToTop | layoutLayeredLeftToRight | layoutLayeredRightToLeft | fullScreen | zoomLevel | showGrid | snapToGrid | gridSize | units | pageSize | pageOrientation | pageColor | dxDiagramCustomCommand
        ]
    ): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    
    inline def setCommandsVarargs(
      value: (separator | exportSvg | exportPng | exportJpg | undo | redo | cut | copy | paste | selectAll | delete | fontName | fontSize | bold | italic | underline | fontColor | lineColor | fillColor | textAlignLeft | textAlignCenter | textAlignRight | lock | unlock | sendToBack | bringToFront | insertShapeImage | editShapeImage | deleteShapeImage | connectorLineType | connectorLineStart | connectorLineEnd | layoutTreeTopToBottom | layoutTreeBottomToTop | layoutTreeLeftToRight | layoutTreeRightToLeft | layoutLayeredTopToBottom | layoutLayeredBottomToTop | layoutLayeredLeftToRight | layoutLayeredRightToLeft | fullScreen | zoomLevel | showGrid | snapToGrid | gridSize | units | pageSize | pageOrientation | pageColor | dxDiagramCustomCommand)*
    ): Self = StObject.set(x, "commands", js.Array(value :_*))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
