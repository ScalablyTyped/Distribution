package typings.expressValidator.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsIMEIOptions extends StObject {
  
  var allow_hyphens: js.UndefOr[Boolean] = js.undefined
}
object IsIMEIOptions {
  
  @scala.inline
  def apply(): IsIMEIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsIMEIOptions]
  }
  
  @scala.inline
  implicit class IsIMEIOptionsMutableBuilder[Self <: IsIMEIOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow_hyphens(value: Boolean): Self = StObject.set(x, "allow_hyphens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_hyphensUndefined: Self = StObject.set(x, "allow_hyphens", js.undefined)
  }
}
