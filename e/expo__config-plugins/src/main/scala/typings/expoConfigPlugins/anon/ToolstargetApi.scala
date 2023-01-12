package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolstargetApi extends StObject {
  
  var name: String
  
  @JSName("tools:targetApi")
  var toolsColontargetApi: js.UndefOr[String] = js.undefined
  
  var translatable: js.UndefOr[String] = js.undefined
}
object ToolstargetApi {
  
  inline def apply(name: String): ToolstargetApi = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolstargetApi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToolstargetApi] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setToolsColontargetApi(value: String): Self = StObject.set(x, "tools:targetApi", value.asInstanceOf[js.Any])
    
    inline def setToolsColontargetApiUndefined: Self = StObject.set(x, "tools:targetApi", js.undefined)
    
    inline def setTranslatable(value: String): Self = StObject.set(x, "translatable", value.asInstanceOf[js.Any])
    
    inline def setTranslatableUndefined: Self = StObject.set(x, "translatable", js.undefined)
  }
}
