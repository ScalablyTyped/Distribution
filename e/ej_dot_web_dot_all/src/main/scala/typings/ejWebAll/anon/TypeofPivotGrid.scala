package typings.ejWebAll.anon

import typings.ejWebAll.ej.PivotGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPivotGrid extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: PivotGrid = js.native
}
object TypeofPivotGrid {
  
  @scala.inline
  def apply(Locale: js.Any, fn: PivotGrid): TypeofPivotGrid = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPivotGrid]
  }
  
  @scala.inline
  implicit class TypeofPivotGridMutableBuilder[Self <: TypeofPivotGrid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: PivotGrid): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
