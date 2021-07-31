package typings.failOnErrorsWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FailOnErrors extends StObject {
    
    var failOnErrors: js.UndefOr[Boolean] = js.undefined
    
    var failOnWarnings: js.UndefOr[Boolean] = js.undefined
  }
  object FailOnErrors {
    
    @scala.inline
    def apply(): FailOnErrors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FailOnErrors]
    }
    
    @scala.inline
    implicit class FailOnErrorsMutableBuilder[Self <: FailOnErrors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFailOnErrors(value: Boolean): Self = StObject.set(x, "failOnErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailOnErrorsUndefined: Self = StObject.set(x, "failOnErrors", js.undefined)
      
      @scala.inline
      def setFailOnWarnings(value: Boolean): Self = StObject.set(x, "failOnWarnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailOnWarningsUndefined: Self = StObject.set(x, "failOnWarnings", js.undefined)
    }
  }
}
