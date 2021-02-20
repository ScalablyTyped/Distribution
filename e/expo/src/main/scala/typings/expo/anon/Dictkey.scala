package typings.expo.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  
  var errorRecovery: js.UndefOr[js.Any] = js.native
  
  var notification: js.UndefOr[js.Any] = js.native
}
object Dictkey {
  
  @scala.inline
  def apply(): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictkey]
  }
  
  @scala.inline
  implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorRecovery(value: js.Any): Self = StObject.set(x, "errorRecovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorRecoveryUndefined: Self = StObject.set(x, "errorRecovery", js.undefined)
    
    @scala.inline
    def setNotification(value: js.Any): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
  }
}
