package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about the processed connector.
  */
trait ASPxClientDiagramChangeConnectorPointsEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * The processed connector.
    */
  var connector: DiagramConnector
  
  /**
    * The array of new connector points.
    */
  var newPoints: js.Array[Any]
  
  /**
    * The array of previous connection points.
    */
  var oldPoints: js.Array[Any]
}
object ASPxClientDiagramChangeConnectorPointsEventArgs {
  
  inline def apply(connector: DiagramConnector, newPoints: js.Array[Any], oldPoints: js.Array[Any]): ASPxClientDiagramChangeConnectorPointsEventArgs = {
    val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any], newPoints = newPoints.asInstanceOf[js.Any], oldPoints = oldPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDiagramChangeConnectorPointsEventArgs]
  }
  
  extension [Self <: ASPxClientDiagramChangeConnectorPointsEventArgs](x: Self) {
    
    inline def setConnector(value: DiagramConnector): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
    
    inline def setNewPoints(value: js.Array[Any]): Self = StObject.set(x, "newPoints", value.asInstanceOf[js.Any])
    
    inline def setNewPointsVarargs(value: Any*): Self = StObject.set(x, "newPoints", js.Array(value*))
    
    inline def setOldPoints(value: js.Array[Any]): Self = StObject.set(x, "oldPoints", value.asInstanceOf[js.Any])
    
    inline def setOldPointsVarargs(value: Any*): Self = StObject.set(x, "oldPoints", js.Array(value*))
  }
}
