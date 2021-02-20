package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PowerFormData extends StObject {
  
  /**
    * The envelope ID of the envelope status that failed to post.
    */
  var envelopeId: js.UndefOr[String] = js.native
  
  /**
    * An array of powerform recipients.
    */
  var recipients: js.UndefOr[js.Array[PowerFormFormDataRecipient]] = js.native
}
object PowerFormData {
  
  @scala.inline
  def apply(): PowerFormData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PowerFormData]
  }
  
  @scala.inline
  implicit class PowerFormDataMutableBuilder[Self <: PowerFormData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvelopeId(value: String): Self = StObject.set(x, "envelopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeIdUndefined: Self = StObject.set(x, "envelopeId", js.undefined)
    
    @scala.inline
    def setRecipients(value: js.Array[PowerFormFormDataRecipient]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
    
    @scala.inline
    def setRecipientsVarargs(value: PowerFormFormDataRecipient*): Self = StObject.set(x, "recipients", js.Array(value :_*))
  }
}
