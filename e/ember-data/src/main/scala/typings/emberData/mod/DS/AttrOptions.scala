package typings.emberData.mod.DS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrOptions[T] extends js.Object {
  
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
  implicit class AttrOptionsOps[Self <: AttrOptions[_], T] (val x: Self with AttrOptions[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowNull(value: Boolean): Self = this.set("allowNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowNull: Self = this.set("allowNull", js.undefined)
    
    @scala.inline
    def setDefaultValueFunction0(value: () => T): Self = this.set("defaultValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDefaultValue(value: T | js.Function0[T]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
  }
}
