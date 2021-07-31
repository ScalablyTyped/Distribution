package typings.extjs.Ext.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHasManyAssociation
  extends StObject
     with typings.extjs.Ext.data.association.IAssociation {
  
  /** [Config Option] (Boolean) */
  var autoLoad: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var filterProperty: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var foreignKey: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Object) */
  var storeConfig: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String) */
  var `type`: js.UndefOr[String] = js.undefined
}
object IHasManyAssociation {
  
  @scala.inline
  def apply(): IHasManyAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHasManyAssociation]
  }
  
  @scala.inline
  implicit class IHasManyAssociationMutableBuilder[Self <: IHasManyAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoLoad(value: Boolean): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
    
    @scala.inline
    def setFilterProperty(value: String): Self = StObject.set(x, "filterProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterPropertyUndefined: Self = StObject.set(x, "filterProperty", js.undefined)
    
    @scala.inline
    def setForeignKey(value: String): Self = StObject.set(x, "foreignKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeignKeyUndefined: Self = StObject.set(x, "foreignKey", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStoreConfig(value: js.Any): Self = StObject.set(x, "storeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreConfigUndefined: Self = StObject.set(x, "storeConfig", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
