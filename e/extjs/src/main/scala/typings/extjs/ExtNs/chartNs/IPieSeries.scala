package typings.extjs.ExtNs.chartNs

import typings.extjs.ExtNs.Array
import typings.extjs.ExtNs.IClass
import typings.extjs.ExtNs.chartNs.seriesNs.ISeries
import typings.extjs.ExtNs.dataNs.IModel
import typings.extjs.ExtNs.drawNs.ISprite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPieSeries extends ISeries {
  /** [Config Option] (String) */
  var angleField: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Array) */
  var colorSet: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Boolean/Number) */
  var donut: js.UndefOr[js.Any] = js.undefined
  /** [Method] Draws the series for the current chart  */
  var drawSeries: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var highlightDuration: js.UndefOr[Double] = js.undefined
  /** [Method] Highlight the specified item
  		* @param item Object {Object} Info about the item; same format as returned by getItemForPoint
  		*/
  @JSName("highlightItem")
  var highlightItem_IPieSeries: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (String) */
  var lengthField: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var style: js.UndefOr[js.Any] = js.undefined
  /** [Method] Un highlights the specified item
  		* @param item Object {Object} Info about the item; same format as returned by getItemForPoint
  		*/
  @JSName("unHighlightItem")
  var unHighlightItem_IPieSeries: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (String) */
  var xField: js.UndefOr[java.lang.String] = js.undefined
}

object IPieSeries {
  @scala.inline
  def apply(
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    angleField: java.lang.String = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearListeners: () => Unit = null,
    clearManagedListeners: () => Unit = null,
    colorSet: Array = null,
    config: js.Any = null,
    donut: js.Any = null,
    drawSeries: () => Unit = null,
    eachRecord: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    extend: java.lang.String = null,
    field: java.lang.String = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => Boolean = null,
    fireEventArgs: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array]) => Boolean = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getItemForPoint: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => _ = null,
    getLegendColor: /* item */ js.UndefOr[js.Any] => Unit = null,
    getRecordCount: () => Unit = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => Boolean = null,
    hasListeners: js.Any = null,
    hideAll: () => Unit = null,
    highlight: js.Any = null,
    highlightCfg: js.Any = null,
    highlightDuration: Int | Double = null,
    highlightItem: /* item */ js.UndefOr[js.Any] => Unit = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IPieSeries = null,
    isExcluded: /* index */ js.UndefOr[js.Any] => Unit = null,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    label: js.Any = null,
    lengthField: java.lang.String = null,
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
    style: js.Any = null,
    suspendEvent: /* repeated */ js.Any => Unit = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Unit = null,
    tips: js.Any = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null,
    un: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    unHighlightItem: /* item */ js.UndefOr[js.Any] => Unit = null,
    uses: Array = null,
    xField: java.lang.String = null
  ): IPieSeries = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (angleField != null) __obj.updateDynamic("angleField")(angleField)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(js.Any.fromFunction0(clearManagedListeners))
    if (colorSet != null) __obj.updateDynamic("colorSet")(colorSet)
    if (config != null) __obj.updateDynamic("config")(config)
    if (donut != null) __obj.updateDynamic("donut")(donut)
    if (drawSeries != null) __obj.updateDynamic("drawSeries")(js.Any.fromFunction0(drawSeries))
    if (eachRecord != null) __obj.updateDynamic("eachRecord")(js.Any.fromFunction2(eachRecord))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (field != null) __obj.updateDynamic("field")(field)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2(fireEventArgs))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getItemForPoint != null) __obj.updateDynamic("getItemForPoint")(js.Any.fromFunction2(getItemForPoint))
    if (getLegendColor != null) __obj.updateDynamic("getLegendColor")(js.Any.fromFunction1(getLegendColor))
    if (getRecordCount != null) __obj.updateDynamic("getRecordCount")(js.Any.fromFunction0(getRecordCount))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (hideAll != null) __obj.updateDynamic("hideAll")(js.Any.fromFunction0(hideAll))
    if (highlight != null) __obj.updateDynamic("highlight")(highlight)
    if (highlightCfg != null) __obj.updateDynamic("highlightCfg")(highlightCfg)
    if (highlightDuration != null) __obj.updateDynamic("highlightDuration")(highlightDuration.asInstanceOf[js.Any])
    if (highlightItem != null) __obj.updateDynamic("highlightItem")(js.Any.fromFunction1(highlightItem))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (isExcluded != null) __obj.updateDynamic("isExcluded")(js.Any.fromFunction1(isExcluded))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (label != null) __obj.updateDynamic("label")(label)
    if (lengthField != null) __obj.updateDynamic("lengthField")(lengthField)
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
    if (style != null) __obj.updateDynamic("style")(style)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1(suspendEvent))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1(suspendEvents))
    if (tips != null) __obj.updateDynamic("tips")(tips)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3(un))
    if (unHighlightItem != null) __obj.updateDynamic("unHighlightItem")(js.Any.fromFunction1(unHighlightItem))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (xField != null) __obj.updateDynamic("xField")(xField)
    __obj.asInstanceOf[IPieSeries]
  }
}

