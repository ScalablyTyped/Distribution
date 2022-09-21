package typings.firebaseAuth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testHelpersDelayMod {
  
  @JSImport("@firebase/auth/dist/esm2017/test/helpers/delay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def delay(cb: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
