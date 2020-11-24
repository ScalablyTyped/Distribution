package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomField extends js.Object {
  
  /**
    * The type of custom field. Valid values are:
    *
    * - `text` (default)
    * - `list`
    */
  var customFieldType: js.UndefOr[String] = js.native
  
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
    * For a list custom field, this is an array of strings that represent the items in a list.
    *
    * Maximum Length: 2,000 characters.
    */
  var listItems: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The name of the custom field.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the signer must complete the custom field.
    */
  var required: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the custom field displays at the top of the Certificate of Completion.
    */
  var show: js.UndefOr[String] = js.native
  
  /**
    * Specifies the value of the custom field.
    *
    * Maximum Length: 2,000 characters.
    */
  var value: js.UndefOr[String] = js.native
}
object CustomField {
  
  @scala.inline
  def apply(): CustomField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomField]
  }
  
  @scala.inline
  implicit class CustomFieldOps[Self <: CustomField] (val x: Self) extends AnyVal {
    
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
    def setCustomFieldType(value: String): Self = this.set("customFieldType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomFieldType: Self = this.set("customFieldType", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setFieldId(value: String): Self = this.set("fieldId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldId: Self = this.set("fieldId", js.undefined)
    
    @scala.inline
    def setListItemsVarargs(value: String*): Self = this.set("listItems", js.Array(value :_*))
    
    @scala.inline
    def setListItems(value: js.Array[String]): Self = this.set("listItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListItems: Self = this.set("listItems", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRequired(value: String): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setShow(value: String): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
