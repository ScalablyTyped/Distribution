package typings.firebaseFirestore.distLiteInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The result of successfully applying a mutation to the backend. */
trait MutationResult extends StObject {
  
  /**
    * The resulting fields returned from the backend after a mutation
    * containing field transforms has been committed. Contains one FieldValue
    * for each FieldTransform that was in the mutation.
    *
    * Will be empty if the mutation did not contain any field transforms.
    */
  val transformResults: js.Array[Value | Null]
  
  /**
    * The version at which the mutation was committed:
    *
    * - For most operations, this is the updateTime in the WriteResult.
    * - For deletes, the commitTime of the WriteResponse (because deletes are
    *   not stored and have no updateTime).
    *
    * Note that these versions can be different: No-op writes will not change
    * the updateTime even though the commitTime advances.
    */
  val version: SnapshotVersion
}
object MutationResult {
  
  inline def apply(transformResults: js.Array[Value | Null], version: SnapshotVersion): MutationResult = {
    val __obj = js.Dynamic.literal(transformResults = transformResults.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MutationResult] (val x: Self) extends AnyVal {
    
    inline def setTransformResults(value: js.Array[Value | Null]): Self = StObject.set(x, "transformResults", value.asInstanceOf[js.Any])
    
    inline def setTransformResultsVarargs(value: (Value | Null)*): Self = StObject.set(x, "transformResults", js.Array(value*))
    
    inline def setVersion(value: SnapshotVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
