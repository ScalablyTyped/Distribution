package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontSizes extends StObject {
  
  /**
    * Default fixed font size.
    */
  var fixed: js.UndefOr[integer] = js.native
  
  /**
    * Default standard font size.
    */
  var standard: js.UndefOr[integer] = js.native
}
object FontSizes {
  
  @scala.inline
  def apply(): FontSizes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontSizes]
  }
  
  @scala.inline
  implicit class FontSizesMutableBuilder[Self <: FontSizes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFixed(value: integer): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    @scala.inline
    def setStandard(value: integer): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
  }
}
