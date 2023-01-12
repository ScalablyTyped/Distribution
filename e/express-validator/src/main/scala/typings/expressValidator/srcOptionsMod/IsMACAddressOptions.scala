package typings.expressValidator.srcOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsMACAddressOptions extends StObject {
  
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
    
    inline def setNo_colons(value: Boolean): Self = StObject.set(x, "no_colons", value.asInstanceOf[js.Any])
    
    inline def setNo_colonsUndefined: Self = StObject.set(x, "no_colons", js.undefined)
    
    inline def setNo_separators(value: Boolean): Self = StObject.set(x, "no_separators", value.asInstanceOf[js.Any])
    
    inline def setNo_separatorsUndefined: Self = StObject.set(x, "no_separators", js.undefined)
  }
}
