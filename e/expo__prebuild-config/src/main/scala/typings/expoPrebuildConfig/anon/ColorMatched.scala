package typings.expoPrebuildConfig.anon

import typings.expoPrebuildConfig.buildPluginsUnversionedExpoSplashScreenInterfaceBuilderMod.IBBoolean
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.`3Dot0`
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.comDotappleDotInterfaceBuilder3DotCocoaTouchDotStoryboardDotXIB
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.iOSDotCocoaTouch
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorMatched extends StObject {
  
  var colorMatched: IBBoolean
  
  var initialViewController: String
  
  var launchScreen: IBBoolean
  
  var propertyAccessControl: none | String
  
  var targetRuntime: iOSDotCocoaTouch | String
  
  var toolsVersion: Double
  
  var `type`: comDotappleDotInterfaceBuilder3DotCocoaTouchDotStoryboardDotXIB | String
  
  var useAutolayout: IBBoolean
  
  var useSafeAreas: IBBoolean
  
  var useTraitCollections: IBBoolean
  
  var version: `3Dot0` | String
}
object ColorMatched {
  
  inline def apply(
    colorMatched: IBBoolean,
    initialViewController: String,
    launchScreen: IBBoolean,
    propertyAccessControl: none | String,
    targetRuntime: iOSDotCocoaTouch | String,
    toolsVersion: Double,
    `type`: comDotappleDotInterfaceBuilder3DotCocoaTouchDotStoryboardDotXIB | String,
    useAutolayout: IBBoolean,
    useSafeAreas: IBBoolean,
    useTraitCollections: IBBoolean,
    version: `3Dot0` | String
  ): ColorMatched = {
    val __obj = js.Dynamic.literal(colorMatched = colorMatched.asInstanceOf[js.Any], initialViewController = initialViewController.asInstanceOf[js.Any], launchScreen = launchScreen.asInstanceOf[js.Any], propertyAccessControl = propertyAccessControl.asInstanceOf[js.Any], targetRuntime = targetRuntime.asInstanceOf[js.Any], toolsVersion = toolsVersion.asInstanceOf[js.Any], useAutolayout = useAutolayout.asInstanceOf[js.Any], useSafeAreas = useSafeAreas.asInstanceOf[js.Any], useTraitCollections = useTraitCollections.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorMatched]
  }
  
  extension [Self <: ColorMatched](x: Self) {
    
    inline def setColorMatched(value: IBBoolean): Self = StObject.set(x, "colorMatched", value.asInstanceOf[js.Any])
    
    inline def setInitialViewController(value: String): Self = StObject.set(x, "initialViewController", value.asInstanceOf[js.Any])
    
    inline def setLaunchScreen(value: IBBoolean): Self = StObject.set(x, "launchScreen", value.asInstanceOf[js.Any])
    
    inline def setPropertyAccessControl(value: none | String): Self = StObject.set(x, "propertyAccessControl", value.asInstanceOf[js.Any])
    
    inline def setTargetRuntime(value: iOSDotCocoaTouch | String): Self = StObject.set(x, "targetRuntime", value.asInstanceOf[js.Any])
    
    inline def setToolsVersion(value: Double): Self = StObject.set(x, "toolsVersion", value.asInstanceOf[js.Any])
    
    inline def setType(value: comDotappleDotInterfaceBuilder3DotCocoaTouchDotStoryboardDotXIB | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUseAutolayout(value: IBBoolean): Self = StObject.set(x, "useAutolayout", value.asInstanceOf[js.Any])
    
    inline def setUseSafeAreas(value: IBBoolean): Self = StObject.set(x, "useSafeAreas", value.asInstanceOf[js.Any])
    
    inline def setUseTraitCollections(value: IBBoolean): Self = StObject.set(x, "useTraitCollections", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: `3Dot0` | String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
