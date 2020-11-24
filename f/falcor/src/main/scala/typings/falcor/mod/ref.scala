package typings.falcor.mod

import typings.falcorJsonGraph.mod.PathSet
import typings.falcorJsonGraph.mod.Reference
import typings.falcorJsonGraph.mod.Sentinel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("falcor", "ref")
@js.native
object ref extends js.Object {
  
  def apply(path: String): Reference = js.native
  def apply(path: String, props: Sentinel): Reference = js.native
  def apply(path: PathSet): Reference = js.native
  def apply(path: PathSet, props: Sentinel): Reference = js.native
}
