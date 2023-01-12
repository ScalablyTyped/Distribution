package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.buildAndroidResourcesMod.ResourceItemXML
import typings.expoConfigPlugins.buildAndroidResourcesMod.ResourceXML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemParent extends StObject {
  
  var item: ResourceItemXML
  
  var parent: Parent
  
  var xml: ResourceXML
}
object ItemParent {
  
  inline def apply(item: ResourceItemXML, parent: Parent, xml: ResourceXML): ItemParent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemParent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemParent] (val x: Self) extends AnyVal {
    
    inline def setItem(value: ResourceItemXML): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Parent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setXml(value: ResourceXML): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
  }
}
