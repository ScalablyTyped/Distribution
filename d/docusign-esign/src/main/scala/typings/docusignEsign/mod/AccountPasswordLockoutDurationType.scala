package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountPasswordLockoutDurationType extends StObject {
  
  /**
    * An array of option strings supported by this setting.
    */
  var options: js.UndefOr[js.Array[String]] = js.undefined
}
object AccountPasswordLockoutDurationType {
  
  inline def apply(): AccountPasswordLockoutDurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPasswordLockoutDurationType]
  }
  
  extension [Self <: AccountPasswordLockoutDurationType](x: Self) {
    
    inline def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value :_*))
  }
}
