package typings
package extjsLib.ExtNs.gridNs.featureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGrouping extends IAbstractSummary {
  /** [Method] Collapse a group
  		* @param groupName String The group name
  		* @param focus Boolean Pass true to focus the group after expand.
  		*/
  var collapse: js.UndefOr[
    js.Function2[
      /* groupName */ js.UndefOr[java.lang.String], 
      /* focus */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Collapse all groups */
  var collapseAll: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var collapsible: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var depthToIndent: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var enableGroupingMenu: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var enableNoGroups: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Expand a group
  		* @param groupName String The group name
  		* @param focus Boolean Pass true to focus the group after expand.
  		*/
  var expand: js.UndefOr[
    js.Function2[
      /* groupName */ js.UndefOr[java.lang.String], 
      /* focus */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Expand all groups */
  var expandAll: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the group data object for the group to which the passed record belongs if the Store is grouped
  		* @param record Ext.data.Model The record for which to return group information.
  		* @returns Object A single group data block as returned from Store.getGroups. Returns undefined if the Store is not grouped.
  		*/
  var getRecordGroup: js.UndefOr[js.Function1[/* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], _]] = js.undefined
  /** [Config Option] (String) */
  var groupByText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String/Array/Ext.Template) */
  var groupHeaderTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var hideGroupedHeader: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns true if the named group is expanded
  		* @param groupName String The group name as returned from getGroupString. This is usually the value of the groupField.
  		* @returns Boolean true if the group defined by that value is expanded.
  		*/
  var isExpanded: js.UndefOr[js.Function1[/* groupName */ js.UndefOr[java.lang.String], scala.Boolean]] = js.undefined
  /** [Config Option] (String) */
  var showGroupsText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var startCollapsed: js.UndefOr[scala.Boolean] = js.undefined
}

object IGrouping {
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
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    clearManagedListeners: js.Function0[scala.Unit] = null,
    collapse: js.Function2[
      /* groupName */ js.UndefOr[java.lang.String], 
      /* focus */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    collapseAll: js.Function0[scala.Unit] = null,
    collapsible: js.UndefOr[scala.Boolean] = js.undefined,
    config: js.Any = null,
    depthToIndent: scala.Int | scala.Double = null,
    disable: js.Function0[scala.Unit] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    enable: js.Function0[scala.Unit] = null,
    enableBubble: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    enableGroupingMenu: js.UndefOr[scala.Boolean] = js.undefined,
    enableNoGroups: js.UndefOr[scala.Boolean] = js.undefined,
    eventPrefix: java.lang.String = null,
    eventSelector: java.lang.String = null,
    expand: js.Function2[
      /* groupName */ js.UndefOr[java.lang.String], 
      /* focus */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    expandAll: js.Function0[scala.Unit] = null,
    extend: java.lang.String = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    fireEventArgs: js.Function2[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Boolean
    ] = null,
    getFireEventArgs: js.Function4[
      /* type */ js.UndefOr[js.Any], 
      /* view */ js.UndefOr[js.Any], 
      /* targetEl */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getRecordGroup: js.Function1[/* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], _] = null,
    grid: extjsLib.ExtNs.gridNs.IPanel = null,
    groupByText: java.lang.String = null,
    groupHeaderTpl: js.Any = null,
    hasFeatureEvent: js.UndefOr[scala.Boolean] = js.undefined,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    hasListeners: js.Any = null,
    hideGroupedHeader: js.UndefOr[scala.Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IGrouping] = null,
    isExpanded: js.Function1[/* groupName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    isObservable: js.UndefOr[scala.Boolean] = js.undefined,
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
    relayEvents: js.Function3[
      /* origin */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* prefix */ js.UndefOr[java.lang.String], 
      _
    ] = null,
    remoteRoot: java.lang.String = null,
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
    showGroupsText: java.lang.String = null,
    showSummaryRow: js.UndefOr[scala.Boolean] = js.undefined,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    startCollapsed: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    suspendEvents: js.Function1[/* queueSuspended */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    toggleSummaryRow: js.Function1[/* visible */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    un: js.Function3[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    uses: extjsLib.ExtNs.Array = null,
    view: extjsLib.ExtNs.viewNs.ITable = null
  ): IGrouping = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(clearManagedListeners)
    if (collapse != null) __obj.updateDynamic("collapse")(collapse)
    if (collapseAll != null) __obj.updateDynamic("collapseAll")(collapseAll)
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    if (config != null) __obj.updateDynamic("config")(config)
    if (depthToIndent != null) __obj.updateDynamic("depthToIndent")(depthToIndent.asInstanceOf[js.Any])
    if (disable != null) __obj.updateDynamic("disable")(disable)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (enable != null) __obj.updateDynamic("enable")(enable)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (!js.isUndefined(enableGroupingMenu)) __obj.updateDynamic("enableGroupingMenu")(enableGroupingMenu)
    if (!js.isUndefined(enableNoGroups)) __obj.updateDynamic("enableNoGroups")(enableNoGroups)
    if (eventPrefix != null) __obj.updateDynamic("eventPrefix")(eventPrefix)
    if (eventSelector != null) __obj.updateDynamic("eventSelector")(eventSelector)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (expandAll != null) __obj.updateDynamic("expandAll")(expandAll)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(fireEventArgs)
    if (getFireEventArgs != null) __obj.updateDynamic("getFireEventArgs")(getFireEventArgs)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getRecordGroup != null) __obj.updateDynamic("getRecordGroup")(getRecordGroup)
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (groupByText != null) __obj.updateDynamic("groupByText")(groupByText)
    if (groupHeaderTpl != null) __obj.updateDynamic("groupHeaderTpl")(groupHeaderTpl)
    if (!js.isUndefined(hasFeatureEvent)) __obj.updateDynamic("hasFeatureEvent")(hasFeatureEvent)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (!js.isUndefined(hideGroupedHeader)) __obj.updateDynamic("hideGroupedHeader")(hideGroupedHeader)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (isExpanded != null) __obj.updateDynamic("isExpanded")(isExpanded)
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (on != null) __obj.updateDynamic("on")(on)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (remoteRoot != null) __obj.updateDynamic("remoteRoot")(remoteRoot)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(resumeEvent)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (self != null) __obj.updateDynamic("self")(self)
    if (showGroupsText != null) __obj.updateDynamic("showGroupsText")(showGroupsText)
    if (!js.isUndefined(showSummaryRow)) __obj.updateDynamic("showSummaryRow")(showSummaryRow)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (!js.isUndefined(startCollapsed)) __obj.updateDynamic("startCollapsed")(startCollapsed)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(suspendEvent)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (toggleSummaryRow != null) __obj.updateDynamic("toggleSummaryRow")(toggleSummaryRow)
    if (un != null) __obj.updateDynamic("un")(un)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[IGrouping]
  }
}

