package typings.firebaseFirestore.anon

import typings.firebaseUtil.mod.EmulatorMockTokenOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
