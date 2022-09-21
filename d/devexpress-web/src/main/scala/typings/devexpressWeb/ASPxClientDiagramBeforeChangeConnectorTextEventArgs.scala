package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about the processed connector.
  */
trait ASPxClientDiagramBeforeChangeConnectorTextEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * The processed connector.
    */
  var connector: DiagramConnector
  
  /**
    * The index of the processed text in the connector's texts collection.
    */
  var index: Double
}
object ASPxClientDiagramBeforeChangeConnectorTextEventArgs {
  
  inline def apply(connector: DiagramConnector, index: Double): ASPxClientDiagramBeforeChangeConnectorTextEventArgs = {
    val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDiagramBeforeChangeConnectorTextEventArgs]
  }
  
  extension [Self <: ASPxClientDiagramBeforeChangeConnectorTextEventArgs](x: Self) {
    
    inline def setConnector(value: DiagramConnector): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
