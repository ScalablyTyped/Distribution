package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountMinimumPasswordLength extends StObject {
  
  var maximumLength: js.UndefOr[String] = js.native
  
  /**
    * Minimum length of the access code string.
    */
  var minimumLength: js.UndefOr[String] = js.native
}
object AccountMinimumPasswordLength {
  
  @scala.inline
  def apply(): AccountMinimumPasswordLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountMinimumPasswordLength]
  }
  
  @scala.inline
  implicit class AccountMinimumPasswordLengthMutableBuilder[Self <: AccountMinimumPasswordLength] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumLength(value: String): Self = StObject.set(x, "maximumLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumLengthUndefined: Self = StObject.set(x, "maximumLength", js.undefined)
    
    @scala.inline
    def setMinimumLength(value: String): Self = StObject.set(x, "minimumLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumLengthUndefined: Self = StObject.set(x, "minimumLength", js.undefined)
  }
}
