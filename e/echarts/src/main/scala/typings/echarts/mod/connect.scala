package typings.echarts.mod

import typings.echarts.echarts.ECharts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("echarts", "connect")
@js.native
object connect extends js.Object {
  /**
    * Connects interaction of multiple chart series. For example:
    *
    ```js
    // set group id of each instance respectively.
    chart1.group = 'group1';
    chart2.group = 'group1';
    echarts.connect('group1');
    // or incoming instance array that need to be linked.
    echarts.connect([chart1, chart2]);
    ```
    *
    * @param group Group id in string, or array of chart instance.
    */
  def apply(group: String): Unit = js.native
  def apply(group: js.Array[ECharts]): Unit = js.native
}

