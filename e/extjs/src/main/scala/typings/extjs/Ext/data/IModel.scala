package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IModel
  extends StObject
     with IObservable {
  
  /** [Property] (String) */
  var COMMIT: js.UndefOr[String] = js.undefined
  
  /** [Property] (String) */
  var EDIT: js.UndefOr[String] = js.undefined
  
  /** [Property] (String) */
  var REJECT: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Object[]) */
  var associations: js.UndefOr[Array] = js.undefined
  
  /** [Method] Begins an edit  */
  var beginEdit: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String/Object/String[]/Object[]) */
  var belongsTo: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Cancels all changes made in the current edit operation  */
  var cancelEdit: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var clientIdProperty: js.UndefOr[String] = js.undefined
  
  /** [Method] Usually called by the Ext data Store which owns the model instance
    * @param silent Boolean Pass true to skip notification of the owning store of the change.
    * @param modifiedFieldNames String[] Array of field names changed during sync with server if known. Omit or pass null if unknown. An empty array means that it is known that no fields were modified by the server's response. Defaults to false.
    */
  var commit: js.UndefOr[
    js.Function2[/* silent */ js.UndefOr[Boolean], /* modifiedFieldNames */ js.UndefOr[Array], Unit]
  ] = js.undefined
  
  /** [Method] Creates a copy clone of this Model instance
    * @param id String A new id, defaults to the id of the instance being copied. See id. To generate a phantom instance with a new id use: var rec = record.copy(); // clone the record Ext.data.Model.id(rec); // automatically generate a unique sequential id
    * @returns Ext.data.Model
    */
  var copy: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], this.type]] = js.undefined
  
  /** [Config Option] (String) */
  var defaultProxyType: js.UndefOr[String] = js.undefined
  
  /** [Method] Destroys the model using the configured proxy
    * @param options Object Options to pass to the proxy. Config object for Ext.data.Operation.
    * @returns Ext.data.Model The Model instance
    */
  var destroy: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], this.type]] = js.undefined
  
  /** [Property] (Boolean) */
  var dirty: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Boolean) */
  var editing: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Ends an edit
    * @param silent Boolean True to not notify the store of the change
    * @param modifiedFieldNames String[] Array of field names changed during edit.
    */
  var endEdit: js.UndefOr[
    js.Function2[/* silent */ js.UndefOr[Boolean], /* modifiedFieldNames */ js.UndefOr[Array], Unit]
  ] = js.undefined
  
  /** [Config Option] (Object[]/String[]) */
  var fields: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Returns the value of the given field
    * @param fieldName String The field to fetch the value for
    * @returns Object The value
    */
  var get: js.UndefOr[js.Function1[/* fieldName */ js.UndefOr[String], js.Any]] = js.undefined
  
  /** [Method] Gets all of the data from this Models loaded associations
    * @returns Object The nested data set for the Model's loaded associations
    */
  var getAssociatedData: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Gets a hash of only the fields that have been modified since this Model was created or commited
    * @returns Object
    */
  var getChanges: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Gets all values for each field in this model and returns an object containing the current data
    * @param includeAssociated Boolean True to also include associated data. Defaults to false.
    * @returns Object An object hash containing all the values in this model
    */
  var getData: js.UndefOr[js.Function1[/* includeAssociated */ js.UndefOr[Boolean], js.Any]] = js.undefined
  
  /** [Method] Returns the unique ID allocated to this model instance as defined by idProperty
    * @returns Number/String The id
    */
  var getId: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the configured Proxy for this Model
    * @returns Ext.data.proxy.Proxy The proxy
    */
  var getProxy: js.UndefOr[js.Function0[typings.extjs.Ext.data.proxy.IProxy]] = js.undefined
  
  /** [Config Option] (String/Object/String[]/Object[]) */
  var hasMany: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String/Object/Ext.data.Field) */
  var idProperty: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String/Object) */
  var idgen: js.UndefOr[js.Any] = js.undefined
  
  /** [Property] (Boolean) */
  var isModel: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Returns true if the passed field name has been modified since the load or last commit
    * @param fieldName String Ext.data.Field.name
    * @returns Boolean
    */
  var isModified: js.UndefOr[js.Function1[/* fieldName */ js.UndefOr[String], Boolean]] = js.undefined
  
  /** [Method] Checks if the model is valid
    * @returns Boolean True if the model is valid.
    */
  var isValid: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Tells this model instance that it has been added to a store
    * @param store Ext.data.Store The store to which this model has been added.
    */
  var join: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], Unit]] = js.undefined
  
  /** [Property] (Object) */
  var modified: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String) */
  var persistenceProperty: js.UndefOr[String] = js.undefined
  
  /** [Property] (Boolean) */
  var phantom: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String/Object/Ext.data.proxy.Proxy) */
  var proxy: js.UndefOr[js.Any] = js.undefined
  
  /** [Property] (Object) */
  var raw: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Usually called by the Ext data Store to which this model instance has been joined
    * @param silent Boolean True to skip notification of the owning store of the change. Defaults to false.
    */
  var reject: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Saves the model instance using the configured proxy
    * @param options Object Options to pass to the proxy. Config object for Ext.data.Operation.
    * @returns Ext.data.Model The Model instance
    */
  var save: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], this.type]] = js.undefined
  
  /** [Method] Sets the given field to the given value marks the instance as dirty
    * @param fieldName String/Object The field to set, or an object containing key/value pairs
    * @param newValue Object The value to set
    * @returns String[] The array of modified field names or null if nothing was modified.
    */
  var set: js.UndefOr[
    js.Function2[/* fieldName */ js.UndefOr[js.Any], /* newValue */ js.UndefOr[js.Any], Array]
  ] = js.undefined
  
  /** [Method] Marks this Record as dirty  */
  var setDirty: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Sets the model instance s id field to the given id
    * @param id Number/String The new id
    */
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the Proxy to use for this model
    * @param proxy String/Object/Ext.data.proxy.Proxy The proxy
    * @returns Ext.data.proxy.Proxy
    */
  var setProxy: js.UndefOr[
    js.Function1[/* proxy */ js.UndefOr[js.Any], typings.extjs.Ext.data.proxy.IProxy]
  ] = js.undefined
  
  /** [Property] (Ext.data.Store) */
  var store: js.UndefOr[IStore] = js.undefined
  
  /** [Property] (Ext.data.Store[]) */
  var stores: js.UndefOr[Array] = js.undefined
  
  /** [Method] Tells this model instance that it has been removed from the store
    * @param store Ext.data.Store The store from which this model has been removed.
    */
  var unjoin: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], Unit]] = js.undefined
  
  /** [Method] Validates the current data against all of its configured validations
    * @returns Ext.data.Errors The errors object
    */
  var validate: js.UndefOr[js.Function0[IErrors]] = js.undefined
  
  /** [Config Option] (Object[]) */
  var validations: js.UndefOr[Array] = js.undefined
}
object IModel {
  
