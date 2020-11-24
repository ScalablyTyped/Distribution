package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptiveRecipientInformation extends js.Object {
  
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
  implicit class CaptiveRecipientInformationOps[Self <: CaptiveRecipientInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCaptiveRecipientsVarargs(
      value: (/* This object contains details about a captive (embedded) recipient. */ CaptiveRecipient)*
    ): Self = this.set("captiveRecipients", js.Array(value :_*))
    
    @scala.inline
    def setCaptiveRecipients(
      value: js.Array[
          /* This object contains details about a captive (embedded) recipient. */ CaptiveRecipient
        ]
    ): Self = this.set("captiveRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptiveRecipients: Self = this.set("captiveRecipients", js.undefined)
  }
}
