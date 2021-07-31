package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomField extends StObject {
  
  /**
    * If you are using merge fields, this property specifies the type of the merge field. The only supported value is `salesforce`.
    */
  var configurationType: js.UndefOr[String] = js.undefined
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
  /**
    * The id of the custom field.
    */
  var fieldId: js.UndefOr[String] = js.undefined
  
  /**
    * An array of strings that represents the options in a list.
    *
    * Maximum length: 2048 characters, but each individual option string can only be a maximum of 100 characters.
    */
  var listItems: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The name of the custom field.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, senders are required to select an option from the list before they can send the envelope.
    */
  var required: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the field displays in the **Envelope Custom Fields** section when a user creates or sends an envelope.
    */
  var show: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the custom field. This is the value that the user who creates or sends the envelope selects from the list.
    */
  var value: js.UndefOr[String] = js.undefined
}
object ListCustomField {
  
  @scala.inline
  def apply(): ListCustomField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomField]
  }
  
  @scala.inline
  implicit class ListCustomFieldMutableBuilder[Self <: ListCustomField] (val x: Self) extends AnyVal {
    
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
    def setListItems(value: js.Array[String]): Self = StObject.set(x, "listItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListItemsUndefined: Self = StObject.set(x, "listItems", js.undefined)
    
    @scala.inline
    def setListItemsVarargs(value: String*): Self = StObject.set(x, "listItems", js.Array(value :_*))
    
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
