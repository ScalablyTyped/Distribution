package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsageHistory extends StObject {
  
  /**
    * The date and time the user last sent an envelope.
    */
  var lastSentDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time the user last signed an envelope.
    */
  var lastSignedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The number of envelopes the user has sent.
    */
  var sentCount: js.UndefOr[String] = js.undefined
  
  /**
    * The number of envelopes the user has signed.
    */
  var signedCount: js.UndefOr[String] = js.undefined
}
object UsageHistory {
  
  inline def apply(): UsageHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageHistory]
  }
  
  extension [Self <: UsageHistory](x: Self) {
    
    inline def setLastSentDateTime(value: String): Self = StObject.set(x, "lastSentDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastSentDateTimeUndefined: Self = StObject.set(x, "lastSentDateTime", js.undefined)
    
    inline def setLastSignedDateTime(value: String): Self = StObject.set(x, "lastSignedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastSignedDateTimeUndefined: Self = StObject.set(x, "lastSignedDateTime", js.undefined)
    
    inline def setSentCount(value: String): Self = StObject.set(x, "sentCount", value.asInstanceOf[js.Any])
    
    inline def setSentCountUndefined: Self = StObject.set(x, "sentCount", js.undefined)
    
    inline def setSignedCount(value: String): Self = StObject.set(x, "signedCount", value.asInstanceOf[js.Any])
    
    inline def setSignedCountUndefined: Self = StObject.set(x, "signedCount", js.undefined)
  }
}
