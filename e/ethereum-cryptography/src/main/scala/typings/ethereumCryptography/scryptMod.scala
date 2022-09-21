package typings.ethereumCryptography

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scryptMod {
  
  @JSImport("ethereum-cryptography/scrypt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scrypt(
    password: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    n: Double,
    p: Double,
    r: Double,
    dkLen: Double
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("scrypt")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], n.asInstanceOf[js.Any], p.asInstanceOf[js.Any], r.asInstanceOf[js.Any], dkLen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def scryptSync(
    password: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    n: Double,
    p: Double,
    r: Double,
    dkLen: Double
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("scryptSync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], n.asInstanceOf[js.Any], p.asInstanceOf[js.Any], r.asInstanceOf[js.Any], dkLen.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
}
