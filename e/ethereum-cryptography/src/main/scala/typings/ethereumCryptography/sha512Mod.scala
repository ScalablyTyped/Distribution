package typings.ethereumCryptography

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sha512Mod {
  
  @JSImport("ethereum-cryptography/sha512", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sha512(msg: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(msg.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
