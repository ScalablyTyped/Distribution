package typings.ember.emberMod.default

import typings.ember.emberMod.Ember.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "keys")
@js.native
object keys extends js.Object {
  /**
    * Polyfill for Object.keys
    * @deprecated Use Object.keys
    */
  def apply(o: js.Any): Array[String] = js.native
}

