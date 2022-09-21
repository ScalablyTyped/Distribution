package typings.frecency

import typings.frecency.mod.idAttrFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ExactQueryMatchWeight extends StObject {
    
    var exactQueryMatchWeight: js.UndefOr[Double] = js.undefined
    
    var idAttribute: js.UndefOr[String | idAttrFn] = js.undefined
    
    var key: String
    
    var recentSelectionsLimit: js.UndefOr[Double] = js.undefined
    
    var recentSelectionsMatchWeight: js.UndefOr[Double] = js.undefined
    
    var storageProvider: js.UndefOr[js.Object] = js.undefined
    
    var subQueryMatchWeight: js.UndefOr[Double] = js.undefined
    
    var timeStampsLimit: js.UndefOr[Double] = js.undefined
  }
  object ExactQueryMatchWeight {
    
    inline def apply(key: String): ExactQueryMatchWeight = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExactQueryMatchWeight]
    }
    
    extension [Self <: ExactQueryMatchWeight](x: Self) {
      
      inline def setExactQueryMatchWeight(value: Double): Self = StObject.set(x, "exactQueryMatchWeight", value.asInstanceOf[js.Any])
      
      inline def setExactQueryMatchWeightUndefined: Self = StObject.set(x, "exactQueryMatchWeight", js.undefined)
      
      inline def setIdAttribute(value: String | idAttrFn): Self = StObject.set(x, "idAttribute", value.asInstanceOf[js.Any])
      
      inline def setIdAttributeFunction1(value: /* result */ String => String): Self = StObject.set(x, "idAttribute", js.Any.fromFunction1(value))
      
      inline def setIdAttributeUndefined: Self = StObject.set(x, "idAttribute", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRecentSelectionsLimit(value: Double): Self = StObject.set(x, "recentSelectionsLimit", value.asInstanceOf[js.Any])
      
      inline def setRecentSelectionsLimitUndefined: Self = StObject.set(x, "recentSelectionsLimit", js.undefined)
      
      inline def setRecentSelectionsMatchWeight(value: Double): Self = StObject.set(x, "recentSelectionsMatchWeight", value.asInstanceOf[js.Any])
      
      inline def setRecentSelectionsMatchWeightUndefined: Self = StObject.set(x, "recentSelectionsMatchWeight", js.undefined)
      
      inline def setStorageProvider(value: js.Object): Self = StObject.set(x, "storageProvider", value.asInstanceOf[js.Any])
      
      inline def setStorageProviderUndefined: Self = StObject.set(x, "storageProvider", js.undefined)
      
      inline def setSubQueryMatchWeight(value: Double): Self = StObject.set(x, "subQueryMatchWeight", value.asInstanceOf[js.Any])
      
      inline def setSubQueryMatchWeightUndefined: Self = StObject.set(x, "subQueryMatchWeight", js.undefined)
      
      inline def setTimeStampsLimit(value: Double): Self = StObject.set(x, "timeStampsLimit", value.asInstanceOf[js.Any])
      
      inline def setTimeStampsLimitUndefined: Self = StObject.set(x, "timeStampsLimit", js.undefined)
    }
  }
  
  trait FrecencyScore extends StObject {
    
    var _frecencyScore: js.UndefOr[Double] = js.undefined
  }
  object FrecencyScore {
    
    inline def apply(): FrecencyScore = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FrecencyScore]
    }
    
    extension [Self <: FrecencyScore](x: Self) {
      
      inline def set_frecencyScore(value: Double): Self = StObject.set(x, "_frecencyScore", value.asInstanceOf[js.Any])
      
      inline def set_frecencyScoreUndefined: Self = StObject.set(x, "_frecencyScore", js.undefined)
    }
  }
  
  trait KeepScores[T] extends StObject {
    
    var keepScores: js.UndefOr[Boolean] = js.undefined
    
    var results: js.Array[T]
    
    var searchQuery: T
  }
  object KeepScores {
    
    inline def apply[T](results: js.Array[T], searchQuery: T): KeepScores[T] = {
      val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], searchQuery = searchQuery.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeepScores[T]]
    }
    
    extension [Self <: KeepScores[?], T](x: Self & KeepScores[T]) {
      
      inline def setKeepScores(value: Boolean): Self = StObject.set(x, "keepScores", value.asInstanceOf[js.Any])
      
      inline def setKeepScoresUndefined: Self = StObject.set(x, "keepScores", js.undefined)
      
      inline def setResults(value: js.Array[T]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: T*): Self = StObject.set(x, "results", js.Array(value*))
      
      inline def setSearchQuery(value: T): Self = StObject.set(x, "searchQuery", value.asInstanceOf[js.Any])
    }
  }
  
  trait Results[T] extends StObject {
    
    var results: js.Array[T]
    
    var searchQuery: T
  }
  object Results {
    
    inline def apply[T](results: js.Array[T], searchQuery: T): Results[T] = {
      val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], searchQuery = searchQuery.asInstanceOf[js.Any])
      __obj.asInstanceOf[Results[T]]
    }
    
    extension [Self <: Results[?], T](x: Self & Results[T]) {
      
      inline def setResults(value: js.Array[T]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: T*): Self = StObject.set(x, "results", js.Array(value*))
      
      inline def setSearchQuery(value: T): Self = StObject.set(x, "searchQuery", value.asInstanceOf[js.Any])
    }
  }
  
  trait SearchQuery[T] extends StObject {
    
    var searchQuery: T
    
    var selectedId: String
  }
  object SearchQuery {
    
    inline def apply[T](searchQuery: T, selectedId: String): SearchQuery[T] = {
      val __obj = js.Dynamic.literal(searchQuery = searchQuery.asInstanceOf[js.Any], selectedId = selectedId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchQuery[T]]
    }
    
    extension [Self <: SearchQuery[?], T](x: Self & SearchQuery[T]) {
      
      inline def setSearchQuery(value: T): Self = StObject.set(x, "searchQuery", value.asInstanceOf[js.Any])
      
      inline def setSelectedId(value: String): Self = StObject.set(x, "selectedId", value.asInstanceOf[js.Any])
    }
  }
}
