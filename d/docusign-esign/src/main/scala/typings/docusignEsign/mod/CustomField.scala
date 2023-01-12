package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomField extends StObject {
  
  /**
    * The type of custom field. Valid values are:
    *
    * - `text` (default)
    * - `list`
    */
  var customFieldType: js.UndefOr[String] = js.undefined
  
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
    * For a list custom field, this is an array of strings that represent the items in a list.
    *
    * Maximum Length: 2,000 characters.
    */
  var listItems: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The name of the custom field.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the signer must complete the custom field.
    */
  var required: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the custom field displays at the top of the Certificate of Completion.
    */
  var show: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the value of the custom field.
    *
    * Maximum Length: 2,000 characters.
    */
  var value: js.UndefOr[String] = js.undefined
}
object CustomField {
  
  inline def apply(): CustomField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomField] (val x: Self) extends AnyVal {
    
    inline def setCustomFieldType(value: String): Self = StObject.set(x, "customFieldType", value.asInstanceOf[js.Any])
    
    inline def setCustomFieldTypeUndefined: Self = StObject.set(x, "customFieldType", js.undefined)
    
    inline def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setFieldId(value: String): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
    
    inline def setFieldIdUndefined: Self = StObject.set(x, "fieldId", js.undefined)
    
    inline def setListItems(value: js.Array[String]): Self = StObject.set(x, "listItems", value.asInstanceOf[js.Any])
    
    inline def setListItemsUndefined: Self = StObject.set(x, "listItems", js.undefined)
    
    inline def setListItemsVarargs(value: String*): Self = StObject.set(x, "listItems", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequired(value: String): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setShow(value: String): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
