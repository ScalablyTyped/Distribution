package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullName[T] extends StObject {
  
  var component: js.UndefOr[T] = js.native
  
  var fullName: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object FullName {
  
  @scala.inline
  def apply[T](): FullName[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullName[T]]
  }
  
  @scala.inline
  implicit class FullNameMutableBuilder[Self <: FullName[_], T] (val x: Self with FullName[T]) extends AnyVal {
    
    @scala.inline
    def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
