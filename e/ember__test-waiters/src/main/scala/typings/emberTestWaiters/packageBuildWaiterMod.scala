package typings.emberTestWaiters

import typings.emberTestWaiters.packageTypesMod.TestWaiter
import typings.emberTestWaiters.packageTypesMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packageBuildWaiterMod {
  
  @JSImport("@ember/test-waiters/package/build-waiter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(name: String): TestWaiter[Token] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any]).asInstanceOf[TestWaiter[Token]]
  
  inline def resetWaiterNames(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_resetWaiterNames")().asInstanceOf[Unit]
}
