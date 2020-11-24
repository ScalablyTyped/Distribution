package typings.fastJsonPatch.moduleCoreMod

import typings.fastJsonPatch.moduleHelpersMod.PatchError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fast-json-patch/module/core", "validate")
@js.native
object validate extends js.Object {
  
  def apply[T](sequence: js.Array[Operation]): PatchError = js.native
  def apply[T](sequence: js.Array[Operation], document: T): PatchError = js.native
  def apply[T](sequence: js.Array[Operation], document: T, externalValidator: Validator_[T]): PatchError = js.native
  def apply[T](
    sequence: js.Array[Operation],
    document: js.UndefOr[scala.Nothing],
    externalValidator: Validator_[T]
  ): PatchError = js.native
}
