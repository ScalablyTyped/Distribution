package typings.fastJsonPatch.helpersMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-json-patch/commonjs/helpers", "PatchError")
@js.native
class PatchError protected () extends Error {
  def this(message: String, name: JsonPatchErrorName) = this()
  def this(message: String, name: JsonPatchErrorName, index: Double) = this()
  def this(message: String, name: JsonPatchErrorName, index: js.UndefOr[scala.Nothing], operation: js.Any) = this()
  def this(message: String, name: JsonPatchErrorName, index: Double, operation: js.Any) = this()
  def this(
    message: String,
    name: JsonPatchErrorName,
    index: js.UndefOr[scala.Nothing],
    operation: js.UndefOr[scala.Nothing],
    tree: js.Any
  ) = this()
  def this(
    message: String,
    name: JsonPatchErrorName,
    index: js.UndefOr[scala.Nothing],
    operation: js.Any,
    tree: js.Any
  ) = this()
  def this(
    message: String,
    name: JsonPatchErrorName,
    index: Double,
    operation: js.UndefOr[scala.Nothing],
    tree: js.Any
  ) = this()
  def this(message: String, name: JsonPatchErrorName, index: Double, operation: js.Any, tree: js.Any) = this()
  var index: js.UndefOr[Double] = js.native
  @JSName("name")
  var name_PatchError: JsonPatchErrorName = js.native
  var operation: js.UndefOr[js.Any] = js.native
  var tree: js.UndefOr[js.Any] = js.native
}

