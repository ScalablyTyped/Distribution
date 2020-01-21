package typings.googleVisualization.google

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developers.google.com/chart/interactive/docs/basic_load_libs
@JSGlobal("google.charts")
@js.native
object charts extends js.Object {
  def load(version: String, packages: js.Object): Unit = js.native
  def setOnLoadCallback(handler: js.Function): Unit = js.native
}

