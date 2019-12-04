package typings.flatpickr.distTypesGlobalsMod._Global_

import typings.flatpickr.distTypesInstanceMod.FlatpickrFn
import typings.flatpickr.distTypesInstanceMod.Instance
import typings.flatpickr.distTypesOptionsMod.Options
import typings.std.ArrayLike
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  @JSName("flatpickr")
  var flatpickr_Original: FlatpickrFn = js.native
  def flatpickr(selector: String): Instance | js.Array[Instance] = js.native
  def flatpickr(selector: String, config: Options): Instance | js.Array[Instance] = js.native
  def flatpickr(selector: ArrayLike[Node]): js.Array[Instance] = js.native
  def flatpickr(selector: ArrayLike[Node], config: Options): js.Array[Instance] = js.native
  def flatpickr(selector: Node): Instance = js.native
  def flatpickr(selector: Node, config: Options): Instance = js.native
}

