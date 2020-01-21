package typings.emberQunit.mod

import typings.emberTestHelpers.mod.TestContext
import typings.qunit.Assert
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-qunit", "todo")
@js.native
object todo extends js.Object {
  def apply(name: String, callback: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit]): Unit = js.native
}

