package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModel
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Property] (String) */
  var COMMIT: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var EDIT: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var REJECT: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object[]) */
  var associations: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Method] Begins an edit  */
  var beginEdit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String/Object/String[]/Object[]) */
  var belongsTo: js.UndefOr[js.Any] = js.undefined
  /** [Method] Cancels all changes made in the current edit operation  */
  var cancelEdit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var clientIdProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Usually called by the Ext data Store which owns the model instance
  		* @param silent Boolean Pass true to skip notification of the owning store of the change.
  		* @param modifiedFieldNames String[] Array of field names changed during sync with server if known. Omit or pass null if unknown. An empty array means that it is known that no fields were modified by the server's response. Defaults to false.
  		*/
  var commit: js.UndefOr[
    js.Function2[
      /* silent */ js.UndefOr[scala.Boolean], 
      /* modifiedFieldNames */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Creates a copy clone of this Model instance
  		* @param id String A new id, defaults to the id of the instance being copied. See id. To generate a phantom instance with a new id use: var rec = record.copy(); // clone the record Ext.data.Model.id(rec); // automatically generate a unique sequential id
  		* @returns Ext.data.Model
  		*/
  var copy: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], this.type]] = js.undefined
  /** [Config Option] (String) */
  var defaultProxyType: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Destroys the model using the configured proxy
  		* @param options Object Options to pass to the proxy. Config object for Ext.data.Operation.
  		* @returns Ext.data.Model The Model instance
  		*/
  var destroy: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Property] (Boolean) */
  var dirty: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var editing: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Ends an edit
  		* @param silent Boolean True to not notify the store of the change
  		* @param modifiedFieldNames String[] Array of field names changed during edit.
  		*/
  var endEdit: js.UndefOr[
    js.Function2[
      /* silent */ js.UndefOr[scala.Boolean], 
      /* modifiedFieldNames */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Object[]/String[]) */
  var fields: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of the given field
  		* @param fieldName String The field to fetch the value for
  		* @returns Object The value
  		*/
  var get: js.UndefOr[js.Function1[/* fieldName */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Gets all of the data from this Models loaded associations
  		* @returns Object The nested data set for the Model's loaded associations
  		*/
  var getAssociatedData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets a hash of only the fields that have been modified since this Model was created or commited
  		* @returns Object
  		*/
  var getChanges: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets all values for each field in this model and returns an object containing the current data
  		* @param includeAssociated Boolean True to also include associated data. Defaults to false.
  		* @returns Object An object hash containing all the values in this model
  		*/
  var getData: js.UndefOr[js.Function1[/* includeAssociated */ js.UndefOr[scala.Boolean], _]] = js.undefined
  /** [Method] Returns the unique ID allocated to this model instance as defined by idProperty
  		* @returns Number/String The id
  		*/
  var getId: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the configured Proxy for this Model
  		* @returns Ext.data.proxy.Proxy The proxy
  		*/
  var getProxy: js.UndefOr[js.Function0[extjsLib.ExtNs.dataNs.proxyNs.IProxy]] = js.undefined
  /** [Config Option] (String/Object/String[]/Object[]) */
  var hasMany: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Object/Ext.data.Field) */
  var idProperty: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Object) */
  var idgen: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Boolean) */
  var isModel: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns true if the passed field name has been modified since the load or last commit
  		* @param fieldName String Ext.data.Field.name
  		* @returns Boolean
  		*/
  var isModified: js.UndefOr[js.Function1[/* fieldName */ js.UndefOr[java.lang.String], scala.Boolean]] = js.undefined
  /** [Method] Checks if the model is valid
  		* @returns Boolean True if the model is valid.
  		*/
  var isValid: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Tells this model instance that it has been added to a store
  		* @param store Ext.data.Store The store to which this model has been added.
  		*/
  var join: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], scala.Unit]] = js.undefined
  /** [Property] (Object) */
  var modified: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var persistenceProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Boolean) */
  var phantom: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String/Object/Ext.data.proxy.Proxy) */
  var proxy: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var raw: js.UndefOr[js.Any] = js.undefined
  /** [Method] Usually called by the Ext data Store to which this model instance has been joined
  		* @param silent Boolean True to skip notification of the owning store of the change. Defaults to false.
  		*/
  var reject: js.UndefOr[js.Function1[/* silent */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
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
    js.Function2[
      /* fieldName */ js.UndefOr[js.Any], 
      /* newValue */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Method] Marks this Record as dirty  */
  var setDirty: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Sets the model instance s id field to the given id
  		* @param id Number/String The new id
  		*/
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the Proxy to use for this model
  		* @param proxy String/Object/Ext.data.proxy.Proxy The proxy
  		* @returns Ext.data.proxy.Proxy
  		*/
  var setProxy: js.UndefOr[
    js.Function1[/* proxy */ js.UndefOr[js.Any], extjsLib.ExtNs.dataNs.proxyNs.IProxy]
  ] = js.undefined
  /** [Property] (Ext.data.Store) */
  var store: js.UndefOr[IStore] = js.undefined
  /** [Property] (Ext.data.Store[]) */
  var stores: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Method] Tells this model instance that it has been removed from the store
  		* @param store Ext.data.Store The store from which this model has been removed.
  		*/
  var unjoin: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], scala.Unit]] = js.undefined
  /** [Method] Validates the current data against all of its configured validations
  		* @returns Ext.data.Errors The errors object
  		*/
  var validate: js.UndefOr[js.Function0[IErrors]] = js.undefined
  /** [Config Option] (Object[]) */
  var validations: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
}

