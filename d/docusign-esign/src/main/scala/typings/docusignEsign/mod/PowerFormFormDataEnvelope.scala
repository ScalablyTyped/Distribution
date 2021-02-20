package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PowerFormFormDataEnvelope extends StObject {
  
  /**
    * The envelope's GUID.
    *
    * Example: `93be49ab-afa0-4adf-933c-f752070d71ec`
    */
  var envelopeId: js.UndefOr[String] = js.native
  
  /**
    * An array of recipient objects that provides details about the recipients of the envelope.
    */
  var recipients: js.UndefOr[js.Array[PowerFormFormDataRecipient]] = js.native
}
object PowerFormFormDataEnvelope {
  
  @scala.inline
  def apply(): PowerFormFormDataEnvelope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PowerFormFormDataEnvelope]
  }
  
  @scala.inline
  implicit class PowerFormFormDataEnvelopeMutableBuilder[Self <: PowerFormFormDataEnvelope] (val x: Self) extends AnyVal {
    
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
