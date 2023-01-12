package typings.firebaseFirestore.distLitePrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Internal transaction object responsible for accumulating the mutations to
  * perform and the base versions for any documents read.
  */
trait Transaction2 extends StObject {
  
  def commit(): js.Promise[Unit]
  
  /* private */ var committed: Any
  
  /* private */ var datastore: Any
  
  def delete(
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentKey */ Any
  ): Unit
  
  /* private */ var ensureCommitNotCalled: Any
  
  /**
    * A deferred usage error that occurred previously in this transaction that
    * will cause the transaction to fail once it actually commits.
    */
  /* private */ var lastWriteError: Any
  
  def lookup(
    keys: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentKey */ Any
    ]
  ): js.Promise[js.Array[Document2]]
  
  /* private */ var mutations: Any
  
  /**
    * Returns the version of this document when it was read in this transaction,
    * as a precondition, or no precondition if it was not read.
    */
  /* private */ var precondition: Any
  
  /**
    * Returns the precondition for a document if the operation is an update.
    */
  /* private */ var preconditionForUpdate: Any
  
  /* private */ var readVersions: Any
  
  /* private */ var recordVersion: Any
  
  def set(
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentKey */ Any,
    data: ParsedSetData
  ): Unit
  
  def update(
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentKey */ Any,
    data: ParsedUpdateData
  ): Unit
  
  /* private */ var write: Any
  
  /**
    * Set of documents that have been written in the transaction.
    *
    * When there's more than one write to the same key in a transaction, any
    * writes after the first are handled differently.
    */
  /* private */ var writtenDocs: Any
}
object Transaction2 {
  
  inline def apply(
    commit: () => js.Promise[Unit],
    committed: Any,
    datastore: Any,
    delete: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentKey */ Any => Unit,
    ensureCommitNotCalled: Any,
    lastWriteError: Any,
    lookup: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentKey */ Any
    ] => js.Promise[js.Array[Document2]],
    mutations: Any,
    precondition: Any,
    preconditionForUpdate: Any,
    readVersions: Any,
    recordVersion: Any,
    set: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentKey */ Any, ParsedSetData) => Unit,
    update: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentKey */ Any, ParsedUpdateData) => Unit,
    write: Any,
    writtenDocs: Any
  ): Transaction2 = {
    val __obj = js.Dynamic.literal(commit = js.Any.fromFunction0(commit), committed = committed.asInstanceOf[js.Any], datastore = datastore.asInstanceOf[js.Any], delete = js.Any.fromFunction1(delete), ensureCommitNotCalled = ensureCommitNotCalled.asInstanceOf[js.Any], lastWriteError = lastWriteError.asInstanceOf[js.Any], lookup = js.Any.fromFunction1(lookup), mutations = mutations.asInstanceOf[js.Any], precondition = precondition.asInstanceOf[js.Any], preconditionForUpdate = preconditionForUpdate.asInstanceOf[js.Any], readVersions = readVersions.asInstanceOf[js.Any], recordVersion = recordVersion.asInstanceOf[js.Any], set = js.Any.fromFunction2(set), update = js.Any.fromFunction2(update), write = write.asInstanceOf[js.Any], writtenDocs = writtenDocs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transaction2] (val x: Self) extends AnyVal {
    
    inline def setCommit(value: () => js.Promise[Unit]): Self = StObject.set(x, "commit", js.Any.fromFunction0(value))
    
    inline def setCommitted(value: Any): Self = StObject.set(x, "committed", value.asInstanceOf[js.Any])
    
    inline def setDatastore(value: Any): Self = StObject.set(x, "datastore", value.asInstanceOf[js.Any])
    
    inline def setDelete(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentKey */ Any => Unit
    ): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    inline def setEnsureCommitNotCalled(value: Any): Self = StObject.set(x, "ensureCommitNotCalled", value.asInstanceOf[js.Any])
    
    inline def setLastWriteError(value: Any): Self = StObject.set(x, "lastWriteError", value.asInstanceOf[js.Any])
    
    inline def setLookup(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentKey */ Any
        ] => js.Promise[js.Array[Document2]]
    ): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
    
    inline def setMutations(value: Any): Self = StObject.set(x, "mutations", value.asInstanceOf[js.Any])
    
    inline def setPrecondition(value: Any): Self = StObject.set(x, "precondition", value.asInstanceOf[js.Any])
    
    inline def setPreconditionForUpdate(value: Any): Self = StObject.set(x, "preconditionForUpdate", value.asInstanceOf[js.Any])
    
    inline def setReadVersions(value: Any): Self = StObject.set(x, "readVersions", value.asInstanceOf[js.Any])
    
    inline def setRecordVersion(value: Any): Self = StObject.set(x, "recordVersion", value.asInstanceOf[js.Any])
    
    inline def setSet(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentKey */ Any, ParsedSetData) => Unit
    ): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setUpdate(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentKey */ Any, ParsedUpdateData) => Unit
    ): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    
    inline def setWrite(value: Any): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    
    inline def setWrittenDocs(value: Any): Self = StObject.set(x, "writtenDocs", value.asInstanceOf[js.Any])
  }
}
