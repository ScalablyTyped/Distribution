package typings.ethers

import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsRlpMod {
  
  @JSImport("ethers/types/utils/rlp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeRlp(_data: BytesLike): RlpStructuredData = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeRlp")(_data.asInstanceOf[js.Any]).asInstanceOf[RlpStructuredData]
  
  inline def encodeRlp(`object`: RlpStructuredData): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeRlp")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type RlpStructuredData = string | std.Array<ethers.ethers/types/utils/rlp.RlpStructuredData>
  }}}
  to avoid circular code involving: 
  - ethers.ethers/types/utils/rlp.RlpStructuredData
  */
  type RlpStructuredData = String | js.Array[Any]
}
