package typings.ethereumCryptography

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aesMod {
  
  @JSImport("ethereum-cryptography/aes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decrypt(cypherText: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cypherText.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def decrypt(
    cypherText: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    iv: js.typedarray.Uint8Array,
    mode: String
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cypherText.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def decrypt(
    cypherText: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    iv: js.typedarray.Uint8Array,
    mode: String,
    pkcs7PaddingEnabled: Boolean
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cypherText.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], pkcs7PaddingEnabled.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def decrypt(
    cypherText: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    iv: js.typedarray.Uint8Array,
    mode: Unit,
    pkcs7PaddingEnabled: Boolean
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cypherText.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], pkcs7PaddingEnabled.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def encrypt(msg: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(msg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def encrypt(
    msg: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    iv: js.typedarray.Uint8Array,
    mode: String
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(msg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def encrypt(
    msg: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    iv: js.typedarray.Uint8Array,
    mode: String,
    pkcs7PaddingEnabled: Boolean
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(msg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], pkcs7PaddingEnabled.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def encrypt(
    msg: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    iv: js.typedarray.Uint8Array,
    mode: Unit,
    pkcs7PaddingEnabled: Boolean
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(msg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], pkcs7PaddingEnabled.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
}
