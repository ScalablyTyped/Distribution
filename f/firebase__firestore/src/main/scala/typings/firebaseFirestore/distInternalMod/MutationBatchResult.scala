package typings.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The result of applying a mutation batch to the backend. */
trait MutationBatchResult extends StObject {
  
  val batch: MutationBatch
  
  val commitVersion: SnapshotVersion
  
  /**
    * A pre-computed mapping from each mutated document to the resulting
    * version.
    */
  val docVersions: DocumentVersionMap
  
  val mutationResults: js.Array[MutationResult]
}
object MutationBatchResult {
  
  inline def apply(
    batch: MutationBatch,
    commitVersion: SnapshotVersion,
    docVersions: DocumentVersionMap,
    mutationResults: js.Array[MutationResult]
  ): MutationBatchResult = {
    val __obj = js.Dynamic.literal(batch = batch.asInstanceOf[js.Any], commitVersion = commitVersion.asInstanceOf[js.Any], docVersions = docVersions.asInstanceOf[js.Any], mutationResults = mutationResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationBatchResult]
  }
  
  extension [Self <: MutationBatchResult](x: Self) {
    
    inline def setBatch(value: MutationBatch): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    inline def setCommitVersion(value: SnapshotVersion): Self = StObject.set(x, "commitVersion", value.asInstanceOf[js.Any])
    
    inline def setDocVersions(value: DocumentVersionMap): Self = StObject.set(x, "docVersions", value.asInstanceOf[js.Any])
    
    inline def setMutationResults(value: js.Array[MutationResult]): Self = StObject.set(x, "mutationResults", value.asInstanceOf[js.Any])
    
    inline def setMutationResultsVarargs(value: MutationResult*): Self = StObject.set(x, "mutationResults", js.Array(value*))
  }
}
