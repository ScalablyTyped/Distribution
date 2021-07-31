package typings.easyJsend

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Limit extends StObject {
    
    var limit: Double
    
    var skip: Double
  }
  object Limit {
    
    @scala.inline
    def apply(limit: Double, skip: Double): Limit = {
      val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
      __obj.asInstanceOf[Limit]
    }
    
    @scala.inline
    implicit class LimitMutableBuilder[Self <: Limit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    }
  }
  
  trait Partial extends StObject {
    
    var partial: Boolean
  }
  object Partial {
    
    @scala.inline
    def apply(partial: Boolean): Partial = {
      val __obj = js.Dynamic.literal(partial = partial.asInstanceOf[js.Any])
      __obj.asInstanceOf[Partial]
    }
    
    @scala.inline
    implicit class PartialMutableBuilder[Self <: Partial] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPartial(value: Boolean): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
    }
  }
}
