package typings.atEmberComponent.helperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Helper
  extends typings.atEmberObject.atEmberObjectMod.default {
  /**
    * Override this function when writing a class-based helper.
    */
  def compute(params: js.Array[_], hash: js.Object): js.Any = js.native
  /**
    * On a class-based helper, it may be useful to force a recomputation of that
    * helpers value. This is akin to `rerender` on a component.
    */
  def recompute(): js.Any = js.native
}

