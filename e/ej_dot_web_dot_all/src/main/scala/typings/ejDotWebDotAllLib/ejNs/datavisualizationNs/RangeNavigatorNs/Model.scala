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

