package typings.expoConstants.buildConstantsDottypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidManifest
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /**
    * The version code set by `android.versionCode` in app.json.
    * The value is set to `null` in case you run your app in Expo Go.
    * @deprecated Use `expo-application`'s [`Application.nativeBuildVersion`](./application/#applicationnativebuildversion).
    */
  var versionCode: Double
}
object AndroidManifest {
  
  inline def apply(versionCode: Double): AndroidManifest = {
    val __obj = js.Dynamic.literal(versionCode = versionCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidManifest]
  }
  
  extension [Self <: AndroidManifest](x: Self) {
    
    inline def setVersionCode(value: Double): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
  }
}
