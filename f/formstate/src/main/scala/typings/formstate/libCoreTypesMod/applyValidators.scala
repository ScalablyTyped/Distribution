package typings.formstate.libCoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formstate/lib/core/types", "applyValidators")
@js.native
object applyValidators extends js.Object {
  def apply[TValue](value: TValue, validators: js.Array[Validator[TValue]]): js.Promise[js.UndefOr[String | Null]] = js.native
}

