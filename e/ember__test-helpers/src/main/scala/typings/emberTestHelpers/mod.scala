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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/test-helpers", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def blur(target: Target): js.Promise[Unit] = js.native
  def clearRender(): js.Promise[Unit] = js.native
  def click(target: Target): js.Promise[Unit] = js.native
  def currentRouteName(): String = js.native
  def currentURL(): String = js.native
  def doubleClick(target: Target): js.Promise[Unit] = js.native
  def fillIn(target: Target, text: String): js.Promise[Unit] = js.native
  def find(selector: String): Element | Null = js.native
  def findAll(selector: String): js.Array[Element] = js.native
  def focus(target: Target): js.Promise[Unit] = js.native
  def getApplication(): default = js.native
  def getContext(): js.Object = js.native
  def getResolver(): typings.emberApplication.resolverMod.default = js.native
  def getRootElement(): Element = js.native
  def getSettledState(): SettledState = js.native
  def isSettled(): Boolean = js.native
  def pauseTest(): js.Promise[Unit] = js.native
  def render(
    template: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TemplateFactory */ js.Any
  ): js.Promise[Unit] = js.native
  def resumeTest(): Unit = js.native
  def setApplication(application: default): Unit = js.native
  def setContext(context: js.Object): Unit = js.native
  def setResolver(resolver: typings.emberApplication.resolverMod.default): Unit = js.native
  def settled(): js.Promise[Unit] = js.native
  def setupApplicationContext[Context /* <: js.Object */](context: Context): js.Promise[Context] = js.native
  def setupContext[C /* <: js.Object */](context: C): js.Promise[C] = js.native
  def setupContext[C /* <: js.Object */](context: C, options: Resolver): js.Promise[C] = js.native
  def setupRenderingContext[Context /* <: js.Object */](context: Context): js.Promise[Context] = js.native
  def tap(target: Target): js.Promise[Unit] = js.native
  def teardownApplicationContext(context: js.Object): js.Promise[Unit] = js.native
  def teardownContext(context: js.Object): js.Promise[Unit] = js.native
  def teardownRenderingContext(context: js.Object): js.Promise[Unit] = js.native
  def triggerEvent(target: Target, eventType: String): js.Promise[Unit] = js.native
  def triggerEvent(target: Target, eventType: String, options: js.Object): js.Promise[Unit] = js.native
  def triggerKeyEvent(target: Target, eventType: KeyEvent, key: String): js.Promise[Unit] = js.native
  def triggerKeyEvent(target: Target, eventType: KeyEvent, key: String, modifiers: KeyModifiers): js.Promise[Unit] = js.native
  def triggerKeyEvent(target: Target, eventType: KeyEvent, key: Double): js.Promise[Unit] = js.native
  def triggerKeyEvent(target: Target, eventType: KeyEvent, key: Double, modifiers: KeyModifiers): js.Promise[Unit] = js.native
  def typeIn(target: Target, text: String): js.Promise[Unit] = js.native
  def typeIn(target: Target, text: String, options: Delay): js.Promise[Unit] = js.native
  def unsetContext(): Unit = js.native
  def validateErrorHandler(): IsValid = js.native
  def validateErrorHandler(callback: js.Function1[/* error */ typings.emberError.mod.default, Unit]): IsValid = js.native
  def visit(url: String): js.Promise[Unit] = js.native
  def waitFor(selector: String): js.Promise[Element | js.Array[Element]] = js.native
  def waitFor(selector: String, options: Options): js.Promise[Element | js.Array[Element]] = js.native
  def waitUntil[T](callback: js.Function0[T]): js.Promise[T] = js.native
  def waitUntil[T](callback: js.Function0[T], options: typings.emberTestHelpers.waitUntilMod.Options): js.Promise[T] = js.native
  type Target = String | Element
}

