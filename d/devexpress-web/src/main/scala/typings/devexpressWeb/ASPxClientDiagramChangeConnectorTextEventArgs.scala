package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about the processed connector.
  */
trait ASPxClientDiagramChangeConnectorTextEventArgs
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
  
  /**
    * The new connector text.
    */
  var text: String
}
object ASPxClientDiagramChangeConnectorTextEventArgs {
  
  inline def apply(connector: DiagramConnector, index: Double, text: String): ASPxClientDiagramChangeConnectorTextEventArgs = {
    val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDiagramChangeConnectorTextEventArgs]
  }
  
  extension [Self <: ASPxClientDiagramChangeConnectorTextEventArgs](x: Self) {
    
    inline def setConnector(value: DiagramConnector): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
