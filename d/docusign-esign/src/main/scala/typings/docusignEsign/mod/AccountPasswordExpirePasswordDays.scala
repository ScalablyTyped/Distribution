package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountPasswordExpirePasswordDays extends StObject {
  
  var maximumDays: js.UndefOr[String] = js.native
  
  var minimumDays: js.UndefOr[String] = js.native
}
object AccountPasswordExpirePasswordDays {
  
  @scala.inline
  def apply(): AccountPasswordExpirePasswordDays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPasswordExpirePasswordDays]
  }
  
  @scala.inline
  implicit class AccountPasswordExpirePasswordDaysMutableBuilder[Self <: AccountPasswordExpirePasswordDays] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumDays(value: String): Self = StObject.set(x, "maximumDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumDaysUndefined: Self = StObject.set(x, "maximumDays", js.undefined)
    
    @scala.inline
    def setMinimumDays(value: String): Self = StObject.set(x, "minimumDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumDaysUndefined: Self = StObject.set(x, "minimumDays", js.undefined)
  }
}
