package typings.fuzzaldrin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Key[K /* <: /* keyof T */ String */, T] extends StObject {
    
    var key: K = js.native
    
    var maxResults: js.UndefOr[Double] = js.native
  }
  object Key {
    
    @scala.inline
    def apply[K /* <: /* keyof T */ String */, T](key: K): Key[K, T] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key[K, T]]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key[_, _], K /* <: /* keyof T */ String */, T] (val x: Self with (Key[K, T])) extends AnyVal {
      
      @scala.inline
      def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    }
  }
  
  @js.native
  trait MaxResults extends StObject {
    
    var maxResults: js.UndefOr[Double] = js.native
  }
  object MaxResults {
    
    @scala.inline
    def apply(): MaxResults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxResults]
    }
    
    @scala.inline
    implicit class MaxResultsMutableBuilder[Self <: MaxResults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    }
  }
}
