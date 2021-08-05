package typings.ethereumCryptography

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hdkeyCryptoMod {
  
  @JSImport("ethereum-cryptography/pure/shims/hdkey-crypto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createHash(name: String): Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(name.asInstanceOf[js.Any]).asInstanceOf[Hash]
  
  @JSImport("ethereum-cryptography/pure/shims/hdkey-crypto", "createHmac")
  @js.native
  val createHmac: js.Any = js.native
  
  @JSImport("ethereum-cryptography/pure/shims/hdkey-crypto", "randomBytes")
  @js.native
  val randomBytes: js.Any = js.native
  
  trait Hash extends StObject {
    
    /* private */ var buffers: js.Any
    
    def digest(param: js.Any): Buffer
    
    /* private */ val hashFunction: js.Any
    
    def update(buffer: Buffer): this.type
  }
  object Hash {
    
    inline def apply(buffers: js.Any, digest: js.Any => Buffer, hashFunction: js.Any, update: Buffer => Hash): Hash = {
      val __obj = js.Dynamic.literal(buffers = buffers.asInstanceOf[js.Any], digest = js.Any.fromFunction1(digest), hashFunction = hashFunction.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Hash]
    }
    
    extension [Self <: Hash](x: Self) {
      
      inline def setBuffers(value: js.Any): Self = StObject.set(x, "buffers", value.asInstanceOf[js.Any])
      
      inline def setDigest(value: js.Any => Buffer): Self = StObject.set(x, "digest", js.Any.fromFunction1(value))
      
      inline def setHashFunction(value: js.Any): Self = StObject.set(x, "hashFunction", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: Buffer => Hash): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
}
