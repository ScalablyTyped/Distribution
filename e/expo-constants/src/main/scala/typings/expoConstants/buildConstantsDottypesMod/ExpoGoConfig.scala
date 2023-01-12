package typings.expoConstants.buildConstantsDottypesMod

import typings.expoConstants.anon.Dictkey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpoGoConfig extends StObject {
  
  var debuggerHost: js.UndefOr[String] = js.undefined
  
  var developer: js.UndefOr[Dictkey] = js.undefined
  
  var logUrl: js.UndefOr[String] = js.undefined
  
  var mainModuleName: js.UndefOr[String] = js.undefined
  
  var packagerOpts: js.UndefOr[ExpoGoPackagerOpts] = js.undefined
}
object ExpoGoConfig {
  
  inline def apply(): ExpoGoConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpoGoConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpoGoConfig] (val x: Self) extends AnyVal {
    
    inline def setDebuggerHost(value: String): Self = StObject.set(x, "debuggerHost", value.asInstanceOf[js.Any])
    
    inline def setDebuggerHostUndefined: Self = StObject.set(x, "debuggerHost", js.undefined)
    
    inline def setDeveloper(value: Dictkey): Self = StObject.set(x, "developer", value.asInstanceOf[js.Any])
    
    inline def setDeveloperUndefined: Self = StObject.set(x, "developer", js.undefined)
    
    inline def setLogUrl(value: String): Self = StObject.set(x, "logUrl", value.asInstanceOf[js.Any])
    
    inline def setLogUrlUndefined: Self = StObject.set(x, "logUrl", js.undefined)
    
    inline def setMainModuleName(value: String): Self = StObject.set(x, "mainModuleName", value.asInstanceOf[js.Any])
    
    inline def setMainModuleNameUndefined: Self = StObject.set(x, "mainModuleName", js.undefined)
    
    inline def setPackagerOpts(value: ExpoGoPackagerOpts): Self = StObject.set(x, "packagerOpts", value.asInstanceOf[js.Any])
    
    inline def setPackagerOptsUndefined: Self = StObject.set(x, "packagerOpts", js.undefined)
  }
}
