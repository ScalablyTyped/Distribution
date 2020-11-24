package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Fires, on clicking the range of range navigator.
    */
  var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
  
  /** It allows to show the value between the particular periods (i.e) from 1st January to 31st February and so on. The default value is true. If we set the property as false, it allows
    * to show the value between the particular periods.(i.e) from 1st January to 31st January and so on.
    * @Default {true}
    */
  var allowNextValue: js.UndefOr[Boolean] = js.native
  
  /** Toggles the placement of slider exactly on the place it left or on the nearest interval.
    * @Default {false}
    */
  var allowSnapping: js.UndefOr[Boolean] = js.native
  
  /** Options for customizing the color, opacity and width of the chart border.
    */
  var border: js.UndefOr[Border] = js.native
  
  /** Specifies the data source for range navigator.
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  
  /** Fires, on double clicking the range of range navigator.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.native
  
  /** Enable the resize option in the rangenavigator.
    * @Default {false}
    */
  var enableAutoResizing: js.UndefOr[Boolean] = js.native
  
  /** Toggles the redrawing of chart on moving the sliders.
    * @Default {true}
    */
  var enableDeferredUpdate: js.UndefOr[Boolean] = js.native
  
  /** Toggles the direction of rendering the range navigator control.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  
  /** Enable the scrollbar option in the rangenavigator.
    * @Default {false}
    */
  var enableScrollbar: js.UndefOr[Boolean] = js.native
  
  /** Sets a value whether to make the range navigator responsive on resize.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  
  /** Options for customizing the labels colors, font, style, size, horizontalAlignment and opacity.
    */
  var labelSettings: js.UndefOr[LabelSettings] = js.native
  
  /** Fires on load of range navigator.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  
  /** Fires after range navigator is loaded.
    */
  var loaded: js.UndefOr[js.Function1[/* e */ LoadedEventArgs, Unit]] = js.native
  
  /** This property is to specify the localization of range navigator.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  
  /** Options for customizing the range navigator.
    */
  var navigatorStyleSettings: js.UndefOr[NavigatorStyleSettings] = js.native
  
  /** Padding specifies the gap between the container and the range navigator.
    * @Default {0}
    */
  var padding: js.UndefOr[String] = js.native
  
  /** Fires on changing the range of range navigator.
    */
  var rangeChanged: js.UndefOr[js.Function1[/* e */ RangeChangedEventArgs, Unit]] = js.native
  
  /** If the range is not given explicitly, range will be calculated automatically.
    * @Default {none}
    */
  var rangePadding: js.UndefOr[RangePadding | String] = js.native
  
  /** Options for customizing the starting and ending ranges.
    */
  var rangeSettings: js.UndefOr[RangeSettings] = js.native
  
  /** Fires, on right clicking the range of range navigator.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.native
  
  /** Fires on changing the scrollbar position of range navigator.
    */
  var scrollChanged: js.UndefOr[js.Function1[/* e */ ScrollChangedEventArgs, Unit]] = js.native
  
  /** Fires on changes ending the scrollbar position of range navigator.
    */
  var scrollEnd: js.UndefOr[js.Function1[/* e */ ScrollEndEventArgs, Unit]] = js.native
  
  /** Options for rendering scrollbar based on the start and end range values.
    */
  var scrollRangeSettings: js.UndefOr[ScrollRangeSettings] = js.native
  
  /** Fires on when starting to change the scrollbar position of range navigator.
    */
  var scrollStart: js.UndefOr[js.Function1[/* e */ ScrollStartEventArgs, Unit]] = js.native
  
  /** selectedData is for getting the data when the &quot;rangeChanged&quot; event trigger from client side.
    */
  var selectedData: js.UndefOr[js.Any] = js.native
  
  /** Fires when the selection  ends in the range navigator
    */
  var selectedRangeEnd: js.UndefOr[js.Function1[/* e */ SelectedRangeEndEventArgs, Unit]] = js.native
  
  /** Options for customizing the start and end range values.
    */
  var selectedRangeSettings: js.UndefOr[SelectedRangeSettings] = js.native
  
  /** Fires on when starting to change the slider position of range navigator.
    */
  var selectedRangeStart: js.UndefOr[js.Function1[/* e */ SelectedRangeStartEventArgs, Unit]] = js.native
  
  /** Specifies the properties used for customizing the range series.
    */
  var series: js.UndefOr[js.Array[Series]] = js.native
  
  /** Specifies the  properties used for customizing all the range series.
    */
  var seriesSettings: js.UndefOr[js.Array[SeriesSetting]] = js.native
  
  /** Contains property to customize the hight and width of range navigator.
    */
  var sizeSettings: js.UndefOr[SizeSettings] = js.native
  
  /** By specifying this property the user can change the theme of the range navigator.
    * @Default {null}
    */
  var theme: js.UndefOr[String] = js.native
  
  /** Options for customizing the tooltip in range navigator.
    */
  var tooltipSettings: js.UndefOr[TooltipSettings] = js.native
  
  /** Options for configuring minor grid lines, major grid lines, axis line of axis.
    */
  var valueAxisSettings: js.UndefOr[ValueAxisSettings] = js.native
  
  /** You can plot data of type date time or numeric. This property determines the type of data that this axis will handle.
    * @Default {datetime}
    */
  var valueType: js.UndefOr[ValueType | String] = js.native
  
  /** Specifies the xName for dataSource. This is used to take the x values from dataSource
    */
  var xName: js.UndefOr[js.Any] = js.native
  
  /** Specifies the yName for dataSource. This is used to take the y values from dataSource
    */
  var yName: js.UndefOr[js.Any] = js.native
}
object Model {
  
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    
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
    def setClick(value: /* e */ ClickEventArgs => Unit): Self = this.set("Click", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClick: Self = this.set("Click", js.undefined)
    
    @scala.inline
    def setAllowNextValue(value: Boolean): Self = this.set("allowNextValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowNextValue: Self = this.set("allowNextValue", js.undefined)
    
    @scala.inline
    def setAllowSnapping(value: Boolean): Self = this.set("allowSnapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSnapping: Self = this.set("allowSnapping", js.undefined)
    
    @scala.inline
    def setBorder(value: Border): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDoubleClick(value: /* e */ DoubleClickEventArgs => Unit): Self = this.set("doubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDoubleClick: Self = this.set("doubleClick", js.undefined)
    
    @scala.inline
    def setEnableAutoResizing(value: Boolean): Self = this.set("enableAutoResizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAutoResizing: Self = this.set("enableAutoResizing", js.undefined)
    
    @scala.inline
    def setEnableDeferredUpdate(value: Boolean): Self = this.set("enableDeferredUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDeferredUpdate: Self = this.set("enableDeferredUpdate", js.undefined)
    
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    
    @scala.inline
    def setEnableScrollbar(value: Boolean): Self = this.set("enableScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableScrollbar: Self = this.set("enableScrollbar", js.undefined)
    
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    
    @scala.inline
    def setLabelSettings(value: LabelSettings): Self = this.set("labelSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelSettings: Self = this.set("labelSettings", js.undefined)
    
    @scala.inline
    def setLoad(value: /* e */ LoadEventArgs => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setLoaded(value: /* e */ LoadedEventArgs => Unit): Self = this.set("loaded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoaded: Self = this.set("loaded", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setNavigatorStyleSettings(value: NavigatorStyleSettings): Self = this.set("navigatorStyleSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigatorStyleSettings: Self = this.set("navigatorStyleSettings", js.undefined)
    
    @scala.inline
    def setPadding(value: String): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setRangeChanged(value: /* e */ RangeChangedEventArgs => Unit): Self = this.set("rangeChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRangeChanged: Self = this.set("rangeChanged", js.undefined)
    
    @scala.inline
    def setRangePadding(value: RangePadding | String): Self = this.set("rangePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangePadding: Self = this.set("rangePadding", js.undefined)
    
    @scala.inline
    def setRangeSettings(value: RangeSettings): Self = this.set("rangeSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeSettings: Self = this.set("rangeSettings", js.undefined)
    
    @scala.inline
    def setRightClick(value: /* e */ RightClickEventArgs => Unit): Self = this.set("rightClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRightClick: Self = this.set("rightClick", js.undefined)
    
    @scala.inline
    def setScrollChanged(value: /* e */ ScrollChangedEventArgs => Unit): Self = this.set("scrollChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteScrollChanged: Self = this.set("scrollChanged", js.undefined)
    
    @scala.inline
    def setScrollEnd(value: /* e */ ScrollEndEventArgs => Unit): Self = this.set("scrollEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteScrollEnd: Self = this.set("scrollEnd", js.undefined)
    
    @scala.inline
    def setScrollRangeSettings(value: ScrollRangeSettings): Self = this.set("scrollRangeSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollRangeSettings: Self = this.set("scrollRangeSettings", js.undefined)
    
    @scala.inline
    def setScrollStart(value: /* e */ ScrollStartEventArgs => Unit): Self = this.set("scrollStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteScrollStart: Self = this.set("scrollStart", js.undefined)
    
    @scala.inline
    def setSelectedData(value: js.Any): Self = this.set("selectedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedData: Self = this.set("selectedData", js.undefined)
    
    @scala.inline
    def setSelectedRangeEnd(value: /* e */ SelectedRangeEndEventArgs => Unit): Self = this.set("selectedRangeEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelectedRangeEnd: Self = this.set("selectedRangeEnd", js.undefined)
    
    @scala.inline
    def setSelectedRangeSettings(value: SelectedRangeSettings): Self = this.set("selectedRangeSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedRangeSettings: Self = this.set("selectedRangeSettings", js.undefined)
    
    @scala.inline
    def setSelectedRangeStart(value: /* e */ SelectedRangeStartEventArgs => Unit): Self = this.set("selectedRangeStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelectedRangeStart: Self = this.set("selectedRangeStart", js.undefined)
    
    @scala.inline
    def setSeriesVarargs(value: Series*): Self = this.set("series", js.Array(value :_*))
    
    @scala.inline
    def setSeries(value: js.Array[Series]): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    
    @scala.inline
    def setSeriesSettingsVarargs(value: SeriesSetting*): Self = this.set("seriesSettings", js.Array(value :_*))
    
    @scala.inline
    def setSeriesSettings(value: js.Array[SeriesSetting]): Self = this.set("seriesSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesSettings: Self = this.set("seriesSettings", js.undefined)
    
    @scala.inline
    def setSizeSettings(value: SizeSettings): Self = this.set("sizeSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeSettings: Self = this.set("sizeSettings", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTooltipSettings(value: TooltipSettings): Self = this.set("tooltipSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipSettings: Self = this.set("tooltipSettings", js.undefined)
    
    @scala.inline
    def setValueAxisSettings(value: ValueAxisSettings): Self = this.set("valueAxisSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueAxisSettings: Self = this.set("valueAxisSettings", js.undefined)
    
    @scala.inline
    def setValueType(value: ValueType | String): Self = this.set("valueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueType: Self = this.set("valueType", js.undefined)
    
    @scala.inline
    def setXName(value: js.Any): Self = this.set("xName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXName: Self = this.set("xName", js.undefined)
    
    @scala.inline
    def setYName(value: js.Any): Self = this.set("yName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYName: Self = this.set("yName", js.undefined)
  }
}
