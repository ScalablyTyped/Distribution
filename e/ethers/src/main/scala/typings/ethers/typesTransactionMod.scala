package typings.ethers

import typings.ethers.typesCryptoMod.SigningKey
import typings.ethers.typesCryptoSignatureMod.SignatureLike
import typings.ethers.typesTransactionTransactionMod.TransactionLike
import typings.ethers.typesUtilsDataMod.BytesLike
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTransactionMod {
  
  @JSImport("ethers/types/transaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ethers/types/transaction", "Transaction")
  @js.native
  /**
    *  Creates a new Transaction with default values.
    */
  open class Transaction ()
    extends typings.ethers.typesTransactionTransactionMod.Transaction
  /* static members */
  object Transaction {
    
    @JSImport("ethers/types/transaction", "Transaction")
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
  
  type AccessList = js.Array[AccessListEntry]
  
  trait AccessListEntry extends StObject {
    
    var address: String
    
    var storageKeys: js.Array[String]
  }
  object AccessListEntry {
    
    inline def apply(address: String, storageKeys: js.Array[String]): AccessListEntry = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], storageKeys = storageKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessListEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccessListEntry] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setStorageKeys(value: js.Array[String]): Self = StObject.set(x, "storageKeys", value.asInstanceOf[js.Any])
      
      inline def setStorageKeysVarargs(value: String*): Self = StObject.set(x, "storageKeys", js.Array(value*))
    }
  }
  
  type AccessListish = AccessList | (js.Array[js.Tuple2[String, js.Array[String]]]) | (Record[String, js.Array[String]])
}
