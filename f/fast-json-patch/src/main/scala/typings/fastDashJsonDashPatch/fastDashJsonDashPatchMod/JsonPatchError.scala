package typings.fastDashJsonDashPatch.fastDashJsonDashPatchMod

import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.TopLevel
import typings.fastDashJsonDashPatch.moduleHelpersMod.JsonPatchErrorName
import typings.fastDashJsonDashPatch.moduleHelpersMod.PatchError
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

@JSImport("fast-json-patch", "JsonPatchError")
@js.native
object JsonPatchError
  extends TopLevel[
      Instantiable5[
        /* message */ String, 
        /* name */ JsonPatchErrorName, 
        js.UndefOr[/* index */ Double], 
        js.UndefOr[/* operation */ js.Any], 
        js.UndefOr[/* tree */ js.Any], 
        PatchError
      ]
    ]

