package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about the processed connector.
  */
trait ASPxClientDiagramDeleteConnectorEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * The processed connector.
    */
  var connector: DiagramConnector
}
object ASPxClientDiagramDeleteConnectorEventArgs {
  
  inline def apply(connector: DiagramConnector): ASPxClientDiagramDeleteConnectorEventArgs = {
    val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDiagramDeleteConnectorEventArgs]
  }
  
  extension [Self <: ASPxClientDiagramDeleteConnectorEventArgs](x: Self) {
    
    inline def setConnector(value: DiagramConnector): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
  }
}
