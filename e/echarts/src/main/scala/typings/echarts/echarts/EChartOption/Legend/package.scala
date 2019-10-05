package typings.echarts.echarts.EChartOption

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Legend {
  type Formatter = js.Function1[/* name */ String, String]
  type PageFormatter = js.Function2[/* current */ Double, /* total */ Double, String]
}
