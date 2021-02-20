package typings.expressValidator.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinMaxExtendedOptions extends MinMaxOptions {
  
  var gt: js.UndefOr[Double] = js.native
  
  var lt: js.UndefOr[Double] = js.native
}
object MinMaxExtendedOptions {
  
  @scala.inline
  def apply(): MinMaxExtendedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinMaxExtendedOptions]
  }
  
  @scala.inline
  implicit class MinMaxExtendedOptionsMutableBuilder[Self <: MinMaxExtendedOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGt(value: Double): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGtUndefined: Self = StObject.set(x, "gt", js.undefined)
    
    @scala.inline
    def setLt(value: Double): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLtUndefined: Self = StObject.set(x, "lt", js.undefined)
  }
}
