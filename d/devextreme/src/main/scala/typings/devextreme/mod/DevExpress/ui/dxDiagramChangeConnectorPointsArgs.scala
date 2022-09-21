package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.Y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxDiagramChangeConnectorPointsArgs extends StObject {
  
  /**
    * The processed connector.
    */
  var connector: js.UndefOr[dxDiagramConnector] = js.undefined
  
  /**
    * The array of new connection points.
    */
  var newPoints: js.UndefOr[js.Array[Y]] = js.undefined
  
  /**
    * The array of previous connection points.
    */
  var oldPoints: js.UndefOr[js.Array[Y]] = js.undefined
}
object dxDiagramChangeConnectorPointsArgs {
  
  inline def apply(): dxDiagramChangeConnectorPointsArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramChangeConnectorPointsArgs]
  }
  
  extension [Self <: dxDiagramChangeConnectorPointsArgs](x: Self) {
    
    inline def setConnector(value: dxDiagramConnector): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
    
    inline def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
    
    inline def setNewPoints(value: js.Array[Y]): Self = StObject.set(x, "newPoints", value.asInstanceOf[js.Any])
    
    inline def setNewPointsUndefined: Self = StObject.set(x, "newPoints", js.undefined)
    
    inline def setNewPointsVarargs(value: Y*): Self = StObject.set(x, "newPoints", js.Array(value*))
    
    inline def setOldPoints(value: js.Array[Y]): Self = StObject.set(x, "oldPoints", value.asInstanceOf[js.Any])
    
    inline def setOldPointsUndefined: Self = StObject.set(x, "oldPoints", js.undefined)
    
    inline def setOldPointsVarargs(value: Y*): Self = StObject.set(x, "oldPoints", js.Array(value*))
  }
}
