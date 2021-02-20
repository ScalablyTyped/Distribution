package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRecord extends IObservable {
  
  /** [Property] (String) */
  var COMMIT: js.UndefOr[String] = js.native
  
  /** [Property] (String) */
  var EDIT: js.UndefOr[String] = js.native
  
  /** [Property] (String) */
  var REJECT: js.UndefOr[String] = js.native
  
  /** [Config Option] (Object[]) */
  var associations: js.UndefOr[Array] = js.native
  
  /** [Method] Begins an edit  */
  var beginEdit: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (String/Object/String[]/Object[]) */
  var belongsTo: js.UndefOr[js.Any] = js.native
  
  /** [Method] Cancels all changes made in the current edit operation  */
  var cancelEdit: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (String) */
  var clientIdProperty: js.UndefOr[String] = js.native
  
  /** [Method] Usually called by the Ext data Store which owns the model instance
    * @param silent Boolean Pass true to skip notification of the owning store of the change.
    * @param modifiedFieldNames String[] Array of field names changed during sync with server if known. Omit or pass null if unknown. An empty array means that it is known that no fields were modified by the server's response. Defaults to false.
    */
  var commit: js.UndefOr[
    js.Function2[/* silent */ js.UndefOr[Boolean], /* modifiedFieldNames */ js.UndefOr[Array], Unit]
  ] = js.native
  
  /** [Method] Creates a copy clone of this Model instance
    * @param id String A new id, defaults to the id of the instance being copied. See id. To generate a phantom instance with a new id use: var rec = record.copy(); // clone the record Ext.data.Model.id(rec); // automatically generate a unique sequential id
    * @returns Ext.data.Model
    */
  var copy: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], IModel]] = js.native
  
  /** [Config Option] (String) */
  var defaultProxyType: js.UndefOr[String] = js.native
  
  /** [Method] Destroys the model using the configured proxy
    * @param options Object Options to pass to the proxy. Config object for Ext.data.Operation.
    * @returns Ext.data.Model The Model instance
    */
  var destroy: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IModel]] = js.native
  
  /** [Property] (Boolean) */
  var dirty: js.UndefOr[Boolean] = js.native
  
  /** [Property] (Boolean) */
  var editing: js.UndefOr[Boolean] = js.native
  
  /** [Method] Ends an edit
    * @param silent Boolean True to not notify the store of the change
    * @param modifiedFieldNames String[] Array of field names changed during edit.
    */
  var endEdit: js.UndefOr[
    js.Function2[/* silent */ js.UndefOr[Boolean], /* modifiedFieldNames */ js.UndefOr[Array], Unit]
  ] = js.native
  
  /** [Config Option] (Object[]/String[]) */
  var fields: js.UndefOr[js.Any] = js.native
  
  /** [Method] Returns the value of the given field
    * @param fieldName String The field to fetch the value for
    * @returns Object The value
    */
  var get: js.UndefOr[js.Function1[/* fieldName */ js.UndefOr[String], _]] = js.native
  
  /** [Method] Gets all of the data from this Models loaded associations
    * @returns Object The nested data set for the Model's loaded associations
    */
  var getAssociatedData: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Gets a hash of only the fields that have been modified since this Model was created or commited
    * @returns Object
    */
  var getChanges: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Gets all values for each field in this model and returns an object containing the current data
    * @param includeAssociated Boolean True to also include associated data. Defaults to false.
    * @returns Object An object hash containing all the values in this model
    */
  var getData: js.UndefOr[js.Function1[/* includeAssociated */ js.UndefOr[Boolean], _]] = js.native
  
  /** [Method] Returns the unique ID allocated to this model instance as defined by idProperty
    * @returns Number/String The id
    */
  var getId: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the configured Proxy for this Model
    * @returns Ext.data.proxy.Proxy The proxy
    */
  var getProxy: js.UndefOr[js.Function0[typings.extjs.Ext.data.proxy.IProxy]] = js.native
  
  /** [Config Option] (String/Object/String[]/Object[]) */
  var hasMany: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String/Object/Ext.data.Field) */
  var idProperty: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String/Object) */
  var idgen: js.UndefOr[js.Any] = js.native
  
  /** [Property] (Boolean) */
  var isModel: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns true if the passed field name has been modified since the load or last commit
    * @param fieldName String Ext.data.Field.name
    * @returns Boolean
    */
  var isModified: js.UndefOr[js.Function1[/* fieldName */ js.UndefOr[String], Boolean]] = js.native
  
  /** [Method] Checks if the model is valid
    * @returns Boolean True if the model is valid.
    */
  var isValid: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Tells this model instance that it has been added to a store
    * @param store Ext.data.Store The store to which this model has been added.
    */
  var join: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], Unit]] = js.native
  
  /** [Property] (Object) */
  var modified: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var persistenceProperty: js.UndefOr[String] = js.native
  
  /** [Property] (Boolean) */
  var phantom: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String/Object/Ext.data.proxy.Proxy) */
  var proxy: js.UndefOr[js.Any] = js.native
  
  /** [Property] (Object) */
  var raw: js.UndefOr[js.Any] = js.native
  
  /** [Method] Usually called by the Ext data Store to which this model instance has been joined
    * @param silent Boolean True to skip notification of the owning store of the change. Defaults to false.
    */
  var reject: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Saves the model instance using the configured proxy
    * @param options Object Options to pass to the proxy. Config object for Ext.data.Operation.
    * @returns Ext.data.Model The Model instance
    */
  var save: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IModel]] = js.native
  
  /** [Method] Sets the given field to the given value marks the instance as dirty
    * @param fieldName String/Object The field to set, or an object containing key/value pairs
    * @param newValue Object The value to set
    * @returns String[] The array of modified field names or null if nothing was modified.
    */
  var set: js.UndefOr[
    js.Function2[/* fieldName */ js.UndefOr[js.Any], /* newValue */ js.UndefOr[js.Any], Array]
  ] = js.native
  
  /** [Method] Marks this Record as dirty  */
  var setDirty: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Sets the model instance s id field to the given id
    * @param id Number/String The new id
    */
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the Proxy to use for this model
    * @param proxy String/Object/Ext.data.proxy.Proxy The proxy
    * @returns Ext.data.proxy.Proxy
    */
  var setProxy: js.UndefOr[
    js.Function1[/* proxy */ js.UndefOr[js.Any], typings.extjs.Ext.data.proxy.IProxy]
  ] = js.native
  
  /** [Property] (Ext.data.Store) */
  var store: js.UndefOr[IStore] = js.native
  
  /** [Property] (Ext.data.Store[]) */
  var stores: js.UndefOr[Array] = js.native
  
  /** [Method] Tells this model instance that it has been removed from the store
    * @param store Ext.data.Store The store from which this model has been removed.
    */
  var unjoin: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], Unit]] = js.native
  
  /** [Method] Validates the current data against all of its configured validations
    * @returns Ext.data.Errors The errors object
    */
  var validate: js.UndefOr[js.Function0[IErrors]] = js.native
  
  /** [Config Option] (Object[]) */
  var validations: js.UndefOr[Array] = js.native
}
object IRecord {
  
