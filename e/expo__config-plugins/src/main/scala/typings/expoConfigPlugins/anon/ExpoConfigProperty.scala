package typings.expoConfigPlugins.anon

import typings.expoConfigTypes.mod.ExpoConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpoConfigProperty extends StObject {
  
  var expoConfigProperty: String
  
  var expoPropertyGetter: js.UndefOr[js.Function1[/* config */ ExpoConfig, String]] = js.undefined
  
  var infoPlistProperty: String
}
object ExpoConfigProperty {
  
  inline def apply(expoConfigProperty: String, infoPlistProperty: String): ExpoConfigProperty = {
    val __obj = js.Dynamic.literal(expoConfigProperty = expoConfigProperty.asInstanceOf[js.Any], infoPlistProperty = infoPlistProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpoConfigProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpoConfigProperty] (val x: Self) extends AnyVal {
    
    inline def setExpoConfigProperty(value: String): Self = StObject.set(x, "expoConfigProperty", value.asInstanceOf[js.Any])
    
    inline def setExpoPropertyGetter(value: /* config */ ExpoConfig => String): Self = StObject.set(x, "expoPropertyGetter", js.Any.fromFunction1(value))
    
    inline def setExpoPropertyGetterUndefined: Self = StObject.set(x, "expoPropertyGetter", js.undefined)
    
    inline def setInfoPlistProperty(value: String): Self = StObject.set(x, "infoPlistProperty", value.asInstanceOf[js.Any])
  }
}
