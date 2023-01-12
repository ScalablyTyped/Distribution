package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeField extends StObject {
  
  /**
    * When **true**, the sender can modify the value of the `mergeField` tab during the sending process.
    */
  var allowSenderToEdit: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates if the sender can edit the `allowSenderToEdit` property.
    */
  var allowSenderToEditMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * If you are using merge fields, this property specifies the type of the merge field. The only supported value is `salesforce`.
    */
  var configurationType: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates if the sender can edit the `configurationType` property.
    */
  var configurationTypeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Sets the object associated with the custom tab. Currently this is the Salesforce object.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var pathExtended: js.UndefOr[js.Array[PathExtendedElement]] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var pathExtendedMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Metadata that indicates whether the `path` property is editable.
    *
    */
  var pathMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Specifies the row number in a Salesforce table that the merge field value corresponds to.
    */
  var row: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `row` property is editable.
    *
    */
  var rowMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * When **true**, data entered into the merge field during Signing will update the mapped Salesforce field.
    */
  var writeBack: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates if the sender can edit the `writeBack` property.
    */
  var writeBackMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
}
object MergeField {
  
  inline def apply(): MergeField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MergeField] (val x: Self) extends AnyVal {
    
    inline def setAllowSenderToEdit(value: String): Self = StObject.set(x, "allowSenderToEdit", value.asInstanceOf[js.Any])
    
    inline def setAllowSenderToEditMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "allowSenderToEditMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowSenderToEditMetadataUndefined: Self = StObject.set(x, "allowSenderToEditMetadata", js.undefined)
    
    inline def setAllowSenderToEditUndefined: Self = StObject.set(x, "allowSenderToEdit", js.undefined)
    
    inline def setConfigurationType(value: String): Self = StObject.set(x, "configurationType", value.asInstanceOf[js.Any])
    
    inline def setConfigurationTypeMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "configurationTypeMetadata", value.asInstanceOf[js.Any])
    
    inline def setConfigurationTypeMetadataUndefined: Self = StObject.set(x, "configurationTypeMetadata", js.undefined)
    
    inline def setConfigurationTypeUndefined: Self = StObject.set(x, "configurationType", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathExtended(value: js.Array[PathExtendedElement]): Self = StObject.set(x, "pathExtended", value.asInstanceOf[js.Any])
    
    inline def setPathExtendedMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "pathExtendedMetadata", value.asInstanceOf[js.Any])
    
    inline def setPathExtendedMetadataUndefined: Self = StObject.set(x, "pathExtendedMetadata", js.undefined)
    
    inline def setPathExtendedUndefined: Self = StObject.set(x, "pathExtended", js.undefined)
    
    inline def setPathExtendedVarargs(value: PathExtendedElement*): Self = StObject.set(x, "pathExtended", js.Array(value*))
    
    inline def setPathMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "pathMetadata", value.asInstanceOf[js.Any])
    
    inline def setPathMetadataUndefined: Self = StObject.set(x, "pathMetadata", js.undefined)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setRow(value: String): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "rowMetadata", value.asInstanceOf[js.Any])
    
    inline def setRowMetadataUndefined: Self = StObject.set(x, "rowMetadata", js.undefined)
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    inline def setWriteBack(value: String): Self = StObject.set(x, "writeBack", value.asInstanceOf[js.Any])
    
    inline def setWriteBackMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "writeBackMetadata", value.asInstanceOf[js.Any])
    
    inline def setWriteBackMetadataUndefined: Self = StObject.set(x, "writeBackMetadata", js.undefined)
    
    inline def setWriteBackUndefined: Self = StObject.set(x, "writeBack", js.undefined)
  }
}
