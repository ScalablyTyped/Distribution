package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.createBaseModMod.BaseModProviderMethods
import typings.expoConfigPlugins.iosConfigTypesMod.InfoPlist
import typings.expoConfigPlugins.iosPathsMod.AppDelegateProjectFile
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@expo/config-plugins.@expo/config-plugins/build/plugins/withIosBaseMods.IosDefaultProviders> */
trait PartialIosDefaultProviderAppDelegate extends StObject {
  
  var appDelegate: js.UndefOr[BaseModProviderMethods[AppDelegateProjectFile, PartialPickBaseModOptions]] = js.undefined
  
  var dangerous: js.UndefOr[BaseModProviderMethods[Any, PartialPickBaseModOptions]] = js.undefined
  
  var entitlements: js.UndefOr[
    BaseModProviderMethods[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any, 
      PartialPickBaseModOptions
    ]
  ] = js.undefined
  
  var expoPlist: js.UndefOr[
    BaseModProviderMethods[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any, 
      PartialPickBaseModOptions
    ]
  ] = js.undefined
  
  var infoPlist: js.UndefOr[BaseModProviderMethods[InfoPlist, PartialPickBaseModOptions]] = js.undefined
  
  var podfileProperties: js.UndefOr[
    BaseModProviderMethods[
      Record[
        String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONValue */ Any
      ], 
      PartialPickBaseModOptions
    ]
  ] = js.undefined
  
  var xcodeproj: js.UndefOr[
    BaseModProviderMethods[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify xcode.XcodeProject */ Any, 
      PartialPickBaseModOptions
    ]
  ] = js.undefined
}
object PartialIosDefaultProviderAppDelegate {
  
  inline def apply(): PartialIosDefaultProviderAppDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIosDefaultProviderAppDelegate]
  }
  
  extension [Self <: PartialIosDefaultProviderAppDelegate](x: Self) {
    
    inline def setAppDelegate(value: BaseModProviderMethods[AppDelegateProjectFile, PartialPickBaseModOptions]): Self = StObject.set(x, "appDelegate", value.asInstanceOf[js.Any])
    
    inline def setAppDelegateUndefined: Self = StObject.set(x, "appDelegate", js.undefined)
    
    inline def setDangerous(value: BaseModProviderMethods[Any, PartialPickBaseModOptions]): Self = StObject.set(x, "dangerous", value.asInstanceOf[js.Any])
    
    inline def setDangerousUndefined: Self = StObject.set(x, "dangerous", js.undefined)
    
    inline def setEntitlements(
      value: BaseModProviderMethods[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any, 
          PartialPickBaseModOptions
        ]
    ): Self = StObject.set(x, "entitlements", value.asInstanceOf[js.Any])
    
    inline def setEntitlementsUndefined: Self = StObject.set(x, "entitlements", js.undefined)
    
    inline def setExpoPlist(
      value: BaseModProviderMethods[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any, 
          PartialPickBaseModOptions
        ]
    ): Self = StObject.set(x, "expoPlist", value.asInstanceOf[js.Any])
    
    inline def setExpoPlistUndefined: Self = StObject.set(x, "expoPlist", js.undefined)
    
    inline def setInfoPlist(value: BaseModProviderMethods[InfoPlist, PartialPickBaseModOptions]): Self = StObject.set(x, "infoPlist", value.asInstanceOf[js.Any])
    
    inline def setInfoPlistUndefined: Self = StObject.set(x, "infoPlist", js.undefined)
    
    inline def setPodfileProperties(
      value: BaseModProviderMethods[
          Record[
            String, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONValue */ Any
          ], 
          PartialPickBaseModOptions
        ]
    ): Self = StObject.set(x, "podfileProperties", value.asInstanceOf[js.Any])
    
    inline def setPodfilePropertiesUndefined: Self = StObject.set(x, "podfileProperties", js.undefined)
    
    inline def setXcodeproj(
      value: BaseModProviderMethods[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify xcode.XcodeProject */ Any, 
          PartialPickBaseModOptions
        ]
    ): Self = StObject.set(x, "xcodeproj", value.asInstanceOf[js.Any])
    
    inline def setXcodeprojUndefined: Self = StObject.set(x, "xcodeproj", js.undefined)
  }
}
