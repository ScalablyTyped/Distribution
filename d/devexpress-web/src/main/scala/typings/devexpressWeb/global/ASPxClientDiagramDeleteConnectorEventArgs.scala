package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about the processed connector.
  */
@JSGlobal("ASPxClientDiagramDeleteConnectorEventArgs")
@js.native
open class ASPxClientDiagramDeleteConnectorEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDiagramDeleteConnectorEventArgs {
  /**
    * Initializes a new instance of the ASPxClientDiagramDeleteConnectorEventArgs class with specified settings.
    * @param connector The connector object.
    */
  def this(connector: typings.devexpressWeb.DiagramConnector) = this()
  
  /**
    * The processed connector.
    */
  /* CompleteClass */
  var connector: typings.devexpressWeb.DiagramConnector = js.native
}
