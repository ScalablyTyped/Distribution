package typings.domMediacaptureRecord

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofMediaRecorder extends StObject {
    
    /* static member */
    def isTypeSupported(`type`: String): Boolean = js.native
  }
  object TypeofMediaRecorder {
    
    @scala.inline
    def apply(isTypeSupported: String => Boolean): TypeofMediaRecorder = {
      val __obj = js.Dynamic.literal(isTypeSupported = js.Any.fromFunction1(isTypeSupported))
      __obj.asInstanceOf[TypeofMediaRecorder]
    }
    
    @scala.inline
    implicit class TypeofMediaRecorderMutableBuilder[Self <: TypeofMediaRecorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsTypeSupported(value: String => Boolean): Self = StObject.set(x, "isTypeSupported", js.Any.fromFunction1(value))
    }
  }
}
