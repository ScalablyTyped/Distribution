package typings.dndCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsUtilsMod {
  
  @JSImport("dnd-core/lib/utils/js_utils", "get")
  @js.native
  def get[T](obj: js.Any, path: String, defaultValue: T): T = js.native
  
  @JSImport("dnd-core/lib/utils/js_utils", "intersection")
  @js.native
  def intersection[T](itemsA: js.Array[T], itemsB: js.Array[T]): js.Array[T] = js.native
  
  @JSImport("dnd-core/lib/utils/js_utils", "isObject")
  @js.native
  def isObject(input: js.Any): Boolean = js.native
  
  @JSImport("dnd-core/lib/utils/js_utils", "isString")
  @js.native
  def isString(input: js.Any): Boolean = js.native
  
  @JSImport("dnd-core/lib/utils/js_utils", "without")
  @js.native
  def without[T](items: js.Array[T], item: T): js.Array[T] = js.native
  
  @JSImport("dnd-core/lib/utils/js_utils", "xor")
  @js.native
  def xor[T /* <: String | Double */](itemsA: js.Array[T], itemsB: js.Array[T]): js.Array[T] = js.native
}
