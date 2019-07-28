package typings.easeljs.createjsNs

import typings.tweenjs.createjsNs.Tween
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.MovieClipPlugin")
@js.native
class MovieClipPlugin () extends js.Object {
  // methods
  def tween(
    tween: Tween,
    prop: String,
    value: String,
    startValues: js.Array[_],
    endValues: js.Array[_],
    ratio: Double,
    wait: js.Object,
    end: js.Object
  ): Unit = js.native
  def tween(
    tween: Tween,
    prop: String,
    value: Boolean,
    startValues: js.Array[_],
    endValues: js.Array[_],
    ratio: Double,
    wait: js.Object,
    end: js.Object
  ): Unit = js.native
  def tween(
    tween: Tween,
    prop: String,
    value: Double,
    startValues: js.Array[_],
    endValues: js.Array[_],
    ratio: Double,
    wait: js.Object,
    end: js.Object
  ): Unit = js.native
}

