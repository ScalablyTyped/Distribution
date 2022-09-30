package typings.dndCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsUtilsMod {
  
  @JSImport("dnd-core/dist/utils/js_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def get[T](obj: Any, path: String, defaultValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def intersection[T](itemsA: js.Array[T], itemsB: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(itemsA.asInstanceOf[js.Any], itemsB.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def isObject(input: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isString(input: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def without[T](items: js.Array[T], item: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("without")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def xor[T /* <: String | Double */](itemsA: js.Array[T], itemsB: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("xor")(itemsA.asInstanceOf[js.Any], itemsB.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
