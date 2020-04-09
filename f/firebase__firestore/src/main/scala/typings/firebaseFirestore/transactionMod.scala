package typings.firebaseFirestore

import typings.firebaseFirestore.datastoreMod.Datastore
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.documentMod.MaybeDocument
import typings.firebaseFirestore.userDataReaderMod.ParsedSetData
import typings.firebaseFirestore.userDataReaderMod.ParsedUpdateData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/core/transaction", JSImport.Namespace)
@js.native
object transactionMod extends js.Object {
  @js.native
  class Transaction protected () extends js.Object {
    def this(datastore: Datastore) = this()
    var committed: js.Any = js.native
    var datastore: js.Any = js.native
    var ensureCommitNotCalled: js.Any = js.native
    /**
      * A deferred usage error that occurred previously in this transaction that
      * will cause the transaction to fail once it actually commits.
      */
    var lastWriteError: js.Any = js.native
    var mutations: js.Any = js.native
    /**
      * Returns the version of this document when it was read in this transaction,
      * as a precondition, or no precondition if it was not read.
      */
    var precondition: js.Any = js.native
    /**
      * Returns the precondition for a document if the operation is an update.
      */
    var preconditionForUpdate: js.Any = js.native
    var readVersions: js.Any = js.native
    var recordVersion: js.Any = js.native
    var write: js.Any = js.native
    /**
      * Set of documents that have been written in the transaction.
      *
      * When there's more than one write to the same key in a transaction, any
      * writes after the first are handled differently.
      */
    var writtenDocs: js.Any = js.native
    def commit(): js.Promise[Unit] = js.native
    def delete(key: DocumentKey): Unit = js.native
    def lookup(keys: js.Array[DocumentKey]): js.Promise[js.Array[MaybeDocument]] = js.native
    def set(key: DocumentKey, data: ParsedSetData): Unit = js.native
    def update(key: DocumentKey, data: ParsedUpdateData): Unit = js.native
  }
  
}

