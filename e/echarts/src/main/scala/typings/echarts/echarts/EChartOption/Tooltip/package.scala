package typings.echarts.echarts.EChartOption

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Tooltip {
  
  /**
    * The first parameter params is the data that the formatter needs.
    * Its format is shown as {Format}
    * When trigger is `'axis'`, or when tooltip is triggered by
    * `axisPointer`, params is the data array of multiple series.
    * The content of each item of the array is Format type but, without
    * `percent` field.
    *
    * Note: Using array to present all the parameters in ECharts 2.x
    * is not supported anymore.
    * The second parameter ticket is the asynchronous callback flag
    * which should be used along with the third parameter callback
    * when it is used.
    * The third parameter callback is asynchronous callback.
    * When the content of tooltip is acquired asynchronously,
    * ticket and htm as introduced above can be used to update tooltip
    * with callback.
    *
    * @example
    * formatter: function (params, ticket, callback) {
    *     $.get('detail?name=' + params.name, function (content) {
    *         callback(ticket, toHTML(content));
    *     });
    *     return 'Loading';
    * }
    */
  type Formatter = js.Function3[
    /* params */ typings.echarts.echarts.EChartOption.Tooltip.Format | js.Array[typings.echarts.echarts.EChartOption.Tooltip.Format], 
    /* ticket */ java.lang.String, 
    /* callback */ js.Function2[/* ticket */ java.lang.String, /* html */ java.lang.String, scala.Unit], 
    java.lang.String
  ]
}
