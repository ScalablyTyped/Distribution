package typings.expoConfigPlugins.manifestMod

import typings.expoConfigPlugins.anon._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidManifest extends StObject {
  
  var manifest: _empty
}
object AndroidManifest {
  
  inline def apply(manifest: _empty): AndroidManifest = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidManifest]
  }
  
  extension [Self <: AndroidManifest](x: Self) {
    
    inline def setManifest(value: _empty): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
  }
}
