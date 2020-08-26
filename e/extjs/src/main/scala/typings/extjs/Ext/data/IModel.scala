package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModel extends IObservable {
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
  var copy: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], this.type]] = js.native
  /** [Config Option] (String) */
  var defaultProxyType: js.UndefOr[String] = js.native
  /** [Method] Destroys the model using the configured proxy
    * @param options Object Options to pass to the proxy. Config object for Ext.data.Operation.
    * @returns Ext.data.Model The Model instance
    */
  var destroy: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], this.type]] = js.native
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
  var save: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], this.type]] = js.native
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

object IModel {
  @scala.inline
  def apply(): IModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModel]
  }
  @scala.inline
  implicit class IModelOps[Self <: IModel] (val x: Self) extends AnyVal {
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
    def setCOMMIT(value: String): Self = this.set("COMMIT", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCOMMIT: Self = this.set("COMMIT", js.undefined)
    @scala.inline
    def setEDIT(value: String): Self = this.set("EDIT", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEDIT: Self = this.set("EDIT", js.undefined)
    @scala.inline
    def setREJECT(value: String): Self = this.set("REJECT", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteREJECT: Self = this.set("REJECT", js.undefined)
    @scala.inline
    def setAssociations(value: Array): Self = this.set("associations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociations: Self = this.set("associations", js.undefined)
    @scala.inline
    def setBeginEdit(value: () => Unit): Self = this.set("beginEdit", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeginEdit: Self = this.set("beginEdit", js.undefined)
    @scala.inline
    def setBelongsTo(value: js.Any): Self = this.set("belongsTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBelongsTo: Self = this.set("belongsTo", js.undefined)
    @scala.inline
    def setCancelEdit(value: () => Unit): Self = this.set("cancelEdit", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCancelEdit: Self = this.set("cancelEdit", js.undefined)
    @scala.inline
    def setClientIdProperty(value: String): Self = this.set("clientIdProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientIdProperty: Self = this.set("clientIdProperty", js.undefined)
    @scala.inline
    def setCopy(value: /* id */ js.UndefOr[String] => IModel): Self = this.set("copy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCopy: Self = this.set("copy", js.undefined)
    @scala.inline
    def setDefaultProxyType(value: String): Self = this.set("defaultProxyType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultProxyType: Self = this.set("defaultProxyType", js.undefined)
    @scala.inline
    def setDestroy(value: /* options */ js.UndefOr[js.Any] => IModel): Self = this.set("destroy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setDirty(value: Boolean): Self = this.set("dirty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirty: Self = this.set("dirty", js.undefined)
    @scala.inline
    def setEditing(value: Boolean): Self = this.set("editing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditing: Self = this.set("editing", js.undefined)
    @scala.inline
    def setEndEdit(value: (/* silent */ js.UndefOr[Boolean], /* modifiedFieldNames */ js.UndefOr[Array]) => Unit): Self = this.set("endEdit", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEndEdit: Self = this.set("endEdit", js.undefined)
    @scala.inline
    def setFields(value: js.Any): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setGet(value: /* fieldName */ js.UndefOr[String] => _): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    @scala.inline
    def setGetAssociatedData(value: () => _): Self = this.set("getAssociatedData", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAssociatedData: Self = this.set("getAssociatedData", js.undefined)
    @scala.inline
    def setGetChanges(value: () => _): Self = this.set("getChanges", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetChanges: Self = this.set("getChanges", js.undefined)
    @scala.inline
    def setGetData(value: /* includeAssociated */ js.UndefOr[Boolean] => _): Self = this.set("getData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetData: Self = this.set("getData", js.undefined)
    @scala.inline
    def setGetId(value: () => _): Self = this.set("getId", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetId: Self = this.set("getId", js.undefined)
    @scala.inline
    def setGetProxy(value: () => typings.extjs.Ext.data.proxy.IProxy): Self = this.set("getProxy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetProxy: Self = this.set("getProxy", js.undefined)
    @scala.inline
    def setHasMany(value: js.Any): Self = this.set("hasMany", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasMany: Self = this.set("hasMany", js.undefined)
    @scala.inline
    def setIdProperty(value: js.Any): Self = this.set("idProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdProperty: Self = this.set("idProperty", js.undefined)
    @scala.inline
    def setIdgen(value: js.Any): Self = this.set("idgen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdgen: Self = this.set("idgen", js.undefined)
    @scala.inline
    def setIsModel(value: Boolean): Self = this.set("isModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsModel: Self = this.set("isModel", js.undefined)
    @scala.inline
    def setIsModified(value: /* fieldName */ js.UndefOr[String] => Boolean): Self = this.set("isModified", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsModified: Self = this.set("isModified", js.undefined)
    @scala.inline
    def setIsValid(value: () => Boolean): Self = this.set("isValid", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsValid: Self = this.set("isValid", js.undefined)
    @scala.inline
    def setJoin(value: /* store */ js.UndefOr[IStore] => Unit): Self = this.set("join", js.Any.fromFunction1(value))
    @scala.inline
    def deleteJoin: Self = this.set("join", js.undefined)
    @scala.inline
    def setModified(value: js.Any): Self = this.set("modified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModified: Self = this.set("modified", js.undefined)
    @scala.inline
    def setPersistenceProperty(value: String): Self = this.set("persistenceProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistenceProperty: Self = this.set("persistenceProperty", js.undefined)
    @scala.inline
    def setPhantom(value: Boolean): Self = this.set("phantom", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhantom: Self = this.set("phantom", js.undefined)
    @scala.inline
    def setProxy(value: js.Any): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    @scala.inline
    def setRaw(value: js.Any): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    @scala.inline
    def setSave(value: /* options */ js.UndefOr[js.Any] => IModel): Self = this.set("save", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
    @scala.inline
    def setSet(value: (/* fieldName */ js.UndefOr[js.Any], /* newValue */ js.UndefOr[js.Any]) => Array): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
    @scala.inline
    def setSetDirty(value: () => Unit): Self = this.set("setDirty", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSetDirty: Self = this.set("setDirty", js.undefined)
    @scala.inline
    def setSetId(value: /* id */ js.UndefOr[js.Any] => Unit): Self = this.set("setId", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetId: Self = this.set("setId", js.undefined)
    @scala.inline
    def setSetProxy(value: /* proxy */ js.UndefOr[js.Any] => typings.extjs.Ext.data.proxy.IProxy): Self = this.set("setProxy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetProxy: Self = this.set("setProxy", js.undefined)
    @scala.inline
    def setStore(value: IStore): Self = this.set("store", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    @scala.inline
    def setStores(value: Array): Self = this.set("stores", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStores: Self = this.set("stores", js.undefined)
    @scala.inline
    def setUnjoin(value: /* store */ js.UndefOr[IStore] => Unit): Self = this.set("unjoin", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUnjoin: Self = this.set("unjoin", js.undefined)
    @scala.inline
    def setValidate(value: () => IErrors): Self = this.set("validate", js.Any.fromFunction0(value))
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    @scala.inline
    def setValidations(value: Array): Self = this.set("validations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidations: Self = this.set("validations", js.undefined)
  }
  
}

