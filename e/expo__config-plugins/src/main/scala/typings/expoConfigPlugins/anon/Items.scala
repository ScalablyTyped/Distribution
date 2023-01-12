package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.buildAndroidResourcesMod.ResourceItemXML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Items extends StObject {
  
  var items: js.UndefOr[js.Array[ResourceItemXML]] = js.undefined
  
  var name: String
  
  var parent: String
}
object Items {
  
  inline def apply(name: String, parent: String): Items = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Items] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[ResourceItemXML]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ResourceItemXML*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
