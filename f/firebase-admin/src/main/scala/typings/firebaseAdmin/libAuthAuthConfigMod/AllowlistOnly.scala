package typings.firebaseAdmin.libAuthAuthConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowlistOnly extends StObject {
  
  /**
    * Two letter unicode region codes to allow as defined by
    * https://cldr.unicode.org/
    * The full list of these region codes is here:
    * https://github.com/unicode-cldr/cldr-localenames-full/blob/master/main/en/territories.json
    */
  var allowedRegions: js.Array[String]
}
object AllowlistOnly {
  
  inline def apply(allowedRegions: js.Array[String]): AllowlistOnly = {
    val __obj = js.Dynamic.literal(allowedRegions = allowedRegions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowlistOnly]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowlistOnly] (val x: Self) extends AnyVal {
    
    inline def setAllowedRegions(value: js.Array[String]): Self = StObject.set(x, "allowedRegions", value.asInstanceOf[js.Any])
    
    inline def setAllowedRegionsVarargs(value: String*): Self = StObject.set(x, "allowedRegions", js.Array(value*))
  }
}
