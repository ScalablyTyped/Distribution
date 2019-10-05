package typings.ember.emberMod.Ember

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "Ember.onerror")
@js.native
object onerror extends js.Object {
  /**
    * A function may be assigned to `Ember.onerror` to be called when Ember
    * internals encounter an error. This is useful for specialized error handling
    * and reporting code.
    */
  def apply(error: Error): Unit = js.native
}

