package typings
package fastDashJsonDashPatchLib.libHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-json-patch/lib/helpers", "PatchError")
@js.native
class PatchError protected ()
  extends stdLib.Error {
  def this(message: java.lang.String, name: JsonPatchErrorName) = this()
  def this(message: java.lang.String, name: JsonPatchErrorName, index: scala.Double) = this()
  def this(message: java.lang.String, name: JsonPatchErrorName, index: scala.Double, operation: js.Any) = this()
  def this(message: java.lang.String, name: JsonPatchErrorName, index: scala.Double, operation: js.Any, tree: js.Any) = this()
  var index: scala.Double = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  @JSName("name")
  var name_PatchError: JsonPatchErrorName = js.native
  var operation: js.Any = js.native
  var tree: js.Any = js.native
}

