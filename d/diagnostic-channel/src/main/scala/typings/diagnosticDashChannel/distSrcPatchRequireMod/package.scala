package typings.diagnosticDashChannel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distSrcPatchRequireMod {
  import org.scalablytyped.runtime.StringDictionary

  type IModulePatchMap = StringDictionary[js.Array[IModulePatcher]]
  type PatchFunction = js.Function2[/* module */ js.Any, /* path */ String, js.Any]
}
