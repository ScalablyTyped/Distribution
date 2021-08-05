package typings.devtoolsProtocol.mod.Protocol.Emulation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetLocaleOverrideRequest extends StObject {
  
  /**
    * ICU style C locale (e.g. "en_US"). If not specified or empty, disables the override and
    * restores default host system locale.
    */
  var locale: js.UndefOr[String] = js.undefined
}
object SetLocaleOverrideRequest {
  
  inline def apply(): SetLocaleOverrideRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetLocaleOverrideRequest]
  }
  
  extension [Self <: SetLocaleOverrideRequest](x: Self) {
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
  }
}
