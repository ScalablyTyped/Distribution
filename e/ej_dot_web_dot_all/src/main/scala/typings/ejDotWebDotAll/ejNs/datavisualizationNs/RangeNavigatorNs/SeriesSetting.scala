package typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesSetting extends js.Object {
  /** Specifies the dataSource for the series. It can be an array of JSON objects or an instance of ej.DataManager.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Enable/disable the animation of series.
    * @Default {false}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.undefined
  /** Fill color of the series.
    * @Default {null}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** Specifies the type of the series to render in chart.
    * @Default {column. see Type}
    */
  var `type`: js.UndefOr[typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs.Type | String] = js.undefined
  /** Name of the property in the datasource that contains x value for the series.
    * @Default {null}
    */
  var xName: js.UndefOr[String] = js.undefined
  /** Name of the property in the datasource that contains y value for the series.
    * @Default {null}
    */
  var yName: js.UndefOr[String] = js.undefined
}

object SeriesSetting {
  @scala.inline
  def apply(
    dataSource: js.Any = null,
    enableAnimation: js.UndefOr[Boolean] = js.undefined,
    fill: String = null,
    `type`: typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs.Type | String = null,
    xName: String = null,
    yName: String = null
  ): SeriesSetting = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (xName != null) __obj.updateDynamic("xName")(xName)
    if (yName != null) __obj.updateDynamic("yName")(yName)
    __obj.asInstanceOf[SeriesSetting]
  }
}

