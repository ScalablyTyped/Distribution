package typings.emberData.mod.DS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrOptions[T] extends StObject {
  
  var allowNull: js.UndefOr[Boolean] = js.native
  
  var defaultValue: js.UndefOr[T | js.Function0[T]] = js.native
}
object AttrOptions {
  
  @scala.inline
  def apply[T](): AttrOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttrOptions[T]]
  }
  
  @scala.inline
  implicit class AttrOptionsMutableBuilder[Self <: AttrOptions[_], T] (val x: Self with AttrOptions[T]) extends AnyVal {
    
    @scala.inline
    def setAllowNull(value: Boolean): Self = StObject.set(x, "allowNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowNullUndefined: Self = StObject.set(x, "allowNull", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: T | js.Function0[T]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueFunction0(value: () => T): Self = StObject.set(x, "defaultValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
  }
}
