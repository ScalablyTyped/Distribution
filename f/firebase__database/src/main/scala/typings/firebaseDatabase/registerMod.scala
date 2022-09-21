package typings.firebaseDatabase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registerMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/register", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerDatabase(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerDatabase")().asInstanceOf[Unit]
  inline def registerDatabase(variant: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerDatabase")(variant.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
