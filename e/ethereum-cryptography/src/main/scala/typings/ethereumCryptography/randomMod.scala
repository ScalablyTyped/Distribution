package typings.ethereumCryptography

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object randomMod {
  
  @JSImport("ethereum-cryptography/random", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRandomBytes(bytes: Double): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomBytes")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def getRandomBytesSync(bytes: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomBytesSync")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
