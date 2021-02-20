package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about a connector.
  */
@js.native
trait DiagramConnector extends DiagramItem {
  
  /**
    * Gets the connector's start node key.
    */
  var fromKey: js.Any = js.native
  
  /**
    * Gets the connector's texts.
    */
  var texts: js.Array[String] = js.native
  
  /**
    * Gets the connector's end node key.
    */
  var toKey: js.Any = js.native
}
object DiagramConnector {
  
  @scala.inline
  def apply(fromKey: js.Any, id: String, key: js.Any, texts: js.Array[String], toKey: js.Any): DiagramConnector = {
    val __obj = js.Dynamic.literal(fromKey = fromKey.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], texts = texts.asInstanceOf[js.Any], toKey = toKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramConnector]
  }
  
  @scala.inline
  implicit class DiagramConnectorMutableBuilder[Self <: DiagramConnector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromKey(value: js.Any): Self = StObject.set(x, "fromKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTexts(value: js.Array[String]): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextsVarargs(value: String*): Self = StObject.set(x, "texts", js.Array(value :_*))
    
    @scala.inline
    def setToKey(value: js.Any): Self = StObject.set(x, "toKey", value.asInstanceOf[js.Any])
  }
}
