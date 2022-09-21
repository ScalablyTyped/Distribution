package typings.ethereumjsTx

import typings.ethereumjsTx.baseTransactionMod.BaseTransaction
import typings.ethereumjsTx.typesMod.TxData
import typings.ethereumjsTx.typesMod.TxOptions
import typings.ethereumjsTx.typesMod.TxValuesArray
import typings.ethereumjsTx.typesMod.TypedTransaction
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legacyTransactionMod {
  
  @JSImport("@ethereumjs/tx/dist/legacyTransaction", "Transaction")
  @js.native
  open class Transaction protected ()
    extends BaseTransaction[Transaction]
       with TypedTransaction {
    /**
      * This constructor takes the values, validates them, assigns them and freezes the object.
      *
      * It is not recommended to use this constructor directly. Instead use
      * the static factory methods to assist in creating a Transaction object from
      * varying data types.
      */
    def this(txData: TxData) = this()
    def this(txData: TxData, opts: TxOptions) = this()
    
    /* private */ var _getMessageToSign: Any = js.native
    
    /**
      * Validates tx's `v` value
      */
    /* private */ var _validateTxV: Any = js.native
    
    val gasPrice: js.BigInt = js.native
  }
  /* static members */
  object Transaction {
    
    @JSImport("@ethereumjs/tx/dist/legacyTransaction", "Transaction")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Instantiate a transaction from the serialized tx.
      *
      * Format: `rlp([nonce, gasPrice, gasLimit, to, value, data, v, r, s])`
      */
    inline def fromSerializedTx(serialized: Buffer): Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSerializedTx")(serialized.asInstanceOf[js.Any]).asInstanceOf[Transaction]
    inline def fromSerializedTx(serialized: Buffer, opts: TxOptions): Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSerializedTx")(serialized.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Transaction]
    
    /**
      * Instantiate a transaction from a data dictionary.
      *
      * Format: { nonce, gasPrice, gasLimit, to, value, data, v, r, s }
      *
      * Notes:
      * - All parameters are optional and have some basic default values
      */
    inline def fromTxData(txData: TxData): Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTxData")(txData.asInstanceOf[js.Any]).asInstanceOf[Transaction]
    inline def fromTxData(txData: TxData, opts: TxOptions): Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTxData")(txData.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Transaction]
    
    /**
      * Create a transaction from a values array.
      *
      * Format: `[nonce, gasPrice, gasLimit, to, value, data, v, r, s]`
      */
    inline def fromValuesArray(values: TxValuesArray): Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValuesArray")(values.asInstanceOf[js.Any]).asInstanceOf[Transaction]
    inline def fromValuesArray(values: TxValuesArray, opts: TxOptions): Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValuesArray")(values.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Transaction]
  }
}
