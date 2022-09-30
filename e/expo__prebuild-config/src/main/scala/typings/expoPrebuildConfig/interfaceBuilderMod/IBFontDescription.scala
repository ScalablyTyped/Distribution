package typings.expoPrebuildConfig.interfaceBuilderMod

import org.scalablytyped.runtime.StringDictionary
import typings.expoPrebuildConfig.anon.Family
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<{  key :string,   pointSize :number,   name :'HelveticaNeue' | string | undefined,   family :'Helvetica Neue' | string | undefined,   type :'system' | 'boldSystem' | 'UICTFontTextStyleCallout' | 'UICTFontTextStyleBody' | string | undefined}, {[key: string] : any}> */
trait IBFontDescription
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  @JSName("$")
  var $: Family
}
object IBFontDescription {
  
  inline def apply($: Family): IBFontDescription = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBFontDescription]
  }
  
  extension [Self <: IBFontDescription](x: Self) {
    
    inline def set$(value: Family): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
