package typings.atEmberTest

import typings.atEmberApplication.atEmberApplicationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/test", JSImport.Namespace)
@js.native
object atEmberTestMod extends js.Object {
  def registerAsyncHelper(name: String, helperMethod: js.Function2[/* app */ default, /* repeated */ js.Any, _]): Unit = js.native
  def registerHelper(name: String, helperMethod: js.Function2[/* app */ default, /* repeated */ js.Any, _]): js.Any = js.native
  def registerHelper(
    name: String,
    helperMethod: js.Function2[/* app */ default, /* repeated */ js.Any, _],
    options: js.Object
  ): js.Any = js.native
  def registerWaiter(callback: js.Function0[Boolean]): js.Any = js.native
  def registerWaiter[Context](context: Context, callback: js.ThisFunction0[/* this */ Context, Boolean]): js.Any = js.native
  def unregisterHelper(name: String): Unit = js.native
  def unregisterWaiter(callback: js.Function0[Boolean]): js.Any = js.native
  def unregisterWaiter[Context](context: Context, callback: js.ThisFunction0[/* this */ Context, Boolean]): js.Any = js.native
}

