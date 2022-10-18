package typings.ethereumjsTx

import typings.ethereumjsTx.distBaseTransactionMod.BaseTransaction
import typings.ethereumjsTx.distTypesMod.AccessList
import typings.ethereumjsTx.distTypesMod.AccessListBuffer
import typings.ethereumjsTx.distTypesMod.AccessListEIP2930TxData
import typings.ethereumjsTx.distTypesMod.AccessListEIP2930ValuesArray
import typings.ethereumjsTx.distTypesMod.TxOptions
import typings.ethereumjsTx.distTypesMod.TypedTransaction
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEip2930TransactionMod {
  
  @JSImport("@ethereumjs/tx/dist/eip2930Transaction", "AccessListEIP2930Transaction")
  @js.native
  open class AccessListEIP2930Transaction protected ()
    extends BaseTransaction[AccessListEIP2930Transaction]
       with TypedTransaction {
    /**
      * This constructor takes the values, validates them, assigns them and freezes the object.
      *
      * It is not recommended to use this constructor directly. Instead use
      * the static factory methods to assist in creating a Transaction object from
      * varying data types.
      */
    def this(txData: AccessListEIP2930TxData) = this()
    def this(txData: AccessListEIP2930TxData, opts: TxOptions) = this()
    
    val AccessListJSON: AccessList = js.native
    
    /**
      * The default HF if the tx type is active on that HF
      * or the first greater HF where the tx is active.
      *
      * @hidden
      */
    /* protected */ @JSName("DEFAULT_HARDFORK")
    var DEFAULT_HARDFORK_AccessListEIP2930Transaction: String = js.native
    
    val accessList: AccessListBuffer = js.native
    
    val chainId: js.BigInt = js.native
    
    val gasPrice: js.BigInt = js.native
    
    def getMessageToSign(hashMessage: Boolean): Buffer = js.native
  }
  /* static members */
  object AccessListEIP2930Transaction {
    
    @JSImport("@ethereumjs/tx/dist/eip2930Transaction", "AccessListEIP2930Transaction")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Instantiate a transaction from the serialized tx.
      *
      * Format: `0x01 || rlp([chainId, nonce, gasPrice, gasLimit, to, value, data, accessList,
      * signatureYParity (v), signatureR (r), signatureS (s)])`
      */
    inline def fromSerializedTx(serialized: Buffer): AccessListEIP2930Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSerializedTx")(serialized.asInstanceOf[js.Any]).asInstanceOf[AccessListEIP2930Transaction]
    inline def fromSerializedTx(serialized: Buffer, opts: TxOptions): AccessListEIP2930Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSerializedTx")(serialized.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AccessListEIP2930Transaction]
    
    /**
      * Instantiate a transaction from a data dictionary.
      *
      * Format: { chainId, nonce, gasPrice, gasLimit, to, value, data, accessList,
      * v, r, s }
      *
      * Notes:
      * - `chainId` will be set automatically if not provided
      * - All parameters are optional and have some basic default values
      */
    inline def fromTxData(txData: AccessListEIP2930TxData): AccessListEIP2930Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTxData")(txData.asInstanceOf[js.Any]).asInstanceOf[AccessListEIP2930Transaction]
    inline def fromTxData(txData: AccessListEIP2930TxData, opts: TxOptions): AccessListEIP2930Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTxData")(txData.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AccessListEIP2930Transaction]
    
    /**
      * Create a transaction from a values array.
      *
      * Format: `[chainId, nonce, gasPrice, gasLimit, to, value, data, accessList,
      * signatureYParity (v), signatureR (r), signatureS (s)]`
      */
    inline def fromValuesArray(values: AccessListEIP2930ValuesArray): AccessListEIP2930Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValuesArray")(values.asInstanceOf[js.Any]).asInstanceOf[AccessListEIP2930Transaction]
    inline def fromValuesArray(values: AccessListEIP2930ValuesArray, opts: TxOptions): AccessListEIP2930Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValuesArray")(values.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AccessListEIP2930Transaction]
  }
}
