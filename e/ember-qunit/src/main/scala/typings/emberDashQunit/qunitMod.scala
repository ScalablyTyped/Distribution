package typings.emberDashQunit

import typings.emberDashTestDashHelpers.emberDashTestDashHelpersMod.TestContext
import typings.qunit.Assert
import typings.qunit.ModuleOnly
import typings.qunit.QUnit
import typings.qunit.moduleFunc1
import typings.qunit.moduleFunc2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qunit", JSImport.Namespace)
@js.native
object qunitMod extends js.Object {
  /* QUnit */
  val default: QUnit = js.native
  val module: Fn_Hooks with moduleFunc1 with moduleFunc2 with ModuleOnly = js.native
  def only(name: String, callback: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit]): Unit = js.native
  def skip(name: String): Unit = js.native
  def skip(name: String, callback: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit]): Unit = js.native
  def test(name: String, callback: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit]): Unit = js.native
  def todo(name: String, callback: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit]): Unit = js.native
}

