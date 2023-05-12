package typings.ethers

import typings.ethers.ethersStrings.sha256
import typings.ethers.ethersStrings.sha512
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCryptoCryptoBrowserMod {
  
  @JSImport("ethers/types/crypto/crypto-browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createHash(algo: String): CryptoHasher = ^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(algo.asInstanceOf[js.Any]).asInstanceOf[CryptoHasher]
  
  inline def createHmac(_algo: String, key: js.typedarray.Uint8Array): CryptoHasher = (^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(_algo.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[CryptoHasher]
  
  object global {
    
    @JSGlobal("self")
    @js.native
    val self: Window = js.native
    
    @JSGlobal("window")
    @js.native
    val window: Window = js.native
  }
  
  inline def pbkdf2Sync(
    password: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    iterations: Double,
    keylen: Double,
    _algo: sha256 | sha512
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], _algo.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def randomBytes(length: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(length.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  trait CryptoHasher extends StObject {
    
    def digest(): js.typedarray.Uint8Array
    
    def update(data: js.typedarray.Uint8Array): CryptoHasher
  }
  object CryptoHasher {
    
    inline def apply(digest: () => js.typedarray.Uint8Array, update: js.typedarray.Uint8Array => CryptoHasher): CryptoHasher = {
      val __obj = js.Dynamic.literal(digest = js.Any.fromFunction0(digest), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[CryptoHasher]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CryptoHasher] (val x: Self) extends AnyVal {
      
      inline def setDigest(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "digest", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: js.typedarray.Uint8Array => CryptoHasher): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
}
