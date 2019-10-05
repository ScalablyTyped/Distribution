package typings.extjs.Ext.chart

import typings.extjs.Ext.Array
import typings.extjs.Ext.IClass
import typings.extjs.Ext.chart.series.ISeries
import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.draw.ISprite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICartesianSeries extends ISeries {
  /** [Config Option] (String/String[]) */
  var axis: js.UndefOr[js.Any] = js.undefined
  /** [Method] Iterates over a given record s values for each of this series s yFields executing a given function for each value
  		* @param record Ext.data.Model
  		* @param fn Function
  		* @param scope Object
  		*/
  var eachYValue: js.UndefOr[
    js.Function3[
      /* record */ js.UndefOr[IModel], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Calculate the min and max values for this series s xField
  		* @returns Array [min, max]
  		*/
  var getMinMaxXValues: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Calculate the min and max values for this series s yField s
  		* @returns Array [min, max]
  		*/
  var getMinMaxYValues: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns an array of functions each of which returns the value of the yField corresponding to function s index in the
  		* @returns Array array of accessor functions
  		*/
  var getYValueAccessors: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the number of yField values taking into account fields combined via legend drag drop
  		* @returns Number
  		*/
  var getYValueCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Config Option] (String) */
  var xField: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String/String[]) */
  var yField: js.UndefOr[js.Any] = js.undefined
}

object ICartesianSeries {
  @scala.inline
  def apply(
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    axis: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearListeners: () => Unit = null,
    clearManagedListeners: () => Unit = null,
    config: js.Any = null,
    eachRecord: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    eachYValue: (/* record */ js.UndefOr[IModel], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    extend: java.lang.String = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => Boolean = null,
    fireEventArgs: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array]) => Boolean = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getItemForPoint: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => _ = null,
    getLegendColor: /* index */ js.UndefOr[js.Any] => Unit = null,
    getMinMaxXValues: () => Array = null,
    getMinMaxYValues: () => Array = null,
    getRecordCount: () => Unit = null,
    getYValueAccessors: () => Array = null,
    getYValueCount: () => Double = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => Boolean = null,
    hasListeners: js.Any = null,
    hideAll: () => Unit = null,
    highlight: js.Any = null,
    highlightCfg: js.Any = null,
    highlightItem: /* item */ js.UndefOr[js.Any] => Unit = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => ICartesianSeries = null,
    isExcluded: /* index */ js.UndefOr[js.Any] => Unit = null,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    label: js.Any = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    onCreateLabel: (/* storeItem */ js.UndefOr[IModel], /* item */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], /* display */ js.UndefOr[java.lang.String]) => ISprite = null,
    onPlaceLabel: (/* label */ js.UndefOr[ISprite], /* storeItem */ js.UndefOr[IModel], /* item */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], /* display */ js.UndefOr[java.lang.String], /* animate */ js.UndefOr[Boolean], /* index */ js.UndefOr[Double]) => Unit = null,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[java.lang.String]) => _ = null,
    removeListener: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    renderer: js.Any = null,
    requires: Array = null,
    resumeEvent: /* repeated */ js.Any => Unit = null,
    resumeEvents: () => Unit = null,
    self: IClass = null,
    setTitle: (/* index */ js.UndefOr[Double], /* title */ js.UndefOr[java.lang.String]) => Unit = null,
    shadowAttributes: Array = null,
    showAll: () => Unit = null,
    showInLegend: js.UndefOr[Boolean] = js.undefined,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvent: /* repeated */ js.Any => Unit = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Unit = null,
    tips: js.Any = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null,
    un: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    unHighlightItem: () => Unit = null,
    uses: Array = null,
    xField: java.lang.String = null,
    yField: js.Any = null
  ): ICartesianSeries = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(js.Any.fromFunction0(clearManagedListeners))
    if (config != null) __obj.updateDynamic("config")(config)
    if (eachRecord != null) __obj.updateDynamic("eachRecord")(js.Any.fromFunction2(eachRecord))
    if (eachYValue != null) __obj.updateDynamic("eachYValue")(js.Any.fromFunction3(eachYValue))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2(fireEventArgs))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getItemForPoint != null) __obj.updateDynamic("getItemForPoint")(js.Any.fromFunction2(getItemForPoint))
    if (getLegendColor != null) __obj.updateDynamic("getLegendColor")(js.Any.fromFunction1(getLegendColor))
    if (getMinMaxXValues != null) __obj.updateDynamic("getMinMaxXValues")(js.Any.fromFunction0(getMinMaxXValues))
    if (getMinMaxYValues != null) __obj.updateDynamic("getMinMaxYValues")(js.Any.fromFunction0(getMinMaxYValues))
    if (getRecordCount != null) __obj.updateDynamic("getRecordCount")(js.Any.fromFunction0(getRecordCount))
    if (getYValueAccessors != null) __obj.updateDynamic("getYValueAccessors")(js.Any.fromFunction0(getYValueAccessors))
    if (getYValueCount != null) __obj.updateDynamic("getYValueCount")(js.Any.fromFunction0(getYValueCount))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (hideAll != null) __obj.updateDynamic("hideAll")(js.Any.fromFunction0(hideAll))
    if (highlight != null) __obj.updateDynamic("highlight")(highlight)
    if (highlightCfg != null) __obj.updateDynamic("highlightCfg")(highlightCfg)
    if (highlightItem != null) __obj.updateDynamic("highlightItem")(js.Any.fromFunction1(highlightItem))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (isExcluded != null) __obj.updateDynamic("isExcluded")(js.Any.fromFunction1(isExcluded))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (label != null) __obj.updateDynamic("label")(label)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4(on))
    if (onCreateLabel != null) __obj.updateDynamic("onCreateLabel")(js.Any.fromFunction4(onCreateLabel))
    if (onPlaceLabel != null) __obj.updateDynamic("onPlaceLabel")(js.Any.fromFunction7(onPlaceLabel))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3(relayEvents))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1(resumeEvent))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction0(resumeEvents))
    if (self != null) __obj.updateDynamic("self")(self)
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction2(setTitle))
    if (shadowAttributes != null) __obj.updateDynamic("shadowAttributes")(shadowAttributes)
    if (showAll != null) __obj.updateDynamic("showAll")(js.Any.fromFunction0(showAll))
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1(suspendEvent))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1(suspendEvents))
    if (tips != null) __obj.updateDynamic("tips")(tips)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3(un))
    if (unHighlightItem != null) __obj.updateDynamic("unHighlightItem")(js.Any.fromFunction0(unHighlightItem))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (xField != null) __obj.updateDynamic("xField")(xField)
    if (yField != null) __obj.updateDynamic("yField")(yField)
    __obj.asInstanceOf[ICartesianSeries]
  }
}

