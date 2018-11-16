package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

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
  var enableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** Fill color of the series.
               * @Default {null}
               */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the type of the series to render in chart.
               * @Default {column. see Type}
               */
  var `type`: js.UndefOr[Type | java.lang.String] = js.undefined
  /** Name of the property in the datasource that contains x value for the series.
               * @Default {null}
               */
  var xName: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the property in the datasource that contains y value for the series.
               * @Default {null}
               */
  var yName: js.UndefOr[java.lang.String] = js.undefined
}

