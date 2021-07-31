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
    
    @scala.inline
    def apply(query: String): Iterations = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[Iterations]
    }
    
    @scala.inline
    implicit class IterationsMutableBuilder[Self <: Iterations] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
      
      @scala.inline
      def setModerate(value: Boolean): Self = StObject.set(x, "moderate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModerateUndefined: Self = StObject.set(x, "moderate", js.undefined)
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    }
  }
}
