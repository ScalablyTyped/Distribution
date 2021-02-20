package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextCustomField extends StObject {
  
  /**
    * If you are using merge fields, this property specifies the type of the merge field. The only supported value is `salesforce`.
    */
  var configurationType: js.UndefOr[String] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * The id of the custom field.
    */
  var fieldId: js.UndefOr[String] = js.native
  
  /**
    * The name of the custom field.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, senders are required to enter or select information for the field before they can send the envelope.
    */
  var required: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the field displays in the **Envelope Custom Fields** section when a user creates or sends an envelope.
    */
  var show: js.UndefOr[String] = js.native
  
  /**
    * The value of the custom field. The user who creates or sends the envelope provides this value. Maximum length: 100 characters.
    */
  var value: js.UndefOr[String] = js.native
}
object TextCustomField {
  
  @scala.inline
  def apply(): TextCustomField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextCustomField]
  }
  
  @scala.inline
  implicit class TextCustomFieldMutableBuilder[Self <: TextCustomField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationType(value: String): Self = StObject.set(x, "configurationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationTypeUndefined: Self = StObject.set(x, "configurationType", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setFieldId(value: String): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldIdUndefined: Self = StObject.set(x, "fieldId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRequired(value: String): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setShow(value: String): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
