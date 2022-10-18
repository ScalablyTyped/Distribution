package typings.firebaseFunctions

import typings.firebaseFunctions.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConfigMod {
  
  @JSImport("@firebase/functions/dist/src/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerFunctions(fetchImpl: FnCall): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerFunctions")(fetchImpl.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def registerFunctions(fetchImpl: FnCall, variant: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFunctions")(fetchImpl.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
