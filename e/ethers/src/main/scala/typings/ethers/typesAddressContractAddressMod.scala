package typings.ethers

import typings.ethers.anon.From
import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAddressContractAddressMod {
  
  @JSImport("ethers/types/address/contract-address", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCreate2Address(_from: String, _salt: BytesLike, _initCodeHash: BytesLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCreate2Address")(_from.asInstanceOf[js.Any], _salt.asInstanceOf[js.Any], _initCodeHash.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getCreateAddress(tx: From): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCreateAddress")(tx.asInstanceOf[js.Any]).asInstanceOf[String]
}
