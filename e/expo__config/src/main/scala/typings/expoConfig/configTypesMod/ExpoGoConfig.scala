package typings.expoConfig.configTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.expoConfig.anon.ProjectRoot
import typings.expoConfig.expoConfigStrings.`React Native packager is running`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpoGoConfig extends StObject {
  
  var __flipperHack: `React Native packager is running`
  
  var debuggerHost: String
  
  var developer: ProjectRoot
  
  var logUrl: String
  
  var mainModuleName: String
  
  var packagerOpts: StringDictionary[Any]
}
object ExpoGoConfig {
  
  inline def apply(
    debuggerHost: String,
    developer: ProjectRoot,
    logUrl: String,
    mainModuleName: String,
    packagerOpts: StringDictionary[Any]
  ): ExpoGoConfig = {
    val __obj = js.Dynamic.literal(__flipperHack = "React Native packager is running", debuggerHost = debuggerHost.asInstanceOf[js.Any], developer = developer.asInstanceOf[js.Any], logUrl = logUrl.asInstanceOf[js.Any], mainModuleName = mainModuleName.asInstanceOf[js.Any], packagerOpts = packagerOpts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpoGoConfig]
  }
  
  extension [Self <: ExpoGoConfig](x: Self) {
    
    inline def setDebuggerHost(value: String): Self = StObject.set(x, "debuggerHost", value.asInstanceOf[js.Any])
    
    inline def setDeveloper(value: ProjectRoot): Self = StObject.set(x, "developer", value.asInstanceOf[js.Any])
    
    inline def setLogUrl(value: String): Self = StObject.set(x, "logUrl", value.asInstanceOf[js.Any])
    
    inline def setMainModuleName(value: String): Self = StObject.set(x, "mainModuleName", value.asInstanceOf[js.Any])
    
    inline def setPackagerOpts(value: StringDictionary[Any]): Self = StObject.set(x, "packagerOpts", value.asInstanceOf[js.Any])
    
    inline def set__flipperHack(value: `React Native packager is running`): Self = StObject.set(x, "__flipperHack", value.asInstanceOf[js.Any])
  }
}
