package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelChanges[T] extends StObject {
  
  var cancel: js.UndefOr[Boolean] = js.undefined
  
  var changes: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var component: js.UndefOr[T] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
}
object CancelChanges {
  
  inline def apply[T](): CancelChanges[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelChanges[T]]
  }
  
  extension [Self <: CancelChanges[?], T](x: Self & CancelChanges[T]) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setChanges(value: js.Array[js.Any]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
    
    inline def setChangesVarargs(value: js.Any*): Self = StObject.set(x, "changes", js.Array(value :_*))
    
    inline def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
