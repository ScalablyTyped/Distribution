package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about the processed connector.
  */
@JSGlobal("ASPxClientDiagramChangeConnectorTextEventArgs")
@js.native
open class ASPxClientDiagramChangeConnectorTextEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDiagramChangeConnectorTextEventArgs {
  /**
    * Initializes a new instance of the ASPxClientDiagramChangeConnectorTextEventArgs class with specified settings.
    * @param connector The connector object.
    * @param index The index of the processed text in the connector's texts collection.
    * @param text The new connector text.
    */
  def this(connector: typings.devexpressWeb.DiagramConnector, index: Double, text: String) = this()
  
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
  
  /**
    * The new connector text.
    */
  /* CompleteClass */
  var text: String = js.native
}
