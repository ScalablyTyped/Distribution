package typings.emberTestHelpers

import typings.emberTestHelpers.anon.Resolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setupContextMod {
  
  @JSImport("@ember/test-helpers/setup-context", JSImport.Default)
  @js.native
  def default[C /* <: js.Object */](context: C): js.Promise[C] = js.native
  @JSImport("@ember/test-helpers/setup-context", JSImport.Default)
  @js.native
  def default[C /* <: js.Object */](context: C, options: Resolver): js.Promise[C] = js.native
  
  @JSImport("@ember/test-helpers/setup-context", "getContext")
  @js.native
  def getContext(): js.Object = js.native
  
  @JSImport("@ember/test-helpers/setup-context", "pauseTest")
  @js.native
  def pauseTest(): js.Promise[Unit] = js.native
  
  @JSImport("@ember/test-helpers/setup-context", "resumeTest")
  @js.native
  def resumeTest(): Unit = js.native
  
  @JSImport("@ember/test-helpers/setup-context", "setContext")
  @js.native
  def setContext(context: js.Object): Unit = js.native
  
  @JSImport("@ember/test-helpers/setup-context", "unsetContext")
  @js.native
  def unsetContext(): Unit = js.native
}
