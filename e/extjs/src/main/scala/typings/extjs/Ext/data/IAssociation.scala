package typings.extjs.Ext.data

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  inline def apply(): IAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAssociation]
  }
  
  extension [Self <: IAssociation](x: Self) {
    
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
