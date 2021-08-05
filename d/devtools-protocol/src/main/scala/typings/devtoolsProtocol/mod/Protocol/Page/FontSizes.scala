package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSizes extends StObject {
  
  /**
    * Default fixed font size.
    */
  var fixed: js.UndefOr[integer] = js.undefined
  
  /**
    * Default standard font size.
    */
  var standard: js.UndefOr[integer] = js.undefined
}
object FontSizes {
  
  inline def apply(): FontSizes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontSizes]
  }
  
  extension [Self <: FontSizes](x: Self) {
    
    inline def setFixed(value: integer): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setStandard(value: integer): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    
    inline def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
  }
}
