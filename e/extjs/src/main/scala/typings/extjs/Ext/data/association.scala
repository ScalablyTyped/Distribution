package typings.extjs.Ext.data

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object association {
  
  trait IAssociation
    extends StObject
       with IBase {
    
    /** [Config Option] (String) */
    var associatedModel: js.UndefOr[String] = js.undefined
    
    /** [Property] (String) */
    var associatedName: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var associationKey: js.UndefOr[String] = js.undefined
    
    /** [Method] Get a specialized reader for reading associated data
      * @returns Ext.data.reader.Reader The reader, null if not supplied
      */
    var getReader: js.UndefOr[js.Function0[typings.extjs.Ext.data.reader.IReader]] = js.undefined
    
    /** [Config Option] (String) */
    var model: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var ownerModel: js.UndefOr[String] = js.undefined
    
    /** [Property] (String) */
    var ownerName: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var primaryKey: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (Ext.data.reader.Reader) */
    var reader: js.UndefOr[typings.extjs.Ext.data.reader.IReader] = js.undefined
  }
  object IAssociation {
    
    inline def apply(): typings.extjs.Ext.data.association.IAssociation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.data.association.IAssociation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.extjs.Ext.data.association.IAssociation] (val x: Self) extends AnyVal {
      
      inline def setAssociatedModel(value: String): Self = StObject.set(x, "associatedModel", value.asInstanceOf[js.Any])
      
      inline def setAssociatedModelUndefined: Self = StObject.set(x, "associatedModel", js.undefined)
      
      inline def setAssociatedName(value: String): Self = StObject.set(x, "associatedName", value.asInstanceOf[js.Any])
      
      inline def setAssociatedNameUndefined: Self = StObject.set(x, "associatedName", js.undefined)
      
      inline def setAssociationKey(value: String): Self = StObject.set(x, "associationKey", value.asInstanceOf[js.Any])
      
      inline def setAssociationKeyUndefined: Self = StObject.set(x, "associationKey", js.undefined)
      
      inline def setGetReader(value: () => typings.extjs.Ext.data.reader.IReader): Self = StObject.set(x, "getReader", js.Any.fromFunction0(value))
      
      inline def setGetReaderUndefined: Self = StObject.set(x, "getReader", js.undefined)
      
      inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setOwnerModel(value: String): Self = StObject.set(x, "ownerModel", value.asInstanceOf[js.Any])
      
      inline def setOwnerModelUndefined: Self = StObject.set(x, "ownerModel", js.undefined)
      
      inline def setOwnerName(value: String): Self = StObject.set(x, "ownerName", value.asInstanceOf[js.Any])
      
      inline def setOwnerNameUndefined: Self = StObject.set(x, "ownerName", js.undefined)
      
      inline def setPrimaryKey(value: String): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
      
      inline def setReader(value: typings.extjs.Ext.data.reader.IReader): Self = StObject.set(x, "reader", value.asInstanceOf[js.Any])
      
      inline def setReaderUndefined: Self = StObject.set(x, "reader", js.undefined)
    }
  }
  
  trait IBelongsTo
    extends StObject
       with typings.extjs.Ext.data.association.IAssociation {
    
    /** [Config Option] (String) */
    var foreignKey: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var getterName: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var setterName: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object IBelongsTo {
    
    inline def apply(): IBelongsTo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBelongsTo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBelongsTo] (val x: Self) extends AnyVal {
      
      inline def setForeignKey(value: String): Self = StObject.set(x, "foreignKey", value.asInstanceOf[js.Any])
      
      inline def setForeignKeyUndefined: Self = StObject.set(x, "foreignKey", js.undefined)
      
      inline def setGetterName(value: String): Self = StObject.set(x, "getterName", value.asInstanceOf[js.Any])
      
      inline def setGetterNameUndefined: Self = StObject.set(x, "getterName", js.undefined)
      
      inline def setSetterName(value: String): Self = StObject.set(x, "setterName", value.asInstanceOf[js.Any])
      
      inline def setSetterNameUndefined: Self = StObject.set(x, "setterName", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait IHasMany
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
    var storeConfig: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (String) */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object IHasMany {
    
    inline def apply(): IHasMany = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHasMany]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IHasMany] (val x: Self) extends AnyVal {
      
      inline def setAutoLoad(value: Boolean): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
      
      inline def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
      
      inline def setFilterProperty(value: String): Self = StObject.set(x, "filterProperty", value.asInstanceOf[js.Any])
      
      inline def setFilterPropertyUndefined: Self = StObject.set(x, "filterProperty", js.undefined)
      
      inline def setForeignKey(value: String): Self = StObject.set(x, "foreignKey", value.asInstanceOf[js.Any])
      
      inline def setForeignKeyUndefined: Self = StObject.set(x, "foreignKey", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setStoreConfig(value: Any): Self = StObject.set(x, "storeConfig", value.asInstanceOf[js.Any])
      
      inline def setStoreConfigUndefined: Self = StObject.set(x, "storeConfig", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait IHasOne
    extends StObject
       with typings.extjs.Ext.data.association.IAssociation {
    
    /** [Config Option] (String) */
    var foreignKey: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var getterName: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var setterName: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object IHasOne {
    
    inline def apply(): IHasOne = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHasOne]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IHasOne] (val x: Self) extends AnyVal {
      
      inline def setForeignKey(value: String): Self = StObject.set(x, "foreignKey", value.asInstanceOf[js.Any])
      
      inline def setForeignKeyUndefined: Self = StObject.set(x, "foreignKey", js.undefined)
      
      inline def setGetterName(value: String): Self = StObject.set(x, "getterName", value.asInstanceOf[js.Any])
      
      inline def setGetterNameUndefined: Self = StObject.set(x, "getterName", js.undefined)
      
      inline def setSetterName(value: String): Self = StObject.set(x, "setterName", value.asInstanceOf[js.Any])
      
      inline def setSetterNameUndefined: Self = StObject.set(x, "setterName", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
