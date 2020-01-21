package typings.emberDebug

import typings.emberDebug.dataAdapterMod.DataAdapter.Column
import typings.std.ObjectConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColumns extends js.Object {
  var columns: js.Array[Column] = js.native
  var count: Double = js.native
  var name: String = js.native
  @JSName("object")
  var object_Original: ObjectConstructor = js.native
  def `object`(): js.Any = js.native
  def `object`(value: js.Any): js.Any = js.native
}

