package typings.expoPrebuildConfig.interfaceBuilderMod

import org.scalablytyped.runtime.StringDictionary
import typings.expoPrebuildConfig.anon.Constant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<{  firstItem :string,   firstAttribute :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.ConstraintAttribute,   secondItem :string,   secondAttribute :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.ConstraintAttribute,   constant :number | undefined,   id :string}, {[key: string] : any}> */
trait IBConstraint
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  @JSName("$")
  var $: Constant
}
object IBConstraint {
  
  inline def apply($: Constant): IBConstraint = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBConstraint]
  }
  
  extension [Self <: IBConstraint](x: Self) {
    
    inline def set$(value: Constant): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
