package typings.focusLock

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayMod {
  
  @JSImport("focus-lock/dist/es5/utils/array", "asArray")
  @js.native
  def asArray[T](a: T): js.Array[T] = js.native
  @JSImport("focus-lock/dist/es5/utils/array", "asArray")
  @js.native
  def asArray[T](a: js.Array[T]): js.Array[T] = js.native
  
  @JSImport("focus-lock/dist/es5/utils/array", "toArray")
  @js.native
  def toArray[T](a: js.Array[T]): js.Array[T] = js.native
  @JSImport("focus-lock/dist/es5/utils/array", "toArray")
  @js.native
  def toArray[T](a: ListOf[T]): js.Array[T] = js.native
  
  @js.native
  trait ListOf[TNode] extends /* index */ NumberDictionary[TNode] {
    
    var length: Double = js.native
  }
  object ListOf {
    
    @scala.inline
    def apply[TNode](length: Double): ListOf[TNode] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListOf[TNode]]
    }
    
    @scala.inline
    implicit class ListOfMutableBuilder[Self <: ListOf[_], TNode] (val x: Self with ListOf[TNode]) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
}
