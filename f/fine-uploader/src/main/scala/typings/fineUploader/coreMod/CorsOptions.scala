package typings.fineUploader.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CorsOptions extends StObject {
  
  /**
    * Enable or disable cross-origin requests from IE9 and older where XDomainRequest must be used
    *
    * @default `false`
    */
  var allowXdr: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable or disable cross-domain requests
    *
    * @default `false`
    */
  var expected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable or disable sending credentials along with each cross-domain request. Ignored if allowXdr is true and IE9 is being used
    *
    * @default `false`
    */
  var sendCredentials: js.UndefOr[Boolean] = js.undefined
}
object CorsOptions {
  
  @scala.inline
  def apply(): CorsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CorsOptions]
  }
  
  @scala.inline
  implicit class CorsOptionsMutableBuilder[Self <: CorsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowXdr(value: Boolean): Self = StObject.set(x, "allowXdr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowXdrUndefined: Self = StObject.set(x, "allowXdr", js.undefined)
    
    @scala.inline
    def setExpected(value: Boolean): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedUndefined: Self = StObject.set(x, "expected", js.undefined)
    
    @scala.inline
    def setSendCredentials(value: Boolean): Self = StObject.set(x, "sendCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendCredentialsUndefined: Self = StObject.set(x, "sendCredentials", js.undefined)
  }
}
