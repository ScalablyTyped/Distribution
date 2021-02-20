package typings.ejWebAll.anon

import typings.ejWebAll.ej.Scroller
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofScroller extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: Scroller = js.native
}
object TypeofScroller {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Scroller): TypeofScroller = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofScroller]
  }
  
  @scala.inline
  implicit class TypeofScrollerMutableBuilder[Self <: TypeofScroller] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Scroller): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
