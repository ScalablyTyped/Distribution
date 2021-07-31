package typings.fuzzaldrin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Key[K /* <: /* keyof T */ String */, T] extends StObject {
    
    var key: K
    
    var maxResults: js.UndefOr[Double] = js.undefined
  }
  object Key {
    
    @scala.inline
    def apply[K /* <: /* keyof T */ String */, T](key: K): Key[K, T] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key[K, T]]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key[?, ?], K /* <: /* keyof T */ String */, T] (val x: Self & (Key[K, T])) extends AnyVal {
      
      @scala.inline
      def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    }
  }
  
  trait MaxResults extends StObject {
    
    var maxResults: js.UndefOr[Double] = js.undefined
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
