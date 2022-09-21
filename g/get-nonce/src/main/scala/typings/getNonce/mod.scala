package typings.getNonce

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("get-nonce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNonce(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNonce")().asInstanceOf[js.UndefOr[String]]
  
  inline def setNonce(nonce: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setNonce")(nonce.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
