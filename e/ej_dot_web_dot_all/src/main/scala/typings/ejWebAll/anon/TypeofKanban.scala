package typings.ejWebAll.anon

import typings.ejWebAll.ej.Kanban
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofKanban extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: Kanban = js.native
}
object TypeofKanban {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Kanban): TypeofKanban = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofKanban]
  }
  
  @scala.inline
  implicit class TypeofKanbanMutableBuilder[Self <: TypeofKanban] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Kanban): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
