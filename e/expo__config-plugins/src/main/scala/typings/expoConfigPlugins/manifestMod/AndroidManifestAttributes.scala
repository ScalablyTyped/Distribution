package typings.expoConfigPlugins.manifestMod

import typings.expoConfigPlugins.expoConfigPluginsStrings.androidDotintentDotactionDotVIEW
import typings.expoConfigPlugins.expoConfigPluginsStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidManifestAttributes extends StObject {
  
  @JSName("android:name")
  var androidColonname: String | androidDotintentDotactionDotVIEW
  
  @JSName("tools:node")
  var toolsColonnode: js.UndefOr[String | remove] = js.undefined
}
object AndroidManifestAttributes {
  
  inline def apply(androidColonname: String | androidDotintentDotactionDotVIEW): AndroidManifestAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("android:name")(androidColonname.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidManifestAttributes]
  }
  
  extension [Self <: AndroidManifestAttributes](x: Self) {
    
    inline def setAndroidColonname(value: String | androidDotintentDotactionDotVIEW): Self = StObject.set(x, "android:name", value.asInstanceOf[js.Any])
    
    inline def setToolsColonnode(value: String | remove): Self = StObject.set(x, "tools:node", value.asInstanceOf[js.Any])
    
    inline def setToolsColonnodeUndefined: Self = StObject.set(x, "tools:node", js.undefined)
  }
}
