package typings.focusLock

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayMod {
  
  @JSImport("focus-lock/dist/es5/utils/array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asArray[T](a: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("asArray")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def asArray[T](a: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("asArray")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def toArray[T](a: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def toArray[T](a: ListOf[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  trait ListOf[TNode]
    extends StObject
       with /* index */ NumberDictionary[TNode] {
    
    var length: Double
  }
  object ListOf {
    
    inline def apply[TNode](length: Double): ListOf[TNode] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListOf[TNode]]
    }
    
    extension [Self <: ListOf[?], TNode](x: Self & ListOf[TNode]) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
}
