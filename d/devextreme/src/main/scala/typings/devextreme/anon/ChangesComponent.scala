package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangesComponent[T] extends StObject {
  
  var changes: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var component: js.UndefOr[T] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
}
object ChangesComponent {
  
  @scala.inline
  def apply[T](): ChangesComponent[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangesComponent[T]]
  }
  
  @scala.inline
  implicit class ChangesComponentMutableBuilder[Self <: ChangesComponent[?], T] (val x: Self & ChangesComponent[T]) extends AnyVal {
    
    @scala.inline
    def setChanges(value: js.Array[js.Any]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
    
    @scala.inline
    def setChangesVarargs(value: js.Any*): Self = StObject.set(x, "changes", js.Array(value :_*))
    
    @scala.inline
    def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
