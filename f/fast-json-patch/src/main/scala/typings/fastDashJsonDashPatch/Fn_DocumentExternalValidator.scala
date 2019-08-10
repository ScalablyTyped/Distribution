package typings.fastDashJsonDashPatch

import typings.fastDashJsonDashPatch.libCoreMod.Operation
import typings.fastDashJsonDashPatch.libCoreMod.Validator
import typings.fastDashJsonDashPatch.libHelpersMod.PatchError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_DocumentExternalValidator extends js.Object {
  def apply[T](sequence: js.Array[Operation]): PatchError = js.native
  def apply[T](sequence: js.Array[Operation], document: T): PatchError = js.native
  def apply[T](sequence: js.Array[Operation], document: T, externalValidator: Validator[T]): PatchError = js.native
}

