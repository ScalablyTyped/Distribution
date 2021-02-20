package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountPasswordLockoutDurationType extends StObject {
  
  /**
    * An array of option strings supported by this setting.
    */
  var options: js.UndefOr[js.Array[String]] = js.native
}
object AccountPasswordLockoutDurationType {
  
  @scala.inline
  def apply(): AccountPasswordLockoutDurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPasswordLockoutDurationType]
  }
  
  @scala.inline
  implicit class AccountPasswordLockoutDurationTypeMutableBuilder[Self <: AccountPasswordLockoutDurationType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value :_*))
  }
}
