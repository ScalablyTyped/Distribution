package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Fires, on clicking the range of range navigator.
    */
  var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
  /** It allows to show the value between the particular periods (i.e) from 1st January to 31st February and so on. The default value is true. If we set the property as false, it allows
    * to show the value between the particular periods.(i.e) from 1st January to 31st January and so on.
    * @Default {true}
    */
  var allowNextValue: js.UndefOr[Boolean] = js.undefined
  /** Toggles the placement of slider exactly on the place it left or on the nearest interval.
    * @Default {false}
    */
  var allowSnapping: js.UndefOr[Boolean] = js.undefined
  /** Options for customizing the color, opacity and width of the chart border.
    */
  var border: js.UndefOr[Border] = js.undefined
  /** Specifies the data source for range navigator.
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Fires, on double clicking the range of range navigator.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.undefined
  /** Enable the resize option in the rangenavigator.
    * @Default {false}
    */
  var enableAutoResizing: js.UndefOr[Boolean] = js.undefined
  /** Toggles the redrawing of chart on moving the sliders.
    * @Default {true}
    */
  var enableDeferredUpdate: js.UndefOr[Boolean] = js.undefined
  /** Toggles the direction of rendering the range navigator control.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** Enable the scrollbar option in the rangenavigator.
    * @Default {false}
    */
  var enableScrollbar: js.UndefOr[Boolean] = js.undefined
  /** Sets a value whether to make the range navigator responsive on resize.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** Options for customizing the labels colors, font, style, size, horizontalAlignment and opacity.
    */
  var labelSettings: js.UndefOr[LabelSettings] = js.undefined
  /** Fires on load of range navigator.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
  /** Fires after range navigator is loaded.
    */
  var loaded: js.UndefOr[js.Function1[/* e */ LoadedEventArgs, Unit]] = js.undefined
  /** This property is to specify the localization of range navigator.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Options for customizing the range navigator.
    */
  var navigatorStyleSettings: js.UndefOr[NavigatorStyleSettings] = js.undefined
  /** Padding specifies the gap between the container and the range navigator.
    * @Default {0}
    */
  var padding: js.UndefOr[String] = js.undefined
  /** Fires on changing the range of range navigator.
    */
  var rangeChanged: js.UndefOr[js.Function1[/* e */ RangeChangedEventArgs, Unit]] = js.undefined
  /** If the range is not given explicitly, range will be calculated automatically.
    * @Default {none}
    */
  var rangePadding: js.UndefOr[RangePadding | String] = js.undefined
  /** Options for customizing the starting and ending ranges.
    */
  var rangeSettings: js.UndefOr[RangeSettings] = js.undefined
  /** Fires, on right clicking the range of range navigator.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.undefined
  /** Fires on changing the scrollbar position of range navigator.
    */
  var scrollChanged: js.UndefOr[js.Function1[/* e */ ScrollChangedEventArgs, Unit]] = js.undefined
  /** Fires on changes ending the scrollbar position of range navigator.
    */
  var scrollEnd: js.UndefOr[js.Function1[/* e */ ScrollEndEventArgs, Unit]] = js.undefined
  /** Options for rendering scrollbar based on the start and end range values.
    */
  var scrollRangeSettings: js.UndefOr[ScrollRangeSettings] = js.undefined
  /** Fires on when starting to change the scrollbar position of range navigator.
    */
  var scrollStart: js.UndefOr[js.Function1[/* e */ ScrollStartEventArgs, Unit]] = js.undefined
  /** selectedData is for getting the data when the &quot;rangeChanged&quot; event trigger from client side.
    */
  var selectedData: js.UndefOr[js.Any] = js.undefined
  /** Fires when the selection  ends in the range navigator
    */
  var selectedRangeEnd: js.UndefOr[js.Function1[/* e */ SelectedRangeEndEventArgs, Unit]] = js.undefined
  /** Options for customizing the start and end range values.
    */
  var selectedRangeSettings: js.UndefOr[SelectedRangeSettings] = js.undefined
  /** Fires on when starting to change the slider position of range navigator.
    */
  var selectedRangeStart: js.UndefOr[js.Function1[/* e */ SelectedRangeStartEventArgs, Unit]] = js.undefined
  /** Specifies the properties used for customizing the range series.
    */
  var series: js.UndefOr[js.Array[Series]] = js.undefined
  /** Specifies the  properties used for customizing all the range series.
    */
  var seriesSettings: js.UndefOr[js.Array[SeriesSetting]] = js.undefined
  /** Contains property to customize the hight and width of range navigator.
    */
  var sizeSettings: js.UndefOr[SizeSettings] = js.undefined
  /** By specifying this property the user can change the theme of the range navigator.
    * @Default {null}
    */
  var theme: js.UndefOr[String] = js.undefined
  /** Options for customizing the tooltip in range navigator.
    */
  var tooltipSettings: js.UndefOr[TooltipSettings] = js.undefined
  /** Options for configuring minor grid lines, major grid lines, axis line of axis.
    */
  var valueAxisSettings: js.UndefOr[ValueAxisSettings] = js.undefined
  /** You can plot data of type date time or numeric. This property determines the type of data that this axis will handle.
    * @Default {datetime}
    */
  var valueType: js.UndefOr[ValueType | String] = js.undefined
  /** Specifies the xName for dataSource. This is used to take the x values from dataSource
    */
  var xName: js.UndefOr[js.Any] = js.undefined
  /** Specifies the yName for dataSource. This is used to take the y values from dataSource
    */
  var yName: js.UndefOr[js.Any] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    Click: /* e */ ClickEventArgs => Unit = null,
    allowNextValue: js.UndefOr[Boolean] = js.undefined,
    allowSnapping: js.UndefOr[Boolean] = js.undefined,
    border: Border = null,
    dataSource: js.Any = null,
    doubleClick: /* e */ DoubleClickEventArgs => Unit = null,
    enableAutoResizing: js.UndefOr[Boolean] = js.undefined,
    enableDeferredUpdate: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enableScrollbar: js.UndefOr[Boolean] = js.undefined,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    labelSettings: LabelSettings = null,
    load: /* e */ LoadEventArgs => Unit = null,
    loaded: /* e */ LoadedEventArgs => Unit = null,
    locale: String = null,
    navigatorStyleSettings: NavigatorStyleSettings = null,
    padding: String = null,
    rangeChanged: /* e */ RangeChangedEventArgs => Unit = null,
    rangePadding: RangePadding | String = null,
    rangeSettings: RangeSettings = null,
    rightClick: /* e */ RightClickEventArgs => Unit = null,
    scrollChanged: /* e */ ScrollChangedEventArgs => Unit = null,
    scrollEnd: /* e */ ScrollEndEventArgs => Unit = null,
    scrollRangeSettings: ScrollRangeSettings = null,
    scrollStart: /* e */ ScrollStartEventArgs => Unit = null,
    selectedData: js.Any = null,
    selectedRangeEnd: /* e */ SelectedRangeEndEventArgs => Unit = null,
    selectedRangeSettings: SelectedRangeSettings = null,
    selectedRangeStart: /* e */ SelectedRangeStartEventArgs => Unit = null,
    series: js.Array[Series] = null,
    seriesSettings: js.Array[SeriesSetting] = null,
    sizeSettings: SizeSettings = null,
    theme: String = null,
    tooltipSettings: TooltipSettings = null,
    valueAxisSettings: ValueAxisSettings = null,
    valueType: ValueType | String = null,
    xName: js.Any = null,
    yName: js.Any = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (Click != null) __obj.updateDynamic("Click")(js.Any.fromFunction1(Click))
    if (!js.isUndefined(allowNextValue)) __obj.updateDynamic("allowNextValue")(allowNextValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSnapping)) __obj.updateDynamic("allowSnapping")(allowSnapping.get.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (doubleClick != null) __obj.updateDynamic("doubleClick")(js.Any.fromFunction1(doubleClick))
    if (!js.isUndefined(enableAutoResizing)) __obj.updateDynamic("enableAutoResizing")(enableAutoResizing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDeferredUpdate)) __obj.updateDynamic("enableDeferredUpdate")(enableDeferredUpdate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableScrollbar)) __obj.updateDynamic("enableScrollbar")(enableScrollbar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive.get.asInstanceOf[js.Any])
    if (labelSettings != null) __obj.updateDynamic("labelSettings")(labelSettings.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (loaded != null) __obj.updateDynamic("loaded")(js.Any.fromFunction1(loaded))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (navigatorStyleSettings != null) __obj.updateDynamic("navigatorStyleSettings")(navigatorStyleSettings.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (rangeChanged != null) __obj.updateDynamic("rangeChanged")(js.Any.fromFunction1(rangeChanged))
    if (rangePadding != null) __obj.updateDynamic("rangePadding")(rangePadding.asInstanceOf[js.Any])
    if (rangeSettings != null) __obj.updateDynamic("rangeSettings")(rangeSettings.asInstanceOf[js.Any])
    if (rightClick != null) __obj.updateDynamic("rightClick")(js.Any.fromFunction1(rightClick))
    if (scrollChanged != null) __obj.updateDynamic("scrollChanged")(js.Any.fromFunction1(scrollChanged))
    if (scrollEnd != null) __obj.updateDynamic("scrollEnd")(js.Any.fromFunction1(scrollEnd))
    if (scrollRangeSettings != null) __obj.updateDynamic("scrollRangeSettings")(scrollRangeSettings.asInstanceOf[js.Any])
    if (scrollStart != null) __obj.updateDynamic("scrollStart")(js.Any.fromFunction1(scrollStart))
    if (selectedData != null) __obj.updateDynamic("selectedData")(selectedData.asInstanceOf[js.Any])
    if (selectedRangeEnd != null) __obj.updateDynamic("selectedRangeEnd")(js.Any.fromFunction1(selectedRangeEnd))
    if (selectedRangeSettings != null) __obj.updateDynamic("selectedRangeSettings")(selectedRangeSettings.asInstanceOf[js.Any])
    if (selectedRangeStart != null) __obj.updateDynamic("selectedRangeStart")(js.Any.fromFunction1(selectedRangeStart))
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (seriesSettings != null) __obj.updateDynamic("seriesSettings")(seriesSettings.asInstanceOf[js.Any])
    if (sizeSettings != null) __obj.updateDynamic("sizeSettings")(sizeSettings.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltipSettings != null) __obj.updateDynamic("tooltipSettings")(tooltipSettings.asInstanceOf[js.Any])
    if (valueAxisSettings != null) __obj.updateDynamic("valueAxisSettings")(valueAxisSettings.asInstanceOf[js.Any])
    if (valueType != null) __obj.updateDynamic("valueType")(valueType.asInstanceOf[js.Any])
    if (xName != null) __obj.updateDynamic("xName")(xName.asInstanceOf[js.Any])
    if (yName != null) __obj.updateDynamic("yName")(yName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

