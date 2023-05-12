package typings.emberTestWaiters

import typings.emberTestWaiters.packagePackageTypesMod.TestWaiter
import typings.emberTestWaiters.packagePackageTypesMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packagePackageBuildWaiterMod {
  
  @JSImport("@ember/test-waiters/package/package/build-waiter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(name: String): TestWaiter[Token] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any]).asInstanceOf[TestWaiter[Token]]
  
  inline def resetWaiterNames(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_resetWaiterNames")().asInstanceOf[Unit]
}
