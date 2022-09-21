package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about a connector.
  */
@JSGlobal("DiagramConnector")
@js.native
open class DiagramConnector ()
  extends StObject
     with typings.devexpressWeb.DiagramConnector {
  
  /**
    * Gets the connector's start node identifier.
    */
  /* CompleteClass */
  var fromId: String = js.native
  
  /**
    * Gets the connector's start node key.
    */
  /* CompleteClass */
  var fromKey: Any = js.native
  
  /**
    * The index of a shape connection point where the connector starts.
    */
  /* CompleteClass */
  var fromPointIndex: Double = js.native
  
  /**
    * Gets the item's internal identifier.
    */
  /* CompleteClass */
  var id: String = js.native
  
  /**
    * Gets the item's key from a data source.
    */
  /* CompleteClass */
  var key: Any = js.native
  
  /**
    * Gets the connector's key points.
    */
  /* CompleteClass */
  var points: js.Array[Any] = js.native
  
  /**
    * Gets the connector's texts.
    */
  /* CompleteClass */
  var texts: js.Array[String] = js.native
  
  /**
    * Gets the connector's end node identifier.
    */
  /* CompleteClass */
  var toId: String = js.native
  
  /**
    * Gets the connector's end node key.
    */
  /* CompleteClass */
  var toKey: Any = js.native
  
  /**
    * The index of the shape connection point where the connector ends.
    */
  /* CompleteClass */
  var toPointIndex: Double = js.native
}
