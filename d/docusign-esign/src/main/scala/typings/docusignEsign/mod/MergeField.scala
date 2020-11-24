package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergeField extends js.Object {
  
  /**
    * When **true**, the sender can modify the value of the `mergeField` tab during the sending process.
    */
  var allowSenderToEdit: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates if the sender can edit the `allowSenderToEdit` property.
    */
  var allowSenderToEditMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * If you are using merge fields, this property specifies the type of the merge field. The only supported value is `salesforce`.
    */
  var configurationType: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates if the sender can edit the `configurationType` property.
    */
  var configurationTypeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Sets the object associated with the custom tab. Currently this is the Salesforce object.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var pathExtended: js.UndefOr[js.Array[PathExtendedElement]] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var pathExtendedMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Metadata that indicates whether the `path` property is editable.
    *
    */
  var pathMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Specifies the row number in a Salesforce table that the merge field value corresponds to.
    */
  var row: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `row` property is editable.
    *
    */
  var rowMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When **true**, data entered into the merge field during Signing will update the mapped Salesforce field.
    */
  var writeBack: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates if the sender can edit the `writeBack` property.
    */
  var writeBackMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
}
object MergeField {
  
  @scala.inline
  def apply(): MergeField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeField]
  }
  
  @scala.inline
  implicit class MergeFieldOps[Self <: MergeField] (val x: Self) extends AnyVal {
    
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
    def setAllowSenderToEdit(value: String): Self = this.set("allowSenderToEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSenderToEdit: Self = this.set("allowSenderToEdit", js.undefined)
    
    @scala.inline
    def setAllowSenderToEditMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("allowSenderToEditMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSenderToEditMetadata: Self = this.set("allowSenderToEditMetadata", js.undefined)
    
    @scala.inline
    def setConfigurationType(value: String): Self = this.set("configurationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationType: Self = this.set("configurationType", js.undefined)
    
    @scala.inline
    def setConfigurationTypeMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("configurationTypeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationTypeMetadata: Self = this.set("configurationTypeMetadata", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPathExtendedVarargs(value: PathExtendedElement*): Self = this.set("pathExtended", js.Array(value :_*))
    
    @scala.inline
    def setPathExtended(value: js.Array[PathExtendedElement]): Self = this.set("pathExtended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathExtended: Self = this.set("pathExtended", js.undefined)
    
    @scala.inline
    def setPathExtendedMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("pathExtendedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathExtendedMetadata: Self = this.set("pathExtendedMetadata", js.undefined)
    
    @scala.inline
    def setPathMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("pathMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathMetadata: Self = this.set("pathMetadata", js.undefined)
    
    @scala.inline
    def setRow(value: String): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    
    @scala.inline
    def setRowMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("rowMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowMetadata: Self = this.set("rowMetadata", js.undefined)
    
    @scala.inline
    def setWriteBack(value: String): Self = this.set("writeBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteBack: Self = this.set("writeBack", js.undefined)
    
    @scala.inline
    def setWriteBackMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("writeBackMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteBackMetadata: Self = this.set("writeBackMetadata", js.undefined)
  }
}
