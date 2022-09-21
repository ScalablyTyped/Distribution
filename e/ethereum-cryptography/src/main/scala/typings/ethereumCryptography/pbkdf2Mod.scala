package typings.ethereumCryptography

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbkdf2Mod {
  
  @JSImport("ethereum-cryptography/pbkdf2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pbkdf2(
    password: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    iterations: Double,
    keylen: Double,
    digest: String
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def pbkdf2Sync(
    password: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    iterations: Double,
    keylen: Double,
    digest: String
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
}
