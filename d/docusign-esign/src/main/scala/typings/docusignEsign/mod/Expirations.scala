package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expirations extends StObject {
  
  /**
    * An integer specifying the number of days that a sent envelope remains active before it expires. A negative number in a response indicates that the envelope has already expired.
    */
  var expireAfter: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the envelope expires (is no longer available for signing) after the specified number of days after it is sent (`sentDateTime`). Set  `expireAfter`
    * to set the number of days until an envelope expires. When **false**, the account default setting is used. If the account does not have an expiration setting,
    * the DocuSign default value of 120 days is used.
    */
  var expireEnabled: js.UndefOr[String] = js.undefined
  
  /**
    * An integer that specifying the number of days before the envelope expires that an expiration warning email is sent to the recipient. If set to 0 (zero), no warning email is sent.
    */
  var expireWarn: js.UndefOr[String] = js.undefined
}
object Expirations {
  
  inline def apply(): Expirations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expirations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Expirations] (val x: Self) extends AnyVal {
    
    inline def setExpireAfter(value: String): Self = StObject.set(x, "expireAfter", value.asInstanceOf[js.Any])
    
    inline def setExpireAfterUndefined: Self = StObject.set(x, "expireAfter", js.undefined)
    
    inline def setExpireEnabled(value: String): Self = StObject.set(x, "expireEnabled", value.asInstanceOf[js.Any])
    
    inline def setExpireEnabledUndefined: Self = StObject.set(x, "expireEnabled", js.undefined)
    
    inline def setExpireWarn(value: String): Self = StObject.set(x, "expireWarn", value.asInstanceOf[js.Any])
    
    inline def setExpireWarnUndefined: Self = StObject.set(x, "expireWarn", js.undefined)
  }
}
