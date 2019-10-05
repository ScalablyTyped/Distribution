package typings.extjs.Ext.chart

import typings.extjs.Ext.Array
import typings.extjs.Ext.chart.theme.ITheme
import typings.extjs.Ext.data.IAbstractStore
import typings.extjs.Ext.data.IStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.util.IBindable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined bindStore, bindStoreListeners, getStore, getStoreListeners, onBindStore, onUnbindStore, unbindStoreListeners
- typings.extjs.Ext.chart.INavigation because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined restoreZoom, setZoom
- typings.extjs.Ext.chart.IMask because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined mask */ trait IChart
  extends typings.extjs.Ext.draw.IComponent
     with ITheme {
  /** [Config Option] (Boolean/Object) */
  @JSName("animate")
  var animate_IChart: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Ext.chart.axis.Axis[]) */
  var axes: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Object/Boolean) */
  var background: js.UndefOr[js.Any] = js.undefined
  /** [Method] Binds a store to this instance
  		* @param store Object
  		* @param initial Object
  		*/
  var bindStore: js.UndefOr[
    (js.Function1[/* store */ js.UndefOr[js.Any], Unit]) | (js.Function2[/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any], Unit])
  ] = js.undefined
  /** [Method] Binds listeners for this component to the store
  		* @param store Ext.data.AbstractStore The store to bind to
  		*/
  var bindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.undefined
  /** [Method] Gets the current store instance
  		* @returns Ext.data.AbstractStore The store, null if one does not exist.
  		*/
  var getStore: js.UndefOr[js.Function0[IAbstractStore]] = js.undefined
  /** [Method] Gets the listeners to bind to a new store
  		* @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
  		*/
  var getStoreListeners: js.UndefOr[js.Function0[_] | (js.Function1[/* store */ js.UndefOr[IStore], _])] = js.undefined
  /** [Config Option] (Number) */
  var insetPadding: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var legend: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean/String) */
  var mask: js.UndefOr[js.Any] = js.undefined
  /** [Method] Template method it is called when a new store is bound to the current instance
  		* @param store Ext.data.AbstractStore The store being bound
  		* @param initial Boolean True if this store is being bound as initialization of the instance.
  		*/
  var onBindStore: js.UndefOr[js.Function2[js.UndefOr[IAbstractStore], js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Allows addition of behavior to the show operation  */
  @JSName("onShow")
  var onShow_IChart: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Template method it is called when an existing store is unbound from the current instance
  		* @param store Ext.data.AbstractStore The store being unbound
  		* @param initial Boolean True if this store is being bound as initialization of the instance.
  		*/
  var onUnbindStore: js.UndefOr[js.Function2[js.UndefOr[IAbstractStore], js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Redraws the chart
  		* @param resize Boolean flag which changes the default origin points of the chart for animations.
  		*/
  var redraw: js.UndefOr[js.Function1[/* resize */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Restores the zoom to the original value  */
  var restoreZoom: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Saves the chart by either triggering a download or returning a string containing the chart data as SVG
  		* @param config Object The configuration to be passed to the exporter. See the export method for the appropriate exporter for the relevant configuration options
  		* @returns Object See the return types for the appropriate exporter
  		*/
  var save: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (Ext.chart.series.Series[]) */
  var series: js.UndefOr[Array] = js.undefined
  /** [Method] Zooms the chart to the specified selection range
  		* @param zoomConfig Object
  		*/
  var setZoom: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Ext.data.Store) */
  var store: js.UndefOr[IStore] = js.undefined
  /** [Config Option] (String) */
  var theme: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Unbinds listeners from this component to the store
  		* @param store Ext.data.AbstractStore The store to unbind from
  		*/
  var unbindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.undefined
}

object IChart {
  @scala.inline
  def apply(
    IComponent: typings.extjs.Ext.draw.IComponent = null,
    ITheme: ITheme = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    animate: js.Any = null,
    axes: Array = null,
    background: js.Any = null,
    bindStore: (/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any]) => Unit = null,
    bindStoreListeners: /* store */ js.UndefOr[IAbstractStore] => Unit = null,
    clearListeners: () => Unit = null,
    clearManagedListeners: () => Unit = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => Boolean = null,
    fireEventArgs: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array]) => Boolean = null,
    getStore: () => IAbstractStore = null,
    getStoreListeners: () => _ = null,
    gradients: Array = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => Boolean = null,
    initComponent: () => Unit = null,
    insetPadding: Int | Double = null,
    legend: js.Any = null,
    mask: js.Any = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    onBindStore: (/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean]) => Unit = null,
    onShow: () => Unit = null,
    onUnbindStore: (/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean]) => Unit = null,
    redraw: /* resize */ js.UndefOr[Boolean] => Unit = null,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[java.lang.String]) => _ = null,
    removeListener: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    restoreZoom: () => Unit = null,
    resumeEvent: /* repeated */ js.Any => Unit = null,
    resumeEvents: () => Unit = null,
    save: /* config */ js.UndefOr[js.Any] => _ = null,
    series: Array = null,
    setZoom: /* zoomConfig */ js.UndefOr[js.Any] => Unit = null,
    store: IStore = null,
    suspendEvent: /* repeated */ js.Any => Unit = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Unit = null,
    theme: java.lang.String = null,
    un: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    unbindStoreListeners: /* store */ js.UndefOr[IAbstractStore] => Unit = null
  ): IChart = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    js.Dynamic.global.Object.assign(__obj, ITheme)
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (axes != null) __obj.updateDynamic("axes")(axes)
    if (background != null) __obj.updateDynamic("background")(background)
    if (bindStore != null) __obj.updateDynamic("bindStore")(js.Any.fromFunction2(bindStore))
    if (bindStoreListeners != null) __obj.updateDynamic("bindStoreListeners")(js.Any.fromFunction1(bindStoreListeners))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(js.Any.fromFunction0(clearManagedListeners))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2(fireEventArgs))
    if (getStore != null) __obj.updateDynamic("getStore")(js.Any.fromFunction0(getStore))
    if (getStoreListeners != null) __obj.updateDynamic("getStoreListeners")(js.Any.fromFunction0(getStoreListeners))
    if (gradients != null) __obj.updateDynamic("gradients")(gradients)
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (initComponent != null) __obj.updateDynamic("initComponent")(js.Any.fromFunction0(initComponent))
    if (insetPadding != null) __obj.updateDynamic("insetPadding")(insetPadding.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (mask != null) __obj.updateDynamic("mask")(mask)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4(on))
    if (onBindStore != null) __obj.updateDynamic("onBindStore")(js.Any.fromFunction2(onBindStore))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (onUnbindStore != null) __obj.updateDynamic("onUnbindStore")(js.Any.fromFunction2(onUnbindStore))
    if (redraw != null) __obj.updateDynamic("redraw")(js.Any.fromFunction1(redraw))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3(relayEvents))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (restoreZoom != null) __obj.updateDynamic("restoreZoom")(js.Any.fromFunction0(restoreZoom))
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1(resumeEvent))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction0(resumeEvents))
    if (save != null) __obj.updateDynamic("save")(js.Any.fromFunction1(save))
    if (series != null) __obj.updateDynamic("series")(series)
    if (setZoom != null) __obj.updateDynamic("setZoom")(js.Any.fromFunction1(setZoom))
    if (store != null) __obj.updateDynamic("store")(store)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1(suspendEvent))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1(suspendEvents))
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3(un))
    if (unbindStoreListeners != null) __obj.updateDynamic("unbindStoreListeners")(js.Any.fromFunction1(unbindStoreListeners))
    __obj.asInstanceOf[IChart]
  }
}

