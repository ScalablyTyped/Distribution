package typings.editJsonFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("edit-json-file", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /** Create a JSON file editor. */
  def apply(path: String): JsonEditor = js.native
  def apply(path: String, options: Options): JsonEditor = js.native
}
