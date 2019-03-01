package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Fires, on clicking the range of range navigator.
    */
  var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, scala.Unit]] = js.undefined
  /** It allows to show the value between the particular periods (i.e) from 1st January to 31st February and so on. The default value is true. If we set the property as false, it allows
    * to show the value between the particular periods.(i.e) from 1st January to 31st January and so on.
    * @Default {true}
    */
  var allowNextValue: js.UndefOr[scala.Boolean] = js.undefined
  /** Toggles the placement of slider exactly on the place it left or on the nearest interval.
    * @Default {false}
    */
  var allowSnapping: js.UndefOr[scala.Boolean] = js.undefined
  /** Options for customizing the color, opacity and width of the chart border.
    */
  var border: js.UndefOr[Border] = js.undefined
  /** Specifies the data source for range navigator.
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Fires, on double clicking the range of range navigator.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, scala.Unit]] = js.undefined
  /** Enable the resize option in the rangenavigator.
    * @Default {false}
    */
  var enableAutoResizing: js.UndefOr[scala.Boolean] = js.undefined
  /** Toggles the redrawing of chart on moving the sliders.
    * @Default {true}
    */
  var enableDeferredUpdate: js.UndefOr[scala.Boolean] = js.undefined
  /** Toggles the direction of rendering the range navigator control.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Enable the scrollbar option in the rangenavigator.
    * @Default {false}
    */
  var enableScrollbar: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets a value whether to make the range navigator responsive on resize.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Options for customizing the labels colors, font, style, size, horizontalAlignment and opacity.
    */
  var labelSettings: js.UndefOr[LabelSettings] = js.undefined
  /** Fires on load of range navigator.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, scala.Unit]] = js.undefined
  /** Fires after range navigator is loaded.
    */
  var loaded: js.UndefOr[js.Function1[/* e */ LoadedEventArgs, scala.Unit]] = js.undefined
  /** This property is to specify the localization of range navigator.
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Options for customizing the range navigator.
    */
  var navigatorStyleSettings: js.UndefOr[NavigatorStyleSettings] = js.undefined
  /** Padding specifies the gap between the container and the range navigator.
    * @Default {0}
    */
  var padding: js.UndefOr[java.lang.String] = js.undefined
  /** Fires on changing the range of range navigator.
    */
  var rangeChanged: js.UndefOr[js.Function1[/* e */ RangeChangedEventArgs, scala.Unit]] = js.undefined
  /** If the range is not given explicitly, range will be calculated automatically.
    * @Default {none}
    */
  var rangePadding: js.UndefOr[RangePadding | java.lang.String] = js.undefined
  /** Options for customizing the starting and ending ranges.
    */
  var rangeSettings: js.UndefOr[RangeSettings] = js.undefined
  /** Fires, on right clicking the range of range navigator.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, scala.Unit]] = js.undefined
  /** Fires on changing the scrollbar position of range navigator.
    */
  var scrollChanged: js.UndefOr[js.Function1[/* e */ ScrollChangedEventArgs, scala.Unit]] = js.undefined
  /** Fires on changes ending the scrollbar position of range navigator.
    */
  var scrollEnd: js.UndefOr[js.Function1[/* e */ ScrollEndEventArgs, scala.Unit]] = js.undefined
  /** Options for rendering scrollbar based on the start and end range values.
    */
  var scrollRangeSettings: js.UndefOr[ScrollRangeSettings] = js.undefined
  /** Fires on when starting to change the scrollbar position of range navigator.
    */
  var scrollStart: js.UndefOr[js.Function1[/* e */ ScrollStartEventArgs, scala.Unit]] = js.undefined
  /** selectedData is for getting the data when the &quot;rangeChanged&quot; event trigger from client side.
    */
  var selectedData: js.UndefOr[js.Any] = js.undefined
  /** Fires when the selection  ends in the range navigator
    */
  var selectedRangeEnd: js.UndefOr[js.Function1[/* e */ SelectedRangeEndEventArgs, scala.Unit]] = js.undefined
  /** Options for customizing the start and end range values.
    */
  var selectedRangeSettings: js.UndefOr[SelectedRangeSettings] = js.undefined
  /** Fires on when starting to change the slider position of range navigator.
    */
  var selectedRangeStart: js.UndefOr[js.Function1[/* e */ SelectedRangeStartEventArgs, scala.Unit]] = js.undefined
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
  var theme: js.UndefOr[java.lang.String] = js.undefined
  /** Options for customizing the tooltip in range navigator.
    */
  var tooltipSettings: js.UndefOr[TooltipSettings] = js.undefined
  /** Options for configuring minor grid lines, major grid lines, axis line of axis.
    */
  var valueAxisSettings: js.UndefOr[ValueAxisSettings] = js.undefined
  /** You can plot data of type date time or numeric. This property determines the type of data that this axis will handle.
    * @Default {datetime}
    */
  var valueType: js.UndefOr[ValueType | java.lang.String] = js.undefined
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
    Click: js.Function1[/* e */ ClickEventArgs, scala.Unit] = null,
    allowNextValue: js.UndefOr[scala.Boolean] = js.undefined,
    allowSnapping: js.UndefOr[scala.Boolean] = js.undefined,
    border: Border = null,
    dataSource: js.Any = null,
    doubleClick: js.Function1[/* e */ DoubleClickEventArgs, scala.Unit] = null,
    enableAutoResizing: js.UndefOr[scala.Boolean] = js.undefined,
    enableDeferredUpdate: js.UndefOr[scala.Boolean] = js.undefined,
    enableRTL: js.UndefOr[scala.Boolean] = js.undefined,
    enableScrollbar: js.UndefOr[scala.Boolean] = js.undefined,
    isResponsive: js.UndefOr[scala.Boolean] = js.undefined,
    labelSettings: LabelSettings = null,
    load: js.Function1[/* e */ LoadEventArgs, scala.Unit] = null,
    loaded: js.Function1[/* e */ LoadedEventArgs, scala.Unit] = null,
    locale: java.lang.String = null,
    navigatorStyleSettings: NavigatorStyleSettings = null,
    padding: java.lang.String = null,
    rangeChanged: js.Function1[/* e */ RangeChangedEventArgs, scala.Unit] = null,
    rangePadding: RangePadding | java.lang.String = null,
    rangeSettings: RangeSettings = null,
    rightClick: js.Function1[/* e */ RightClickEventArgs, scala.Unit] = null,
    scrollChanged: js.Function1[/* e */ ScrollChangedEventArgs, scala.Unit] = null,
    scrollEnd: js.Function1[/* e */ ScrollEndEventArgs, scala.Unit] = null,
    scrollRangeSettings: ScrollRangeSettings = null,
    scrollStart: js.Function1[/* e */ ScrollStartEventArgs, scala.Unit] = null,
    selectedData: js.Any = null,
    selectedRangeEnd: js.Function1[/* e */ SelectedRangeEndEventArgs, scala.Unit] = null,
    selectedRangeSettings: SelectedRangeSettings = null,
    selectedRangeStart: js.Function1[/* e */ SelectedRangeStartEventArgs, scala.Unit] = null,
    series: js.Array[Series] = null,
    seriesSettings: js.Array[SeriesSetting] = null,
    sizeSettings: SizeSettings = null,
    theme: java.lang.String = null,
    tooltipSettings: TooltipSettings = null,
    valueAxisSettings: ValueAxisSettings = null,
    valueType: ValueType | java.lang.String = null,
    xName: js.Any = null,
    yName: js.Any = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (Click != null) __obj.updateDynamic("Click")(Click)
    if (!js.isUndefined(allowNextValue)) __obj.updateDynamic("allowNextValue")(allowNextValue)
    if (!js.isUndefined(allowSnapping)) __obj.updateDynamic("allowSnapping")(allowSnapping)
    if (border != null) __obj.updateDynamic("border")(border)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (doubleClick != null) __obj.updateDynamic("doubleClick")(doubleClick)
    if (!js.isUndefined(enableAutoResizing)) __obj.updateDynamic("enableAutoResizing")(enableAutoResizing)
    if (!js.isUndefined(enableDeferredUpdate)) __obj.updateDynamic("enableDeferredUpdate")(enableDeferredUpdate)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enableScrollbar)) __obj.updateDynamic("enableScrollbar")(enableScrollbar)
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive)
    if (labelSettings != null) __obj.updateDynamic("labelSettings")(labelSettings)
    if (load != null) __obj.updateDynamic("load")(load)
    if (loaded != null) __obj.updateDynamic("loaded")(loaded)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (navigatorStyleSettings != null) __obj.updateDynamic("navigatorStyleSettings")(navigatorStyleSettings)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (rangeChanged != null) __obj.updateDynamic("rangeChanged")(rangeChanged)
    if (rangePadding != null) __obj.updateDynamic("rangePadding")(rangePadding.asInstanceOf[js.Any])
    if (rangeSettings != null) __obj.updateDynamic("rangeSettings")(rangeSettings)
    if (rightClick != null) __obj.updateDynamic("rightClick")(rightClick)
    if (scrollChanged != null) __obj.updateDynamic("scrollChanged")(scrollChanged)
    if (scrollEnd != null) __obj.updateDynamic("scrollEnd")(scrollEnd)
    if (scrollRangeSettings != null) __obj.updateDynamic("scrollRangeSettings")(scrollRangeSettings)
    if (scrollStart != null) __obj.updateDynamic("scrollStart")(scrollStart)
    if (selectedData != null) __obj.updateDynamic("selectedData")(selectedData)
    if (selectedRangeEnd != null) __obj.updateDynamic("selectedRangeEnd")(selectedRangeEnd)
    if (selectedRangeSettings != null) __obj.updateDynamic("selectedRangeSettings")(selectedRangeSettings)
    if (selectedRangeStart != null) __obj.updateDynamic("selectedRangeStart")(selectedRangeStart)
    if (series != null) __obj.updateDynamic("series")(series)
    if (seriesSettings != null) __obj.updateDynamic("seriesSettings")(seriesSettings)
    if (sizeSettings != null) __obj.updateDynamic("sizeSettings")(sizeSettings)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (tooltipSettings != null) __obj.updateDynamic("tooltipSettings")(tooltipSettings)
    if (valueAxisSettings != null) __obj.updateDynamic("valueAxisSettings")(valueAxisSettings)
    if (valueType != null) __obj.updateDynamic("valueType")(valueType.asInstanceOf[js.Any])
    if (xName != null) __obj.updateDynamic("xName")(xName)
    if (yName != null) __obj.updateDynamic("yName")(yName)
    __obj.asInstanceOf[Model]
  }
}

