package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundleIdentifier extends StObject {
  
  var bundleIdentifier: js.UndefOr[String] = js.undefined
}
object BundleIdentifier {
  
  inline def apply(): BundleIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BundleIdentifier]
  }
  
  extension [Self <: BundleIdentifier](x: Self) {
    
    inline def setBundleIdentifier(value: String): Self = StObject.set(x, "bundleIdentifier", value.asInstanceOf[js.Any])
    
    inline def setBundleIdentifierUndefined: Self = StObject.set(x, "bundleIdentifier", js.undefined)
  }
}
