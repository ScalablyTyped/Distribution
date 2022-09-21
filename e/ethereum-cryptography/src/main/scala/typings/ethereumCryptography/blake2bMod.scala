package typings.ethereumCryptography

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blake2bMod {
  
  @JSImport("ethereum-cryptography/blake2b", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def blake2b(msg: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("blake2b")(msg.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def blake2b(msg: js.typedarray.Uint8Array, outputLength: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2b")(msg.asInstanceOf[js.Any], outputLength.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
}
