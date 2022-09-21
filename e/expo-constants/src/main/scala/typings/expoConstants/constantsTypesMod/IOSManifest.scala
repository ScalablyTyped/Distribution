package typings.expoConstants.constantsTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOSManifest
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /**
    * The build number specified in the embedded **Info.plist** value for `CFBundleVersion` in this app.
    * In a standalone app, you can set this with the `ios.buildNumber` value in **app.json**. This
    * may differ from the value in `Constants.manifest.ios.buildNumber` because the manifest
    * can be updated, whereas this value will never change for a given native binary.
    * The value is set to `null` in case you run your app in Expo Go.
    */
  var buildNumber: String | Null
  
  /**
    * The human-readable model name of this device, e.g. `"iPhone 7 Plus"` if it can be determined,
    * otherwise will be `null`.
    * @deprecated Moved to `expo-device` as [`Device.modelName`](./device/#devicemodelname).
    */
  var model: String | Null
  
  /**
    * The Apple internal model identifier for this device, e.g. `iPhone1,1`.
    * @deprecated Use `expo-device`'s [`Device.modelId`](./device/#devicemodelid).
    */
  var platform: String
  
  /**
    * The version of iOS running on this device, e.g. `10.3`.
    * @deprecated Use `expo-device`'s [`Device.osVersion`](./device/#deviceosversion).
    */
  var systemVersion: String
  
  /**
    * The user interface idiom of this device, i.e. whether the app is running on an iPhone or an iPad.
    * @deprecated Use `expo-device`'s [`Device.getDeviceTypeAsync()`](./device/#devicegetdevicetypeasync).
    */
  var userInterfaceIdiom: UserInterfaceIdiom
}
object IOSManifest {
  
  inline def apply(platform: String, systemVersion: String, userInterfaceIdiom: UserInterfaceIdiom): IOSManifest = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any], systemVersion = systemVersion.asInstanceOf[js.Any], userInterfaceIdiom = userInterfaceIdiom.asInstanceOf[js.Any], buildNumber = null, model = null)
    __obj.asInstanceOf[IOSManifest]
  }
  
  extension [Self <: IOSManifest](x: Self) {
    
    inline def setBuildNumber(value: String): Self = StObject.set(x, "buildNumber", value.asInstanceOf[js.Any])
    
    inline def setBuildNumberNull: Self = StObject.set(x, "buildNumber", null)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setSystemVersion(value: String): Self = StObject.set(x, "systemVersion", value.asInstanceOf[js.Any])
    
    inline def setUserInterfaceIdiom(value: UserInterfaceIdiom): Self = StObject.set(x, "userInterfaceIdiom", value.asInstanceOf[js.Any])
  }
}
