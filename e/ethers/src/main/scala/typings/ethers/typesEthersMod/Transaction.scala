package typings.ethers.typesEthersMod

import typings.ethers.typesTransactionTransactionMod.TransactionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/types/ethers", "Transaction")
@js.native
/**
  *  Creates a new Transaction with default values.
  */
open class Transaction ()
  extends typings.ethers.typesTransactionMod.Transaction
/* static members */
object Transaction {
  
  @JSImport("ethers/types/ethers", "Transaction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *  Create a **Transaction** from a serialized transaction or a
    *  Transaction-like object.
    */
  inline def from(): typings.ethers.typesTransactionTransactionMod.Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[typings.ethers.typesTransactionTransactionMod.Transaction]
  inline def from(tx: String): typings.ethers.typesTransactionTransactionMod.Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(tx.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesTransactionTransactionMod.Transaction]
  inline def from(tx: TransactionLike[String]): typings.ethers.typesTransactionTransactionMod.Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(tx.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesTransactionTransactionMod.Transaction]
}
