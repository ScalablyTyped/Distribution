package typings.devexpressWeb

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
  implicit class DiagramConnectorOps[Self <: DiagramConnector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFromKey(value: js.Any): Self = this.set("fromKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextsVarargs(value: String*): Self = this.set("texts", js.Array(value :_*))
    
    @scala.inline
    def setTexts(value: js.Array[String]): Self = this.set("texts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToKey(value: js.Any): Self = this.set("toKey", value.asInstanceOf[js.Any])
  }
}
