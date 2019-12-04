package typings.fastDashJsonDashPatch.commonjsCoreMod

import typings.fastDashJsonDashPatch.commonjsHelpersMod.PatchError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-json-patch/commonjs/core", "validate")
@js.native
object validate extends js.Object {
  def apply[T](sequence: js.Array[Operation]): PatchError = js.native
  def apply[T](sequence: js.Array[Operation], document: T): PatchError = js.native
  def apply[T](sequence: js.Array[Operation], document: T, externalValidator: Validator[T]): PatchError = js.native
}

