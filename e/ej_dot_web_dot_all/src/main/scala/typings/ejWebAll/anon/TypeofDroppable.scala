package typings.ejWebAll.anon

import typings.ejWebAll.ej.Droppable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDroppable extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: Droppable = js.native
}
object TypeofDroppable {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Droppable): TypeofDroppable = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDroppable]
  }
  
  @scala.inline
  implicit class TypeofDroppableMutableBuilder[Self <: TypeofDroppable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Droppable): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
