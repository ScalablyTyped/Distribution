package typings.firefoxWebextBrowser.browser.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestMatchOutcomeOptions extends StObject {
  
  /** Whether to account for rules from other installed extensions during rule evaluation. */
  var includeOtherExtensions: js.UndefOr[Boolean] = js.undefined
}
object TestMatchOutcomeOptions {
  
  inline def apply(): TestMatchOutcomeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestMatchOutcomeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestMatchOutcomeOptions] (val x: Self) extends AnyVal {
    
    inline def setIncludeOtherExtensions(value: Boolean): Self = StObject.set(x, "includeOtherExtensions", value.asInstanceOf[js.Any])
    
    inline def setIncludeOtherExtensionsUndefined: Self = StObject.set(x, "includeOtherExtensions", js.undefined)
  }
}
