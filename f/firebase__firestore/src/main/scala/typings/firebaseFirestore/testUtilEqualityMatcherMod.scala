package typings.firebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testUtilEqualityMatcherMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/test/util/equality_matcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addEqualityMatcher(customMatchers: CustomMatcher[Any]*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEqualityMatcher")(customMatchers.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  trait CustomMatcher[T] extends StObject {
    
    def equalsFn(left: T, right: T): Boolean
    
    var forType: js.Function
  }
  object CustomMatcher {
    
    inline def apply[T](equalsFn: (T, T) => Boolean, forType: js.Function): CustomMatcher[T] = {
      val __obj = js.Dynamic.literal(equalsFn = js.Any.fromFunction2(equalsFn), forType = forType.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomMatcher[T]]
    }
    
    extension [Self <: CustomMatcher[?], T](x: Self & CustomMatcher[T]) {
      
      inline def setEqualsFn(value: (T, T) => Boolean): Self = StObject.set(x, "equalsFn", js.Any.fromFunction2(value))
      
      inline def setForType(value: js.Function): Self = StObject.set(x, "forType", value.asInstanceOf[js.Any])
    }
  }
  
  trait Equatable[T] extends StObject {
    
    def isEqual(other: T): Boolean
  }
  object Equatable {
    
    inline def apply[T](isEqual: T => Boolean): Equatable[T] = {
      val __obj = js.Dynamic.literal(isEqual = js.Any.fromFunction1(isEqual))
      __obj.asInstanceOf[Equatable[T]]
    }
    
    extension [Self <: Equatable[?], T](x: Self & Equatable[T]) {
      
      inline def setIsEqual(value: T => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    }
  }
}
