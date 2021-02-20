package typings.expressValidator.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsFloatOptions extends MinMaxExtendedOptions {
  
  var locale: js.UndefOr[AlphanumericLocale] = js.native
}
object IsFloatOptions {
  
  @scala.inline
  def apply(): IsFloatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsFloatOptions]
  }
  
  @scala.inline
  implicit class IsFloatOptionsMutableBuilder[Self <: IsFloatOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocale(value: AlphanumericLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
  }
}
