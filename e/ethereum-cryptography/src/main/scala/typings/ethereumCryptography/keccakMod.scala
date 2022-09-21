package typings.ethereumCryptography

import typings.nobleHashes.sha3Mod.Keccak
import typings.nobleHashes.utilsMod.Hash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keccakMod {
  
  @JSImport("ethereum-cryptography/keccak", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def keccak224(msg: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("keccak224")(msg.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("ethereum-cryptography/keccak", "keccak256")
  @js.native
  val keccak256: K256 = js.native
  
  inline def keccak384(msg: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("keccak384")(msg.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def keccak512(msg: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("keccak512")(msg.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @js.native
  trait K256 extends StObject {
    
    def apply(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    def create(): Hash[Keccak] = js.native
  }
}
