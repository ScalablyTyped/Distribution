package typings.firebaseAppCheck

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var originalErrorMessage: js.UndefOr[String] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setOriginalErrorMessage(value: String): Self = StObject.set(x, "originalErrorMessage", value.asInstanceOf[js.Any])
      
      inline def setOriginalErrorMessageUndefined: Self = StObject.set(x, "originalErrorMessage", js.undefined)
    }
  }
  
  trait Action extends StObject {
    
    var action: String
  }
  object Action {
    
    inline def apply(action: String): Action = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    extension [Self <: Action](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppName extends StObject {
    
    var appName: String
  }
  object AppName {
    
    inline def apply(appName: String): AppName = {
      val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppName]
    }
    
    extension [Self <: AppName](x: Self) {
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    }
  }
  
  trait HttpStatus extends StObject {
    
    var httpStatus: Double
  }
  object HttpStatus {
    
    inline def apply(httpStatus: Double): HttpStatus = {
      val __obj = js.Dynamic.literal(httpStatus = httpStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpStatus]
    }
    
    extension [Self <: HttpStatus](x: Self) {
      
      inline def setHttpStatus(value: Double): Self = StObject.set(x, "httpStatus", value.asInstanceOf[js.Any])
    }
  }
  
  trait OriginalErrorMessage extends StObject {
    
    var originalErrorMessage: String
  }
  object OriginalErrorMessage {
    
    inline def apply(originalErrorMessage: String): OriginalErrorMessage = {
      val __obj = js.Dynamic.literal(originalErrorMessage = originalErrorMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[OriginalErrorMessage]
    }
    
    extension [Self <: OriginalErrorMessage](x: Self) {
      
      inline def setOriginalErrorMessage(value: String): Self = StObject.set(x, "originalErrorMessage", value.asInstanceOf[js.Any])
    }
  }
  
  trait Time extends StObject {
    
    var httpStatus: Double
    
    var time: String
  }
  object Time {
    
    inline def apply(httpStatus: Double, time: String): Time = {
      val __obj = js.Dynamic.literal(httpStatus = httpStatus.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Time]
    }
    
    extension [Self <: Time](x: Self) {
      
      inline def setHttpStatus(value: Double): Self = StObject.set(x, "httpStatus", value.asInstanceOf[js.Any])
      
      inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
