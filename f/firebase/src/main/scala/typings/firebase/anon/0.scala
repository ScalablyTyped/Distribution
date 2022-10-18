package typings.firebase.anon

import typings.firebase.compatMod.firebase.EmulatorMockTokenOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var mockUserToken: js.UndefOr[EmulatorMockTokenOptions | String] = js.undefined
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setMockUserToken(value: EmulatorMockTokenOptions | String): Self = StObject.set(x, "mockUserToken", value.asInstanceOf[js.Any])
    
    inline def setMockUserTokenUndefined: Self = StObject.set(x, "mockUserToken", js.undefined)
  }
}
