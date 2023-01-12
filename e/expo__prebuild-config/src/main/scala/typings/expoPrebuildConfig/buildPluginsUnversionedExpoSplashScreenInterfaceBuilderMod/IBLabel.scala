package typings.expoPrebuildConfig.buildPluginsUnversionedExpoSplashScreenInterfaceBuilderMod

import typings.expoPrebuildConfig.anon.AdjustsFontSizeToFit
import typings.expoPrebuildConfig.anon.IBItemkeystringkeystringa
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<{  id :string,   text :string,   opaque :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBBoolean,   fixedFrame :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBBoolean,   textAlignment :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBTextAlignment | undefined,   lineBreakMode :'clip' | 'characterWrap' | 'wordWrap' | 'headTruncation' | 'middleTruncation' | 'tailTruncation',   baselineAdjustment :'none' | 'alignBaselines' | undefined,   adjustsFontSizeToFit :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBBoolean,   userInteractionEnabled :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBBoolean,   contentMode :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBContentMode,   horizontalHuggingPriority :number,   verticalHuggingPriority :number,   translatesAutoresizingMaskIntoConstraints :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBBoolean | undefined}, {  rect :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBRect>,   autoresizingMask :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBAutoresizingMask> | undefined,   fontDescription :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBFontDescription> | undefined,   color :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBColor> | undefined,   nil :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<{  key :string}, {[key: string] : any}>> | undefined}> */
trait IBLabel extends StObject {
  
  @JSName("$")
  var $: AdjustsFontSizeToFit
  
  /** @example `<autoresizingMask key="autoresizingMask" flexibleMaxX="YES" flexibleMaxY="YES"/>` */
  var autoresizingMask: js.UndefOr[js.Array[IBAutoresizingMask]] = js.undefined
  
  /** @example `<color key="textColor" red="0.0" green="0.0" blue="0.0" alpha="1" colorSpace="custom" customColorSpace="sRGB"/>` */
  var color: js.UndefOr[js.Array[IBColor]] = js.undefined
  
  /** @example `<fontDescription key="fontDescription" type="system" pointSize="19"/>` */
  var fontDescription: js.UndefOr[js.Array[IBFontDescription]] = js.undefined
  
  var nil: js.UndefOr[js.Array[IBItemkeystringkeystringa]] = js.undefined
  
  /** @example `<rect key="frame" x="175" y="670" width="35" height="17"/>` */
  var rect: js.Array[IBRect]
}
object IBLabel {
  
  inline def apply($: AdjustsFontSizeToFit, rect: js.Array[IBRect]): IBLabel = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBLabel] (val x: Self) extends AnyVal {
    
    inline def set$(value: AdjustsFontSizeToFit): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
    
    inline def setAutoresizingMask(value: js.Array[IBAutoresizingMask]): Self = StObject.set(x, "autoresizingMask", value.asInstanceOf[js.Any])
    
    inline def setAutoresizingMaskUndefined: Self = StObject.set(x, "autoresizingMask", js.undefined)
    
    inline def setAutoresizingMaskVarargs(value: IBAutoresizingMask*): Self = StObject.set(x, "autoresizingMask", js.Array(value*))
    
    inline def setColor(value: js.Array[IBColor]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: IBColor*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setFontDescription(value: js.Array[IBFontDescription]): Self = StObject.set(x, "fontDescription", value.asInstanceOf[js.Any])
    
    inline def setFontDescriptionUndefined: Self = StObject.set(x, "fontDescription", js.undefined)
    
    inline def setFontDescriptionVarargs(value: IBFontDescription*): Self = StObject.set(x, "fontDescription", js.Array(value*))
    
    inline def setNil(value: js.Array[IBItemkeystringkeystringa]): Self = StObject.set(x, "nil", value.asInstanceOf[js.Any])
    
    inline def setNilUndefined: Self = StObject.set(x, "nil", js.undefined)
    
    inline def setNilVarargs(value: IBItemkeystringkeystringa*): Self = StObject.set(x, "nil", js.Array(value*))
    
    inline def setRect(value: js.Array[IBRect]): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setRectVarargs(value: IBRect*): Self = StObject.set(x, "rect", js.Array(value*))
  }
}
