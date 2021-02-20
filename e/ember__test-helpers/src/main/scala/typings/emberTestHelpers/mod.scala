package typings.emberTestHelpers

import typings.emberApplication.mod.default
import typings.emberTestHelpers.anon.Delay
import typings.emberTestHelpers.anon.IsValid
import typings.emberTestHelpers.anon.Resolver
import typings.emberTestHelpers.settledMod.SettledState
import typings.emberTestHelpers.triggerKeyEventMod.KeyEvent
import typings.emberTestHelpers.triggerKeyEventMod.KeyModifiers
import typings.emberTestHelpers.waitForMod.Options
import typings.std.Element
import typings.std.MouseEventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ember/test-helpers", "blur")
  @js.native
  def blur(target: Target): js.Promise[Unit] = js.native
  
  @JSImport("@ember/test-helpers", "clearRender")
  @js.native
  def clearRender(): js.Promise[Unit] = js.native
  
  @JSImport("@ember/test-helpers", "click")
  @js.native
  def click(target: Target): js.Promise[Unit] = js.native
  @JSImport("@ember/test-helpers", "click")
  @js.native
  def click(target: Target, options: MouseEventInit): js.Promise[Unit] = js.native
  
  @JSImport("@ember/test-helpers", "currentRouteName")
  @js.native
  def currentRouteName(): String = js.native
  
  @JSImport("@ember/test-helpers", "currentURL")
  @js.native
  def currentURL(): String = js.native
  
  @JSImport("@ember/test-helpers", "doubleClick")
  @js.native
  def doubleClick(target: Target): js.Promise[Unit] = js.native
  @JSImport("@ember/test-helpers", "doubleClick")
  @js.native
  def doubleClick(target: Target, options: MouseEventInit): js.Promise[Unit] = js.native
  
  @JSImport("@ember/test-helpers", "fillIn")
  @js.native
  def fillIn(target: Target, text: String): js.Promise[Unit] = js.native
  
  @JSImport("@ember/test-helpers", "find")
  @js.native
  def find(selector: String): Element | Null = js.native
  
  @JSImport("@ember/test-helpers", "findAll")
  @js.native
  def findAll(selector: String): js.Array[Element] = js.native
  
  @JSImport("@ember/test-helpers", "focus")
  @js.native
  def focus(target: Target): js.Promise[Unit] = js.native
  
  @JSImport("@ember/test-helpers", "getApplication")
  @js.native
  def getApplication(): default = js.native
  
  @JSImport("@ember/test-helpers", "getContext")
  @js.native
  def getContext(): js.Object = js.native
  
  @JSImport("@ember/test-helpers", "getResolver")
  @js.native
  def getResolver(): typings.emberApplication.resolverMod.default = js.native
  
  @JSImport("@ember/test-helpers", "getRootElement")
  @js.native
  def getRootElement(): Element = js.native
  
  @JSImport("@ember/test-helpers", "getSettledState")
  @js.native
  def getSettledState(): SettledState = js.native
  
  @JSImport("@ember/test-helpers", "isSettled")
  @js.native
  def isSettled(): Boolean = js.native
  
  @JSImport("@ember/test-helpers", "pauseTest")
  @js.native
  def pauseTest(): js.Promise[Unit] = js.native
  
  @JSImport("@ember/test-helpers", "render")
  @js.native
  def render(
    template: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TemplateFactory */ js.Any
  ): js.Promise[Unit] = js.native
  
  @JSImport("@ember/test-helpers", "resetOnerror")
  @js.native
  def resetOnerror(): Unit = js.native
  
  @JSImport("@ember/test-helpers", "resumeTest")
  @js.native
  def resumeTest(): Unit = js.native
  
  @JSImport("@ember/test-helpers", "setApplication")
  @js.native
  def setApplication(application: default): Unit = js.native
  
  @JSImport("@ember/test-helpers", "setContext")
  @js.native
  def setContext(context: js.Object): Unit = js.native
  
  @JSImport("@ember/test-helpers", "setResolver")
  @js.native
  def setResolver(resolver: typings.emberApplication.resolverMod.default): Unit = js.native
  
  @JSImport("@ember/test-helpers", "settled")
  @js.native
  def settled(): js.Promise[Unit] = js.native
  
  @JSImport("@ember/test-helpers", "setupApplicationContext")
  @js.native
  def setupApplicationContext[Context /* <: js.Object */](context: Context): js.Promise[Context] = js.native
  
  @JSImport("@ember/test-helpers", "setupContext")
  @js.native
  def setupContext[C /* <: js.Object */](context: C): js.Promise[C] = js.native
  @JSImport("@ember/test-helpers", "setupContext")
  @js.native
  def setupContext[C /* <: js.Object */](context: C, options: Resolver): js.Promise[C] = js.native
  
  @JSImport("@ember/test-helpers", "setupOnerror")
  @js.native
  def setupOnerror(handler: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  
  @JSImport("@ember/test-helpers", "setupRenderingContext")
  @js.native
  def setupRenderingContext[Context /* <: js.Object */](context: Context): js.Promise[Context] = js.native
  
  @JSImport("@ember/test-helpers", "tap")
  @js.native
  def tap(target: Target): js.Promise[Unit] = js.native
  @JSImport("@ember/test-helpers", "tap")
  @js.native
  def tap(target: Target, options: js.Object): js.Promise[Unit] = js.native
  
  @JSImport("@ember/test-helpers", "teardownApplicationContext")
  @js.native
  def teardownApplicationContext(context: js.Object): js.Promise[Unit] = js.native
  
  @JSImport("@ember/test-helpers", "teardownContext")
  @js.native
  def teardownContext(context: js.Object): js.Promise[Unit] = js.native
  
  @JSImport("@ember/test-helpers", "teardownRenderingContext")
  @js.native
  def teardownRenderingContext(context: js.Object): js.Promise[Unit] = js.native
  
  @JSImport("@ember/test-helpers", "triggerEvent")
  @js.native
  def triggerEvent(target: Target, eventType: String): js.Promise[Unit] = js.native
  @JSImport("@ember/test-helpers", "triggerEvent")
  @js.native
  def triggerEvent(target: Target, eventType: String, options: js.Object): js.Promise[Unit] = js.native
  
  @JSImport("@ember/test-helpers", "triggerKeyEvent")
  @js.native
  def triggerKeyEvent(target: Target, eventType: KeyEvent, key: String): js.Promise[Unit] = js.native
  @JSImport("@ember/test-helpers", "triggerKeyEvent")
  @js.native
  def triggerKeyEvent(target: Target, eventType: KeyEvent, key: String, modifiers: KeyModifiers): js.Promise[Unit] = js.native
  @JSImport("@ember/test-helpers", "triggerKeyEvent")
  @js.native
  def triggerKeyEvent(target: Target, eventType: KeyEvent, key: Double): js.Promise[Unit] = js.native
  @JSImport("@ember/test-helpers", "triggerKeyEvent")
  @js.native
  def triggerKeyEvent(target: Target, eventType: KeyEvent, key: Double, modifiers: KeyModifiers): js.Promise[Unit] = js.native
  
  @JSImport("@ember/test-helpers", "typeIn")
  @js.native
  def typeIn(target: Target, text: String): js.Promise[Unit] = js.native
  @JSImport("@ember/test-helpers", "typeIn")
  @js.native
  def typeIn(target: Target, text: String, options: Delay): js.Promise[Unit] = js.native
  
  @JSImport("@ember/test-helpers", "unsetContext")
  @js.native
  def unsetContext(): Unit = js.native
  
  @JSImport("@ember/test-helpers", "validateErrorHandler")
  @js.native
  def validateErrorHandler(): IsValid = js.native
  @JSImport("@ember/test-helpers", "validateErrorHandler")
  @js.native
  def validateErrorHandler(callback: js.Function1[/* error */ typings.emberError.mod.default, Unit]): IsValid = js.native
  
  @JSImport("@ember/test-helpers", "visit")
  @js.native
  def visit(url: String): js.Promise[Unit] = js.native
  
  @JSImport("@ember/test-helpers", "waitFor")
  @js.native
  def waitFor(selector: String): js.Promise[Element | js.Array[Element]] = js.native
  @JSImport("@ember/test-helpers", "waitFor")
  @js.native
  def waitFor(selector: String, options: Options): js.Promise[Element | js.Array[Element]] = js.native
  
  @JSImport("@ember/test-helpers", "waitUntil")
  @js.native
  def waitUntil[T](callback: js.Function0[T]): js.Promise[T] = js.native
  @JSImport("@ember/test-helpers", "waitUntil")
  @js.native
  def waitUntil[T](callback: js.Function0[T], options: typings.emberTestHelpers.waitUntilMod.Options): js.Promise[T] = js.native
  
  type Target = String | Element
}
