package typings.ethers.anon

import typings.ethers.typesAddressMod.AddressLike
import typings.ethers.typesTransactionMod.AccessListEntry
import typings.ethers.typesTransactionMod.AccessListish
import typings.ethers.typesUtilsMathsMod.BigNumberish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<ethers.ethers/types/providers.TransactionRequest, 'to'> */
trait OmitTransactionRequestto extends StObject {
  
  var accessList: js.UndefOr[Null | AccessListish] = js.undefined
  
  var blockTag: js.UndefOr[typings.ethers.typesProvidersProviderMod.BlockTag] = js.undefined
  
  var chainId: js.UndefOr[Null | BigNumberish] = js.undefined
  
  var customData: js.UndefOr[Any] = js.undefined
  
  var data: js.UndefOr[Null | String] = js.undefined
  
  var enableCcipRead: js.UndefOr[Boolean] = js.undefined
  
  var from: js.UndefOr[Null | AddressLike] = js.undefined
  
  var gasLimit: js.UndefOr[Null | BigNumberish] = js.undefined
  
  var gasPrice: js.UndefOr[Null | BigNumberish] = js.undefined
  
  var maxFeePerGas: js.UndefOr[Null | BigNumberish] = js.undefined
  
  var maxPriorityFeePerGas: js.UndefOr[Null | BigNumberish] = js.undefined
  
  var nonce: js.UndefOr[Null | Double] = js.undefined
  
  var `type`: js.UndefOr[Null | Double] = js.undefined
  
  var value: js.UndefOr[Null | BigNumberish] = js.undefined
}
object OmitTransactionRequestto {
  
  inline def apply(): OmitTransactionRequestto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitTransactionRequestto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitTransactionRequestto] (val x: Self) extends AnyVal {
    
    inline def setAccessList(value: AccessListish): Self = StObject.set(x, "accessList", value.asInstanceOf[js.Any])
    
    inline def setAccessListNull: Self = StObject.set(x, "accessList", null)
    
    inline def setAccessListUndefined: Self = StObject.set(x, "accessList", js.undefined)
    
    inline def setAccessListVarargs(value: (AccessListEntry | (js.Tuple2[String, js.Array[String]]))*): Self = StObject.set(x, "accessList", js.Array(value*))
    
    inline def setBlockTag(value: typings.ethers.typesProvidersProviderMod.BlockTag): Self = StObject.set(x, "blockTag", value.asInstanceOf[js.Any])
    
    inline def setBlockTagUndefined: Self = StObject.set(x, "blockTag", js.undefined)
    
    inline def setChainId(value: BigNumberish): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
    
    inline def setChainIdNull: Self = StObject.set(x, "chainId", null)
    
    inline def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
    
    inline def setCustomData(value: Any): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setEnableCcipRead(value: Boolean): Self = StObject.set(x, "enableCcipRead", value.asInstanceOf[js.Any])
    
    inline def setEnableCcipReadUndefined: Self = StObject.set(x, "enableCcipRead", js.undefined)
    
    inline def setFrom(value: AddressLike): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromNull: Self = StObject.set(x, "from", null)
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setGasLimit(value: BigNumberish): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
    
    inline def setGasLimitNull: Self = StObject.set(x, "gasLimit", null)
    
    inline def setGasLimitUndefined: Self = StObject.set(x, "gasLimit", js.undefined)
    
    inline def setGasPrice(value: BigNumberish): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
    
    inline def setGasPriceNull: Self = StObject.set(x, "gasPrice", null)
    
    inline def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
    
    inline def setMaxFeePerGas(value: BigNumberish): Self = StObject.set(x, "maxFeePerGas", value.asInstanceOf[js.Any])
    
    inline def setMaxFeePerGasNull: Self = StObject.set(x, "maxFeePerGas", null)
    
    inline def setMaxFeePerGasUndefined: Self = StObject.set(x, "maxFeePerGas", js.undefined)
    
    inline def setMaxPriorityFeePerGas(value: BigNumberish): Self = StObject.set(x, "maxPriorityFeePerGas", value.asInstanceOf[js.Any])
    
    inline def setMaxPriorityFeePerGasNull: Self = StObject.set(x, "maxPriorityFeePerGas", null)
    
    inline def setMaxPriorityFeePerGasUndefined: Self = StObject.set(x, "maxPriorityFeePerGas", js.undefined)
    
    inline def setNonce(value: Double): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceNull: Self = StObject.set(x, "nonce", null)
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: BigNumberish): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
