package typings.emartechClsAdapter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait RequestId extends StObject {
    
    var requestId: String
  }
  object RequestId {
    
    @scala.inline
    def apply(requestId: String): RequestId = {
      val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestId]
    }
    
    @scala.inline
    implicit class RequestIdMutableBuilder[Self <: RequestId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    }
  }
}
