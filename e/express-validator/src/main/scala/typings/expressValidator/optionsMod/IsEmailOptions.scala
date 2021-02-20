package typings.expressValidator.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsEmailOptions extends StObject {
  
  var allow_display_name: js.UndefOr[Boolean] = js.native
  
  var allow_utf8_local_part: js.UndefOr[Boolean] = js.native
  
  var require_tld: js.UndefOr[Boolean] = js.native
}
object IsEmailOptions {
  
  @scala.inline
  def apply(): IsEmailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsEmailOptions]
  }
  
  @scala.inline
  implicit class IsEmailOptionsMutableBuilder[Self <: IsEmailOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow_display_name(value: Boolean): Self = StObject.set(x, "allow_display_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_display_nameUndefined: Self = StObject.set(x, "allow_display_name", js.undefined)
    
    @scala.inline
    def setAllow_utf8_local_part(value: Boolean): Self = StObject.set(x, "allow_utf8_local_part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_utf8_local_partUndefined: Self = StObject.set(x, "allow_utf8_local_part", js.undefined)
    
    @scala.inline
    def setRequire_tld(value: Boolean): Self = StObject.set(x, "require_tld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequire_tldUndefined: Self = StObject.set(x, "require_tld", js.undefined)
  }
}
