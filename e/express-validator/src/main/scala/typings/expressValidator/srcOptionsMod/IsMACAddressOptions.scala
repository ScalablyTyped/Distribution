package typings.expressValidator.srcOptionsMod

import typings.expressValidator.expressValidatorStrings.`48`
import typings.expressValidator.expressValidatorStrings.`64`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsMACAddressOptions extends StObject {
  
  var eui: js.UndefOr[`48` | `64`] = js.undefined
  
  /**
    * @deprecated use `no_separators` instead
    */
  var no_colons: js.UndefOr[Boolean] = js.undefined
  
  var no_separators: js.UndefOr[Boolean] = js.undefined
}
object IsMACAddressOptions {
  
  inline def apply(): IsMACAddressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsMACAddressOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsMACAddressOptions] (val x: Self) extends AnyVal {
    
    inline def setEui(value: `48` | `64`): Self = StObject.set(x, "eui", value.asInstanceOf[js.Any])
    
    inline def setEuiUndefined: Self = StObject.set(x, "eui", js.undefined)
    
    inline def setNo_colons(value: Boolean): Self = StObject.set(x, "no_colons", value.asInstanceOf[js.Any])
    
    inline def setNo_colonsUndefined: Self = StObject.set(x, "no_colons", js.undefined)
    
    inline def setNo_separators(value: Boolean): Self = StObject.set(x, "no_separators", value.asInstanceOf[js.Any])
    
    inline def setNo_separatorsUndefined: Self = StObject.set(x, "no_separators", js.undefined)
  }
}
