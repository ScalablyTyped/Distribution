package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CommitResponse. */
trait ICommitResponse extends StObject {
  
  /** CommitResponse commitTime */
  var commitTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** CommitResponse writeResults */
  var writeResults: js.UndefOr[js.Array[IWriteResult] | Null] = js.undefined
}
object ICommitResponse {
  
  inline def apply(): ICommitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICommitResponse]
  }
  
  extension [Self <: ICommitResponse](x: Self) {
    
    inline def setCommitTime(value: ITimestamp): Self = StObject.set(x, "commitTime", value.asInstanceOf[js.Any])
    
    inline def setCommitTimeNull: Self = StObject.set(x, "commitTime", null)
    
    inline def setCommitTimeUndefined: Self = StObject.set(x, "commitTime", js.undefined)
    
    inline def setWriteResults(value: js.Array[IWriteResult]): Self = StObject.set(x, "writeResults", value.asInstanceOf[js.Any])
    
    inline def setWriteResultsNull: Self = StObject.set(x, "writeResults", null)
    
    inline def setWriteResultsUndefined: Self = StObject.set(x, "writeResults", js.undefined)
    
    inline def setWriteResultsVarargs(value: IWriteResult*): Self = StObject.set(x, "writeResults", js.Array(value*))
  }
}
