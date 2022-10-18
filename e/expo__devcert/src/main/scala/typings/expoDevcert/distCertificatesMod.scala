package typings.expoDevcert

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCertificatesMod {
  
  @JSImport("@expo/devcert/dist/certificates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(domain: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(domain.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def generateKey(filename: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")(filename.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
