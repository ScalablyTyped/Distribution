package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiTransactionOptionsMod.TransactionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcApiTransactionMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/api/transaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/api/transaction", "Transaction")
  @js.native
  open class Transaction protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiTransactionMod.Transaction {
    /** @hideconstructor */
    def this(
      _firestore: Firestore,
      _transaction: typings.firebaseFirestore.distPackagesFirestoreSrcCoreTransactionMod.Transaction
    ) = this()
  }
  
  inline def runTransaction[T](firestore: Firestore, updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[T]]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def runTransaction[T](
    firestore: Firestore,
    updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[T]],
    options: TransactionOptions
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
