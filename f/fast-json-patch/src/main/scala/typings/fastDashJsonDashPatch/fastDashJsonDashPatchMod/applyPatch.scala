package typings.fastDashJsonDashPatch.fastDashJsonDashPatchMod

import typings.fastDashJsonDashPatch.moduleCoreMod.Operation
import typings.fastDashJsonDashPatch.moduleCoreMod.PatchResult
import typings.fastDashJsonDashPatch.moduleCoreMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-json-patch", "applyPatch")
@js.native
object applyPatch extends js.Object {
  def apply[T](document: T, patch: js.Array[Operation]): PatchResult[T] = js.native
  def apply[T](document: T, patch: js.Array[Operation], validateOperation: Boolean): PatchResult[T] = js.native
  def apply[T](document: T, patch: js.Array[Operation], validateOperation: Boolean, mutateDocument: Boolean): PatchResult[T] = js.native
  def apply[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: Boolean,
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): PatchResult[T] = js.native
  def apply[T](document: T, patch: js.Array[Operation], validateOperation: Validator[T]): PatchResult[T] = js.native
  def apply[T](document: T, patch: js.Array[Operation], validateOperation: Validator[T], mutateDocument: Boolean): PatchResult[T] = js.native
  def apply[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: Validator[T],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): PatchResult[T] = js.native
}

