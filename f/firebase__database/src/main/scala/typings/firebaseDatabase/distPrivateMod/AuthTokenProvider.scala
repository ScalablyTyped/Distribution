package typings.firebaseDatabase.distPrivateMod

import typings.firebaseAppTypes.privateMod.FirebaseAuthTokenData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthTokenProvider extends StObject {
  
  def addTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): Unit
  
  def getToken(forceRefresh: Boolean): js.Promise[FirebaseAuthTokenData]
  
  def notifyForInvalidToken(): Unit
  
  def removeTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): Unit
}
object AuthTokenProvider {
  
  inline def apply(
    addTokenChangeListener: js.Function1[/* token */ String | Null, Unit] => Unit,
    getToken: Boolean => js.Promise[FirebaseAuthTokenData],
    notifyForInvalidToken: () => Unit,
    removeTokenChangeListener: js.Function1[/* token */ String | Null, Unit] => Unit
  ): AuthTokenProvider = {
    val __obj = js.Dynamic.literal(addTokenChangeListener = js.Any.fromFunction1(addTokenChangeListener), getToken = js.Any.fromFunction1(getToken), notifyForInvalidToken = js.Any.fromFunction0(notifyForInvalidToken), removeTokenChangeListener = js.Any.fromFunction1(removeTokenChangeListener))
    __obj.asInstanceOf[AuthTokenProvider]
  }
  
  extension [Self <: AuthTokenProvider](x: Self) {
    
    inline def setAddTokenChangeListener(value: js.Function1[/* token */ String | Null, Unit] => Unit): Self = StObject.set(x, "addTokenChangeListener", js.Any.fromFunction1(value))
    
    inline def setGetToken(value: Boolean => js.Promise[FirebaseAuthTokenData]): Self = StObject.set(x, "getToken", js.Any.fromFunction1(value))
    
    inline def setNotifyForInvalidToken(value: () => Unit): Self = StObject.set(x, "notifyForInvalidToken", js.Any.fromFunction0(value))
    
    inline def setRemoveTokenChangeListener(value: js.Function1[/* token */ String | Null, Unit] => Unit): Self = StObject.set(x, "removeTokenChangeListener", js.Any.fromFunction1(value))
  }
}
