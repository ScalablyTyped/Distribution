package typings.extjs.Ext.data.association

import typings.extjs.Ext.IBase
import typings.extjs.Ext.data.reader.IReader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAssociation extends IBase {
  
  /** [Config Option] (String) */
  var associatedModel: js.UndefOr[String] = js.native
  
  /** [Property] (String) */
  var associatedName: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var associationKey: js.UndefOr[String] = js.native
  
  /** [Method] Get a specialized reader for reading associated data
    * @returns Ext.data.reader.Reader The reader, null if not supplied
    */
  var getReader: js.UndefOr[js.Function0[IReader]] = js.native
  
  /** [Config Option] (String) */
  var model: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var ownerModel: js.UndefOr[String] = js.native
  
  /** [Property] (String) */
  var ownerName: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var primaryKey: js.UndefOr[String] = js.native
  
  /** [Config Option] (Ext.data.reader.Reader) */
  var reader: js.UndefOr[IReader] = js.native
}
object IAssociation {
  
  @scala.inline
  def apply(): IAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAssociation]
  }
  
  @scala.inline
  implicit class IAssociationOps[Self <: IAssociation] (val x: Self) extends AnyVal {
    
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
    def setAssociatedModel(value: String): Self = this.set("associatedModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociatedModel: Self = this.set("associatedModel", js.undefined)
    
    @scala.inline
    def setAssociatedName(value: String): Self = this.set("associatedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociatedName: Self = this.set("associatedName", js.undefined)
    
    @scala.inline
    def setAssociationKey(value: String): Self = this.set("associationKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociationKey: Self = this.set("associationKey", js.undefined)
    
    @scala.inline
    def setGetReader(value: () => IReader): Self = this.set("getReader", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetReader: Self = this.set("getReader", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setOwnerModel(value: String): Self = this.set("ownerModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerModel: Self = this.set("ownerModel", js.undefined)
    
    @scala.inline
    def setOwnerName(value: String): Self = this.set("ownerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerName: Self = this.set("ownerName", js.undefined)
    
    @scala.inline
    def setPrimaryKey(value: String): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryKey: Self = this.set("primaryKey", js.undefined)
    
    @scala.inline
    def setReader(value: IReader): Self = this.set("reader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReader: Self = this.set("reader", js.undefined)
  }
}
