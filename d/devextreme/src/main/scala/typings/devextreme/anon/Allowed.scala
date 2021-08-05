package typings.devextreme.anon

import typings.devextreme.devextremeStrings.addShape
import typings.devextreme.devextremeStrings.addShapeFromToolbox
import typings.devextreme.devextremeStrings.beforeChangeConnectorText
import typings.devextreme.devextremeStrings.beforeChangeShapeText
import typings.devextreme.devextremeStrings.changeConnection
import typings.devextreme.devextremeStrings.changeConnectorPoints
import typings.devextreme.devextremeStrings.changeConnectorText
import typings.devextreme.devextremeStrings.changeShapeText
import typings.devextreme.devextremeStrings.deleteConnector
import typings.devextreme.devextremeStrings.deleteShape
import typings.devextreme.devextremeStrings.moveShape
import typings.devextreme.devextremeStrings.resizeShape
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxDiagram
import typings.devextreme.mod.DevExpress.ui.dxDiagramAddShapeArgs
import typings.devextreme.mod.DevExpress.ui.dxDiagramAddShapeFromToolboxArgs
import typings.devextreme.mod.DevExpress.ui.dxDiagramBeforeChangeConnectorTextArgs
import typings.devextreme.mod.DevExpress.ui.dxDiagramBeforeChangeShapeTextArgs
import typings.devextreme.mod.DevExpress.ui.dxDiagramChangeConnectionArgs
import typings.devextreme.mod.DevExpress.ui.dxDiagramChangeConnectorPointsArgs
import typings.devextreme.mod.DevExpress.ui.dxDiagramChangeConnectorTextArgs
import typings.devextreme.mod.DevExpress.ui.dxDiagramChangeShapeTextArgs
import typings.devextreme.mod.DevExpress.ui.dxDiagramDeleteConnectorArgs
import typings.devextreme.mod.DevExpress.ui.dxDiagramDeleteShapeArgs
import typings.devextreme.mod.DevExpress.ui.dxDiagramMoveShapeArgs
import typings.devextreme.mod.DevExpress.ui.dxDiagramResizeShapeArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Allowed extends StObject {
  
  var allowed: js.UndefOr[Boolean] = js.undefined
  
  var args: js.UndefOr[
    dxDiagramAddShapeArgs | dxDiagramAddShapeFromToolboxArgs | dxDiagramDeleteShapeArgs | dxDiagramDeleteConnectorArgs | dxDiagramChangeConnectionArgs | dxDiagramChangeConnectorPointsArgs | dxDiagramBeforeChangeShapeTextArgs | dxDiagramChangeShapeTextArgs | dxDiagramBeforeChangeConnectorTextArgs | dxDiagramChangeConnectorTextArgs | dxDiagramResizeShapeArgs | dxDiagramMoveShapeArgs
  ] = js.undefined
  
  var component: js.UndefOr[dxDiagram] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var operation: js.UndefOr[
    addShape | addShapeFromToolbox | deleteShape | deleteConnector | changeConnection | changeConnectorPoints | beforeChangeShapeText | changeShapeText | beforeChangeConnectorText | changeConnectorText | resizeShape | moveShape
  ] = js.undefined
  
  var updateUI: js.UndefOr[Boolean] = js.undefined
}
object Allowed {
  
  inline def apply(): Allowed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Allowed]
  }
  
  extension [Self <: Allowed](x: Self) {
    
    inline def setAllowed(value: Boolean): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
    
    inline def setAllowedUndefined: Self = StObject.set(x, "allowed", js.undefined)
    
    inline def setArgs(
      value: dxDiagramAddShapeArgs | dxDiagramAddShapeFromToolboxArgs | dxDiagramDeleteShapeArgs | dxDiagramDeleteConnectorArgs | dxDiagramChangeConnectionArgs | dxDiagramChangeConnectorPointsArgs | dxDiagramBeforeChangeShapeTextArgs | dxDiagramChangeShapeTextArgs | dxDiagramBeforeChangeConnectorTextArgs | dxDiagramChangeConnectorTextArgs | dxDiagramResizeShapeArgs | dxDiagramMoveShapeArgs
    ): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setComponent(value: dxDiagram): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setOperation(
      value: addShape | addShapeFromToolbox | deleteShape | deleteConnector | changeConnection | changeConnectorPoints | beforeChangeShapeText | changeShapeText | beforeChangeConnectorText | changeConnectorText | resizeShape | moveShape
    ): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setUpdateUI(value: Boolean): Self = StObject.set(x, "updateUI", value.asInstanceOf[js.Any])
    
    inline def setUpdateUIUndefined: Self = StObject.set(x, "updateUI", js.undefined)
  }
}
