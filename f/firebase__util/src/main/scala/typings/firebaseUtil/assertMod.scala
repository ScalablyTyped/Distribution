package typings.firebaseUtil

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/util/dist/src/assert", JSImport.Namespace)
@js.native
object assertMod extends js.Object {
  
  def assert(assertion: js.Any, message: String): Unit = js.native
  
  def assertionError(message: String): Error = js.native
}
