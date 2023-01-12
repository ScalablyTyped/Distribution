package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.buildAndroidResourcesMod.ResourceXML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentXml extends StObject {
  
  var name: String
  
  var parent: Parent
  
  var xml: ResourceXML
}
object ParentXml {
  
  inline def apply(name: String, parent: Parent, xml: ResourceXML): ParentXml = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentXml]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParentXml] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Parent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setXml(value: ResourceXML): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
  }
}
