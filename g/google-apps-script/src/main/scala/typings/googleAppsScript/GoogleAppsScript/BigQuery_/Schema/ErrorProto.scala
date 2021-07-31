package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorProto extends StObject {
  
  var debugInfo: js.UndefOr[String] = js.undefined
  
  var location: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var reason: js.UndefOr[String] = js.undefined
}
object ErrorProto {
  
  @scala.inline
  def apply(): ErrorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorProto]
  }
  
  @scala.inline
  implicit class ErrorProtoMutableBuilder[Self <: ErrorProto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebugInfo(value: String): Self = StObject.set(x, "debugInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugInfoUndefined: Self = StObject.set(x, "debugInfo", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
