package typings.expoConfigPlugins

import typings.expoConfigTypes.mod.ExpoConfig
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPropertiesTypesMod {
  
  type BuildPropertiesConfig = ExpoConfig | (Record[String, Any])
  
  trait ConfigToPropertyRuleType[SourceConfigType /* <: BuildPropertiesConfig */] extends StObject {
    
    /** Property name in `android/gradle.properties` or `ios/Podfile.properties.json` */
    var propName: String
    
    /** Passing config and get the property value */
    def propValueGetter(config: SourceConfigType): js.UndefOr[String | Null]
  }
  object ConfigToPropertyRuleType {
    
    inline def apply[SourceConfigType /* <: BuildPropertiesConfig */](propName: String, propValueGetter: SourceConfigType => js.UndefOr[String | Null]): ConfigToPropertyRuleType[SourceConfigType] = {
      val __obj = js.Dynamic.literal(propName = propName.asInstanceOf[js.Any], propValueGetter = js.Any.fromFunction1(propValueGetter))
      __obj.asInstanceOf[ConfigToPropertyRuleType[SourceConfigType]]
    }
    
    extension [Self <: ConfigToPropertyRuleType[?], SourceConfigType /* <: BuildPropertiesConfig */](x: Self & ConfigToPropertyRuleType[SourceConfigType]) {
      
      inline def setPropName(value: String): Self = StObject.set(x, "propName", value.asInstanceOf[js.Any])
      
      inline def setPropValueGetter(value: SourceConfigType => js.UndefOr[String | Null]): Self = StObject.set(x, "propValueGetter", js.Any.fromFunction1(value))
    }
  }
}
