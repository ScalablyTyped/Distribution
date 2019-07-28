package typings.falcorDashJsonDashGraph.falcorDashJsonDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("falcor-json-graph", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def atom(value: js.Any): Atom = js.native
  def atom(value: js.Any, props: Sentinel): Atom = js.native
  def error(errorValue: js.Any): Error = js.native
  def error(errorValue: js.Any, props: Sentinel): Error = js.native
  def pathInvalidation(path: String): InvalidPath = js.native
  def pathInvalidation(path: PathSet): InvalidPath = js.native
  def pathValue(path: String, value: js.Any): PathValue = js.native
  def pathValue(path: PathSet, value: js.Any): PathValue = js.native
  def ref(path: String): Reference = js.native
  def ref(path: String, props: Sentinel): Reference = js.native
  def ref(path: PathSet): Reference = js.native
  def ref(path: PathSet, props: Sentinel): Reference = js.native
}

