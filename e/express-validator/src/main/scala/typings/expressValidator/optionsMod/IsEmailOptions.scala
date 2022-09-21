package typings.expressValidator.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsEmailOptions extends StObject {
  
  var allow_display_name: js.UndefOr[Boolean] = js.undefined
  
  var allow_ip_domain: js.UndefOr[Boolean] = js.undefined
  
  var allow_utf8_local_part: js.UndefOr[Boolean] = js.undefined
  
  var blacklisted_chars: js.UndefOr[String] = js.undefined
  
  var domain_specific_validation: js.UndefOr[Boolean] = js.undefined
  
  var host_blacklist: js.UndefOr[js.Array[String]] = js.undefined
  
  var ignore_max_length: js.UndefOr[Boolean] = js.undefined
  
  var require_tld: js.UndefOr[Boolean] = js.undefined
}
object IsEmailOptions {
  
  inline def apply(): IsEmailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsEmailOptions]
  }
  
  extension [Self <: IsEmailOptions](x: Self) {
    
    inline def setAllow_display_name(value: Boolean): Self = StObject.set(x, "allow_display_name", value.asInstanceOf[js.Any])
    
    inline def setAllow_display_nameUndefined: Self = StObject.set(x, "allow_display_name", js.undefined)
    
    inline def setAllow_ip_domain(value: Boolean): Self = StObject.set(x, "allow_ip_domain", value.asInstanceOf[js.Any])
    
    inline def setAllow_ip_domainUndefined: Self = StObject.set(x, "allow_ip_domain", js.undefined)
    
    inline def setAllow_utf8_local_part(value: Boolean): Self = StObject.set(x, "allow_utf8_local_part", value.asInstanceOf[js.Any])
    
    inline def setAllow_utf8_local_partUndefined: Self = StObject.set(x, "allow_utf8_local_part", js.undefined)
    
    inline def setBlacklisted_chars(value: String): Self = StObject.set(x, "blacklisted_chars", value.asInstanceOf[js.Any])
    
    inline def setBlacklisted_charsUndefined: Self = StObject.set(x, "blacklisted_chars", js.undefined)
    
    inline def setDomain_specific_validation(value: Boolean): Self = StObject.set(x, "domain_specific_validation", value.asInstanceOf[js.Any])
    
    inline def setDomain_specific_validationUndefined: Self = StObject.set(x, "domain_specific_validation", js.undefined)
    
    inline def setHost_blacklist(value: js.Array[String]): Self = StObject.set(x, "host_blacklist", value.asInstanceOf[js.Any])
    
    inline def setHost_blacklistUndefined: Self = StObject.set(x, "host_blacklist", js.undefined)
    
    inline def setHost_blacklistVarargs(value: String*): Self = StObject.set(x, "host_blacklist", js.Array(value*))
    
    inline def setIgnore_max_length(value: Boolean): Self = StObject.set(x, "ignore_max_length", value.asInstanceOf[js.Any])
    
    inline def setIgnore_max_lengthUndefined: Self = StObject.set(x, "ignore_max_length", js.undefined)
    
    inline def setRequire_tld(value: Boolean): Self = StObject.set(x, "require_tld", value.asInstanceOf[js.Any])
    
    inline def setRequire_tldUndefined: Self = StObject.set(x, "require_tld", js.undefined)
  }
}
