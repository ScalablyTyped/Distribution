package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetApi extends StObject {
  
  var name: String
  
  var targetApi: js.UndefOr[String] = js.undefined
  
  var translatable: js.UndefOr[Boolean] = js.undefined
  
  var value: String
}
object TargetApi {
  
  inline def apply(name: String, value: String): TargetApi = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetApi]
  }
  
  extension [Self <: TargetApi](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTargetApi(value: String): Self = StObject.set(x, "targetApi", value.asInstanceOf[js.Any])
    
    inline def setTargetApiUndefined: Self = StObject.set(x, "targetApi", js.undefined)
    
    inline def setTranslatable(value: Boolean): Self = StObject.set(x, "translatable", value.asInstanceOf[js.Any])
    
    inline def setTranslatableUndefined: Self = StObject.set(x, "translatable", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
