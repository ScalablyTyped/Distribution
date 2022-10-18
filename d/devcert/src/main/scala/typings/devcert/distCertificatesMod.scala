package typings.devcert

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCertificatesMod {
  
  @JSImport("devcert/dist/certificates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(domains: js.Array[String]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(domains.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def generateKey(filename: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")(filename.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
