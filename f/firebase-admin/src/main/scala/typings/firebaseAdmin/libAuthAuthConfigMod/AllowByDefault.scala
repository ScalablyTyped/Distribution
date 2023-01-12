package typings.firebaseAdmin.libAuthAuthConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowByDefault extends StObject {
  
  /**
    * Two letter unicode region codes to disallow as defined by
    * https://cldr.unicode.org/
    * The full list of these region codes is here:
    * https://github.com/unicode-cldr/cldr-localenames-full/blob/master/main/en/territories.json
    */
  var disallowedRegions: js.Array[String]
}
object AllowByDefault {
  
  inline def apply(disallowedRegions: js.Array[String]): AllowByDefault = {
    val __obj = js.Dynamic.literal(disallowedRegions = disallowedRegions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowByDefault]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowByDefault] (val x: Self) extends AnyVal {
    
    inline def setDisallowedRegions(value: js.Array[String]): Self = StObject.set(x, "disallowedRegions", value.asInstanceOf[js.Any])
    
    inline def setDisallowedRegionsVarargs(value: String*): Self = StObject.set(x, "disallowedRegions", js.Array(value*))
  }
}
