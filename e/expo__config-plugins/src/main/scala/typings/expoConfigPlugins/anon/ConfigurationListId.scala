package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationListId extends StObject {
  
  var buildConfiguration: String
  
  var configurationListId: String
}
object ConfigurationListId {
  
  inline def apply(buildConfiguration: String, configurationListId: String): ConfigurationListId = {
    val __obj = js.Dynamic.literal(buildConfiguration = buildConfiguration.asInstanceOf[js.Any], configurationListId = configurationListId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationListId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigurationListId] (val x: Self) extends AnyVal {
    
    inline def setBuildConfiguration(value: String): Self = StObject.set(x, "buildConfiguration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationListId(value: String): Self = StObject.set(x, "configurationListId", value.asInstanceOf[js.Any])
  }
}
