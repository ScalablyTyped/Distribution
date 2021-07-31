package typings.domAccessibilityApi

import typings.domAccessibilityApi.setLikeMod.global.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setLikeMod {
  
  /* was `typeof Set` */
  @JSImport("dom-accessibility-api/dist/polyfills/SetLike", JSImport.Default)
  @js.native
  class default[T] () extends Set[T] {
    def this(items: js.Array[T]) = this()
  }
  
  object global {
    
    @JSGlobal("Set")
    @js.native
    class Set[T] () extends StObject {
      def this(items: js.Array[T]) = this()
      
      def add(value: T): this.type = js.native
      
      def clear(): Unit = js.native
      
      def delete(value: T): Boolean = js.native
      
      def forEach(callbackfn: js.Function3[/* value */ T, /* value2 */ T, /* set */ Set[T], Unit]): Unit = js.native
      def forEach(callbackfn: js.Function3[/* value */ T, /* value2 */ T, /* set */ Set[T], Unit], thisArg: js.Any): Unit = js.native
      
      def has(value: T): Boolean = js.native
      
      val size: Double = js.native
    }
  }
  
  /* was `typeof Set` */
  type _default[T] = Set[T]
}
