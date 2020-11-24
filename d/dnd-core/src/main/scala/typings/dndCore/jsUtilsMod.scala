package typings.dndCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dnd-core/lib/utils/js_utils", JSImport.Namespace)
@js.native
object jsUtilsMod extends js.Object {
  
  def get[T](obj: js.Any, path: String, defaultValue: T): T = js.native
  
  def intersection[T](itemsA: js.Array[T], itemsB: js.Array[T]): js.Array[T] = js.native
  
  def isObject(input: js.Any): Boolean = js.native
  
  def isString(input: js.Any): Boolean = js.native
  
  def without[T](items: js.Array[T], item: T): js.Array[T] = js.native
  
  def xor[T /* <: String | Double */](itemsA: js.Array[T], itemsB: js.Array[T]): js.Array[T] = js.native
}
