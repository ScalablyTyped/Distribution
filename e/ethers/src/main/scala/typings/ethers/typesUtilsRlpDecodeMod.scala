package typings.ethers

import typings.ethers.typesUtilsDataMod.BytesLike
import typings.ethers.typesUtilsRlpMod.RlpStructuredData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsRlpDecodeMod {
  
  @JSImport("ethers/types/utils/rlp-decode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeRlp(_data: BytesLike): RlpStructuredData = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeRlp")(_data.asInstanceOf[js.Any]).asInstanceOf[RlpStructuredData]
}
