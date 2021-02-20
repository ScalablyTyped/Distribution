package typings.ejWebAll.anon

import typings.ejWebAll.ej.ListView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofListView extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: ListView = js.native
}
object TypeofListView {
  
  @scala.inline
  def apply(Locale: js.Any, fn: ListView): TypeofListView = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofListView]
  }
  
  @scala.inline
  implicit class TypeofListViewMutableBuilder[Self <: TypeofListView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: ListView): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
