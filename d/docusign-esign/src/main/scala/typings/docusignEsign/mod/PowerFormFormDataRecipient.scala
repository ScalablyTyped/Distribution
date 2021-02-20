package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PowerFormFormDataRecipient extends StObject {
  
  var email: js.UndefOr[String] = js.native
  
  var formData: js.UndefOr[
    js.Array[
      /* A name-value pair that describes an item and provides a value for the item. */ NameValue
    ]
  ] = js.native
  
  /**
    * The name of the recipient.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The unique id for the recipient. It is used by the tab element to indicate which recipient is to sign the document.
    */
  var recipientId: js.UndefOr[String] = js.native
}
object PowerFormFormDataRecipient {
  
  @scala.inline
  def apply(): PowerFormFormDataRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PowerFormFormDataRecipient]
  }
  
  @scala.inline
  implicit class PowerFormFormDataRecipientMutableBuilder[Self <: PowerFormFormDataRecipient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setFormData(
      value: js.Array[
          /* A name-value pair that describes an item and provides a value for the item. */ NameValue
        ]
    ): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    @scala.inline
    def setFormDataVarargs(
      value: (/* A name-value pair that describes an item and provides a value for the item. */ NameValue)*
    ): Self = StObject.set(x, "formData", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRecipientId(value: String): Self = StObject.set(x, "recipientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientIdUndefined: Self = StObject.set(x, "recipientId", js.undefined)
  }
}
