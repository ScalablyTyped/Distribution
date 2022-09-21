package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about the processed connection.
  */
@JSGlobal("ASPxClientDiagramChangeConnectionEventArgs")
@js.native
open class ASPxClientDiagramChangeConnectionEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDiagramChangeConnectionEventArgs {
  /**
    * Initializes a new instance of the ASPxClientDiagramChangeConnectionEventArgs class with specified settings.
    * @param newShape The new connected shape.
    * @param oldShape The previous connected shape.
    * @param connector The processed connector.
    * @param connectionPointIndex The index of the processed point in the shape's connection point collection.
    * @param connectorPosition The position of the connector in the processed point.
    */
  def this(
    newShape: typings.devexpressWeb.DiagramShape,
    oldShape: typings.devexpressWeb.DiagramShape,
    connector: typings.devexpressWeb.DiagramConnector,
    connectionPointIndex: Double,
    connectorPosition: String
  ) = this()
  
  /**
    * The index of the processed point in the shape's connection point collection.
    */
  /* CompleteClass */
  var connectionPointIndex: Double = js.native
  
  /**
    * The processed connector.
    */
  /* CompleteClass */
  var connector: typings.devexpressWeb.DiagramConnector = js.native
  
  /**
    * The new connected shape.
    */
  /* CompleteClass */
  var newShape: typings.devexpressWeb.DiagramShape = js.native
  
  /**
    * The previous connected shape.
    */
  /* CompleteClass */
  var oldShape: typings.devexpressWeb.DiagramShape = js.native
  
  /**
    * The position of the connector in the processed point.
    */
  /* CompleteClass */
  var position: String = js.native
}
