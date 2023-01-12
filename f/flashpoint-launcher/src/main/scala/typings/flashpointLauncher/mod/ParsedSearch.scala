package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object representation of a parsed search query. */
trait ParsedSearch extends StObject {
  
  /** Whitelists to apply */
  var blacklist: js.Array[FieldFilter]
  
  /** Generic filter to blacklist some predetermined field(s). */
  var genericBlacklist: js.Array[String]
  
  /** Generic filter to whitelist some predetermined field(s). */
  var genericWhitelist: js.Array[String]
  
  /** Blacklists to apply */
  var whitelist: js.Array[FieldFilter]
}
object ParsedSearch {
  
  inline def apply(
    blacklist: js.Array[FieldFilter],
    genericBlacklist: js.Array[String],
    genericWhitelist: js.Array[String],
    whitelist: js.Array[FieldFilter]
  ): ParsedSearch = {
    val __obj = js.Dynamic.literal(blacklist = blacklist.asInstanceOf[js.Any], genericBlacklist = genericBlacklist.asInstanceOf[js.Any], genericWhitelist = genericWhitelist.asInstanceOf[js.Any], whitelist = whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedSearch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParsedSearch] (val x: Self) extends AnyVal {
    
    inline def setBlacklist(value: js.Array[FieldFilter]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
    
    inline def setBlacklistVarargs(value: FieldFilter*): Self = StObject.set(x, "blacklist", js.Array(value*))
    
    inline def setGenericBlacklist(value: js.Array[String]): Self = StObject.set(x, "genericBlacklist", value.asInstanceOf[js.Any])
    
    inline def setGenericBlacklistVarargs(value: String*): Self = StObject.set(x, "genericBlacklist", js.Array(value*))
    
    inline def setGenericWhitelist(value: js.Array[String]): Self = StObject.set(x, "genericWhitelist", value.asInstanceOf[js.Any])
    
    inline def setGenericWhitelistVarargs(value: String*): Self = StObject.set(x, "genericWhitelist", js.Array(value*))
    
    inline def setWhitelist(value: js.Array[FieldFilter]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
    
    inline def setWhitelistVarargs(value: FieldFilter*): Self = StObject.set(x, "whitelist", js.Array(value*))
  }
}
