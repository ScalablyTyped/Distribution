package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountPasswordMinimumPasswordAgeDays extends StObject {
  
  var maximumAge: js.UndefOr[String] = js.native
  
  var minimumAge: js.UndefOr[String] = js.native
}
object AccountPasswordMinimumPasswordAgeDays {
  
  @scala.inline
  def apply(): AccountPasswordMinimumPasswordAgeDays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPasswordMinimumPasswordAgeDays]
  }
  
  @scala.inline
  implicit class AccountPasswordMinimumPasswordAgeDaysMutableBuilder[Self <: AccountPasswordMinimumPasswordAgeDays] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumAge(value: String): Self = StObject.set(x, "maximumAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumAgeUndefined: Self = StObject.set(x, "maximumAge", js.undefined)
    
    @scala.inline
    def setMinimumAge(value: String): Self = StObject.set(x, "minimumAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumAgeUndefined: Self = StObject.set(x, "minimumAge", js.undefined)
  }
}
