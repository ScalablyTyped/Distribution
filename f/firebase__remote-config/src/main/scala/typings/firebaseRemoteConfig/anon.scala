package typings.firebaseRemoteConfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait HttpStatus extends StObject {
    
    var httpStatus: Double
  }
  object HttpStatus {
    
    inline def apply(httpStatus: Double): HttpStatus = {
      val __obj = js.Dynamic.literal(httpStatus = httpStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpStatus]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpStatus] (val x: Self) extends AnyVal {
      
      inline def setHttpStatus(value: Double): Self = StObject.set(x, "httpStatus", value.asInstanceOf[js.Any])
    }
  }
  
  trait OriginalErrorMessage extends StObject {
    
    var originalErrorMessage: js.UndefOr[String] = js.undefined
  }
  object OriginalErrorMessage {
    
    inline def apply(): OriginalErrorMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OriginalErrorMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OriginalErrorMessage] (val x: Self) extends AnyVal {
      
      inline def setOriginalErrorMessage(value: String): Self = StObject.set(x, "originalErrorMessage", value.asInstanceOf[js.Any])
      
      inline def setOriginalErrorMessageUndefined: Self = StObject.set(x, "originalErrorMessage", js.undefined)
    }
  }
  
  trait OriginalErrorMessageString extends StObject {
    
    var originalErrorMessage: String
  }
  object OriginalErrorMessageString {
    
    inline def apply(originalErrorMessage: String): OriginalErrorMessageString = {
      val __obj = js.Dynamic.literal(originalErrorMessage = originalErrorMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[OriginalErrorMessageString]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OriginalErrorMessageString] (val x: Self) extends AnyVal {
      
      inline def setOriginalErrorMessage(value: String): Self = StObject.set(x, "originalErrorMessage", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThrottleEndTimeMillis extends StObject {
    
    var throttleEndTimeMillis: Double
  }
  object ThrottleEndTimeMillis {
    
    inline def apply(throttleEndTimeMillis: Double): ThrottleEndTimeMillis = {
      val __obj = js.Dynamic.literal(throttleEndTimeMillis = throttleEndTimeMillis.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThrottleEndTimeMillis]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThrottleEndTimeMillis] (val x: Self) extends AnyVal {
      
      inline def setThrottleEndTimeMillis(value: Double): Self = StObject.set(x, "throttleEndTimeMillis", value.asInstanceOf[js.Any])
    }
  }
}
