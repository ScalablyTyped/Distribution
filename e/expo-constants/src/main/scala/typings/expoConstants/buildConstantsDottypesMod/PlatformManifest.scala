package typings.expoConstants.buildConstantsDottypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.expoConstants.anon.Scheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlatformManifest
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var android: js.UndefOr[AndroidManifest] = js.undefined
  
  var detach: js.UndefOr[Scheme] = js.undefined
  
  var developer: js.UndefOr[String] = js.undefined
  
  var hostUri: js.UndefOr[String] = js.undefined
  
  var ios: js.UndefOr[IOSManifest] = js.undefined
  
  var logUrl: js.UndefOr[String] = js.undefined
  
  var scheme: js.UndefOr[String] = js.undefined
  
  var web: js.UndefOr[WebManifest] = js.undefined
}
object PlatformManifest {
  
  inline def apply(): PlatformManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformManifest]
  }
  
  extension [Self <: PlatformManifest](x: Self) {
    
    inline def setAndroid(value: AndroidManifest): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    inline def setDetach(value: Scheme): Self = StObject.set(x, "detach", value.asInstanceOf[js.Any])
    
    inline def setDetachUndefined: Self = StObject.set(x, "detach", js.undefined)
    
    inline def setDeveloper(value: String): Self = StObject.set(x, "developer", value.asInstanceOf[js.Any])
    
    inline def setDeveloperUndefined: Self = StObject.set(x, "developer", js.undefined)
    
    inline def setHostUri(value: String): Self = StObject.set(x, "hostUri", value.asInstanceOf[js.Any])
    
    inline def setHostUriUndefined: Self = StObject.set(x, "hostUri", js.undefined)
    
    inline def setIos(value: IOSManifest): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
    
    inline def setLogUrl(value: String): Self = StObject.set(x, "logUrl", value.asInstanceOf[js.Any])
    
    inline def setLogUrlUndefined: Self = StObject.set(x, "logUrl", js.undefined)
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    inline def setWeb(value: WebManifest): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
    
    inline def setWebUndefined: Self = StObject.set(x, "web", js.undefined)
  }
}
