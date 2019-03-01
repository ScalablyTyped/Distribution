package typings
package extjsLib.ExtNs.gridNs.pluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowEditing extends IEditing {
  /** [Config Option] (Boolean) */
  var autoCancel: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var clicksToMoveEditor: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var errorSummary: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Starts editing the specified record using the specified Column definition to define which field is being edited
  		* @param record Ext.data.Model The Store data record which backs the row to be edited.
  		* @param columnHeader Ext.data.Model The Column object defining the column to be edited.
  		* @returns Boolean true if editing was started, false otherwise.
  		*/
  @JSName("startEdit")
  var startEdit_IRowEditing: js.UndefOr[
    js.Function2[
      /* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* columnHeader */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      scala.Boolean
    ]
  ] = js.undefined
}

object IRowEditing {
  @scala.inline
  def apply(
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
    autoCancel: js.UndefOr[scala.Boolean] = js.undefined,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    cancelEdit: js.Function0[scala.Unit] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    clearManagedListeners: js.Function0[scala.Unit] = null,
    clicksToEdit: scala.Int | scala.Double = null,
    clicksToMoveEditor: scala.Int | scala.Double = null,
    clonePlugin: js.Function1[/* overrideCfg */ js.UndefOr[js.Any], scala.Unit] = null,
    completeEdit: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    disable: js.Function0[scala.Unit] = null,
    editing: js.UndefOr[scala.Boolean] = js.undefined,
    enable: js.Function0[scala.Unit] = null,
    enableBubble: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    errorSummary: js.UndefOr[scala.Boolean] = js.undefined,
    extend: java.lang.String = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    fireEventArgs: js.Function2[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Boolean
    ] = null,
    getCmp: js.Function0[extjsLib.ExtNs.IComponent] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    hasListeners: js.Any = null,
    inheritableStatics: js.Any = null,
    init: js.Function1[/* client */ js.UndefOr[extjsLib.ExtNs.IComponent], scala.Unit] = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IRowEditing] = null,
    isObservable: js.UndefOr[scala.Boolean] = js.undefined,
    isPlugin: js.UndefOr[scala.Boolean] = js.undefined,
    listeners: js.Any = null,
    mixins: js.Any = null,
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
    pluginId: java.lang.String = null,
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
    self: extjsLib.ExtNs.IClass = null,
    setCmp: js.Function1[/* cmp */ js.UndefOr[extjsLib.ExtNs.IComponent], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    startEdit: js.Function2[
      /* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* columnHeader */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      scala.Boolean
    ] = null,
    statics: js.Any = null,
    suspendEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    suspendEvents: js.Function1[/* queueSuspended */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    triggerEvent: java.lang.String = null,
    un: js.Function3[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    uses: extjsLib.ExtNs.Array = null
  ): IRowEditing = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (!js.isUndefined(autoCancel)) __obj.updateDynamic("autoCancel")(autoCancel)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (cancelEdit != null) __obj.updateDynamic("cancelEdit")(cancelEdit)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(clearManagedListeners)
    if (clicksToEdit != null) __obj.updateDynamic("clicksToEdit")(clicksToEdit.asInstanceOf[js.Any])
    if (clicksToMoveEditor != null) __obj.updateDynamic("clicksToMoveEditor")(clicksToMoveEditor.asInstanceOf[js.Any])
    if (clonePlugin != null) __obj.updateDynamic("clonePlugin")(clonePlugin)
    if (completeEdit != null) __obj.updateDynamic("completeEdit")(completeEdit)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (disable != null) __obj.updateDynamic("disable")(disable)
    if (!js.isUndefined(editing)) __obj.updateDynamic("editing")(editing)
    if (enable != null) __obj.updateDynamic("enable")(enable)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (!js.isUndefined(errorSummary)) __obj.updateDynamic("errorSummary")(errorSummary)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(fireEventArgs)
    if (getCmp != null) __obj.updateDynamic("getCmp")(getCmp)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (init != null) __obj.updateDynamic("init")(init)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (!js.isUndefined(isPlugin)) __obj.updateDynamic("isPlugin")(isPlugin)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (on != null) __obj.updateDynamic("on")(on)
    if (pluginId != null) __obj.updateDynamic("pluginId")(pluginId)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(resumeEvent)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setCmp != null) __obj.updateDynamic("setCmp")(setCmp)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (startEdit != null) __obj.updateDynamic("startEdit")(startEdit)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(suspendEvent)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (triggerEvent != null) __obj.updateDynamic("triggerEvent")(triggerEvent)
    if (un != null) __obj.updateDynamic("un")(un)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IRowEditing]
  }
}

