package typings.emberTest

import typings.emberApplication.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ember/test", "registerAsyncHelper")
  @js.native
  def registerAsyncHelper(name: String, helperMethod: js.Function2[/* app */ default, /* repeated */ js.Any, _]): Unit = js.native
  
  @JSImport("@ember/test", "registerHelper")
  @js.native
  def registerHelper(name: String, helperMethod: js.Function2[/* app */ default, /* repeated */ js.Any, _]): js.Any = js.native
  @JSImport("@ember/test", "registerHelper")
  @js.native
  def registerHelper(
    name: String,
    helperMethod: js.Function2[/* app */ default, /* repeated */ js.Any, _],
    options: js.Object
  ): js.Any = js.native
  
  @JSImport("@ember/test", "registerWaiter")
  @js.native
  def registerWaiter(callback: js.Function0[Boolean]): js.Any = js.native
  @JSImport("@ember/test", "registerWaiter")
  @js.native
  def registerWaiter[Context](context: Context, callback: js.ThisFunction0[/* this */ Context, Boolean]): js.Any = js.native
  
  @JSImport("@ember/test", "unregisterHelper")
  @js.native
  def unregisterHelper(name: String): Unit = js.native
  
  @JSImport("@ember/test", "unregisterWaiter")
  @js.native
  def unregisterWaiter(callback: js.Function0[Boolean]): js.Any = js.native
  @JSImport("@ember/test", "unregisterWaiter")
  @js.native
  def unregisterWaiter[Context](context: Context, callback: js.ThisFunction0[/* this */ Context, Boolean]): js.Any = js.native
}
