package typings.ejWebAll.anon

import typings.ejWebAll.ej.Tooltip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTooltip extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: Tooltip = js.native
}
object TypeofTooltip {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Tooltip): TypeofTooltip = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTooltip]
  }
  
  @scala.inline
  implicit class TypeofTooltipMutableBuilder[Self <: TypeofTooltip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Tooltip): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