  inline def apply(): IModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModel]
  }
  
  extension [Self <: IModel](x: Self) {
    
    inline def setAssociations(value: Array): Self = StObject.set(x, "associations", value.asInstanceOf[js.Any])
    
    inline def setAssociationsUndefined: Self = StObject.set(x, "associations", js.undefined)
    
    inline def setBeginEdit(value: () => Unit): Self = StObject.set(x, "beginEdit", js.Any.fromFunction0(value))
    
    inline def setBeginEditUndefined: Self = StObject.set(x, "beginEdit", js.undefined)
    
    inline def setBelongsTo(value: js.Any): Self = StObject.set(x, "belongsTo", value.asInstanceOf[js.Any])
    
    inline def setBelongsToUndefined: Self = StObject.set(x, "belongsTo", js.undefined)
    
    inline def setCOMMIT(value: String): Self = StObject.set(x, "COMMIT", value.asInstanceOf[js.Any])
    
    inline def setCOMMITUndefined: Self = StObject.set(x, "COMMIT", js.undefined)
    
    inline def setCancelEdit(value: () => Unit): Self = StObject.set(x, "cancelEdit", js.Any.fromFunction0(value))
    
    inline def setCancelEditUndefined: Self = StObject.set(x, "cancelEdit", js.undefined)
    
    inline def setClientIdProperty(value: String): Self = StObject.set(x, "clientIdProperty", value.asInstanceOf[js.Any])
    
    inline def setClientIdPropertyUndefined: Self = StObject.set(x, "clientIdProperty", js.undefined)
    
    inline def setCopy(value: /* id */ js.UndefOr[String] => IModel): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
    
    inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    inline def setDefaultProxyType(value: String): Self = StObject.set(x, "defaultProxyType", value.asInstanceOf[js.Any])
    
    inline def setDefaultProxyTypeUndefined: Self = StObject.set(x, "defaultProxyType", js.undefined)
    
    inline def setDestroy(value: /* options */ js.UndefOr[js.Any] => IModel): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    inline def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
    
    inline def setEDIT(value: String): Self = StObject.set(x, "EDIT", value.asInstanceOf[js.Any])
    
    inline def setEDITUndefined: Self = StObject.set(x, "EDIT", js.undefined)
    
    inline def setEditing(value: Boolean): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
    
    inline def setEditingUndefined: Self = StObject.set(x, "editing", js.undefined)
    
    inline def setEndEdit(value: (/* silent */ js.UndefOr[Boolean], /* modifiedFieldNames */ js.UndefOr[Array]) => Unit): Self = StObject.set(x, "endEdit", js.Any.fromFunction2(value))
    
    inline def setEndEditUndefined: Self = StObject.set(x, "endEdit", js.undefined)
    
    inline def setFields(value: js.Any): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setGet(value: /* fieldName */ js.UndefOr[String] => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetAssociatedData(value: () => js.Any): Self = StObject.set(x, "getAssociatedData", js.Any.fromFunction0(value))
    
    inline def setGetAssociatedDataUndefined: Self = StObject.set(x, "getAssociatedData", js.undefined)
    
    inline def setGetChanges(value: () => js.Any): Self = StObject.set(x, "getChanges", js.Any.fromFunction0(value))
    
    inline def setGetChangesUndefined: Self = StObject.set(x, "getChanges", js.undefined)
    
    inline def setGetData(value: /* includeAssociated */ js.UndefOr[Boolean] => js.Any): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
    
    inline def setGetDataUndefined: Self = StObject.set(x, "getData", js.undefined)
    
    inline def setGetId(value: () => js.Any): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetIdUndefined: Self = StObject.set(x, "getId", js.undefined)
    
    inline def setGetProxy(value: () => typings.extjs.Ext.data.proxy.IProxy): Self = StObject.set(x, "getProxy", js.Any.fromFunction0(value))
    
    inline def setGetProxyUndefined: Self = StObject.set(x, "getProxy", js.undefined)
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    inline def setHasMany(value: js.Any): Self = StObject.set(x, "hasMany", value.asInstanceOf[js.Any])
    
    inline def setHasManyUndefined: Self = StObject.set(x, "hasMany", js.undefined)
    
    inline def setIdProperty(value: js.Any): Self = StObject.set(x, "idProperty", value.asInstanceOf[js.Any])
    
    inline def setIdPropertyUndefined: Self = StObject.set(x, "idProperty", js.undefined)
    
    inline def setIdgen(value: js.Any): Self = StObject.set(x, "idgen", value.asInstanceOf[js.Any])
    
    inline def setIdgenUndefined: Self = StObject.set(x, "idgen", js.undefined)
    
    inline def setIsModel(value: Boolean): Self = StObject.set(x, "isModel", value.asInstanceOf[js.Any])
    
    inline def setIsModelUndefined: Self = StObject.set(x, "isModel", js.undefined)
    
    inline def setIsModified(value: /* fieldName */ js.UndefOr[String] => Boolean): Self = StObject.set(x, "isModified", js.Any.fromFunction1(value))
    
    inline def setIsModifiedUndefined: Self = StObject.set(x, "isModified", js.undefined)
    
    inline def setIsValid(value: () => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
    
    inline def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    inline def setJoin(value: /* store */ js.UndefOr[IStore] => Unit): Self = StObject.set(x, "join", js.Any.fromFunction1(value))
    
    inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
    
    inline def setModified(value: js.Any): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    inline def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
    
    inline def setPersistenceProperty(value: String): Self = StObject.set(x, "persistenceProperty", value.asInstanceOf[js.Any])
    
    inline def setPersistencePropertyUndefined: Self = StObject.set(x, "persistenceProperty", js.undefined)
    
    inline def setPhantom(value: Boolean): Self = StObject.set(x, "phantom", value.asInstanceOf[js.Any])
    
    inline def setPhantomUndefined: Self = StObject.set(x, "phantom", js.undefined)
    
    inline def setProxy(value: js.Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setREJECT(value: String): Self = StObject.set(x, "REJECT", value.asInstanceOf[js.Any])
    
    inline def setREJECTUndefined: Self = StObject.set(x, "REJECT", js.undefined)
    
    inline def setRaw(value: js.Any): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setSave(value: /* options */ js.UndefOr[js.Any] => IModel): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    inline def setSet(value: (/* fieldName */ js.UndefOr[js.Any], /* newValue */ js.UndefOr[js.Any]) => Array): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setSetDirty(value: () => Unit): Self = StObject.set(x, "setDirty", js.Any.fromFunction0(value))
    
    inline def setSetDirtyUndefined: Self = StObject.set(x, "setDirty", js.undefined)
    
    inline def setSetId(value: /* id */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setId", js.Any.fromFunction1(value))
    
    inline def setSetIdUndefined: Self = StObject.set(x, "setId", js.undefined)
    
    inline def setSetProxy(value: /* proxy */ js.UndefOr[js.Any] => typings.extjs.Ext.data.proxy.IProxy): Self = StObject.set(x, "setProxy", js.Any.fromFunction1(value))
    
    inline def setSetProxyUndefined: Self = StObject.set(x, "setProxy", js.undefined)
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    inline def setStore(value: IStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    inline def setStores(value: Array): Self = StObject.set(x, "stores", value.asInstanceOf[js.Any])
    
    inline def setStoresUndefined: Self = StObject.set(x, "stores", js.undefined)
    
    inline def setUnjoin(value: /* store */ js.UndefOr[IStore] => Unit): Self = StObject.set(x, "unjoin", js.Any.fromFunction1(value))
    
    inline def setUnjoinUndefined: Self = StObject.set(x, "unjoin", js.undefined)
    
    inline def setValidate(value: () => IErrors): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    inline def setValidations(value: Array): Self = StObject.set(x, "validations", value.asInstanceOf[js.Any])
    
    inline def setValidationsUndefined: Self = StObject.set(x, "validations", js.undefined)
  }
}
