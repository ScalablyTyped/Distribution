package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectSalesforceObject extends js.Object {
  
  /**
    * When set to **true**, the `connectSalesforceObject` is active.
    */
  var active: js.UndefOr[String] = js.native
  
  /**
    * A description of the `connectSalesforceObject`.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The id of the `connectSalesforceObject`.
    */
  var id: js.UndefOr[String] = js.native
  
  var insert: js.UndefOr[String] = js.native
  
  /**
    * When **true**, Salesforce is updated only when the envelope is complete.
    */
  var onCompleteOnly: js.UndefOr[String] = js.native
  
  /**
    * The DocuSign and Salesforce fields that you want to use to match a Salesforce object with DocuSign information. This information tells Connect when to send updates to Salesforce.
    */
  var selectFields: js.UndefOr[
    js.Array[
      /* This object is used to match a DocuSign field to a Salesforce field so that Docusign can send information to your Salesforce account. */ ConnectSalesforceField
    ]
  ] = js.native
  
  /**
    * The Salesforce.com object type, such as `case`, `contact`, or `opportunity`.
    */
  var sfObject: js.UndefOr[String] = js.native
  
  /**
    * A name for the Salesforce object.
    *
    * **Note**: You can enter any name for the object. It does not have to match the `sfObject` property.
    */
  var sfObjectName: js.UndefOr[String] = js.native
  
  /**
    * The DocuSign and Salesforce fields that you want to update.
    *
    * **Note**: You can choose to update SalesForce (with information from DocuSign) only, update DocuSign only, or both.
    */
  var updateFields: js.UndefOr[
    js.Array[
      /* This object is used to match a DocuSign field to a Salesforce field so that Docusign can send information to your Salesforce account. */ ConnectSalesforceField
    ]
  ] = js.native
}
object ConnectSalesforceObject {
  
  @scala.inline
  def apply(): ConnectSalesforceObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectSalesforceObject]
  }
  
  @scala.inline
  implicit class ConnectSalesforceObjectOps[Self <: ConnectSalesforceObject] (val x: Self) extends AnyVal {
    
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
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInsert(value: String): Self = this.set("insert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsert: Self = this.set("insert", js.undefined)
    
    @scala.inline
    def setOnCompleteOnly(value: String): Self = this.set("onCompleteOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCompleteOnly: Self = this.set("onCompleteOnly", js.undefined)
    
    @scala.inline
    def setSelectFieldsVarargs(
      value: (/* This object is used to match a DocuSign field to a Salesforce field so that Docusign can send information to your Salesforce account. */ ConnectSalesforceField)*
    ): Self = this.set("selectFields", js.Array(value :_*))
    
    @scala.inline
    def setSelectFields(
      value: js.Array[
          /* This object is used to match a DocuSign field to a Salesforce field so that Docusign can send information to your Salesforce account. */ ConnectSalesforceField
        ]
    ): Self = this.set("selectFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectFields: Self = this.set("selectFields", js.undefined)
    
    @scala.inline
    def setSfObject(value: String): Self = this.set("sfObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSfObject: Self = this.set("sfObject", js.undefined)
    
    @scala.inline
    def setSfObjectName(value: String): Self = this.set("sfObjectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSfObjectName: Self = this.set("sfObjectName", js.undefined)
    
    @scala.inline
    def setUpdateFieldsVarargs(
      value: (/* This object is used to match a DocuSign field to a Salesforce field so that Docusign can send information to your Salesforce account. */ ConnectSalesforceField)*
    ): Self = this.set("updateFields", js.Array(value :_*))
    
    @scala.inline
    def setUpdateFields(
      value: js.Array[
          /* This object is used to match a DocuSign field to a Salesforce field so that Docusign can send information to your Salesforce account. */ ConnectSalesforceField
        ]
    ): Self = this.set("updateFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateFields: Self = this.set("updateFields", js.undefined)
  }
}
