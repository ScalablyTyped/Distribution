package typings.emberDashTestDashHelpers.emberDashTestDashHelpersMod

import typings.ember.emberMod.defaultNs.Resolver
import typings.rsvp.rsvpMod.defaultNs.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-test-helpers", "TestModule")
@js.native
class TestModule protected () extends js.Object {
  def this(name: String) = this()
  def this(name: String, callbacks: ModuleCallbacks) = this()
  def this(name: String, description: String) = this()
  def this(name: String, description: String, callbacks: ModuleCallbacks) = this()
  var callbacks: ModuleCallbacks = js.native
  var context: TestContext = js.native
  var description: String = js.native
  var isIntegration: Boolean = js.native
  var name: String = js.native
  var resolver: Resolver = js.native
  var subjectName: String = js.native
  def getContext(): TestContext = js.native
  def setContext(context: TestContext): Unit = js.native
  def setup(): Promise[Unit] = js.native
  def setup(assert: js.Any): Promise[Unit] = js.native
  def teardown(): Promise[Unit] = js.native
  def teardown(assert: js.Any): Promise[Unit] = js.native
}

