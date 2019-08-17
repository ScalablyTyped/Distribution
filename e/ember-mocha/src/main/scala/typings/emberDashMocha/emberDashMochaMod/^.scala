package typings.emberDashMocha.emberDashMochaMod

import typings.ember.emberMod.defaultNs.Resolver
import typings.mocha.MochaNs.TestFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-mocha", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val describeComponent: ContextDefinition = js.native
  val describeModel: ContextDefinition = js.native
  val describeModule: ContextDefinition = js.native
  val it: TestFunction = js.native
  val setupAcceptanceTest: SetupTest = js.native
  val setupApplicationTest: NewSetupTest = js.native
  val setupComponentTest: SetupTest = js.native
  val setupModelTest: SetupTest = js.native
  val setupRenderingTest: NewSetupTest = js.native
  val setupTest: NewSetupTest with SetupTest = js.native
  def setResolver(resolver: Resolver): Unit = js.native
}

