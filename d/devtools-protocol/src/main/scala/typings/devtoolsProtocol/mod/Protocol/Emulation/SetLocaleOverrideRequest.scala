package typings.devtoolsProtocol.mod.Protocol.Emulation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetLocaleOverrideRequest extends StObject {
  
  /**
    * ICU style C locale (e.g. "en_US"). If not specified or empty, disables the override and
    * restores default host system locale.
    */
  var locale: js.UndefOr[String] = js.native
}
object SetLocaleOverrideRequest {
  
  @scala.inline
  def apply(): SetLocaleOverrideRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetLocaleOverrideRequest]
  }
  
  @scala.inline
  implicit class SetLocaleOverrideRequestMutableBuilder[Self <: SetLocaleOverrideRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
  }
}
