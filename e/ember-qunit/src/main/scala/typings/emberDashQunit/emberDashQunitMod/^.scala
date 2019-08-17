package typings.emberDashQunit.emberDashQunitMod

import typings.ember.emberMod.defaultNs.Resolver
import typings.emberDashQunit.Fn_Hooks
import typings.emberDashTestDashHelpers.emberDashTestDashHelpersMod.TestContext
import typings.qunit.Assert
import typings.qunit.ModuleOnly
import typings.qunit.NestedHooks
import typings.qunit.moduleFunc1
import typings.qunit.moduleFunc2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-qunit", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val module: Fn_Hooks with moduleFunc1 with moduleFunc2 with ModuleOnly = js.native
  def moduleFor(fullName: String): Unit = js.native
  def moduleFor(fullName: String, callbacks: QUnitModuleCallbacks): Unit = js.native
  def moduleFor(fullName: String, description: String): Unit = js.native
  def moduleFor(fullName: String, description: String, callbacks: QUnitModuleCallbacks): Unit = js.native
  def moduleForComponent(fullName: String): Unit = js.native
  def moduleForComponent(fullName: String, callbacks: QUnitModuleCallbacks): Unit = js.native
  def moduleForComponent(fullName: String, description: String): Unit = js.native
  def moduleForComponent(fullName: String, description: String, callbacks: QUnitModuleCallbacks): Unit = js.native
  def moduleForModel(fullName: String): Unit = js.native
  def moduleForModel(fullName: String, callbacks: QUnitModuleCallbacks): Unit = js.native
  def moduleForModel(fullName: String, description: String): Unit = js.native
  def moduleForModel(fullName: String, description: String, callbacks: QUnitModuleCallbacks): Unit = js.native
  def only(name: String, callback: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit]): Unit = js.native
  def setResolver(resolver: Resolver): Unit = js.native
  def setupApplicationTest(hooks: NestedHooks): Unit = js.native
  def setupApplicationTest(hooks: NestedHooks, options: SetupTestOptions): Unit = js.native
  def setupRenderingTest(hooks: NestedHooks): Unit = js.native
  def setupRenderingTest(hooks: NestedHooks, options: SetupTestOptions): Unit = js.native
  def setupTest(hooks: NestedHooks): Unit = js.native
  def setupTest(hooks: NestedHooks, options: SetupTestOptions): Unit = js.native
  def skip(name: String): Unit = js.native
  def skip(name: String, callback: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit]): Unit = js.native
  def start(): Unit = js.native
  def start(options: QUnitStartOptions): Unit = js.native
  def test(name: String, callback: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit]): Unit = js.native
  def todo(name: String, callback: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit]): Unit = js.native
}

