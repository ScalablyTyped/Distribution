package typings.fastDashJsonDashPatch.fastDashJsonDashPatchMod

import typings.fastDashJsonDashPatch.moduleCoreMod.Operation
import typings.fastDashJsonDashPatch.moduleCoreMod.Validator
import typings.fastDashJsonDashPatch.moduleHelpersMod.PatchError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-json-patch", "validate")
@js.native
object validate extends js.Object {
  def apply[T](sequence: js.Array[Operation]): PatchError = js.native
  def apply[T](sequence: js.Array[Operation], document: T): PatchError = js.native
  def apply[T](sequence: js.Array[Operation], document: T, externalValidator: Validator[T]): PatchError = js.native
}

