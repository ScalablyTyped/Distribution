package typings.formstate.formstateMod

import typings.formstate.libCoreTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formstate", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def applyValidators[TValue](value: TValue, validators: js.Array[Validator[TValue]]): js.Promise[js.UndefOr[String | Null]] = js.native
}

