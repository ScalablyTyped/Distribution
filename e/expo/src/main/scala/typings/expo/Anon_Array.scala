package typings.expo

import typings.expo.expoMod.HashMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Array extends js.Object {
  var _array: js.Array[HashMap]
  var length: Double
  def item(index: Double): js.Any
}

object Anon_Array {
  @scala.inline
  def apply(_array: js.Array[HashMap], item: Double => js.Any, length: Double): Anon_Array = {
    val __obj = js.Dynamic.literal(_array = _array, item = js.Any.fromFunction1(item), length = length)
  
    __obj.asInstanceOf[Anon_Array]
  }
}

