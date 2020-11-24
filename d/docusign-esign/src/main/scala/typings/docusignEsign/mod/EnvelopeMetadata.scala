package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeMetadata extends js.Object {
  
  /**
    * Specifies if the Advanced Correct feature is enabled for the envelope. This feature enables you to correct the details of in process envelopes that
    * you sent or are shared with you. It offers more functionality than the Correct feature.
    */
  var allowAdvancedCorrect: js.UndefOr[String] = js.native
  
  /**
    * Specifies if the Correct feature is enabled for the envelope. This feature enables you to correct the details of in process envelopes that you sent or
    * are shared with you, including the recipient, envelope, and document information.
    */
  var allowCorrect: js.UndefOr[String] = js.native
  
  /**
    * Specifies if DocuSign eNotary service is enabled for the envelope.
    */
  var enableSignWithNotary: js.UndefOr[String] = js.native
}
object EnvelopeMetadata {
  
  @scala.inline
  def apply(): EnvelopeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeMetadata]
  }
  
  @scala.inline
  implicit class EnvelopeMetadataOps[Self <: EnvelopeMetadata] (val x: Self) extends AnyVal {
    
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
    def setAllowAdvancedCorrect(value: String): Self = this.set("allowAdvancedCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAdvancedCorrect: Self = this.set("allowAdvancedCorrect", js.undefined)
    
    @scala.inline
    def setAllowCorrect(value: String): Self = this.set("allowCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCorrect: Self = this.set("allowCorrect", js.undefined)
    
    @scala.inline
    def setEnableSignWithNotary(value: String): Self = this.set("enableSignWithNotary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSignWithNotary: Self = this.set("enableSignWithNotary", js.undefined)
  }
}
