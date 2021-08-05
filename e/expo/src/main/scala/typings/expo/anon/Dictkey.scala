package typings.expo.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var errorRecovery: js.UndefOr[js.Any] = js.undefined
  
  var notification: js.UndefOr[js.Any] = js.undefined
}
object Dictkey {
  
  inline def apply(): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictkey]
  }
  
  extension [Self <: Dictkey](x: Self) {
    
    inline def setErrorRecovery(value: js.Any): Self = StObject.set(x, "errorRecovery", value.asInstanceOf[js.Any])
    
    inline def setErrorRecoveryUndefined: Self = StObject.set(x, "errorRecovery", js.undefined)
    
    inline def setNotification(value: js.Any): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
  }
}
