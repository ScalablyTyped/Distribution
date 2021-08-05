package typings.dymoLabelFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ErrorDetails extends StObject {
    
    /** An empty string if no error is detected; an error message if an error is detected. */
    var errorDetails: String
    
    /** Indicates whether the browser is supported or not. */
    var isBrowserSupported: Boolean
    
    /** Indicates whether the Framework is installed or not. */
    var isFrameworkInstalled: Boolean
  }
  object ErrorDetails {
    
    inline def apply(errorDetails: String, isBrowserSupported: Boolean, isFrameworkInstalled: Boolean): ErrorDetails = {
      val __obj = js.Dynamic.literal(errorDetails = errorDetails.asInstanceOf[js.Any], isBrowserSupported = isBrowserSupported.asInstanceOf[js.Any], isFrameworkInstalled = isFrameworkInstalled.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorDetails]
    }
    
    extension [Self <: ErrorDetails](x: Self) {
      
      inline def setErrorDetails(value: String): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
      
      inline def setIsBrowserSupported(value: Boolean): Self = StObject.set(x, "isBrowserSupported", value.asInstanceOf[js.Any])
      
      inline def setIsFrameworkInstalled(value: Boolean): Self = StObject.set(x, "isFrameworkInstalled", value.asInstanceOf[js.Any])
    }
  }
}
