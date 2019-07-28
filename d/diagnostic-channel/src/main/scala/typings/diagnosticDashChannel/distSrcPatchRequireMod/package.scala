package typings.diagnosticDashChannel

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distSrcPatchRequireMod {
  type IModulePatchMap = StringDictionary[js.Array[IModulePatcher]]
  type PatchFunction = js.Function2[/* module */ js.Any, /* path */ String, js.Any]
}
