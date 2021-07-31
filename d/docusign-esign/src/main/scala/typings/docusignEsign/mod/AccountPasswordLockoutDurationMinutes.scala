package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountPasswordLockoutDurationMinutes extends StObject {
  
  var maximumMinutes: js.UndefOr[String] = js.undefined
  
  var minimumMinutes: js.UndefOr[String] = js.undefined
}
object AccountPasswordLockoutDurationMinutes {
  
  @scala.inline
  def apply(): AccountPasswordLockoutDurationMinutes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPasswordLockoutDurationMinutes]
  }
  
  @scala.inline
  implicit class AccountPasswordLockoutDurationMinutesMutableBuilder[Self <: AccountPasswordLockoutDurationMinutes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumMinutes(value: String): Self = StObject.set(x, "maximumMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumMinutesUndefined: Self = StObject.set(x, "maximumMinutes", js.undefined)
    
    @scala.inline
    def setMinimumMinutes(value: String): Self = StObject.set(x, "minimumMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumMinutesUndefined: Self = StObject.set(x, "minimumMinutes", js.undefined)
  }
}
