package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.resourcesMod.ResourceXML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Xml extends StObject {
  
  var name: String
  
  var parent: NameParent
  
  var xml: ResourceXML
}
object Xml {
  
  inline def apply(name: String, parent: NameParent, xml: ResourceXML): Xml = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xml]
  }
  
  extension [Self <: Xml](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: NameParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setXml(value: ResourceXML): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
  }
}
