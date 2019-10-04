package typings.fastDashJsonDashPatch.fastDashJsonDashPatchMod

import typings.fastDashJsonDashPatch.moduleHelpersMod.JsonPatchErrorName
import typings.fastDashJsonDashPatch.moduleHelpersMod.PatchError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-json-patch", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  @js.native
  class JsonPatchError protected () extends PatchError {
    def this(message: String, name: JsonPatchErrorName) = this()
    def this(message: String, name: JsonPatchErrorName, index: Double) = this()
    def this(message: String, name: JsonPatchErrorName, index: Double, operation: js.Any) = this()
    def this(message: String, name: JsonPatchErrorName, index: Double, operation: js.Any, tree: js.Any) = this()
  }
  
}

