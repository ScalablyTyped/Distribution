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
  
  inline def apply(): AccountPasswordStrengthType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPasswordStrengthType]
  }
  
  extension [Self <: AccountPasswordStrengthType](x: Self) {
    
    inline def setOptions(value: js.Array[AccountPasswordStrengthTypeOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: AccountPasswordStrengthTypeOption*): Self = StObject.set(x, "options", js.Array(value :_*))
  }
}
