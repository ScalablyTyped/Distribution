package typings.fastDashJsonDashPatch.fastDashJsonDashPatchMod

import typings.fastDashJsonDashPatch.libHelpersMod.JsonPatchErrorName
import typings.fastDashJsonDashPatch.libHelpersMod.PatchError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-json-patch", "JsonPatchError")
@js.native
class JsonPatchError protected () extends PatchError {
  def this(message: String, name: JsonPatchErrorName) = this()
  def this(message: String, name: JsonPatchErrorName, index: Double) = this()
  def this(message: String, name: JsonPatchErrorName, index: Double, operation: js.Any) = this()
  def this(message: String, name: JsonPatchErrorName, index: Double, operation: js.Any, tree: js.Any) = this()
}

