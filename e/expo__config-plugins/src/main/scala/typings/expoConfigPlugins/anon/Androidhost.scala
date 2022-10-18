package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Androidhost
  extends StObject
     with /* key */ StringDictionary[js.UndefOr[String]] {
  
  @JSName("android:host")
  var androidColonhost: js.UndefOr[String] = js.undefined
  
  @JSName("android:pathPrefix")
  var androidColonpathPrefix: js.UndefOr[String] = js.undefined
  
  @JSName("android:scheme")
  var androidColonscheme: js.UndefOr[String] = js.undefined
}
object Androidhost {
  
  inline def apply(): Androidhost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Androidhost]
  }
  
  extension [Self <: Androidhost](x: Self) {
    
    inline def setAndroidColonhost(value: String): Self = StObject.set(x, "android:host", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonhostUndefined: Self = StObject.set(x, "android:host", js.undefined)
    
    inline def setAndroidColonpathPrefix(value: String): Self = StObject.set(x, "android:pathPrefix", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonpathPrefixUndefined: Self = StObject.set(x, "android:pathPrefix", js.undefined)
    
    inline def setAndroidColonscheme(value: String): Self = StObject.set(x, "android:scheme", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonschemeUndefined: Self = StObject.set(x, "android:scheme", js.undefined)
  }
}
