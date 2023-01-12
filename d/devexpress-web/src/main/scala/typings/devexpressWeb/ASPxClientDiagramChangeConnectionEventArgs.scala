package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about the processed connection.
  */
trait ASPxClientDiagramChangeConnectionEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * The index of the processed point in the shape's connection point collection.
    */
  var connectionPointIndex: Double
  
  /**
    * The processed connector.
    */
  var connector: DiagramConnector
  
  /**
    * The new connected shape.
    */
  var newShape: DiagramShape
  
  /**
    * The previous connected shape.
    */
  var oldShape: DiagramShape
  
  /**
    * The position of the connector in the processed point.
    */
  var position: String
}
object ASPxClientDiagramChangeConnectionEventArgs {
  
  inline def apply(
    connectionPointIndex: Double,
    connector: DiagramConnector,
    newShape: DiagramShape,
    oldShape: DiagramShape,
    position: String
  ): ASPxClientDiagramChangeConnectionEventArgs = {
    val __obj = js.Dynamic.literal(connectionPointIndex = connectionPointIndex.asInstanceOf[js.Any], connector = connector.asInstanceOf[js.Any], newShape = newShape.asInstanceOf[js.Any], oldShape = oldShape.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDiagramChangeConnectionEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientDiagramChangeConnectionEventArgs] (val x: Self) extends AnyVal {
    
    inline def setConnectionPointIndex(value: Double): Self = StObject.set(x, "connectionPointIndex", value.asInstanceOf[js.Any])
    
    inline def setConnector(value: DiagramConnector): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
    
    inline def setNewShape(value: DiagramShape): Self = StObject.set(x, "newShape", value.asInstanceOf[js.Any])
    
    inline def setOldShape(value: DiagramShape): Self = StObject.set(x, "oldShape", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
