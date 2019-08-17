package typings.ember

import typings.atEmberObject.computedMod.ComputedProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Array extends js.Object {
  def apply[U](
    dependentKey: String,
    callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], U]
  ): ComputedProperty[js.Array[U], js.Array[U]] = js.native
}

