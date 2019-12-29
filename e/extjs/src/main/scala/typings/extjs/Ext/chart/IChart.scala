package typings.extjs.Ext.chart

import typings.extjs.Ext.Array
import typings.extjs.Ext.chart.theme.ITheme
import typings.extjs.Ext.data.IAbstractStore
import typings.extjs.Ext.data.IStore
import typings.extjs.Ext.draw.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.util.IBindable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined bindStore, bindStoreListeners, getStore, getStoreListeners, onBindStore, onUnbindStore, unbindStoreListeners
- typings.extjs.Ext.chart.INavigation because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined restoreZoom, setZoom
- typings.extjs.Ext.chart.IMask because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined mask */ trait IChart
  extends IComponent
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
  var theme: js.UndefOr[String] = js.undefined
  /** [Method] Unbinds listeners from this component to the store
  		* @param store Ext.data.AbstractStore The store to unbind from
  		*/
  var unbindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.undefined
}

object IChart {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    ITheme: ITheme = null,
    animate: js.Any = null,
    axes: Array = null,
    background: js.Any = null,
    bindStore: (js.Function1[/* store */ js.UndefOr[js.Any], Unit]) | (js.Function2[/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any], Unit]) = null,
    bindStoreListeners: js.UndefOr[IAbstractStore] => Unit = null,
    getStore: () => IAbstractStore = null,
    getStoreListeners: js.Function0[_] | (js.Function1[/* store */ js.UndefOr[IStore], _]) = null,
    insetPadding: Int | Double = null,
    legend: js.Any = null,
    mask: js.Any = null,
    onBindStore: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Unit = null,
    onShow: () => Unit = null,
    onUnbindStore: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Unit = null,
    redraw: /* resize */ js.UndefOr[Boolean] => Unit = null,
    restoreZoom: () => Unit = null,
    save: /* config */ js.UndefOr[js.Any] => _ = null,
    series: Array = null,
    setZoom: js.UndefOr[js.Any] => Unit = null,
    store: IStore = null,
    theme: String = null,
    unbindStoreListeners: js.UndefOr[IAbstractStore] => Unit = null
  ): IChart = {
    val __obj = js.Dynamic.literal()
    if (IComponent != null) js.Dynamic.global.Object.assign(__obj, IComponent)
    if (ITheme != null) js.Dynamic.global.Object.assign(__obj, ITheme)
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (axes != null) __obj.updateDynamic("axes")(axes.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (bindStore != null) __obj.updateDynamic("bindStore")(bindStore.asInstanceOf[js.Any])
    if (bindStoreListeners != null) __obj.updateDynamic("bindStoreListeners")(js.Any.fromFunction1(bindStoreListeners))
    if (getStore != null) __obj.updateDynamic("getStore")(js.Any.fromFunction0(getStore))
    if (getStoreListeners != null) __obj.updateDynamic("getStoreListeners")(getStoreListeners.asInstanceOf[js.Any])
    if (insetPadding != null) __obj.updateDynamic("insetPadding")(insetPadding.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (onBindStore != null) __obj.updateDynamic("onBindStore")(js.Any.fromFunction2(onBindStore))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (onUnbindStore != null) __obj.updateDynamic("onUnbindStore")(js.Any.fromFunction2(onUnbindStore))
    if (redraw != null) __obj.updateDynamic("redraw")(js.Any.fromFunction1(redraw))
    if (restoreZoom != null) __obj.updateDynamic("restoreZoom")(js.Any.fromFunction0(restoreZoom))
    if (save != null) __obj.updateDynamic("save")(js.Any.fromFunction1(save))
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (setZoom != null) __obj.updateDynamic("setZoom")(js.Any.fromFunction1(setZoom))
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (unbindStoreListeners != null) __obj.updateDynamic("unbindStoreListeners")(js.Any.fromFunction1(unbindStoreListeners))
    __obj.asInstanceOf[IChart]
  }
}

