package typings.googleCloudFirestore.FirebaseFirestore

import typings.googleCloudFirestore.googleCloudFirestoreStrings.create
import typings.googleCloudFirestore.googleCloudFirestoreStrings.delete
import typings.googleCloudFirestore.googleCloudFirestoreStrings.set
import typings.googleCloudFirestore.googleCloudFirestoreStrings.update
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkWriterError
  extends StObject
     with Error {
  
  /** The status code of the error. */
  val code: GrpcStatus
  
  /** The document reference the operation was performed on. */
  val documentRef: DocumentReference[Any]
  
  /** How many times this operation has been attempted unsuccessfully. */
  val failedAttempts: Double
  
  /** The type of operation performed. */
  val operationType: create | set | update | delete
}
object BulkWriterError {
  
  inline def apply(
    code: GrpcStatus,
    documentRef: DocumentReference[Any],
    failedAttempts: Double,
    message: String,
    name: String,
    operationType: create | set | update | delete
  ): BulkWriterError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], documentRef = documentRef.asInstanceOf[js.Any], failedAttempts = failedAttempts.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriterError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BulkWriterError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: GrpcStatus): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDocumentRef(value: DocumentReference[Any]): Self = StObject.set(x, "documentRef", value.asInstanceOf[js.Any])
    
    inline def setFailedAttempts(value: Double): Self = StObject.set(x, "failedAttempts", value.asInstanceOf[js.Any])
    
    inline def setOperationType(value: create | set | update | delete): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
  }
}
