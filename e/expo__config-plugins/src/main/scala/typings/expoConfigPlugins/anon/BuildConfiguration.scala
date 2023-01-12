package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildConfiguration extends StObject {
  
  var buildConfiguration: js.UndefOr[String] = js.undefined
  
  var targetName: js.UndefOr[String] = js.undefined
}
object BuildConfiguration {
  
  inline def apply(): BuildConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBuildConfiguration(value: String): Self = StObject.set(x, "buildConfiguration", value.asInstanceOf[js.Any])
    
    inline def setBuildConfigurationUndefined: Self = StObject.set(x, "buildConfiguration", js.undefined)
    
    inline def setTargetName(value: String): Self = StObject.set(x, "targetName", value.asInstanceOf[js.Any])
    
    inline def setTargetNameUndefined: Self = StObject.set(x, "targetName", js.undefined)
  }
}
