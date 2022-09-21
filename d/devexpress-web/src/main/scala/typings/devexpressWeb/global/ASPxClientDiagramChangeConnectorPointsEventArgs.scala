package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about the processed connector.
  */
@JSGlobal("ASPxClientDiagramChangeConnectorPointsEventArgs")
@js.native
open class ASPxClientDiagramChangeConnectorPointsEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDiagramChangeConnectorPointsEventArgs {
  /**
    * Initializes a new instance of the ASPxClientDiagramChangeConnectorPointsEventArgs class with specified settings.
    * @param connector The connector object.
    * @param newPoints The array of new connector points.
    * @param oldPoints The array of previous connection points.
    */
  def this(
    connector: typings.devexpressWeb.DiagramConnector,
    newPoints: js.Array[Any],
    oldPoints: js.Array[Any]
  ) = this()
  
  /**
    * The processed connector.
    */
  /* CompleteClass */
  var connector: typings.devexpressWeb.DiagramConnector = js.native
  
  /**
    * The array of new connector points.
    */
  /* CompleteClass */
  var newPoints: js.Array[Any] = js.native
  
  /**
    * The array of previous connection points.
    */
  /* CompleteClass */
  var oldPoints: js.Array[Any] = js.native
}
