package typings.ember.emberMod.Ember

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Map stores values indexed by keys. Unlike JavaScript's
  * default Objects, the keys of a Map can be any JavaScript
  * object.
  * @deprecated
  */
@JSImport("ember", "Ember.Map")
@js.native
class Map () extends js.Object {
  var length: Double = js.native
  def copy(): Map = js.native
  def forEach(callback: js.Function1[/* repeated */ js.Any, _], self: js.Any): Unit = js.native
  def get(key: js.Any): js.Any = js.native
  def has(key: js.Any): Boolean = js.native
  def set(key: js.Any, value: js.Any): Unit = js.native
}

/* static members */
@JSImport("ember", "Ember.Map")
@js.native
object Map extends js.Object {
  def create(): Map = js.native
}

