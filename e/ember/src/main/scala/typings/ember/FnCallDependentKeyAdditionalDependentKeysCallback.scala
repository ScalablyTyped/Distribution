package typings.ember

import typings.emberObject.computedMod.ComputedProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallDependentKeyAdditionalDependentKeysCallback extends js.Object {
  def apply(
    dependentKey: String,
    additionalDependentKeys: js.Array[String],
    callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Boolean]
  ): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def apply(
    dependentKey: String,
    callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Boolean]
  ): ComputedProperty[js.Array[_], js.Array[_]] = js.native
}

