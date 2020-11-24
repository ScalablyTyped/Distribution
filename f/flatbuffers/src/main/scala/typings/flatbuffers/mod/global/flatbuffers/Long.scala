package typings.flatbuffers.mod.global.flatbuffers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////////////////////////////////////////////////////////////////
@JSGlobal("flatbuffers.Long")
@js.native
class Long protected () extends js.Object {
  def this(low: Double, high: Double) = this()
  
  def equals(other: js.Any): Boolean = js.native
  
  var high: Double = js.native
  
  var low: Double = js.native
  
  def toFloat64(): Double = js.native
}
/* static members */
@JSGlobal("flatbuffers.Long")
@js.native
object Long extends js.Object {
  
  var ZERO: Long = js.native
  
  def create(low: Double, high: Double): Long = js.native
}
