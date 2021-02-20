package typings.emberEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initializerMod {
  
  @js.native
  trait Initializer[T] extends StObject {
    
    var after: js.UndefOr[js.Array[String]] = js.native
    
    var before: js.UndefOr[js.Array[String]] = js.native
    
    def initialize(application: T): Unit = js.native
    
    var name: String = js.native
  }
  object Initializer {
    
    @scala.inline
    def apply[T](initialize: T => Unit, name: String): Initializer[T] = {
      val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction1(initialize), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Initializer[T]]
    }
    
    @scala.inline
    implicit class InitializerMutableBuilder[Self <: Initializer[_], T] (val x: Self with Initializer[T]) extends AnyVal {
      
      @scala.inline
      def setAfter(value: js.Array[String]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      @scala.inline
      def setAfterVarargs(value: String*): Self = StObject.set(x, "after", js.Array(value :_*))
      
      @scala.inline
      def setBefore(value: js.Array[String]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      @scala.inline
      def setBeforeVarargs(value: String*): Self = StObject.set(x, "before", js.Array(value :_*))
      
      @scala.inline
      def setInitialize(value: T => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
