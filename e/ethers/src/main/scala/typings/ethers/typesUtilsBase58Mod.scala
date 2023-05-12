package typings.ethers

import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsBase58Mod {
  
  @JSImport("ethers/types/utils/base58", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeBase58(value: String): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeBase58")(value.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  
  inline def encodeBase58(_value: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeBase58")(_value.asInstanceOf[js.Any]).asInstanceOf[String]
}
