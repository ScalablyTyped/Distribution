package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedKey[T /* <: String */] extends StObject {
  
  var selectedKey: js.UndefOr[T] = js.undefined
}
object SelectedKey {
  
  inline def apply[T /* <: String */](): SelectedKey[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedKey[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectedKey[?], T /* <: String */] (val x: Self & SelectedKey[T]) extends AnyVal {
    
    inline def setSelectedKey(value: T): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
    
    inline def setSelectedKeyUndefined: Self = StObject.set(x, "selectedKey", js.undefined)
  }
}
