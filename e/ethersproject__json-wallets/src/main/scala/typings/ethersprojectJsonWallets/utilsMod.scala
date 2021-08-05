package typings.ethersprojectJsonWallets

import typings.ethersprojectBytes.mod.Bytes
import typings.ethersprojectBytes.mod.BytesLike
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@ethersproject/json-wallets/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPassword(password: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getPassword")(password.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  inline def getPassword(password: Bytes): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getPassword")(password.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  inline def looseArrayify(hexString: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("looseArrayify")(hexString.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  inline def searchPath(`object`: js.Any, path: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPath")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def uuidV4(randomBytes: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uuidV4")(randomBytes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def zpad(value: String, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("zpad")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def zpad(value: Double, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("zpad")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
}
