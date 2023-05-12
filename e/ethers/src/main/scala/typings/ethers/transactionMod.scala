package typings.ethers

import typings.ethers.typesCryptoMod.SigningKey
import typings.ethers.typesCryptoSignatureMod.SignatureLike
import typings.ethers.typesTransactionMod.AccessList
import typings.ethers.typesTransactionMod.AccessListish
import typings.ethers.typesTransactionTransactionMod.TransactionLike
import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object transactionMod {
  
  @JSImport("ethers/transaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ethers/transaction", "Transaction")
  @js.native
  /**
    *  Creates a new Transaction with default values.
    */
  open class Transaction ()
    extends typings.ethers.typesTransactionMod.Transaction
  /* static members */
  object Transaction {
    
    @JSImport("ethers/transaction", "Transaction")
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
  
  inline def accessListify(value: AccessListish): AccessList = ^.asInstanceOf[js.Dynamic].applyDynamic("accessListify")(value.asInstanceOf[js.Any]).asInstanceOf[AccessList]
  
  inline def computeAddress(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computeAddress")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def computeAddress(key: SigningKey): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computeAddress")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def recoverAddress(digest: BytesLike, signature: SignatureLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("recoverAddress")(digest.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[String]
}
