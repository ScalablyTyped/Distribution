package typings.ethereumjsTx

import typings.ethereumjsCommon.mod.Common
import typings.ethereumjsUtil.typesMod.AddressLike
import typings.ethereumjsUtil.typesMod.BigIntLike
import typings.ethereumjsUtil.typesMod.BufferLike
import typings.ethereumjsUtil.typesMod.PrefixedHexString
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("@ethereumjs/tx/dist/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Capability extends StObject
  @JSImport("@ethereumjs/tx/dist/types", "Capability")
  @js.native
  object Capability extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Capability & Double] = js.native
    
    /**
      * Tx supports EIP-1559 gas fee market mechanism
      * See: [1559](https://eips.ethereum.org/EIPS/eip-1559) Fee Market EIP
      */
    @js.native
    sealed trait EIP1559FeeMarket
      extends StObject
         with Capability
    /* 1559 */ val EIP1559FeeMarket: typings.ethereumjsTx.typesMod.Capability.EIP1559FeeMarket & Double = js.native
    
    /**
      * Tx supports EIP-155 replay protection
      * See: [155](https://eips.ethereum.org/EIPS/eip-155) Replay Attack Protection EIP
      */
    @js.native
    sealed trait EIP155ReplayProtection
      extends StObject
         with Capability
    /* 155 */ val EIP155ReplayProtection: typings.ethereumjsTx.typesMod.Capability.EIP155ReplayProtection & Double = js.native
    
    /**
      * Tx is a typed transaction as defined in EIP-2718
      * See: [2718](https://eips.ethereum.org/EIPS/eip-2718) Transaction Type EIP
      */
    @js.native
    sealed trait EIP2718TypedTransaction
      extends StObject
         with Capability
    /* 2718 */ val EIP2718TypedTransaction: typings.ethereumjsTx.typesMod.Capability.EIP2718TypedTransaction & Double = js.native
    
    /**
      * Tx supports access list generation as defined in EIP-2930
      * See: [2930](https://eips.ethereum.org/EIPS/eip-2930) Access Lists EIP
      */
    @js.native
    sealed trait EIP2930AccessLists
      extends StObject
         with Capability
    /* 2930 */ val EIP2930AccessLists: typings.ethereumjsTx.typesMod.Capability.EIP2930AccessLists & Double = js.native
  }
  
  inline def isAccessList(input: AccessList | AccessListBuffer): /* is @ethereumjs/tx.@ethereumjs/tx/dist/types.AccessList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAccessList")(input.asInstanceOf[js.Any]).asInstanceOf[/* is @ethereumjs/tx.@ethereumjs/tx/dist/types.AccessList */ Boolean]
  
  inline def isAccessListBuffer(input: AccessList | AccessListBuffer): /* is @ethereumjs/tx.@ethereumjs/tx/dist/types.AccessListBuffer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAccessListBuffer")(input.asInstanceOf[js.Any]).asInstanceOf[/* is @ethereumjs/tx.@ethereumjs/tx/dist/types.AccessListBuffer */ Boolean]
  
  type AccessList = js.Array[AccessListItem]
  
  type AccessListBuffer = js.Array[AccessListBufferItem]
  
  type AccessListBufferItem = js.Tuple2[Buffer, js.Array[Buffer]]
  
  trait AccessListEIP2930TxData
    extends StObject
       with TxData {
    
    /**
      * The access list which contains the addresses/storage slots which the transaction wishes to access
      */
    var accessList: js.UndefOr[AccessListBuffer | AccessList] = js.undefined
    
    /**
      * The transaction's chain ID
      */
    var chainId: js.UndefOr[BigIntLike] = js.undefined
  }
  object AccessListEIP2930TxData {
    
    inline def apply(): AccessListEIP2930TxData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccessListEIP2930TxData]
    }
    
    extension [Self <: AccessListEIP2930TxData](x: Self) {
      
      inline def setAccessList(value: AccessListBuffer | AccessList): Self = StObject.set(x, "accessList", value.asInstanceOf[js.Any])
      
      inline def setAccessListUndefined: Self = StObject.set(x, "accessList", js.undefined)
      
      inline def setAccessListVarargs(value: (AccessListBufferItem | AccessListItem)*): Self = StObject.set(x, "accessList", js.Array(value*))
      
      inline def setChainId(value: BigIntLike): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      inline def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
    }
  }
  
  type AccessListEIP2930ValuesArray = js.Tuple11[
    Buffer, 
    Buffer, 
    Buffer, 
    Buffer, 
    Buffer, 
    Buffer, 
    Buffer, 
    AccessListBuffer, 
    js.UndefOr[Buffer], 
    js.UndefOr[Buffer], 
    js.UndefOr[Buffer]
  ]
  
  trait AccessListItem extends StObject {
    
    var address: PrefixedHexString
    
    var storageKeys: js.Array[PrefixedHexString]
  }
  object AccessListItem {
    
    inline def apply(address: PrefixedHexString, storageKeys: js.Array[PrefixedHexString]): AccessListItem = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], storageKeys = storageKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessListItem]
    }
    
    extension [Self <: AccessListItem](x: Self) {
      
      inline def setAddress(value: PrefixedHexString): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setStorageKeys(value: js.Array[PrefixedHexString]): Self = StObject.set(x, "storageKeys", value.asInstanceOf[js.Any])
      
      inline def setStorageKeysVarargs(value: PrefixedHexString*): Self = StObject.set(x, "storageKeys", js.Array(value*))
    }
  }
  
  trait FeeMarketEIP1559TxData
    extends StObject
       with AccessListEIP2930TxData {
    
    /**
      * The transaction's gas price, inherited from {@link Transaction}.  This property is not used for EIP1559
      * transactions and should always be undefined for this specific transaction type.
      */
    @JSName("gasPrice")
    var gasPrice_FeeMarketEIP1559TxData: js.UndefOr[scala.Nothing] = js.undefined
    
    /**
      * The maximum total fee
      */
    var maxFeePerGas: js.UndefOr[BigIntLike] = js.undefined
    
    /**
      * The maximum inclusion fee per gas (this fee is given to the miner)
      */
    var maxPriorityFeePerGas: js.UndefOr[BigIntLike] = js.undefined
  }
  object FeeMarketEIP1559TxData {
    
    inline def apply(): FeeMarketEIP1559TxData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeeMarketEIP1559TxData]
    }
    
    extension [Self <: FeeMarketEIP1559TxData](x: Self) {
      
      inline def setMaxFeePerGas(value: BigIntLike): Self = StObject.set(x, "maxFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setMaxFeePerGasUndefined: Self = StObject.set(x, "maxFeePerGas", js.undefined)
      
      inline def setMaxPriorityFeePerGas(value: BigIntLike): Self = StObject.set(x, "maxPriorityFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setMaxPriorityFeePerGasUndefined: Self = StObject.set(x, "maxPriorityFeePerGas", js.undefined)
    }
  }
  
  type FeeMarketEIP1559ValuesArray = js.Tuple12[
    Buffer, 
    Buffer, 
    Buffer, 
    Buffer, 
    Buffer, 
    Buffer, 
    Buffer, 
    Buffer, 
    AccessListBuffer, 
    js.UndefOr[Buffer], 
    js.UndefOr[Buffer], 
    js.UndefOr[Buffer]
  ]
  
  trait JsonAccessListItem extends StObject {
    
    var address: String
    
    var storageKeys: js.Array[String]
  }
  object JsonAccessListItem {
    
    inline def apply(address: String, storageKeys: js.Array[String]): JsonAccessListItem = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], storageKeys = storageKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonAccessListItem]
    }
    
    extension [Self <: JsonAccessListItem](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setStorageKeys(value: js.Array[String]): Self = StObject.set(x, "storageKeys", value.asInstanceOf[js.Any])
      
      inline def setStorageKeysVarargs(value: String*): Self = StObject.set(x, "storageKeys", js.Array(value*))
    }
  }
  
  trait JsonRpcTx extends StObject {
    
    var accessList: js.UndefOr[js.Array[JsonAccessListItem]] = js.undefined
    
    var blockHash: String | Null
    
    var blockNumber: String | Null
    
    var chainId: js.UndefOr[String] = js.undefined
    
    var from: String
    
    var gas: String
    
    var gasPrice: String
    
    var hash: String
    
    var input: String
    
    var maxFeePerGas: js.UndefOr[String] = js.undefined
    
    var maxPriorityFeePerGas: js.UndefOr[String] = js.undefined
    
    var nonce: String
    
    var r: String
    
    var s: String
    
    var to: String | Null
    
    var transactionIndex: String | Null
    
    var `type`: String
    
    var v: String
    
    var value: String
  }
  object JsonRpcTx {
    
    inline def apply(
      from: String,
      gas: String,
      gasPrice: String,
      hash: String,
      input: String,
      nonce: String,
      r: String,
      s: String,
      `type`: String,
      v: String,
      value: String
    ): JsonRpcTx = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], gas = gas.asInstanceOf[js.Any], gasPrice = gasPrice.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], blockHash = null, blockNumber = null, to = null, transactionIndex = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonRpcTx]
    }
    
    extension [Self <: JsonRpcTx](x: Self) {
      
      inline def setAccessList(value: js.Array[JsonAccessListItem]): Self = StObject.set(x, "accessList", value.asInstanceOf[js.Any])
      
      inline def setAccessListUndefined: Self = StObject.set(x, "accessList", js.undefined)
      
      inline def setAccessListVarargs(value: JsonAccessListItem*): Self = StObject.set(x, "accessList", js.Array(value*))
      
      inline def setBlockHash(value: String): Self = StObject.set(x, "blockHash", value.asInstanceOf[js.Any])
      
      inline def setBlockHashNull: Self = StObject.set(x, "blockHash", null)
      
      inline def setBlockNumber(value: String): Self = StObject.set(x, "blockNumber", value.asInstanceOf[js.Any])
      
      inline def setBlockNumberNull: Self = StObject.set(x, "blockNumber", null)
      
      inline def setChainId(value: String): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      inline def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setGas(value: String): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
      
      inline def setGasPrice(value: String): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setMaxFeePerGas(value: String): Self = StObject.set(x, "maxFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setMaxFeePerGasUndefined: Self = StObject.set(x, "maxFeePerGas", js.undefined)
      
      inline def setMaxPriorityFeePerGas(value: String): Self = StObject.set(x, "maxPriorityFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setMaxPriorityFeePerGasUndefined: Self = StObject.set(x, "maxPriorityFeePerGas", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToNull: Self = StObject.set(x, "to", null)
      
      inline def setTransactionIndex(value: String): Self = StObject.set(x, "transactionIndex", value.asInstanceOf[js.Any])
      
      inline def setTransactionIndexNull: Self = StObject.set(x, "transactionIndex", null)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait JsonTx extends StObject {
    
    var accessList: js.UndefOr[js.Array[JsonAccessListItem]] = js.undefined
    
    var chainId: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[String] = js.undefined
    
    var gasLimit: js.UndefOr[String] = js.undefined
    
    var gasPrice: js.UndefOr[String] = js.undefined
    
    var maxFeePerGas: js.UndefOr[String] = js.undefined
    
    var maxPriorityFeePerGas: js.UndefOr[String] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var r: js.UndefOr[String] = js.undefined
    
    var s: js.UndefOr[String] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var v: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object JsonTx {
    
    inline def apply(): JsonTx = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonTx]
    }
    
    extension [Self <: JsonTx](x: Self) {
      
      inline def setAccessList(value: js.Array[JsonAccessListItem]): Self = StObject.set(x, "accessList", value.asInstanceOf[js.Any])
      
      inline def setAccessListUndefined: Self = StObject.set(x, "accessList", js.undefined)
      
      inline def setAccessListVarargs(value: JsonAccessListItem*): Self = StObject.set(x, "accessList", js.Array(value*))
      
      inline def setChainId(value: String): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      inline def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setGasLimit(value: String): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      inline def setGasLimitUndefined: Self = StObject.set(x, "gasLimit", js.undefined)
      
      inline def setGasPrice(value: String): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      inline def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      inline def setMaxFeePerGas(value: String): Self = StObject.set(x, "maxFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setMaxFeePerGasUndefined: Self = StObject.set(x, "maxFeePerGas", js.undefined)
      
      inline def setMaxPriorityFeePerGas(value: String): Self = StObject.set(x, "maxPriorityFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setMaxPriorityFeePerGasUndefined: Self = StObject.set(x, "maxPriorityFeePerGas", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      inline def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait TxData extends StObject {
    
    /**
      * This will contain the data of the message or the init of a contract.
      */
    var data: js.UndefOr[BufferLike] = js.undefined
    
    /**
      * The transaction's gas limit.
      */
    var gasLimit: js.UndefOr[BigIntLike] = js.undefined
    
    /**
      * The transaction's gas price.
      */
    var gasPrice: js.UndefOr[BigIntLike] = js.undefined
    
    /**
      * The transaction's nonce.
      */
    var nonce: js.UndefOr[BigIntLike] = js.undefined
    
    /**
      * EC signature parameter.
      */
    var r: js.UndefOr[BigIntLike] = js.undefined
    
    /**
      * EC signature parameter.
      */
    var s: js.UndefOr[BigIntLike] = js.undefined
    
    /**
      * The transaction's the address is sent to.
      */
    var to: js.UndefOr[AddressLike] = js.undefined
    
    /**
      * The transaction type
      */
    var `type`: js.UndefOr[BigIntLike] = js.undefined
    
    /**
      * EC recovery ID.
      */
    var v: js.UndefOr[BigIntLike] = js.undefined
    
    /**
      * The amount of Ether sent.
      */
    var value: js.UndefOr[BigIntLike] = js.undefined
  }
  object TxData {
    
    inline def apply(): TxData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TxData]
    }
    
    extension [Self <: TxData](x: Self) {
      
      inline def setData(value: BufferLike): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setGasLimit(value: BigIntLike): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      inline def setGasLimitUndefined: Self = StObject.set(x, "gasLimit", js.undefined)
      
      inline def setGasPrice(value: BigIntLike): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      inline def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      inline def setNonce(value: BigIntLike): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setR(value: BigIntLike): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      inline def setS(value: BigIntLike): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      inline def setTo(value: AddressLike): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setType(value: BigIntLike): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setV(value: BigIntLike): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
      
      inline def setValue(value: BigIntLike): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait TxOptions extends StObject {
    
    /**
      * A {@link Common} object defining the chain and hardfork for the transaction.
      *
      * Object will be internally copied so that tx behavior don't incidentally
      * change on future HF changes.
      *
      * Default: {@link Common} object set to `mainnet` and the default hardfork as defined in the {@link Common} class.
      *
      * Current default hardfork: `istanbul`
      */
    var common: js.UndefOr[Common] = js.undefined
    
    /**
      * A transaction object by default gets frozen along initialization. This gives you
      * strong additional security guarantees on the consistency of the tx parameters.
      * It also enables tx hash caching when the `hash()` method is called multiple times.
      *
      * If you need to deactivate the tx freeze - e.g. because you want to subclass tx and
      * add additional properties - it is strongly encouraged that you do the freeze yourself
      * within your code instead.
      *
      * Default: true
      */
    var freeze: js.UndefOr[Boolean] = js.undefined
  }
  object TxOptions {
    
    inline def apply(): TxOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TxOptions]
    }
    
    extension [Self <: TxOptions](x: Self) {
      
      inline def setCommon(value: Common): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
      
      inline def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
      
      inline def setFreeze(value: Boolean): Self = StObject.set(x, "freeze", value.asInstanceOf[js.Any])
      
      inline def setFreezeUndefined: Self = StObject.set(x, "freeze", js.undefined)
    }
  }
  
  type TxValuesArray = js.Array[Buffer]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ethereumjsTx.legacyTransactionMod.Transaction
    - typings.ethereumjsTx.eip2930TransactionMod.AccessListEIP2930Transaction
    - typings.ethereumjsTx.eip1559TransactionMod.FeeMarketEIP1559Transaction
  */
  trait TypedTransaction extends StObject
}
