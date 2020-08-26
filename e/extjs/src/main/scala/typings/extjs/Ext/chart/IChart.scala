package typings.extjs.Ext.chart

import typings.extjs.Ext.Array
import typings.extjs.Ext.chart.theme.ITheme
import typings.extjs.Ext.data.IAbstractStore
import typings.extjs.Ext.data.IStore
import typings.extjs.Ext.draw.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.util.IBindable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined bindStore, bindStoreListeners, getStore, getStoreListeners, onBindStore, onUnbindStore, unbindStoreListeners
- typings.extjs.Ext.chart.INavigation because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined restoreZoom, setZoom
- typings.extjs.Ext.chart.IMask because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined mask */ @js.native
trait IChart
  extends IComponent
     with ITheme {
  /** [Config Option] (Boolean/Object) */
  @JSName("animate")
  var animate_IChart: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Ext.chart.axis.Axis[]) */
  var axes: js.UndefOr[Array] = js.native
  /** [Config Option] (Object/Boolean) */
  var background: js.UndefOr[js.Any] = js.native
  /** [Method] Binds a store to this instance
    * @param store Object
    * @param initial Object
    */
  var bindStore: js.UndefOr[
    (js.Function1[/* store */ js.UndefOr[js.Any], Unit]) | (js.Function2[/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any], Unit])
  ] = js.native
  /** [Method] Binds listeners for this component to the store
    * @param store Ext.data.AbstractStore The store to bind to
    */
  var bindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.native
  /** [Method] Gets the current store instance
    * @returns Ext.data.AbstractStore The store, null if one does not exist.
    */
  var getStore: js.UndefOr[js.Function0[IAbstractStore]] = js.native
  /** [Method] Gets the listeners to bind to a new store
    * @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
    */
  var getStoreListeners: js.UndefOr[js.Function0[_] | (js.Function1[/* store */ js.UndefOr[IStore], _])] = js.native
  /** [Config Option] (Number) */
  var insetPadding: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean/Object) */
  var legend: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean/String) */
  var mask: js.UndefOr[js.Any] = js.native
  /** [Method] Template method it is called when a new store is bound to the current instance
    * @param store Ext.data.AbstractStore The store being bound
    * @param initial Boolean True if this store is being bound as initialization of the instance.
    */
  var onBindStore: js.UndefOr[js.Function2[js.UndefOr[IAbstractStore], js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Allows addition of behavior to the show operation  */
  @JSName("onShow")
  var onShow_IChart: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Template method it is called when an existing store is unbound from the current instance
    * @param store Ext.data.AbstractStore The store being unbound
    * @param initial Boolean True if this store is being bound as initialization of the instance.
    */
  var onUnbindStore: js.UndefOr[js.Function2[js.UndefOr[IAbstractStore], js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Redraws the chart
    * @param resize Boolean flag which changes the default origin points of the chart for animations.
    */
  var redraw: js.UndefOr[js.Function1[/* resize */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Restores the zoom to the original value  */
  var restoreZoom: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Saves the chart by either triggering a download or returning a string containing the chart data as SVG
    * @param config Object The configuration to be passed to the exporter. See the export method for the appropriate exporter for the relevant configuration options
    * @returns Object See the return types for the appropriate exporter
    */
  var save: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], _]] = js.native
  /** [Config Option] (Ext.chart.series.Series[]) */
  var series: js.UndefOr[Array] = js.native
  /** [Method] Zooms the chart to the specified selection range
    * @param zoomConfig Object
    */
  var setZoom: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Ext.data.Store) */
  var store: js.UndefOr[IStore] = js.native
  /** [Config Option] (String) */
  var theme: js.UndefOr[String] = js.native
  /** [Method] Unbinds listeners from this component to the store
    * @param store Ext.data.AbstractStore The store to unbind from
    */
  var unbindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.native
}

object IChart {
  @scala.inline
  def apply(): IChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChart]
  }
  @scala.inline
  implicit class IChartOps[Self <: IChart] (val x: Self) extends AnyVal {
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
    def setAnimate(value: js.Any): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setAxes(value: Array): Self = this.set("axes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxes: Self = this.set("axes", js.undefined)
    @scala.inline
    def setBackground(value: js.Any): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBindStoreFunction2(value: (/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any]) => Unit): Self = this.set("bindStore", js.Any.fromFunction2(value))
    @scala.inline
    def setBindStoreFunction1(value: /* store */ js.UndefOr[js.Any] => Unit): Self = this.set("bindStore", js.Any.fromFunction1(value))
    @scala.inline
    def setBindStore(
      value: (js.Function1[/* store */ js.UndefOr[js.Any], Unit]) | (js.Function2[/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any], Unit])
    ): Self = this.set("bindStore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindStore: Self = this.set("bindStore", js.undefined)
    @scala.inline
    def setBindStoreListeners(value: js.UndefOr[IAbstractStore] => Unit): Self = this.set("bindStoreListeners", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBindStoreListeners: Self = this.set("bindStoreListeners", js.undefined)
    @scala.inline
    def setGetStore(value: () => IAbstractStore): Self = this.set("getStore", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetStore: Self = this.set("getStore", js.undefined)
    @scala.inline
    def setGetStoreListenersFunction1(value: /* store */ js.UndefOr[IStore] => _): Self = this.set("getStoreListeners", js.Any.fromFunction1(value))
    @scala.inline
    def setGetStoreListenersFunction0(value: () => _): Self = this.set("getStoreListeners", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStoreListeners(value: js.Function0[_] | (js.Function1[/* store */ js.UndefOr[IStore], _])): Self = this.set("getStoreListeners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetStoreListeners: Self = this.set("getStoreListeners", js.undefined)
    @scala.inline
    def setInsetPadding(value: Double): Self = this.set("insetPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsetPadding: Self = this.set("insetPadding", js.undefined)
    @scala.inline
    def setLegend(value: js.Any): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setMask(value: js.Any): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    @scala.inline
    def setOnBindStore(value: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Unit): Self = this.set("onBindStore", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnBindStore: Self = this.set("onBindStore", js.undefined)
    @scala.inline
    def setOnShow(value: () => Unit): Self = this.set("onShow", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setOnUnbindStore(value: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Unit): Self = this.set("onUnbindStore", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnUnbindStore: Self = this.set("onUnbindStore", js.undefined)
    @scala.inline
    def setRedraw(value: /* resize */ js.UndefOr[Boolean] => Unit): Self = this.set("redraw", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRedraw: Self = this.set("redraw", js.undefined)
    @scala.inline
    def setRestoreZoom(value: () => Unit): Self = this.set("restoreZoom", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRestoreZoom: Self = this.set("restoreZoom", js.undefined)
    @scala.inline
    def setSave(value: /* config */ js.UndefOr[js.Any] => _): Self = this.set("save", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
    @scala.inline
    def setSeries(value: Array): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    @scala.inline
    def setSetZoom(value: js.UndefOr[js.Any] => Unit): Self = this.set("setZoom", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetZoom: Self = this.set("setZoom", js.undefined)
    @scala.inline
    def setStore(value: IStore): Self = this.set("store", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setUnbindStoreListeners(value: js.UndefOr[IAbstractStore] => Unit): Self = this.set("unbindStoreListeners", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUnbindStoreListeners: Self = this.set("unbindStoreListeners", js.undefined)
  }
  
}

