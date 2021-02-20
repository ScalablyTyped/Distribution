package typings.firebaseRemoteConfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait HttpStatus extends StObject {
    
    var httpStatus: Double = js.native
  }
  object HttpStatus {
    
    @scala.inline
    def apply(httpStatus: Double): HttpStatus = {
      val __obj = js.Dynamic.literal(httpStatus = httpStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpStatus]
    }
    
    @scala.inline
    implicit class HttpStatusMutableBuilder[Self <: HttpStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHttpStatus(value: Double): Self = StObject.set(x, "httpStatus", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OriginalErrorMessage extends StObject {
    
    var originalErrorMessage: js.UndefOr[String] = js.native
  }
  object OriginalErrorMessage {
    
    @scala.inline
    def apply(): OriginalErrorMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OriginalErrorMessage]
    }
    
    @scala.inline
    implicit class OriginalErrorMessageMutableBuilder[Self <: OriginalErrorMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalErrorMessage(value: String): Self = StObject.set(x, "originalErrorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalErrorMessageUndefined: Self = StObject.set(x, "originalErrorMessage", js.undefined)
    }
  }
  
  @js.native
  trait OriginalErrorMessageString extends StObject {
    
    var originalErrorMessage: String = js.native
  }
  object OriginalErrorMessageString {
    
    @scala.inline
    def apply(originalErrorMessage: String): OriginalErrorMessageString = {
      val __obj = js.Dynamic.literal(originalErrorMessage = originalErrorMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[OriginalErrorMessageString]
    }
    
    @scala.inline
    implicit class OriginalErrorMessageStringMutableBuilder[Self <: OriginalErrorMessageString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalErrorMessage(value: String): Self = StObject.set(x, "originalErrorMessage", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ThrottleEndTimeMillis extends StObject {
    
    var throttleEndTimeMillis: Double = js.native
  }
  object ThrottleEndTimeMillis {
    
    @scala.inline
    def apply(throttleEndTimeMillis: Double): ThrottleEndTimeMillis = {
      val __obj = js.Dynamic.literal(throttleEndTimeMillis = throttleEndTimeMillis.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThrottleEndTimeMillis]
    }
    
    @scala.inline
    implicit class ThrottleEndTimeMillisMutableBuilder[Self <: ThrottleEndTimeMillis] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setThrottleEndTimeMillis(value: Double): Self = StObject.set(x, "throttleEndTimeMillis", value.asInstanceOf[js.Any])
    }
  }
}
