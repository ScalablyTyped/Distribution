package typings.duckduckgoImagesApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Iterations extends StObject {
    
    var iterations: js.UndefOr[Double] = js.undefined
    
    var moderate: js.UndefOr[Boolean] = js.undefined
    
    var query: String
    
    var retries: js.UndefOr[Double] = js.undefined
  }
  object Iterations {
    
    inline def apply(query: String): Iterations = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[Iterations]
    }
    
    extension [Self <: Iterations](x: Self) {
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
      
      inline def setModerate(value: Boolean): Self = StObject.set(x, "moderate", value.asInstanceOf[js.Any])
      
      inline def setModerateUndefined: Self = StObject.set(x, "moderate", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    }
  }
}
