package typings.ethereumjsTx

import typings.ethereumjsTx.distBaseTransactionMod.BaseTransaction
import typings.ethereumjsTx.distTypesMod.AccessList
import typings.ethereumjsTx.distTypesMod.AccessListBuffer
import typings.ethereumjsTx.distTypesMod.FeeMarketEIP1559TxData
import typings.ethereumjsTx.distTypesMod.FeeMarketEIP1559ValuesArray
import typings.ethereumjsTx.distTypesMod.TxOptions
import typings.ethereumjsTx.distTypesMod.TypedTransaction
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEip1559TransactionMod {
  
  @JSImport("@ethereumjs/tx/dist/eip1559Transaction", "FeeMarketEIP1559Transaction")
  @js.native
  open class FeeMarketEIP1559Transaction protected ()
    extends BaseTransaction[FeeMarketEIP1559Transaction]
       with TypedTransaction {
    /**
      * This constructor takes the values, validates them, assigns them and freezes the object.
      *
      * It is not recommended to use this constructor directly. Instead use
      * the static factory methods to assist in creating a Transaction object from
      * varying data types.
      */
    def this(txData: FeeMarketEIP1559TxData) = this()
    def this(txData: FeeMarketEIP1559TxData, opts: TxOptions) = this()
    
    val AccessListJSON: AccessList = js.native
    
    /**
      * The default HF if the tx type is active on that HF
      * or the first greater HF where the tx is active.
      *
      * @hidden
      */
    /* protected */ @JSName("DEFAULT_HARDFORK")
    var DEFAULT_HARDFORK_FeeMarketEIP1559Transaction: String = js.native
    
    val accessList: AccessListBuffer = js.native
    
    val chainId: js.BigInt = js.native
    
    def getMessageToSign(hashMessage: Boolean): Buffer = js.native
    
    def getUpfrontCost(baseFee: js.BigInt): js.BigInt = js.native
    
    val maxFeePerGas: js.BigInt = js.native
    
    val maxPriorityFeePerGas: js.BigInt = js.native
  }
  /* static members */
  object FeeMarketEIP1559Transaction {
    
    @JSImport("@ethereumjs/tx/dist/eip1559Transaction", "FeeMarketEIP1559Transaction")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Instantiate a transaction from the serialized tx.
      *
      * Format: `0x02 || rlp([chainId, nonce, maxPriorityFeePerGas, maxFeePerGas, gasLimit, to, value, data,
      * accessList, signatureYParity, signatureR, signatureS])`
      */
    inline def fromSerializedTx(serialized: Buffer): FeeMarketEIP1559Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSerializedTx")(serialized.asInstanceOf[js.Any]).asInstanceOf[FeeMarketEIP1559Transaction]
    inline def fromSerializedTx(serialized: Buffer, opts: TxOptions): FeeMarketEIP1559Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSerializedTx")(serialized.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[FeeMarketEIP1559Transaction]
    
    /**
      * Instantiate a transaction from a data dictionary.
      *
      * Format: { chainId, nonce, maxPriorityFeePerGas, maxFeePerGas, gasLimit, to, value, data,
      * accessList, v, r, s }
      *
      * Notes:
      * - `chainId` will be set automatically if not provided
      * - All parameters are optional and have some basic default values
      */
    inline def fromTxData(txData: FeeMarketEIP1559TxData): FeeMarketEIP1559Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTxData")(txData.asInstanceOf[js.Any]).asInstanceOf[FeeMarketEIP1559Transaction]
    inline def fromTxData(txData: FeeMarketEIP1559TxData, opts: TxOptions): FeeMarketEIP1559Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTxData")(txData.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[FeeMarketEIP1559Transaction]
    
    /**
      * Create a transaction from a values array.
      *
      * Format: `[chainId, nonce, maxPriorityFeePerGas, maxFeePerGas, gasLimit, to, value, data,
      * accessList, signatureYParity, signatureR, signatureS]`
      */
    inline def fromValuesArray(values: FeeMarketEIP1559ValuesArray): FeeMarketEIP1559Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValuesArray")(values.asInstanceOf[js.Any]).asInstanceOf[FeeMarketEIP1559Transaction]
    inline def fromValuesArray(values: FeeMarketEIP1559ValuesArray, opts: TxOptions): FeeMarketEIP1559Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValuesArray")(values.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[FeeMarketEIP1559Transaction]
  }
}
