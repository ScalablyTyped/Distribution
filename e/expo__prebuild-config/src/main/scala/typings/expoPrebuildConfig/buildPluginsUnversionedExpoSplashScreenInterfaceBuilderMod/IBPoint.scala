package typings.expoPrebuildConfig.buildPluginsUnversionedExpoSplashScreenInterfaceBuilderMod

import org.scalablytyped.runtime.StringDictionary
import typings.expoPrebuildConfig.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<{  key :string | 'canvasLocation',   x :number,   y :number}, {[key: string] : any}> */
trait IBPoint
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  @JSName("$")
  var $: X
}
object IBPoint {
  
  inline def apply($: X): IBPoint = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBPoint] (val x: Self) extends AnyVal {
    
    inline def set$(value: X): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
