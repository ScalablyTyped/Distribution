package typings.firebaseFirestore

import typings.firebaseFirestore.srcLiteApiUserDataReaderMod.ParsedSetData
import typings.firebaseFirestore.srcLiteApiUserDataReaderMod.ParsedUpdateData
import typings.firebaseFirestore.srcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.srcModelDocumentMod.Document
import typings.firebaseFirestore.srcRemoteDatastoreMod.Datastore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firestoreSrcCoreTransactionMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/core/transaction", "Transaction")
  @js.native
  open class Transaction protected () extends StObject {
    def this(datastore: Datastore) = this()
    
    def commit(): js.Promise[Unit] = js.native
    
    /* private */ var committed: Any = js.native
    
    /* private */ var datastore: Any = js.native
    
    def delete(key: DocumentKey): Unit = js.native
    
    /* private */ var ensureCommitNotCalled: Any = js.native
    
    /**
      * A deferred usage error that occurred previously in this transaction that
      * will cause the transaction to fail once it actually commits.
      */
    /* private */ var lastWriteError: Any = js.native
    
    def lookup(keys: js.Array[DocumentKey]): js.Promise[js.Array[Document]] = js.native
    
    /* private */ var mutations: Any = js.native
    
    /**
      * Returns the version of this document when it was read in this transaction,
      * as a precondition, or no precondition if it was not read.
      */
    /* private */ var precondition: Any = js.native
    
    /**
      * Returns the precondition for a document if the operation is an update.
      */
    /* private */ var preconditionForUpdate: Any = js.native
    
    /* private */ var readVersions: Any = js.native
    
    /* private */ var recordVersion: Any = js.native
    
    def set(key: DocumentKey, data: ParsedSetData): Unit = js.native
    
    def update(key: DocumentKey, data: ParsedUpdateData): Unit = js.native
    
    /* private */ var write: Any = js.native
    
    /**
      * Set of documents that have been written in the transaction.
      *
      * When there's more than one write to the same key in a transaction, any
      * writes after the first are handled differently.
      */
    /* private */ var writtenDocs: Any = js.native
  }
}
