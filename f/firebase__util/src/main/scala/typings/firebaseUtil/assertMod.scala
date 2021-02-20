package typings.firebaseUtil

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assertMod {
  
  @JSImport("@firebase/util/dist/src/assert", "assert")
  @js.native
  def assert(assertion: js.Any, message: String): Unit = js.native
  
  @JSImport("@firebase/util/dist/src/assert", "assertionError")
  @js.native
  def assertionError(message: String): Error = js.native
}
