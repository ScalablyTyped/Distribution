package typings.ethereumCryptography

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ripemd160Mod {
  
  @JSImport("ethereum-cryptography/pure/ripemd160", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ripemd160(msg: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("ripemd160")(msg.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
