package typings.flatbuffers.mod._Global_.flatbuffers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////////////////////////
@JSGlobal("flatbuffers.Long")
@js.native
class Long protected () extends js.Object {
  def this(low: Double, high: Double) = this()
  var high: Double = js.native
  var low: Double = js.native
  def equals(other: js.Any): Boolean = js.native
  def toFloat64(): Double = js.native
}

/* static members */
@JSGlobal("flatbuffers.Long")
@js.native
object Long extends js.Object {
  var ZERO: Long = js.native
  def create(low: Double, high: Double): Long = js.native
}

