package typings.echarts.libEchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("echarts/lib/echarts", "registerTheme")
@js.native
object registerTheme extends js.Object {
  /**
    * Registers a theme, should be specified when
    * [initialize the chart instance](https://echarts.apache.org/api.html#echarts.init).
    *
    * @param {string} themeName Theme name.
    * @param {object} theme Theme configurations.
    */
  def apply(themeName: String, theme: js.Object): Unit = js.native
}

