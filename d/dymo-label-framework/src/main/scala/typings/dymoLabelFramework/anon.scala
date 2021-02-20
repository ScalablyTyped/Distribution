package typings.dymoLabelFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ErrorDetails extends StObject {
    
    /** An empty string if no error is detected; an error message if an error is detected. */
    var errorDetails: String = js.native
    
    /** Indicates whether the browser is supported or not. */
    var isBrowserSupported: Boolean = js.native
    
    /** Indicates whether the Framework is installed or not. */
    var isFrameworkInstalled: Boolean = js.native
  }
  object ErrorDetails {
    
    @scala.inline
    def apply(errorDetails: String, isBrowserSupported: Boolean, isFrameworkInstalled: Boolean): ErrorDetails = {
      val __obj = js.Dynamic.literal(errorDetails = errorDetails.asInstanceOf[js.Any], isBrowserSupported = isBrowserSupported.asInstanceOf[js.Any], isFrameworkInstalled = isFrameworkInstalled.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorDetails]
    }
    
    @scala.inline
    implicit class ErrorDetailsMutableBuilder[Self <: ErrorDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorDetails(value: String): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBrowserSupported(value: Boolean): Self = StObject.set(x, "isBrowserSupported", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFrameworkInstalled(value: Boolean): Self = StObject.set(x, "isFrameworkInstalled", value.asInstanceOf[js.Any])
    }
  }
}
