package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Add extends StObject {
  
  var add: Boolean
  
  var name: String
  
  var parent: Parent
  
  var targetApi: js.UndefOr[String] = js.undefined
  
  var value: String
}
object Add {
  
  inline def apply(add: Boolean, name: String, parent: Parent, value: String): Add = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Add]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Add] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Parent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setTargetApi(value: String): Self = StObject.set(x, "targetApi", value.asInstanceOf[js.Any])
    
    inline def setTargetApiUndefined: Self = StObject.set(x, "targetApi", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
