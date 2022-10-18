package typings.firebase.anon

import typings.firebase.compatMod.firebase.appCheck.AppCheckToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetToken extends StObject {
  
  def getToken(): AppCheckToken
}
object GetToken {
  
  inline def apply(getToken: () => AppCheckToken): GetToken = {
    val __obj = js.Dynamic.literal(getToken = js.Any.fromFunction0(getToken))
    __obj.asInstanceOf[GetToken]
  }
  
  extension [Self <: GetToken](x: Self) {
    
    inline def setGetToken(value: () => AppCheckToken): Self = StObject.set(x, "getToken", js.Any.fromFunction0(value))
  }
}
