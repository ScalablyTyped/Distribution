package typings.emberObject.copyableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implements some standard methods for copying an object. Add this mixin to
  * any object you create that can create a copy of itself. This mixin is
  * added automatically to the built-in array.
  */
trait Copyable extends js.Object {
  /**
    * __Required.__ You must implement this method to apply this mixin.
    */
  def copy(deep: Boolean): Copyable
  /**
    * If the object implements `Ember.Freezable`, then this will return a new
    * copy if the object is not frozen and the receiver if the object is frozen.
    */
  def frozenCopy(): Copyable
}

object Copyable {
  @scala.inline
  def apply(copy: Boolean => Copyable, frozenCopy: () => Copyable): Copyable = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction1(copy), frozenCopy = js.Any.fromFunction0(frozenCopy))
    __obj.asInstanceOf[Copyable]
  }
}

