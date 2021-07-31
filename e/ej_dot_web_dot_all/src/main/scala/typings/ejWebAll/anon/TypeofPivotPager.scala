package typings.ejWebAll.anon

import typings.ejWebAll.ej.PivotPager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPivotPager extends StObject {
  
  /* static member */
  var Locale: js.Any
  
  /* static member */
  var fn: PivotPager
}
object TypeofPivotPager {
  
  @scala.inline
  def apply(Locale: js.Any, fn: PivotPager): TypeofPivotPager = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPivotPager]
  }
  
  @scala.inline
  implicit class TypeofPivotPagerMutableBuilder[Self <: TypeofPivotPager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: PivotPager): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