object IModel {
  @scala.inline
  def apply(
    COMMIT: java.lang.String = null,
    EDIT: java.lang.String = null,
    REJECT: java.lang.String = null,
    addEvents: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    addListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    addManagedListener: js.Function5[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    associations: extjsLib.ExtNs.Array = null,
    beginEdit: js.Function0[scala.Unit] = null,
    belongsTo: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    cancelEdit: js.Function0[scala.Unit] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    clearManagedListeners: js.Function0[scala.Unit] = null,
    clientIdProperty: java.lang.String = null,
    commit: js.Function2[
      /* silent */ js.UndefOr[scala.Boolean], 
      /* modifiedFieldNames */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Unit
    ] = null,
    config: js.Any = null,
    copy: js.Function1[/* id */ js.UndefOr[java.lang.String], IModel] = null,
    defaultProxyType: java.lang.String = null,
    destroy: js.Function1[/* options */ js.UndefOr[js.Any], IModel] = null,
    dirty: js.UndefOr[scala.Boolean] = js.undefined,
    editing: js.UndefOr[scala.Boolean] = js.undefined,
    enableBubble: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    endEdit: js.Function2[
      /* silent */ js.UndefOr[scala.Boolean], 
      /* modifiedFieldNames */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Unit
    ] = null,
    extend: java.lang.String = null,
    fields: js.Any = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    fireEventArgs: js.Function2[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Boolean
    ] = null,
    get: js.Function1[/* fieldName */ js.UndefOr[java.lang.String], _] = null,
    getAssociatedData: js.Function0[_] = null,
    getChanges: js.Function0[_] = null,
    getData: js.Function1[/* includeAssociated */ js.UndefOr[scala.Boolean], _] = null,
    getId: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getProxy: js.Function0[extjsLib.ExtNs.dataNs.proxyNs.IProxy] = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    hasListeners: js.Any = null,
    hasMany: js.Any = null,
    idProperty: js.Any = null,
    idgen: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IModel] = null,
    isModel: js.UndefOr[scala.Boolean] = js.undefined,
    isModified: js.Function1[/* fieldName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    isObservable: js.UndefOr[scala.Boolean] = js.undefined,
    isValid: js.Function0[scala.Boolean] = null,
    join: js.Function1[/* store */ js.UndefOr[IStore], scala.Unit] = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    modified: js.Any = null,
    mon: js.Function5[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    mun: js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    on: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    persistenceProperty: java.lang.String = null,
    phantom: js.UndefOr[scala.Boolean] = js.undefined,
    proxy: js.Any = null,
    raw: js.Any = null,
    reject: js.Function1[/* silent */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    relayEvents: js.Function3[
      /* origin */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* prefix */ js.UndefOr[java.lang.String], 
      _
    ] = null,
    removeListener: js.Function3[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    removeManagedListener: js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    requires: extjsLib.ExtNs.Array = null,
    resumeEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    resumeEvents: js.Function0[scala.Unit] = null,
    save: js.Function1[/* options */ js.UndefOr[js.Any], IModel] = null,
    self: extjsLib.ExtNs.IClass = null,
    set: js.Function2[
      /* fieldName */ js.UndefOr[js.Any], 
      /* newValue */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.Array
    ] = null,
    setDirty: js.Function0[scala.Unit] = null,
    setId: js.Function1[/* id */ js.UndefOr[js.Any], scala.Unit] = null,
    setProxy: js.Function1[/* proxy */ js.UndefOr[js.Any], extjsLib.ExtNs.dataNs.proxyNs.IProxy] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    store: IStore = null,
    stores: extjsLib.ExtNs.Array = null,
    suspendEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    suspendEvents: js.Function1[/* queueSuspended */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    un: js.Function3[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    unjoin: js.Function1[/* store */ js.UndefOr[IStore], scala.Unit] = null,
    uses: extjsLib.ExtNs.Array = null,
    validate: js.Function0[IErrors] = null,
    validations: extjsLib.ExtNs.Array = null
  ): IModel = {
    val __obj = js.Dynamic.literal()
    if (COMMIT != null) __obj.updateDynamic("COMMIT")(COMMIT)
    if (EDIT != null) __obj.updateDynamic("EDIT")(EDIT)
    if (REJECT != null) __obj.updateDynamic("REJECT")(REJECT)
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (associations != null) __obj.updateDynamic("associations")(associations)
    if (beginEdit != null) __obj.updateDynamic("beginEdit")(beginEdit)
    if (belongsTo != null) __obj.updateDynamic("belongsTo")(belongsTo)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (cancelEdit != null) __obj.updateDynamic("cancelEdit")(cancelEdit)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(clearManagedListeners)
    if (clientIdProperty != null) __obj.updateDynamic("clientIdProperty")(clientIdProperty)
    if (commit != null) __obj.updateDynamic("commit")(commit)
    if (config != null) __obj.updateDynamic("config")(config)
    if (copy != null) __obj.updateDynamic("copy")(copy)
    if (defaultProxyType != null) __obj.updateDynamic("defaultProxyType")(defaultProxyType)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(dirty)) __obj.updateDynamic("dirty")(dirty)
    if (!js.isUndefined(editing)) __obj.updateDynamic("editing")(editing)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (endEdit != null) __obj.updateDynamic("endEdit")(endEdit)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(fireEventArgs)
    if (get != null) __obj.updateDynamic("get")(get)
    if (getAssociatedData != null) __obj.updateDynamic("getAssociatedData")(getAssociatedData)
    if (getChanges != null) __obj.updateDynamic("getChanges")(getChanges)
    if (getData != null) __obj.updateDynamic("getData")(getData)
    if (getId != null) __obj.updateDynamic("getId")(getId)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getProxy != null) __obj.updateDynamic("getProxy")(getProxy)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (hasMany != null) __obj.updateDynamic("hasMany")(hasMany)
    if (idProperty != null) __obj.updateDynamic("idProperty")(idProperty)
    if (idgen != null) __obj.updateDynamic("idgen")(idgen)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (!js.isUndefined(isModel)) __obj.updateDynamic("isModel")(isModel)
    if (isModified != null) __obj.updateDynamic("isModified")(isModified)
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (isValid != null) __obj.updateDynamic("isValid")(isValid)
    if (join != null) __obj.updateDynamic("join")(join)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (modified != null) __obj.updateDynamic("modified")(modified)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (on != null) __obj.updateDynamic("on")(on)
    if (persistenceProperty != null) __obj.updateDynamic("persistenceProperty")(persistenceProperty)
    if (!js.isUndefined(phantom)) __obj.updateDynamic("phantom")(phantom)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (raw != null) __obj.updateDynamic("raw")(raw)
    if (reject != null) __obj.updateDynamic("reject")(reject)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(resumeEvent)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (save != null) __obj.updateDynamic("save")(save)
    if (self != null) __obj.updateDynamic("self")(self)
    if (set != null) __obj.updateDynamic("set")(set)
    if (setDirty != null) __obj.updateDynamic("setDirty")(setDirty)
    if (setId != null) __obj.updateDynamic("setId")(setId)
    if (setProxy != null) __obj.updateDynamic("setProxy")(setProxy)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (store != null) __obj.updateDynamic("store")(store)
    if (stores != null) __obj.updateDynamic("stores")(stores)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(suspendEvent)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (un != null) __obj.updateDynamic("un")(un)
    if (unjoin != null) __obj.updateDynamic("unjoin")(unjoin)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (validate != null) __obj.updateDynamic("validate")(validate)
    if (validations != null) __obj.updateDynamic("validations")(validations)
    __obj.asInstanceOf[IModel]
  }
}

