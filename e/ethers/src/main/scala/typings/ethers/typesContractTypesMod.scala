package typings.ethers

import org.scalablytyped.runtime.StringDictionary
import typings.ethers.anon.OmitTransactionRequestto
import typings.ethers.typesAbiMod.EventFragment
import typings.ethers.typesAbiMod.FunctionFragment
import typings.ethers.typesAbiMod.Result
import typings.ethers.typesAddressMod.AddressLike
import typings.ethers.typesContractWrappersMod.ContractTransactionResponse
import typings.ethers.typesProvidersProviderMod.BlockTag
import typings.ethers.typesProvidersProviderMod.PreparedTransactionRequest
import typings.ethers.typesProvidersProviderMod.TopicFilter
import typings.ethers.typesTransactionMod.AccessList
import typings.ethers.typesTransactionMod.AccessListEntry
import typings.ethers.typesTransactionMod.AccessListish
import typings.ethers.typesUtilsMathsMod.BigNumberish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesContractTypesMod {
  
  @js.native
  trait BaseContractMethod[A /* <: js.Array[Any] */, R, D /* <: R | ContractTransactionResponse */] extends StObject {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ContractMethodArgs<A> is not an array type */ args: ContractMethodArgs[A]
    ): js.Promise[D] = js.native
    
    def estimateGas(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ContractMethodArgs<A> is not an array type */ args: ContractMethodArgs[A]
    ): js.Promise[js.BigInt] = js.native
    
    var fragment: FunctionFragment = js.native
    
    def getFragment(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ContractMethodArgs<A> is not an array type */ args: ContractMethodArgs[A]
    ): FunctionFragment = js.native
    
    var name: String = js.native
    
    def populateTransaction(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ContractMethodArgs<A> is not an array type */ args: ContractMethodArgs[A]
    ): js.Promise[ContractTransaction] = js.native
    
    def send(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ContractMethodArgs<A> is not an array type */ args: ContractMethodArgs[A]
    ): js.Promise[ContractTransactionResponse] = js.native
    
    def staticCall(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ContractMethodArgs<A> is not an array type */ args: ContractMethodArgs[A]
    ): js.Promise[R] = js.native
    
    def staticCallResult(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ContractMethodArgs<A> is not an array type */ args: ContractMethodArgs[A]
    ): js.Promise[Result] = js.native
  }
  
  type ConstantContractMethod[A /* <: js.Array[Any] */, R] = ContractMethod[A, R, R]
  
  /* Inlined parent std.Omit<ethers.ethers/types/contract/types.ContractTransaction, 'to'> */
  trait ContractDeployTransaction extends StObject {
    
    var accessList: js.UndefOr[AccessList] = js.undefined
    
    var blockTag: js.UndefOr[BlockTag] = js.undefined
    
    var chainId: js.UndefOr[js.BigInt] = js.undefined
    
    var customData: js.UndefOr[Any] = js.undefined
    
    var data: String
    
    var enableCcipRead: js.UndefOr[Boolean] = js.undefined
    
    var from: js.UndefOr[String] = js.undefined
    
    var gasLimit: js.UndefOr[js.BigInt] = js.undefined
    
    var gasPrice: js.UndefOr[js.BigInt] = js.undefined
    
    var maxFeePerGas: js.UndefOr[js.BigInt] = js.undefined
    
    var maxPriorityFeePerGas: js.UndefOr[js.BigInt] = js.undefined
    
    var nonce: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[js.BigInt] = js.undefined
  }
  object ContractDeployTransaction {
    
    inline def apply(data: String): ContractDeployTransaction = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContractDeployTransaction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContractDeployTransaction] (val x: Self) extends AnyVal {
      
      inline def setAccessList(value: AccessList): Self = StObject.set(x, "accessList", value.asInstanceOf[js.Any])
      
      inline def setAccessListUndefined: Self = StObject.set(x, "accessList", js.undefined)
      
      inline def setAccessListVarargs(value: AccessListEntry*): Self = StObject.set(x, "accessList", js.Array(value*))
      
      inline def setBlockTag(value: BlockTag): Self = StObject.set(x, "blockTag", value.asInstanceOf[js.Any])
      
      inline def setBlockTagUndefined: Self = StObject.set(x, "blockTag", js.undefined)
      
      inline def setChainId(value: js.BigInt): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      inline def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
      
      inline def setCustomData(value: Any): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEnableCcipRead(value: Boolean): Self = StObject.set(x, "enableCcipRead", value.asInstanceOf[js.Any])
      
      inline def setEnableCcipReadUndefined: Self = StObject.set(x, "enableCcipRead", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setGasLimit(value: js.BigInt): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      inline def setGasLimitUndefined: Self = StObject.set(x, "gasLimit", js.undefined)
      
      inline def setGasPrice(value: js.BigInt): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      inline def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      inline def setMaxFeePerGas(value: js.BigInt): Self = StObject.set(x, "maxFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setMaxFeePerGasUndefined: Self = StObject.set(x, "maxFeePerGas", js.undefined)
      
      inline def setMaxPriorityFeePerGas(value: js.BigInt): Self = StObject.set(x, "maxPriorityFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setMaxPriorityFeePerGasUndefined: Self = StObject.set(x, "maxPriorityFeePerGas", js.undefined)
      
      inline def setNonce(value: Double): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: js.BigInt): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait ContractEvent[A /* <: js.Array[Any] */] extends StObject {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ContractEventArgs<A> is not an array type */ args: ContractEventArgs[A]
    ): DeferredTopicFilter = js.native
    
    var fragment: EventFragment = js.native
    
    def getFragment(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ContractEventArgs<A> is not an array type */ args: ContractEventArgs[A]
    ): EventFragment = js.native
    
    var name: String = js.native
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ I in keyof A ]:? A[I] | ethers.ethers/types/abi.Typed | null}
    }}}
    */
  @js.native
  trait ContractEventArgs[A /* <: js.Array[Any] */] extends StObject
  
  type ContractEventName = String | ContractEvent[js.Array[Any]] | TopicFilter | DeferredTopicFilter
  
  type ContractInterface = StringDictionary[BaseContractMethod[js.Array[Any], Any, Any | ContractTransactionResponse]]
  
  type ContractMethod[A /* <: js.Array[Any] */, R, D /* <: R | ContractTransactionResponse */] = BaseContractMethod[A, R, D]
  
  type ContractMethodArgs[A /* <: js.Array[Any] */] = PostfixOverrides[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ I in keyof A ]: -? A[I] | ethers.ethers/types/abi.Typed} */ js.Any
  ]
  
  trait ContractTransaction
    extends StObject
       with PreparedTransactionRequest {
    
    @JSName("data")
    var data_ContractTransaction: String
    
    @JSName("from")
    var from_ContractTransaction: js.UndefOr[String] = js.undefined
    
    @JSName("to")
    var to_ContractTransaction: String
  }
  object ContractTransaction {
    
    inline def apply(data: String, to: String): ContractTransaction = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContractTransaction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContractTransaction] (val x: Self) extends AnyVal {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeferredTopicFilter extends StObject {
    
    var fragment: EventFragment
    
    def getTopicFilter(): js.Promise[TopicFilter]
  }
  object DeferredTopicFilter {
    
    inline def apply(fragment: EventFragment, getTopicFilter: () => js.Promise[TopicFilter]): DeferredTopicFilter = {
      val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], getTopicFilter = js.Any.fromFunction0(getTopicFilter))
      __obj.asInstanceOf[DeferredTopicFilter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeferredTopicFilter] (val x: Self) extends AnyVal {
      
      inline def setFragment(value: EventFragment): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setGetTopicFilter(value: () => js.Promise[TopicFilter]): Self = StObject.set(x, "getTopicFilter", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined parent std.Omit<ethers.ethers/types/providers.TransactionRequest, 'to' | 'data'> */
  trait Overrides extends StObject {
    
    var accessList: js.UndefOr[Null | AccessListish] = js.undefined
    
    var blockTag: js.UndefOr[BlockTag] = js.undefined
    
    var chainId: js.UndefOr[Null | BigNumberish] = js.undefined
    
    var customData: js.UndefOr[Any] = js.undefined
    
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
  object Overrides {
    
    inline def apply(): Overrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Overrides]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Overrides] (val x: Self) extends AnyVal {
      
      inline def setAccessList(value: AccessListish): Self = StObject.set(x, "accessList", value.asInstanceOf[js.Any])
      
      inline def setAccessListNull: Self = StObject.set(x, "accessList", null)
      
      inline def setAccessListUndefined: Self = StObject.set(x, "accessList", js.undefined)
      
      inline def setAccessListVarargs(value: (AccessListEntry | (js.Tuple2[String, js.Array[String]]))*): Self = StObject.set(x, "accessList", js.Array(value*))
      
      inline def setBlockTag(value: BlockTag): Self = StObject.set(x, "blockTag", value.asInstanceOf[js.Any])
      
      inline def setBlockTagUndefined: Self = StObject.set(x, "blockTag", js.undefined)
      
      inline def setChainId(value: BigNumberish): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      inline def setChainIdNull: Self = StObject.set(x, "chainId", null)
      
      inline def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
      
      inline def setCustomData(value: Any): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
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
  
  type PostfixOverrides[A /* <: js.Array[Any] */] = A | (/* import warning: importer.ImportType#apply c repeated non-array type: A */ js.Array[A])
  
  @js.native
  trait WrappedFallback extends StObject {
    
    def apply(): js.Promise[ContractTransactionResponse] = js.native
    def apply(overrides: OmitTransactionRequestto): js.Promise[ContractTransactionResponse] = js.native
    
    def estimateGas(): js.Promise[js.BigInt] = js.native
    def estimateGas(overrides: OmitTransactionRequestto): js.Promise[js.BigInt] = js.native
    
    def populateTransaction(): js.Promise[ContractTransaction] = js.native
    def populateTransaction(overrides: OmitTransactionRequestto): js.Promise[ContractTransaction] = js.native
    
    def send(): js.Promise[ContractTransactionResponse] = js.native
    def send(overrides: OmitTransactionRequestto): js.Promise[ContractTransactionResponse] = js.native
    
    def staticCall(): js.Promise[String] = js.native
    def staticCall(overrides: OmitTransactionRequestto): js.Promise[String] = js.native
  }
}
