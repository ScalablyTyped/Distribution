package typings.ethers

import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAbiBytes32Mod {
  
  @JSImport("ethers/types/abi/bytes32", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeBytes32String(_bytes: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeBytes32String")(_bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeBytes32String(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeBytes32String")(text.asInstanceOf[js.Any]).asInstanceOf[String]
}
