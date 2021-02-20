package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Component[T] extends StObject {
  
  var component: js.UndefOr[T] = js.native
}
object Component {
  
  @scala.inline
  def apply[T](): Component[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Component[T]]
  }
  
  @scala.inline
  implicit class ComponentMutableBuilder[Self <: Component[_], T] (val x: Self with Component[T]) extends AnyVal {
    
    @scala.inline
    def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
