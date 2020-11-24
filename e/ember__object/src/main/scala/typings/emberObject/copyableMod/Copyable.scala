package typings.emberObject.copyableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implements some standard methods for copying an object. Add this mixin to
  * any object you create that can create a copy of itself. This mixin is
  * added automatically to the built-in array.
  */
@js.native
trait Copyable extends js.Object {
  
  /**
    * __Required.__ You must implement this method to apply this mixin.
    */
  def copy(deep: Boolean): Copyable = js.native
  
  /**
    * If the object implements `Ember.Freezable`, then this will return a new
    * copy if the object is not frozen and the receiver if the object is frozen.
    */
  def frozenCopy(): Copyable = js.native
}
object Copyable {
  
  @scala.inline
  def apply(copy: Boolean => Copyable, frozenCopy: () => Copyable): Copyable = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction1(copy), frozenCopy = js.Any.fromFunction0(frozenCopy))
    __obj.asInstanceOf[Copyable]
  }
  
  @scala.inline
  implicit class CopyableOps[Self <: Copyable] (val x: Self) extends AnyVal {
    
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
    def setCopy(value: Boolean => Copyable): Self = this.set("copy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFrozenCopy(value: () => Copyable): Self = this.set("frozenCopy", js.Any.fromFunction0(value))
  }
}
