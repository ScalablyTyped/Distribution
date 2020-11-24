package typings.flatpickr.globalsMod.global

import typings.flatpickr.instanceMod.FlatpickrFn
import typings.flatpickr.instanceMod.Instance
import typings.flatpickr.optionsMod.Options
import typings.std.ArrayLike
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends js.Object {
  
  def flatpickr(selector: String): Instance | js.Array[Instance] = js.native
  def flatpickr(selector: String, config: Options): Instance | js.Array[Instance] = js.native
  def flatpickr(selector: ArrayLike[Node]): js.Array[Instance] = js.native
  def flatpickr(selector: ArrayLike[Node], config: Options): js.Array[Instance] = js.native
  def flatpickr(selector: Node): Instance = js.native
  def flatpickr(selector: Node, config: Options): Instance = js.native
  @JSName("flatpickr")
  var flatpickr_Original: FlatpickrFn = js.native
}
