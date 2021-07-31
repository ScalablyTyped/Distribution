package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectSalesforceField extends StObject {
  
  var dsAttribute: js.UndefOr[String] = js.undefined
  
  /**
    * A URL that links to the information in the DocuSign field.
    */
  var dsLink: js.UndefOr[String] = js.undefined
  
  var dsNode: js.UndefOr[String] = js.undefined
  
  /**
    * A unique ID for the Salesforce object.
    */
  var id: js.UndefOr[String] = js.undefined
  
  var sfField: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Salesforce field.
    */
  var sfFieldName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Salesforce folder.
    */
  var sfFolder: js.UndefOr[String] = js.undefined
  
  var sfLockedValue: js.UndefOr[String] = js.undefined
}
object ConnectSalesforceField {
  
  @scala.inline
  def apply(): ConnectSalesforceField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectSalesforceField]
  }
  
  @scala.inline
  implicit class ConnectSalesforceFieldMutableBuilder[Self <: ConnectSalesforceField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDsAttribute(value: String): Self = StObject.set(x, "dsAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDsAttributeUndefined: Self = StObject.set(x, "dsAttribute", js.undefined)
    
    @scala.inline
    def setDsLink(value: String): Self = StObject.set(x, "dsLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDsLinkUndefined: Self = StObject.set(x, "dsLink", js.undefined)
    
    @scala.inline
    def setDsNode(value: String): Self = StObject.set(x, "dsNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDsNodeUndefined: Self = StObject.set(x, "dsNode", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setSfField(value: String): Self = StObject.set(x, "sfField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSfFieldName(value: String): Self = StObject.set(x, "sfFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSfFieldNameUndefined: Self = StObject.set(x, "sfFieldName", js.undefined)
    
    @scala.inline
    def setSfFieldUndefined: Self = StObject.set(x, "sfField", js.undefined)
    
    @scala.inline
    def setSfFolder(value: String): Self = StObject.set(x, "sfFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSfFolderUndefined: Self = StObject.set(x, "sfFolder", js.undefined)
    
    @scala.inline
    def setSfLockedValue(value: String): Self = StObject.set(x, "sfLockedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSfLockedValueUndefined: Self = StObject.set(x, "sfLockedValue", js.undefined)
  }
}
