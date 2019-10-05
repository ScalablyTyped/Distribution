package typings.falcor.falcorMod

import typings.falcorDashJsonDashGraph.falcorDashJsonDashGraphMod.PathSet
import typings.falcorDashJsonDashGraph.falcorDashJsonDashGraphMod.Reference
import typings.falcorDashJsonDashGraph.falcorDashJsonDashGraphMod.Sentinel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("falcor", "ref")
@js.native
object ref extends js.Object {
  def apply(path: String): Reference = js.native
  def apply(path: String, props: Sentinel): Reference = js.native
  def apply(path: PathSet): Reference = js.native
  def apply(path: PathSet, props: Sentinel): Reference = js.native
}

