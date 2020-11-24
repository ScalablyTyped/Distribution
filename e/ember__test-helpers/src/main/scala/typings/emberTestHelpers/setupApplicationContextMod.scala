package typings.emberTestHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ember/test-helpers/setup-application-context", JSImport.Namespace)
@js.native
object setupApplicationContextMod extends js.Object {
  
  def currentRouteName(): String = js.native
  
  def currentURL(): String = js.native
  
  def default[Context /* <: js.Object */](context: Context): js.Promise[Context] = js.native
  
  def visit(url: String): js.Promise[Unit] = js.native
}
