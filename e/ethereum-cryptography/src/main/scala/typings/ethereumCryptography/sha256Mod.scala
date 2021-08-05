package typings.ethereumCryptography

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sha256Mod {
  
  @JSImport("ethereum-cryptography/pure/sha256", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sha256(msg: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(msg.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
