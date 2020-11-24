package typings.firebase.mod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("firebase", "registerVersion")
@js.native
object registerVersion extends js.Object {
  
  /**
    * Registers a library's name and version for platform logging purposes.
    * @param library Name of 1p or 3p library (e.g. firestore, angularfire)
    * @param version Current version of that library.
    * @param variant Bundle variant, e.g., node, rn, etc.
    */
  def apply(library: String, version: String): Unit = js.native
  def apply(library: String, version: String, variant: String): Unit = js.native
}
