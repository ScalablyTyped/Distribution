package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.buildAndroidPropertiesMod.PropertiesItem
import typings.expoConfigPlugins.expoConfigPluginsStrings.comment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type
  extends StObject
     with PropertiesItem {
  
  var `type`: comment
  
  var value: String
}
object Type {
  
  inline def apply(value: String): Type = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("comment")
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setType(value: comment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
