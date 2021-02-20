package typings.ejWebAll.anon

import typings.ejWebAll.ej.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTab extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: Tab = js.native
}
object TypeofTab {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Tab): TypeofTab = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTab]
  }
  
  @scala.inline
  implicit class TypeofTabMutableBuilder[Self <: TypeofTab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Tab): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
