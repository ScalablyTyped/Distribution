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
    
    inline def apply[K /* <: /* keyof T */ String */, T](key: K): Key[K, T] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key[K, T]]
    }
    
    extension [Self <: Key[?, ?], K /* <: /* keyof T */ String */, T](x: Self & (Key[K, T])) {
      
      inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    }
  }
  
  trait MaxResults extends StObject {
    
    var maxResults: js.UndefOr[Double] = js.undefined
  }
  object MaxResults {
    
    inline def apply(): MaxResults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxResults]
    }
    
    extension [Self <: MaxResults](x: Self) {
      
      inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    }
  }
}
