package typings
package extjsLib.ExtNs.gridNs.propertyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProperty
  extends extjsLib.ExtNs.dataNs.IModel {
  /** [Property] (Ext.util.MixedCollection) */
  @JSName("fields")
  var fields_IProperty: js.UndefOr[extjsLib.ExtNs.utilNs.IMixedCollection] = js.undefined
}

object IProperty {
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
    copy: js.Function1[/* id */ js.UndefOr[java.lang.String], IProperty] = null,
    defaultProxyType: java.lang.String = null,
    destroy: js.Function1[/* options */ js.UndefOr[js.Any], IProperty] = null,
    dirty: js.UndefOr[scala.Boolean] = js.undefined,
    editing: js.UndefOr[scala.Boolean] = js.undefined,
    enableBubble: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    endEdit: js.Function2[
      /* silent */ js.UndefOr[scala.Boolean], 
      /* modifiedFieldNames */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Unit
    ] = null,
    extend: java.lang.String = null,
    fields: extjsLib.ExtNs.utilNs.IMixedCollection = null,
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
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IProperty] = null,
    isModel: js.UndefOr[scala.Boolean] = js.undefined,
    isModified: js.Function1[/* fieldName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    isObservable: js.UndefOr[scala.Boolean] = js.undefined,
    isValid: js.Function0[scala.Boolean] = null,
    join: js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IStore], scala.Unit] = null,
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
    save: js.Function1[/* options */ js.UndefOr[js.Any], IProperty] = null,
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
    store: extjsLib.ExtNs.dataNs.IStore = null,
    stores: extjsLib.ExtNs.Array = null,
    suspendEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    suspendEvents: js.Function1[/* queueSuspended */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    un: js.Function3[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    unjoin: js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IStore], scala.Unit] = null,
    uses: extjsLib.ExtNs.Array = null,
    validate: js.Function0[extjsLib.ExtNs.dataNs.IErrors] = null,
    validations: extjsLib.ExtNs.Array = null
  ): IProperty = {
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
    __obj.asInstanceOf[IProperty]
  }
}

