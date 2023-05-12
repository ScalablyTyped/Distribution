package typings.expressValidator.srcOptionsMod

import typings.expressValidator.expressValidatorStrings.`10`
import typings.expressValidator.expressValidatorStrings.`13`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsISBNOptions extends StObject {
  
  var version: js.UndefOr[`10` | `13`] = js.undefined
}
object IsISBNOptions {
  
  inline def apply(): IsISBNOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsISBNOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsISBNOptions] (val x: Self) extends AnyVal {
    
    inline def setVersion(value: `10` | `13`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
