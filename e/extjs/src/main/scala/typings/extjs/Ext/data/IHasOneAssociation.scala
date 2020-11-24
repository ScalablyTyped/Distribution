package typings.extjs.Ext.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHasOneAssociation
  extends typings.extjs.Ext.data.association.IAssociation {
  
  /** [Config Option] (String) */
  var foreignKey: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var getterName: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var setterName: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var `type`: js.UndefOr[String] = js.native
}
object IHasOneAssociation {
  
  @scala.inline
  def apply(): IHasOneAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHasOneAssociation]
  }
  
  @scala.inline
  implicit class IHasOneAssociationOps[Self <: IHasOneAssociation] (val x: Self) extends AnyVal {
    
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
    def setForeignKey(value: String): Self = this.set("foreignKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForeignKey: Self = this.set("foreignKey", js.undefined)
    
    @scala.inline
    def setGetterName(value: String): Self = this.set("getterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetterName: Self = this.set("getterName", js.undefined)
    
    @scala.inline
    def setSetterName(value: String): Self = this.set("setterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetterName: Self = this.set("setterName", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
