package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptiveRecipientInformation extends StObject {
  
  /**
    * A complex type containing information about one or more captive recipients.
    */
  var captiveRecipients: js.UndefOr[
    js.Array[
      /* This object contains details about a captive (embedded) recipient. */ CaptiveRecipient
    ]
  ] = js.native
}
object CaptiveRecipientInformation {
  
  @scala.inline
  def apply(): CaptiveRecipientInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptiveRecipientInformation]
  }
  
  @scala.inline
  implicit class CaptiveRecipientInformationMutableBuilder[Self <: CaptiveRecipientInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptiveRecipients(
      value: js.Array[
          /* This object contains details about a captive (embedded) recipient. */ CaptiveRecipient
        ]
    ): Self = StObject.set(x, "captiveRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptiveRecipientsUndefined: Self = StObject.set(x, "captiveRecipients", js.undefined)
    
    @scala.inline
    def setCaptiveRecipientsVarargs(
      value: (/* This object contains details about a captive (embedded) recipient. */ CaptiveRecipient)*
    ): Self = StObject.set(x, "captiveRecipients", js.Array(value :_*))
  }
}
