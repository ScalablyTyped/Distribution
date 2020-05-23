package typings.extjs.Ext.grid.property

import typings.extjs.Ext.Array
import typings.extjs.Ext.IClass
import typings.extjs.Ext.data.IErrors
import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.data.proxy.IProxy
import typings.extjs.Ext.util.IMixedCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProperty extends IModel {
  /** [Property] (Ext.util.MixedCollection) */
  @JSName("fields")
  var fields_IProperty: js.UndefOr[IMixedCollection] = js.undefined
}

object IProperty {
  @scala.inline
  def apply(
    COMMIT: String = null,
    EDIT: String = null,
    REJECT: String = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    associations: Array = null,
    beginEdit: () => Unit = null,
    belongsTo: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    cancelEdit: () => Unit = null,
    clearListeners: () => Unit = null,
    clearManagedListeners: () => Unit = null,
    clientIdProperty: String = null,
    commit: (/* silent */ js.UndefOr[Boolean], /* modifiedFieldNames */ js.UndefOr[Array]) => Unit = null,
    config: js.Any = null,
    copy: /* id */ js.UndefOr[String] => IProperty = null,
    defaultProxyType: String = null,
    destroy: /* options */ js.UndefOr[js.Any] => IProperty = null,
    dirty: js.UndefOr[Boolean] = js.undefined,
    editing: js.UndefOr[Boolean] = js.undefined,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    endEdit: (/* silent */ js.UndefOr[Boolean], /* modifiedFieldNames */ js.UndefOr[Array]) => Unit = null,
    extend: String = null,
    fields: IMixedCollection = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => Boolean = null,
    fireEventArgs: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array]) => Boolean = null,
    get: /* fieldName */ js.UndefOr[String] => _ = null,
    getAssociatedData: () => _ = null,
    getChanges: () => _ = null,
    getData: /* includeAssociated */ js.UndefOr[Boolean] => _ = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getProxy: () => IProxy = null,
    hasListener: /* eventName */ js.UndefOr[String] => Boolean = null,
    hasListeners: js.Any = null,
    hasMany: js.Any = null,
    idProperty: js.Any = null,
    idgen: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IProperty = null,
    isModel: js.UndefOr[Boolean] = js.undefined,
    isModified: /* fieldName */ js.UndefOr[String] => Boolean = null,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    isValid: () => Boolean = null,
    join: /* store */ js.UndefOr[typings.extjs.Ext.data.IStore] => Unit = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    modified: js.Any = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    persistenceProperty: String = null,
    phantom: js.UndefOr[Boolean] = js.undefined,
    proxy: js.Any = null,
    raw: js.Any = null,
    reject: /* silent */ js.UndefOr[Boolean] => Unit = null,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[String]) => _ = null,
    removeListener: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    requires: Array = null,
    resumeEvent: /* repeated */ js.Any => Unit = null,
    resumeEvents: () => Unit = null,
    save: /* options */ js.UndefOr[js.Any] => IProperty = null,
    self: IClass = null,
    set: (/* fieldName */ js.UndefOr[js.Any], /* newValue */ js.UndefOr[js.Any]) => Array = null,
    setDirty: () => Unit = null,
    setId: /* id */ js.UndefOr[js.Any] => Unit = null,
    setProxy: /* proxy */ js.UndefOr[js.Any] => IProxy = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    store: typings.extjs.Ext.data.IStore = null,
    stores: Array = null,
    suspendEvent: /* repeated */ js.Any => Unit = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Unit = null,
    un: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    unjoin: /* store */ js.UndefOr[typings.extjs.Ext.data.IStore] => Unit = null,
    uses: Array = null,
    validate: () => IErrors = null,
    validations: Array = null
  ): IProperty = {
    val __obj = js.Dynamic.literal()
    if (COMMIT != null) __obj.updateDynamic("COMMIT")(COMMIT.asInstanceOf[js.Any])
    if (EDIT != null) __obj.updateDynamic("EDIT")(EDIT.asInstanceOf[js.Any])
    if (REJECT != null) __obj.updateDynamic("REJECT")(REJECT.asInstanceOf[js.Any])
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (associations != null) __obj.updateDynamic("associations")(associations.asInstanceOf[js.Any])
    if (beginEdit != null) __obj.updateDynamic("beginEdit")(js.Any.fromFunction0(beginEdit))
    if (belongsTo != null) __obj.updateDynamic("belongsTo")(belongsTo.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (cancelEdit != null) __obj.updateDynamic("cancelEdit")(js.Any.fromFunction0(cancelEdit))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(js.Any.fromFunction0(clearManagedListeners))
    if (clientIdProperty != null) __obj.updateDynamic("clientIdProperty")(clientIdProperty.asInstanceOf[js.Any])
    if (commit != null) __obj.updateDynamic("commit")(js.Any.fromFunction2(commit))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (copy != null) __obj.updateDynamic("copy")(js.Any.fromFunction1(copy))
    if (defaultProxyType != null) __obj.updateDynamic("defaultProxyType")(defaultProxyType.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (!js.isUndefined(dirty)) __obj.updateDynamic("dirty")(dirty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(editing)) __obj.updateDynamic("editing")(editing.get.asInstanceOf[js.Any])
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (endEdit != null) __obj.updateDynamic("endEdit")(js.Any.fromFunction2(endEdit))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2(fireEventArgs))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1(get))
    if (getAssociatedData != null) __obj.updateDynamic("getAssociatedData")(js.Any.fromFunction0(getAssociatedData))
    if (getChanges != null) __obj.updateDynamic("getChanges")(js.Any.fromFunction0(getChanges))
    if (getData != null) __obj.updateDynamic("getData")(js.Any.fromFunction1(getData))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getProxy != null) __obj.updateDynamic("getProxy")(js.Any.fromFunction0(getProxy))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners.asInstanceOf[js.Any])
    if (hasMany != null) __obj.updateDynamic("hasMany")(hasMany.asInstanceOf[js.Any])
    if (idProperty != null) __obj.updateDynamic("idProperty")(idProperty.asInstanceOf[js.Any])
    if (idgen != null) __obj.updateDynamic("idgen")(idgen.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (!js.isUndefined(isModel)) __obj.updateDynamic("isModel")(isModel.get.asInstanceOf[js.Any])
    if (isModified != null) __obj.updateDynamic("isModified")(js.Any.fromFunction1(isModified))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable.get.asInstanceOf[js.Any])
    if (isValid != null) __obj.updateDynamic("isValid")(js.Any.fromFunction0(isValid))
    if (join != null) __obj.updateDynamic("join")(js.Any.fromFunction1(join))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (modified != null) __obj.updateDynamic("modified")(modified.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4(on))
    if (persistenceProperty != null) __obj.updateDynamic("persistenceProperty")(persistenceProperty.asInstanceOf[js.Any])
    if (!js.isUndefined(phantom)) __obj.updateDynamic("phantom")(phantom.get.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (reject != null) __obj.updateDynamic("reject")(js.Any.fromFunction1(reject))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3(relayEvents))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1(resumeEvent))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction0(resumeEvents))
    if (save != null) __obj.updateDynamic("save")(js.Any.fromFunction1(save))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction2(set))
    if (setDirty != null) __obj.updateDynamic("setDirty")(js.Any.fromFunction0(setDirty))
    if (setId != null) __obj.updateDynamic("setId")(js.Any.fromFunction1(setId))
    if (setProxy != null) __obj.updateDynamic("setProxy")(js.Any.fromFunction1(setProxy))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (stores != null) __obj.updateDynamic("stores")(stores.asInstanceOf[js.Any])
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1(suspendEvent))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1(suspendEvents))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3(un))
    if (unjoin != null) __obj.updateDynamic("unjoin")(js.Any.fromFunction1(unjoin))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction0(validate))
    if (validations != null) __obj.updateDynamic("validations")(validations.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProperty]
  }
}

