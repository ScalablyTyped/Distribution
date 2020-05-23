package typings.emberQunit

import typings.emberTestHelpers.mod.TestContext
import typings.qunit.Assert
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qunit", JSImport.Namespace)
@js.native
object qunitMod extends js.Object {
  val module: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof QUnit.module */ js.Any = js.native
  def only(name: String, callback: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit]): Unit = js.native
  def skip(name: String): Unit = js.native
  def skip(name: String, callback: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit]): Unit = js.native
  def test(name: String, callback: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit]): Unit = js.native
  def todo(name: String, callback: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit]): Unit = js.native
}

