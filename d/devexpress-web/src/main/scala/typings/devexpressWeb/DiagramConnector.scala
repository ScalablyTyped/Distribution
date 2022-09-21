package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about a connector.
  */
trait DiagramConnector
  extends StObject
     with DiagramItem {
  
  /**
    * Gets the connector's start node identifier.
    */
  var fromId: String
  
  /**
    * Gets the connector's start node key.
    */
  var fromKey: Any
  
  /**
    * The index of a shape connection point where the connector starts.
    */
  var fromPointIndex: Double
  
  /**
    * Gets the connector's key points.
    */
  var points: js.Array[Any]
  
  /**
    * Gets the connector's texts.
    */
  var texts: js.Array[String]
  
  /**
    * Gets the connector's end node identifier.
    */
  var toId: String
  
  /**
    * Gets the connector's end node key.
    */
  var toKey: Any
  
  /**
    * The index of the shape connection point where the connector ends.
    */
  var toPointIndex: Double
}
object DiagramConnector {
  
  inline def apply(
    fromId: String,
    fromKey: Any,
    fromPointIndex: Double,
    id: String,
    key: Any,
    points: js.Array[Any],
    texts: js.Array[String],
    toId: String,
    toKey: Any,
    toPointIndex: Double
  ): DiagramConnector = {
    val __obj = js.Dynamic.literal(fromId = fromId.asInstanceOf[js.Any], fromKey = fromKey.asInstanceOf[js.Any], fromPointIndex = fromPointIndex.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], texts = texts.asInstanceOf[js.Any], toId = toId.asInstanceOf[js.Any], toKey = toKey.asInstanceOf[js.Any], toPointIndex = toPointIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramConnector]
  }
  
  extension [Self <: DiagramConnector](x: Self) {
    
    inline def setFromId(value: String): Self = StObject.set(x, "fromId", value.asInstanceOf[js.Any])
    
    inline def setFromKey(value: Any): Self = StObject.set(x, "fromKey", value.asInstanceOf[js.Any])
    
    inline def setFromPointIndex(value: Double): Self = StObject.set(x, "fromPointIndex", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: js.Array[Any]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: Any*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setTexts(value: js.Array[String]): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    inline def setTextsVarargs(value: String*): Self = StObject.set(x, "texts", js.Array(value*))
    
    inline def setToId(value: String): Self = StObject.set(x, "toId", value.asInstanceOf[js.Any])
    
    inline def setToKey(value: Any): Self = StObject.set(x, "toKey", value.asInstanceOf[js.Any])
    
    inline def setToPointIndex(value: Double): Self = StObject.set(x, "toPointIndex", value.asInstanceOf[js.Any])
  }
}
