package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptiveRecipientInformation extends StObject {
  
  /**
    * A complex type containing information about one or more captive recipients.
    */
  var captiveRecipients: js.UndefOr[
    js.Array[
      /* This object contains details about a captive (embedded) recipient. */ CaptiveRecipient
    ]
  ] = js.undefined
}
object CaptiveRecipientInformation {
  
  inline def apply(): CaptiveRecipientInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptiveRecipientInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CaptiveRecipientInformation] (val x: Self) extends AnyVal {
    
    inline def setCaptiveRecipients(
      value: js.Array[
          /* This object contains details about a captive (embedded) recipient. */ CaptiveRecipient
        ]
    ): Self = StObject.set(x, "captiveRecipients", value.asInstanceOf[js.Any])
    
    inline def setCaptiveRecipientsUndefined: Self = StObject.set(x, "captiveRecipients", js.undefined)
    
    inline def setCaptiveRecipientsVarargs(
      value: (/* This object contains details about a captive (embedded) recipient. */ CaptiveRecipient)*
    ): Self = StObject.set(x, "captiveRecipients", js.Array(value*))
  }
}
