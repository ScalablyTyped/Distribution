package typings.ember.emberMod.Ember

import typings.ember.emberNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a shallow copy of the passed object. A deep copy of the object is
  * returned if the optional `deep` argument is `true`.
  */
@JSImport("ember", "Ember.copy")
@js.native
object copy extends js.Object {
  def apply(obj: js.Any): js.Any = js.native
  def apply(obj: js.Any, deep: Boolean): js.Any = js.native
  def apply[T](obj: T, deep: `true`): T = js.native
}

