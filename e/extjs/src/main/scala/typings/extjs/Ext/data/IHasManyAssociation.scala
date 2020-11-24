package typings.extjs.Ext.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHasManyAssociation
  extends typings.extjs.Ext.data.association.IAssociation {
  
  /** [Config Option] (Boolean) */
  var autoLoad: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var filterProperty: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var foreignKey: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.native
  
  /** [Config Option] (Object) */
  var storeConfig: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var `type`: js.UndefOr[String] = js.native
}
object IHasManyAssociation {
  
  @scala.inline
  def apply(): IHasManyAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHasManyAssociation]
  }
  
  @scala.inline
  implicit class IHasManyAssociationOps[Self <: IHasManyAssociation] (val x: Self) extends AnyVal {
    
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
    def setAutoLoad(value: Boolean): Self = this.set("autoLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoLoad: Self = this.set("autoLoad", js.undefined)
    
    @scala.inline
    def setFilterProperty(value: String): Self = this.set("filterProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterProperty: Self = this.set("filterProperty", js.undefined)
    
    @scala.inline
    def setForeignKey(value: String): Self = this.set("foreignKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForeignKey: Self = this.set("foreignKey", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setStoreConfig(value: js.Any): Self = this.set("storeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreConfig: Self = this.set("storeConfig", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
