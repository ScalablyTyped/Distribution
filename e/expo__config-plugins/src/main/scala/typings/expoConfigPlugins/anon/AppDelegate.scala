package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.buildIosIosConfigDottypesMod.InfoPlist
import typings.expoConfigPlugins.buildIosPathsMod.AppDelegateProjectFile
import typings.expoConfigPlugins.buildPluginDottypesMod.Plist
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppDelegate extends StObject {
  
  /**
    * Modify the `ios/<name>/AppDelegate.m` as a string (dangerous)
    */
  var appDelegate: js.UndefOr[typings.expoConfigPlugins.buildPluginDottypesMod.Mod[AppDelegateProjectFile]] = js.undefined
  
  /**
    * Dangerously make a modification before any other android mods have been run.
    */
  var dangerous: js.UndefOr[typings.expoConfigPlugins.buildPluginDottypesMod.Mod[Any]] = js.undefined
  
  /**
    * Modify the `ios/<name>/<product-name>.entitlements` as JSON (parsed with [`@expo/plist`](https://www.npmjs.com/package/@expo/plist)).
    */
  var entitlements: js.UndefOr[typings.expoConfigPlugins.buildPluginDottypesMod.Mod[Plist]] = js.undefined
  
  /**
    * Modify the `ios/<name>/Expo.plist` as JSON (Expo updates config for iOS) (parsed with [`@expo/plist`](https://www.npmjs.com/package/@expo/plist)).
    */
  var expoPlist: js.UndefOr[typings.expoConfigPlugins.buildPluginDottypesMod.Mod[Plist]] = js.undefined
  
  /**
    * Modify the `ios/<name>/Info.plist` as JSON (parsed with [`@expo/plist`](https://www.npmjs.com/package/@expo/plist)).
    */
  var infoPlist: js.UndefOr[typings.expoConfigPlugins.buildPluginDottypesMod.Mod[InfoPlist]] = js.undefined
  
  /**
    * Modify the `ios/Podfile.properties.json` as key-value pairs
    */
  var podfileProperties: js.UndefOr[typings.expoConfigPlugins.buildPluginDottypesMod.Mod[Record[String, String]]] = js.undefined
  
  /**
    * Modify the `ios/<name>.xcodeproj` as an `XcodeProject` (parsed with [`xcode`](https://www.npmjs.com/package/xcode))
    */
  var xcodeproj: js.UndefOr[
    typings.expoConfigPlugins.buildPluginDottypesMod.Mod[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
    ]
  ] = js.undefined
}
object AppDelegate {
  
  inline def apply(): AppDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppDelegate]
  }
  
  extension [Self <: AppDelegate](x: Self) {
    
    inline def setAppDelegate(value: typings.expoConfigPlugins.buildPluginDottypesMod.Mod[AppDelegateProjectFile]): Self = StObject.set(x, "appDelegate", value.asInstanceOf[js.Any])
    
    inline def setAppDelegateUndefined: Self = StObject.set(x, "appDelegate", js.undefined)
    
    inline def setDangerous(value: typings.expoConfigPlugins.buildPluginDottypesMod.Mod[Any]): Self = StObject.set(x, "dangerous", value.asInstanceOf[js.Any])
    
    inline def setDangerousUndefined: Self = StObject.set(x, "dangerous", js.undefined)
    
    inline def setEntitlements(value: typings.expoConfigPlugins.buildPluginDottypesMod.Mod[Plist]): Self = StObject.set(x, "entitlements", value.asInstanceOf[js.Any])
    
    inline def setEntitlementsUndefined: Self = StObject.set(x, "entitlements", js.undefined)
    
    inline def setExpoPlist(value: typings.expoConfigPlugins.buildPluginDottypesMod.Mod[Plist]): Self = StObject.set(x, "expoPlist", value.asInstanceOf[js.Any])
    
    inline def setExpoPlistUndefined: Self = StObject.set(x, "expoPlist", js.undefined)
    
    inline def setInfoPlist(value: typings.expoConfigPlugins.buildPluginDottypesMod.Mod[InfoPlist]): Self = StObject.set(x, "infoPlist", value.asInstanceOf[js.Any])
    
    inline def setInfoPlistUndefined: Self = StObject.set(x, "infoPlist", js.undefined)
    
    inline def setPodfileProperties(value: typings.expoConfigPlugins.buildPluginDottypesMod.Mod[Record[String, String]]): Self = StObject.set(x, "podfileProperties", value.asInstanceOf[js.Any])
    
    inline def setPodfilePropertiesUndefined: Self = StObject.set(x, "podfileProperties", js.undefined)
    
    inline def setXcodeproj(
      value: typings.expoConfigPlugins.buildPluginDottypesMod.Mod[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
        ]
    ): Self = StObject.set(x, "xcodeproj", value.asInstanceOf[js.Any])
    
    inline def setXcodeprojUndefined: Self = StObject.set(x, "xcodeproj", js.undefined)
  }
}
