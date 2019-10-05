package typings.emberDashMocha.emberDashMochaMod

import org.scalablytyped.runtime.TopLevel
import typings.emberDashTestDashHelpers.emberDashTestDashHelpersMod.ModuleCallbacks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetupTest extends js.Object {
  def apply(): Unit = js.native
  def apply(callbacks: ModuleCallbacks): Unit = js.native
  def apply(name: String): Unit = js.native
  def apply(name: String, callbacks: ModuleCallbacks): Unit = js.native
}

@JSImport("ember-mocha", "setupTest")
@js.native
object setupTest extends TopLevel[NewSetupTest with SetupTest]

