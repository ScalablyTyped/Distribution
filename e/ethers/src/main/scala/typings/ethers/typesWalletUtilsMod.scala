package typings.ethers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWalletUtilsMod {
  
  @JSImport("ethers/types/wallet/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPassword(password: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getPassword")(password.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def getPassword(password: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getPassword")(password.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def looseArrayify(hexString: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("looseArrayify")(hexString.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def spelunk[T](`object`: Any, _path: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("spelunk")(`object`.asInstanceOf[js.Any], _path.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def zpad(value: String, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("zpad")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def zpad(value: Double, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("zpad")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
}
