package typings.embroiderMacros.anon

import org.scalablytyped.runtime.StringDictionary
import typings.embroiderMacros.embroiderMacrosBooleans.`true`
import typings.embroiderMacros.embroiderMacrosStrings.`compile-time`
import typings.embroiderMacros.embroiderMacrosStrings.`run-time`
import typings.embroiderMacros.embroiderMacrosStrings.cjs
import typings.embroiderMacros.embroiderMacrosStrings.eager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppPackageRoot extends StObject {
  
  var appPackageRoot: String
  
  var embroiderMacrosConfigMarker: `true`
  
  var globalConfig: StringDictionary[Any]
  
  var importSyncImplementation: cjs | eager
  
  var isDevelopingPackageRoots: js.Array[String]
  
  var mode: `compile-time` | `run-time`
  
  var owningPackageRoot: js.UndefOr[String] = js.undefined
  
  var userConfigs: StringDictionary[Any]
}
object AppPackageRoot {
  
  inline def apply(
    appPackageRoot: String,
    globalConfig: StringDictionary[Any],
    importSyncImplementation: cjs | eager,
    isDevelopingPackageRoots: js.Array[String],
    mode: `compile-time` | `run-time`,
    userConfigs: StringDictionary[Any]
  ): AppPackageRoot = {
    val __obj = js.Dynamic.literal(appPackageRoot = appPackageRoot.asInstanceOf[js.Any], embroiderMacrosConfigMarker = true, globalConfig = globalConfig.asInstanceOf[js.Any], importSyncImplementation = importSyncImplementation.asInstanceOf[js.Any], isDevelopingPackageRoots = isDevelopingPackageRoots.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], userConfigs = userConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppPackageRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppPackageRoot] (val x: Self) extends AnyVal {
    
    inline def setAppPackageRoot(value: String): Self = StObject.set(x, "appPackageRoot", value.asInstanceOf[js.Any])
    
    inline def setEmbroiderMacrosConfigMarker(value: `true`): Self = StObject.set(x, "embroiderMacrosConfigMarker", value.asInstanceOf[js.Any])
    
    inline def setGlobalConfig(value: StringDictionary[Any]): Self = StObject.set(x, "globalConfig", value.asInstanceOf[js.Any])
    
    inline def setImportSyncImplementation(value: cjs | eager): Self = StObject.set(x, "importSyncImplementation", value.asInstanceOf[js.Any])
    
    inline def setIsDevelopingPackageRoots(value: js.Array[String]): Self = StObject.set(x, "isDevelopingPackageRoots", value.asInstanceOf[js.Any])
    
    inline def setIsDevelopingPackageRootsVarargs(value: String*): Self = StObject.set(x, "isDevelopingPackageRoots", js.Array(value*))
    
    inline def setMode(value: `compile-time` | `run-time`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOwningPackageRoot(value: String): Self = StObject.set(x, "owningPackageRoot", value.asInstanceOf[js.Any])
    
    inline def setOwningPackageRootUndefined: Self = StObject.set(x, "owningPackageRoot", js.undefined)
    
    inline def setUserConfigs(value: StringDictionary[Any]): Self = StObject.set(x, "userConfigs", value.asInstanceOf[js.Any])
  }
}
