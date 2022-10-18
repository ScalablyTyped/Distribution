package typings.ethereumjsTx

import typings.ethereumjsTx.distTypesMod.AccessListEIP2930TxData
import typings.ethereumjsTx.distTypesMod.FeeMarketEIP1559TxData
import typings.ethereumjsTx.distTypesMod.TxData
import typings.ethereumjsTx.distTypesMod.TxOptions
import typings.ethereumjsTx.distTypesMod.TypedTransaction
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransactionFactoryMod {
  
  @JSImport("@ethereumjs/tx/dist/transactionFactory", "TransactionFactory")
  @js.native
  /* private */ open class TransactionFactory () extends StObject
  /* static members */
  object TransactionFactory {
    
    @JSImport("@ethereumjs/tx/dist/transactionFactory", "TransactionFactory")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromBlockBodyData(data: js.Array[Buffer]): TypedTransaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBlockBodyData")(data.asInstanceOf[js.Any]).asInstanceOf[TypedTransaction]
    inline def fromBlockBodyData(data: js.Array[Buffer], txOptions: TxOptions): TypedTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBlockBodyData")(data.asInstanceOf[js.Any], txOptions.asInstanceOf[js.Any])).asInstanceOf[TypedTransaction]
    /**
      * When decoding a BlockBody, in the transactions field, a field is either:
      * A Buffer (a TypedTransaction - encoded as TransactionType || rlp(TransactionPayload))
      * A Buffer[] (Legacy Transaction)
      * This method returns the right transaction.
      *
      * @param data - A Buffer or Buffer[]
      * @param txOptions - The transaction options
      */
    inline def fromBlockBodyData(data: Buffer): TypedTransaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBlockBodyData")(data.asInstanceOf[js.Any]).asInstanceOf[TypedTransaction]
    inline def fromBlockBodyData(data: Buffer, txOptions: TxOptions): TypedTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBlockBodyData")(data.asInstanceOf[js.Any], txOptions.asInstanceOf[js.Any])).asInstanceOf[TypedTransaction]
    
    /**
      * This method tries to decode serialized data.
      *
      * @param data - The data Buffer
      * @param txOptions - The transaction options
      */
    inline def fromSerializedData(data: Buffer): TypedTransaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSerializedData")(data.asInstanceOf[js.Any]).asInstanceOf[TypedTransaction]
    inline def fromSerializedData(data: Buffer, txOptions: TxOptions): TypedTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSerializedData")(data.asInstanceOf[js.Any], txOptions.asInstanceOf[js.Any])).asInstanceOf[TypedTransaction]
    
    inline def fromTxData(txData: AccessListEIP2930TxData): TypedTransaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTxData")(txData.asInstanceOf[js.Any]).asInstanceOf[TypedTransaction]
    inline def fromTxData(txData: AccessListEIP2930TxData, txOptions: TxOptions): TypedTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTxData")(txData.asInstanceOf[js.Any], txOptions.asInstanceOf[js.Any])).asInstanceOf[TypedTransaction]
    inline def fromTxData(txData: FeeMarketEIP1559TxData): TypedTransaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTxData")(txData.asInstanceOf[js.Any]).asInstanceOf[TypedTransaction]
    inline def fromTxData(txData: FeeMarketEIP1559TxData, txOptions: TxOptions): TypedTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTxData")(txData.asInstanceOf[js.Any], txOptions.asInstanceOf[js.Any])).asInstanceOf[TypedTransaction]
    /**
      * Create a transaction from a `txData` object
      *
      * @param txData - The transaction data. The `type` field will determine which transaction type is returned (if undefined, creates a legacy transaction)
      * @param txOptions - Options to pass on to the constructor of the transaction
      */
    inline def fromTxData(txData: TxData): TypedTransaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTxData")(txData.asInstanceOf[js.Any]).asInstanceOf[TypedTransaction]
    inline def fromTxData(txData: TxData, txOptions: TxOptions): TypedTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTxData")(txData.asInstanceOf[js.Any], txOptions.asInstanceOf[js.Any])).asInstanceOf[TypedTransaction]
  }
}