  @scala.inline
  def apply(): IRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRecord]
  }
  
  @scala.inline
  implicit class IRecordMutableBuilder[Self <: IRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociations(value: Array): Self = StObject.set(x, "associations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationsUndefined: Self = StObject.set(x, "associations", js.undefined)
    
    @scala.inline
    def setBeginEdit(value: () => Unit): Self = StObject.set(x, "beginEdit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeginEditUndefined: Self = StObject.set(x, "beginEdit", js.undefined)
    
    @scala.inline
    def setBelongsTo(value: js.Any): Self = StObject.set(x, "belongsTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBelongsToUndefined: Self = StObject.set(x, "belongsTo", js.undefined)
    
    @scala.inline
    def setCOMMIT(value: String): Self = StObject.set(x, "COMMIT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCOMMITUndefined: Self = StObject.set(x, "COMMIT", js.undefined)
    
    @scala.inline
    def setCancelEdit(value: () => Unit): Self = StObject.set(x, "cancelEdit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCancelEditUndefined: Self = StObject.set(x, "cancelEdit", js.undefined)
    
    @scala.inline
    def setClientIdProperty(value: String): Self = StObject.set(x, "clientIdProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdPropertyUndefined: Self = StObject.set(x, "clientIdProperty", js.undefined)
    
    @scala.inline
    def setCopy(value: /* id */ js.UndefOr[String] => IModel): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    @scala.inline
    def setDefaultProxyType(value: String): Self = StObject.set(x, "defaultProxyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultProxyTypeUndefined: Self = StObject.set(x, "defaultProxyType", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* options */ js.UndefOr[js.Any] => IModel): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
    
    @scala.inline
    def setEDIT(value: String): Self = StObject.set(x, "EDIT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEDITUndefined: Self = StObject.set(x, "EDIT", js.undefined)
    
    @scala.inline
    def setEditing(value: Boolean): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditingUndefined: Self = StObject.set(x, "editing", js.undefined)
    
    @scala.inline
    def setEndEdit(value: (/* silent */ js.UndefOr[Boolean], /* modifiedFieldNames */ js.UndefOr[Array]) => Unit): Self = StObject.set(x, "endEdit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEndEditUndefined: Self = StObject.set(x, "endEdit", js.undefined)
    
    @scala.inline
    def setFields(value: js.Any): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setGet(value: /* fieldName */ js.UndefOr[String] => _): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAssociatedData(value: () => _): Self = StObject.set(x, "getAssociatedData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAssociatedDataUndefined: Self = StObject.set(x, "getAssociatedData", js.undefined)
    
    @scala.inline
    def setGetChanges(value: () => _): Self = StObject.set(x, "getChanges", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetChangesUndefined: Self = StObject.set(x, "getChanges", js.undefined)
    
    @scala.inline
    def setGetData(value: /* includeAssociated */ js.UndefOr[Boolean] => _): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDataUndefined: Self = StObject.set(x, "getData", js.undefined)
    
    @scala.inline
    def setGetId(value: () => _): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIdUndefined: Self = StObject.set(x, "getId", js.undefined)
    
    @scala.inline
    def setGetProxy(value: () => typings.extjs.Ext.data.proxy.IProxy): Self = StObject.set(x, "getProxy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProxyUndefined: Self = StObject.set(x, "getProxy", js.undefined)
    
    @scala.inline
    def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    @scala.inline
    def setHasMany(value: js.Any): Self = StObject.set(x, "hasMany", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasManyUndefined: Self = StObject.set(x, "hasMany", js.undefined)
    
    @scala.inline
    def setIdProperty(value: js.Any): Self = StObject.set(x, "idProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdPropertyUndefined: Self = StObject.set(x, "idProperty", js.undefined)
    
    @scala.inline
    def setIdgen(value: js.Any): Self = StObject.set(x, "idgen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdgenUndefined: Self = StObject.set(x, "idgen", js.undefined)
    
    @scala.inline
    def setIsModel(value: Boolean): Self = StObject.set(x, "isModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsModelUndefined: Self = StObject.set(x, "isModel", js.undefined)
    
    @scala.inline
    def setIsModified(value: /* fieldName */ js.UndefOr[String] => Boolean): Self = StObject.set(x, "isModified", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsModifiedUndefined: Self = StObject.set(x, "isModified", js.undefined)
    
    @scala.inline
    def setIsValid(value: () => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    @scala.inline
    def setJoin(value: /* store */ js.UndefOr[IStore] => Unit): Self = StObject.set(x, "join", js.Any.fromFunction1(value))
    
    @scala.inline
    def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
    
    @scala.inline
    def setModified(value: js.Any): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
    
    @scala.inline
    def setPersistenceProperty(value: String): Self = StObject.set(x, "persistenceProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistencePropertyUndefined: Self = StObject.set(x, "persistenceProperty", js.undefined)
    
    @scala.inline
    def setPhantom(value: Boolean): Self = StObject.set(x, "phantom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhantomUndefined: Self = StObject.set(x, "phantom", js.undefined)
    
    @scala.inline
    def setProxy(value: js.Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    @scala.inline
    def setREJECT(value: String): Self = StObject.set(x, "REJECT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREJECTUndefined: Self = StObject.set(x, "REJECT", js.undefined)
    
    @scala.inline
    def setRaw(value: js.Any): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setSave(value: /* options */ js.UndefOr[js.Any] => IModel): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    @scala.inline
    def setSet(value: (/* fieldName */ js.UndefOr[js.Any], /* newValue */ js.UndefOr[js.Any]) => Array): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetDirty(value: () => Unit): Self = StObject.set(x, "setDirty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDirtyUndefined: Self = StObject.set(x, "setDirty", js.undefined)
    
    @scala.inline
    def setSetId(value: /* id */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIdUndefined: Self = StObject.set(x, "setId", js.undefined)
    
    @scala.inline
    def setSetProxy(value: /* proxy */ js.UndefOr[js.Any] => typings.extjs.Ext.data.proxy.IProxy): Self = StObject.set(x, "setProxy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetProxyUndefined: Self = StObject.set(x, "setProxy", js.undefined)
    
    @scala.inline
    def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    @scala.inline
    def setStore(value: IStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    @scala.inline
    def setStores(value: Array): Self = StObject.set(x, "stores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoresUndefined: Self = StObject.set(x, "stores", js.undefined)
    
    @scala.inline
    def setUnjoin(value: /* store */ js.UndefOr[IStore] => Unit): Self = StObject.set(x, "unjoin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnjoinUndefined: Self = StObject.set(x, "unjoin", js.undefined)
    
    @scala.inline
    def setValidate(value: () => IErrors): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    @scala.inline
    def setValidations(value: Array): Self = StObject.set(x, "validations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationsUndefined: Self = StObject.set(x, "validations", js.undefined)
  }
}
