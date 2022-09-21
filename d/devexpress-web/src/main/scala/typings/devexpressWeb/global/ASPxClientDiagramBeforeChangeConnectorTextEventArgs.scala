package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about the processed connector.
  */
@JSGlobal("ASPxClientDiagramBeforeChangeConnectorTextEventArgs")
@js.native
open class ASPxClientDiagramBeforeChangeConnectorTextEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDiagramBeforeChangeConnectorTextEventArgs {
  /**
    * Initializes a new instance of the ASPxClientDiagramBeforeChangeConnectorTextEventArgs class with specified settings.
    * @param connector The connector object.
    * @param index The index of the processed text in the connector's texts collection.
    */
  def this(connector: typings.devexpressWeb.DiagramConnector, index: Double) = this()
  
  /**
    * The processed connector.
    */
  /* CompleteClass */
  var connector: typings.devexpressWeb.DiagramConnector = js.native
  
  /**
    * The index of the processed text in the connector's texts collection.
    */
  /* CompleteClass */
  var index: Double = js.native
}
