package typings.ember.mod.Ember.Test

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ember", "Ember.Test.resolve")
@js.native
object resolve extends js.Object {
  
  /**
    * Replacement for `Ember.RSVP.resolve`
    * The only difference is this uses
    * an instance of `Ember.Test.Promise`
    */
  def apply[T](): Promise_[T] = js.native
  def apply[T](value: T): Promise_[T] = js.native
  def apply[T](value: T, label: String): Promise_[T] = js.native
  def apply[T](value: js.UndefOr[scala.Nothing], label: String): Promise_[T] = js.native
  def apply[T](value: js.Thenable[T]): Promise_[T] = js.native
  def apply[T](value: js.Thenable[T], label: String): Promise_[T] = js.native
}
