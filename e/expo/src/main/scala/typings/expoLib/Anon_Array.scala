package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Array extends js.Object {
  var _array: js.Array[expoLib.expoMod.HashMap]
  var length: scala.Double
  def item(index: scala.Double): js.Any
}

object Anon_Array {
  @scala.inline
  def apply(
    _array: js.Array[expoLib.expoMod.HashMap],
    item: js.Function1[scala.Double, js.Any],
    length: scala.Double
  ): Anon_Array = {
    val __obj = js.Dynamic.literal(_array = _array, item = item, length = length)
  
    __obj.asInstanceOf[Anon_Array]
  }
}

