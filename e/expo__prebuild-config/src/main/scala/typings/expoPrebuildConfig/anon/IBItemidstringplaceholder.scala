package typings.expoPrebuildConfig.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<{  id :string,   placeholderIdentifier :string | undefined,   userLabel :string,   sceneMemberID :string}, {[key: string] : any}> */
trait IBItemidstringplaceholder
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  @JSName("$")
  var $: Id
}
object IBItemidstringplaceholder {
  
  inline def apply($: Id): IBItemidstringplaceholder = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBItemidstringplaceholder]
  }
  
  extension [Self <: IBItemidstringplaceholder](x: Self) {
    
    inline def set$(value: Id): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
