package typings.emberTestHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setupApplicationContextMod {
  
  @JSImport("@ember/test-helpers/setup-application-context", JSImport.Default)
  @js.native
  def default[Context /* <: js.Object */](context: Context): js.Promise[Context] = js.native
  
  @JSImport("@ember/test-helpers/setup-application-context", "currentRouteName")
  @js.native
  def currentRouteName(): String = js.native
  
  @JSImport("@ember/test-helpers/setup-application-context", "currentURL")
  @js.native
  def currentURL(): String = js.native
  
  @JSImport("@ember/test-helpers/setup-application-context", "visit")
  @js.native
  def visit(url: String): js.Promise[Unit] = js.native
}
