package typings.ethers

import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCryptoSha2Mod {
  
  object sha256 {
    
    inline def apply(_data: BytesLike): String = ^.asInstanceOf[js.Dynamic].apply(_data.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("ethers/types/crypto/sha2", "sha256")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ethers/types/crypto/sha2", "sha256._")
    @js.native
    def _underscore: js.Function1[/* data */ js.typedarray.Uint8Array, js.typedarray.Uint8Array] = js.native
    
    inline def _underscore_=(x: js.Function1[/* data */ js.typedarray.Uint8Array, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_")(x.asInstanceOf[js.Any])
    
    @JSImport("ethers/types/crypto/sha2", "sha256.lock")
    @js.native
    def lock: js.Function0[Unit] = js.native
    inline def lock_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lock")(x.asInstanceOf[js.Any])
    
    @JSImport("ethers/types/crypto/sha2", "sha256.register")
    @js.native
    def register: js.Function1[/* func */ js.Function1[/* data */ js.typedarray.Uint8Array, BytesLike], Unit] = js.native
    inline def register_=(x: js.Function1[/* func */ js.Function1[/* data */ js.typedarray.Uint8Array, BytesLike], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("register")(x.asInstanceOf[js.Any])
  }
  
  object sha512 {
    
    inline def apply(_data: BytesLike): String = ^.asInstanceOf[js.Dynamic].apply(_data.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("ethers/types/crypto/sha2", "sha512")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ethers/types/crypto/sha2", "sha512._")
    @js.native
    def _underscore: js.Function1[/* data */ js.typedarray.Uint8Array, js.typedarray.Uint8Array] = js.native
    
    inline def _underscore_=(x: js.Function1[/* data */ js.typedarray.Uint8Array, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_")(x.asInstanceOf[js.Any])
    
    @JSImport("ethers/types/crypto/sha2", "sha512.lock")
    @js.native
    def lock: js.Function0[Unit] = js.native
    inline def lock_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lock")(x.asInstanceOf[js.Any])
    
    @JSImport("ethers/types/crypto/sha2", "sha512.register")
    @js.native
    def register: js.Function1[/* func */ js.Function1[/* data */ js.typedarray.Uint8Array, BytesLike], Unit] = js.native
    inline def register_=(x: js.Function1[/* func */ js.Function1[/* data */ js.typedarray.Uint8Array, BytesLike], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("register")(x.asInstanceOf[js.Any])
  }
}
