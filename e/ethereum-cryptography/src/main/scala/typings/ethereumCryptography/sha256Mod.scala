package typings.ethereumCryptography

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sha256Mod {
  
  @JSImport("ethereum-cryptography/sha256", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sha256(msg: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(msg.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
