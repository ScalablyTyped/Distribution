package typings.ethereumCryptography

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keccakMod {
  
  @JSImport("ethereum-cryptography/keccak", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def keccak224(msg: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("keccak224")(msg.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def keccak256(msg: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("keccak256")(msg.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def keccak384(msg: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("keccak384")(msg.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def keccak512(msg: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("keccak512")(msg.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
