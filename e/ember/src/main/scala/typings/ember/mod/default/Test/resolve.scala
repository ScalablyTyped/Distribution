package typings.ember.mod.default.Test

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ember", "Test.resolve")
@js.native
object resolve extends js.Object {
  
  /**
    * Replacement for `Ember.RSVP.resolve`
    * The only difference is this uses
    * an instance of `Ember.Test.Promise`
    */
  def apply[T](): typings.ember.mod.Ember.Test.Promise_[T] = js.native
  def apply[T](value: T): typings.ember.mod.Ember.Test.Promise_[T] = js.native
  def apply[T](value: T, label: String): typings.ember.mod.Ember.Test.Promise_[T] = js.native
  def apply[T](value: js.UndefOr[scala.Nothing], label: String): typings.ember.mod.Ember.Test.Promise_[T] = js.native
  def apply[T](value: js.Thenable[T]): typings.ember.mod.Ember.Test.Promise_[T] = js.native
  def apply[T](value: js.Thenable[T], label: String): typings.ember.mod.Ember.Test.Promise_[T] = js.native
}
