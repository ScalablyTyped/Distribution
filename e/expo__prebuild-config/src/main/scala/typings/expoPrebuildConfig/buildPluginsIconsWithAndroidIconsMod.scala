package typings.expoPrebuildConfig

import typings.expoConfigTypes.mod.ExpoConfig
import typings.expoPrebuildConfig.anon.BackgroundColor
import typings.expoPrebuildConfig.anon.BackgroundImage
import typings.expoPrebuildConfig.anon.FolderName
import typings.expoPrebuildConfig.anon.PickExpoConfigandroid
import typings.expoPrebuildConfig.expoPrebuildConfigBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPluginsIconsWithAndroidIconsMod {
  
  @JSImport("@expo/prebuild-config/build/plugins/icons/withAndroidIcons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@expo/prebuild-config/build/plugins/icons/withAndroidIcons", "ANDROID_RES_PATH")
  @js.native
  val ANDROID_RES_PATH: /* "android/app/src/main/res/" */ String = js.native
  
  inline def configureAdaptiveIconAsync(projectRoot: String, foregroundImage: String, backgroundImage: String, isAdaptive: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("configureAdaptiveIconAsync")(projectRoot.asInstanceOf[js.Any], foregroundImage.asInstanceOf[js.Any], backgroundImage.asInstanceOf[js.Any], isAdaptive.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def configureAdaptiveIconAsync(projectRoot: String, foregroundImage: String, backgroundImage: Null, isAdaptive: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("configureAdaptiveIconAsync")(projectRoot.asInstanceOf[js.Any], foregroundImage.asInstanceOf[js.Any], backgroundImage.asInstanceOf[js.Any], isAdaptive.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def createAdaptiveIconXmlString(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createAdaptiveIconXmlString")().asInstanceOf[String]
  inline def createAdaptiveIconXmlString(backgroundImage: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createAdaptiveIconXmlString")(backgroundImage.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@expo/prebuild-config/build/plugins/icons/withAndroidIcons", "dpiValues")
  @js.native
  val dpiValues: dpiMap = js.native
  
  inline def getAdaptiveIcon(config: ExpoConfig): BackgroundColor = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdaptiveIcon")(config.asInstanceOf[js.Any]).asInstanceOf[BackgroundColor]
  
  inline def getIcon(config: ExpoConfig): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getIcon")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def setIconAsync(projectRoot: String, hasIconBackgroundColorBackgroundImageIsAdaptive: BackgroundImage): js.Promise[`true` | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("setIconAsync")(projectRoot.asInstanceOf[js.Any], hasIconBackgroundColorBackgroundImageIsAdaptive.asInstanceOf[js.Any])).asInstanceOf[js.Promise[`true` | Null]]
  
  inline def setRoundIconManifest(
    config: PickExpoConfigandroid,
    manifest: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AndroidConfig.Manifest.AndroidManifest */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setRoundIconManifest")(config.asInstanceOf[js.Any], manifest.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@expo/prebuild-config/build/plugins/icons/withAndroidIcons", "withAndroidIcons")
  @js.native
  val withAndroidIcons: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin */ Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.expoPrebuildConfig.expoPrebuildConfigStrings.mdpi
    - typings.expoPrebuildConfig.expoPrebuildConfigStrings.hdpi
    - typings.expoPrebuildConfig.expoPrebuildConfigStrings.xhdpi
    - typings.expoPrebuildConfig.expoPrebuildConfigStrings.xxhdpi
    - typings.expoPrebuildConfig.expoPrebuildConfigStrings.xxxhdpi
  */
  trait DPIString extends StObject
  object DPIString {
    
    inline def hdpi: typings.expoPrebuildConfig.expoPrebuildConfigStrings.hdpi = "hdpi".asInstanceOf[typings.expoPrebuildConfig.expoPrebuildConfigStrings.hdpi]
    
    inline def mdpi: typings.expoPrebuildConfig.expoPrebuildConfigStrings.mdpi = "mdpi".asInstanceOf[typings.expoPrebuildConfig.expoPrebuildConfigStrings.mdpi]
    
    inline def xhdpi: typings.expoPrebuildConfig.expoPrebuildConfigStrings.xhdpi = "xhdpi".asInstanceOf[typings.expoPrebuildConfig.expoPrebuildConfigStrings.xhdpi]
    
    inline def xxhdpi: typings.expoPrebuildConfig.expoPrebuildConfigStrings.xxhdpi = "xxhdpi".asInstanceOf[typings.expoPrebuildConfig.expoPrebuildConfigStrings.xxhdpi]
    
    inline def xxxhdpi: typings.expoPrebuildConfig.expoPrebuildConfigStrings.xxxhdpi = "xxxhdpi".asInstanceOf[typings.expoPrebuildConfig.expoPrebuildConfigStrings.xxxhdpi]
  }
  
  /* Inlined std.Record<@expo/prebuild-config.@expo/prebuild-config/build/plugins/icons/withAndroidIcons.DPIString, {  folderName :string,   scale :number}> */
  trait dpiMap extends StObject {
    
    var hdpi: FolderName
    
    var mdpi: FolderName
    
    var xhdpi: FolderName
    
    var xxhdpi: FolderName
    
    var xxxhdpi: FolderName
  }
  object dpiMap {
    
    inline def apply(hdpi: FolderName, mdpi: FolderName, xhdpi: FolderName, xxhdpi: FolderName, xxxhdpi: FolderName): dpiMap = {
      val __obj = js.Dynamic.literal(hdpi = hdpi.asInstanceOf[js.Any], mdpi = mdpi.asInstanceOf[js.Any], xhdpi = xhdpi.asInstanceOf[js.Any], xxhdpi = xxhdpi.asInstanceOf[js.Any], xxxhdpi = xxxhdpi.asInstanceOf[js.Any])
      __obj.asInstanceOf[dpiMap]
    }
    
    extension [Self <: dpiMap](x: Self) {
      
      inline def setHdpi(value: FolderName): Self = StObject.set(x, "hdpi", value.asInstanceOf[js.Any])
      
      inline def setMdpi(value: FolderName): Self = StObject.set(x, "mdpi", value.asInstanceOf[js.Any])
      
      inline def setXhdpi(value: FolderName): Self = StObject.set(x, "xhdpi", value.asInstanceOf[js.Any])
      
      inline def setXxhdpi(value: FolderName): Self = StObject.set(x, "xxhdpi", value.asInstanceOf[js.Any])
      
      inline def setXxxhdpi(value: FolderName): Self = StObject.set(x, "xxxhdpi", value.asInstanceOf[js.Any])
    }
  }
}
