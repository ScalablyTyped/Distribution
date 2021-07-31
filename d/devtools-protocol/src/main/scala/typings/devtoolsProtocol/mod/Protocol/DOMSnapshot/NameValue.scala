package typings.devtoolsProtocol.mod.Protocol.DOMSnapshot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameValue extends StObject {
  
  /**
    * Attribute/property name.
    */
  var name: String
  
  /**
    * Attribute/property value.
    */
  var value: String
}
object NameValue {
  
  @scala.inline
  def apply(name: String, value: String): NameValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameValue]
  }
  
  @scala.inline
  implicit class NameValueMutableBuilder[Self <: NameValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
