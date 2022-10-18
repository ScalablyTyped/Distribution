package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.Dangerous
import typings.expoConfigPlugins.anon.ForwardedBaseModOptionsprSkipEmptyMod
import typings.expoConfigPlugins.anon.PartialPickBaseModOptions
import typings.expoConfigPlugins.buildIosIosConfigDottypesMod.InfoPlist
import typings.expoConfigPlugins.buildIosPathsMod.AppDelegateProjectFile
import typings.expoConfigPlugins.buildPluginDottypesMod.ExportedConfig
import typings.expoConfigPlugins.buildPluginsCreateBaseModMod.BaseModProviderMethods
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPluginsWithIosBaseModsMod {
  
  @JSImport("@expo/config-plugins/build/plugins/withIosBaseMods", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getIosModFileProviders(): Dangerous = ^.asInstanceOf[js.Dynamic].applyDynamic("getIosModFileProviders")().asInstanceOf[Dangerous]
  
  inline def withIosBaseMods(config: ExportedConfig): ExportedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("withIosBaseMods")(config.asInstanceOf[js.Any]).asInstanceOf[ExportedConfig]
  inline def withIosBaseMods(config: ExportedConfig, hasProvidersProps: ForwardedBaseModOptionsprSkipEmptyMod): ExportedConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("withIosBaseMods")(config.asInstanceOf[js.Any], hasProvidersProps.asInstanceOf[js.Any])).asInstanceOf[ExportedConfig]
  
  trait IosDefaultProviders extends StObject {
    
    var appDelegate: BaseModProviderMethods[AppDelegateProjectFile, PartialPickBaseModOptions]
    
    var dangerous: BaseModProviderMethods[Any, PartialPickBaseModOptions]
    
    var entitlements: BaseModProviderMethods[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any, 
        PartialPickBaseModOptions
      ]
    
    var expoPlist: BaseModProviderMethods[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any, 
        PartialPickBaseModOptions
      ]
    
    var infoPlist: BaseModProviderMethods[InfoPlist, PartialPickBaseModOptions]
    
    var podfileProperties: BaseModProviderMethods[
        Record[
          String, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONValue */ Any
        ], 
        PartialPickBaseModOptions
      ]
    
    var xcodeproj: BaseModProviderMethods[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify xcode.XcodeProject */ Any, 
        PartialPickBaseModOptions
      ]
  }
  object IosDefaultProviders {
    
    inline def apply(
      appDelegate: BaseModProviderMethods[AppDelegateProjectFile, PartialPickBaseModOptions],
      dangerous: BaseModProviderMethods[Any, PartialPickBaseModOptions],
      entitlements: BaseModProviderMethods[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any, 
          PartialPickBaseModOptions
        ],
      expoPlist: BaseModProviderMethods[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any, 
          PartialPickBaseModOptions
        ],
      infoPlist: BaseModProviderMethods[InfoPlist, PartialPickBaseModOptions],
      podfileProperties: BaseModProviderMethods[
          Record[
            String, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONValue */ Any
          ], 
          PartialPickBaseModOptions
        ],
      xcodeproj: BaseModProviderMethods[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify xcode.XcodeProject */ Any, 
          PartialPickBaseModOptions
        ]
    ): IosDefaultProviders = {
      val __obj = js.Dynamic.literal(appDelegate = appDelegate.asInstanceOf[js.Any], dangerous = dangerous.asInstanceOf[js.Any], entitlements = entitlements.asInstanceOf[js.Any], expoPlist = expoPlist.asInstanceOf[js.Any], infoPlist = infoPlist.asInstanceOf[js.Any], podfileProperties = podfileProperties.asInstanceOf[js.Any], xcodeproj = xcodeproj.asInstanceOf[js.Any])
      __obj.asInstanceOf[IosDefaultProviders]
    }
    
    extension [Self <: IosDefaultProviders](x: Self) {
      
      inline def setAppDelegate(value: BaseModProviderMethods[AppDelegateProjectFile, PartialPickBaseModOptions]): Self = StObject.set(x, "appDelegate", value.asInstanceOf[js.Any])
      
      inline def setDangerous(value: BaseModProviderMethods[Any, PartialPickBaseModOptions]): Self = StObject.set(x, "dangerous", value.asInstanceOf[js.Any])
      
      inline def setEntitlements(
        value: BaseModProviderMethods[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any, 
              PartialPickBaseModOptions
            ]
      ): Self = StObject.set(x, "entitlements", value.asInstanceOf[js.Any])
      
      inline def setExpoPlist(
        value: BaseModProviderMethods[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any, 
              PartialPickBaseModOptions
            ]
      ): Self = StObject.set(x, "expoPlist", value.asInstanceOf[js.Any])
      
      inline def setInfoPlist(value: BaseModProviderMethods[InfoPlist, PartialPickBaseModOptions]): Self = StObject.set(x, "infoPlist", value.asInstanceOf[js.Any])
      
      inline def setPodfileProperties(
        value: BaseModProviderMethods[
              Record[
                String, 
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONValue */ Any
              ], 
              PartialPickBaseModOptions
            ]
      ): Self = StObject.set(x, "podfileProperties", value.asInstanceOf[js.Any])
      
      inline def setXcodeproj(
        value: BaseModProviderMethods[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify xcode.XcodeProject */ Any, 
              PartialPickBaseModOptions
            ]
      ): Self = StObject.set(x, "xcodeproj", value.asInstanceOf[js.Any])
    }
  }
}
