package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountPasswordStrengthType extends StObject {
  
  /**
    * An array of option strings supported by this setting.
    */
  var options: js.UndefOr[js.Array[AccountPasswordStrengthTypeOption]] = js.undefined
}
object AccountPasswordStrengthType {
  
  @scala.inline
  def apply(): AccountPasswordStrengthType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPasswordStrengthType]
  }
  
  @scala.inline
  implicit class AccountPasswordStrengthTypeMutableBuilder[Self <: AccountPasswordStrengthType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: js.Array[AccountPasswordStrengthTypeOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: AccountPasswordStrengthTypeOption*): Self = StObject.set(x, "options", js.Array(value :_*))
  }
}
