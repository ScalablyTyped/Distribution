package typings.domMediacaptureRecord

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait TypeofMediaRecorder extends StObject {
    
    /* static member */
    def isTypeSupported(`type`: String): Boolean
  }
  object TypeofMediaRecorder {
    
    inline def apply(isTypeSupported: String => Boolean): TypeofMediaRecorder = {
      val __obj = js.Dynamic.literal(isTypeSupported = js.Any.fromFunction1(isTypeSupported))
      __obj.asInstanceOf[TypeofMediaRecorder]
    }
    
    extension [Self <: TypeofMediaRecorder](x: Self) {
      
      inline def setIsTypeSupported(value: String => Boolean): Self = StObject.set(x, "isTypeSupported", js.Any.fromFunction1(value))
    }
  }
}
