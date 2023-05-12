package typings.firebaseStorageTypes

import typings.firebaseUtil.mod.EmulatorMockTokenOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait MockUserToken extends StObject {
    
    var mockUserToken: js.UndefOr[EmulatorMockTokenOptions | String] = js.undefined
  }
  object MockUserToken {
    
    inline def apply(): MockUserToken = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockUserToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MockUserToken] (val x: Self) extends AnyVal {
      
      inline def setMockUserToken(value: EmulatorMockTokenOptions | String): Self = StObject.set(x, "mockUserToken", value.asInstanceOf[js.Any])
      
      inline def setMockUserTokenUndefined: Self = StObject.set(x, "mockUserToken", js.undefined)
    }
  }
  
  trait ServerResponse extends StObject {
    
    var serverResponse: String | Null
  }
  object ServerResponse {
    
    inline def apply(): ServerResponse = {
      val __obj = js.Dynamic.literal(serverResponse = null)
      __obj.asInstanceOf[ServerResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerResponse] (val x: Self) extends AnyVal {
      
      inline def setServerResponse(value: String): Self = StObject.set(x, "serverResponse", value.asInstanceOf[js.Any])
      
      inline def setServerResponseNull: Self = StObject.set(x, "serverResponse", null)
    }
  }
}
