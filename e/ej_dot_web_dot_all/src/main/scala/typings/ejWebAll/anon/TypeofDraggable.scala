package typings.ejWebAll.anon

import typings.ejWebAll.ej.Draggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDraggable extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: Draggable = js.native
}
object TypeofDraggable {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Draggable): TypeofDraggable = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDraggable]
  }
  
  @scala.inline
  implicit class TypeofDraggableMutableBuilder[Self <: TypeofDraggable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Draggable): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
