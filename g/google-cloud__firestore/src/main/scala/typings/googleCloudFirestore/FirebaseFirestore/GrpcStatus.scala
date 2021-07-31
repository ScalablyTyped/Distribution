package typings.googleCloudFirestore.FirebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GrpcStatus extends StObject
@JSGlobal("FirebaseFirestore.GrpcStatus")
@js.native
object GrpcStatus extends StObject {
  
  @js.native
  sealed trait ABORTED
    extends StObject
       with GrpcStatus
  
  @js.native
  sealed trait ALREADY_EXISTS
    extends StObject
       with GrpcStatus
  
  @js.native
  sealed trait CANCELLED
    extends StObject
       with GrpcStatus
  
  @js.native
  sealed trait DATA_LOSS
    extends StObject
       with GrpcStatus
  
  @js.native
  sealed trait DEADLINE_EXCEEDED
    extends StObject
       with GrpcStatus
  
  @js.native
  sealed trait FAILED_PRECONDITION
    extends StObject
       with GrpcStatus
  
  @js.native
  sealed trait INTERNAL
    extends StObject
       with GrpcStatus
  
  @js.native
  sealed trait INVALID_ARGUMENT
    extends StObject
       with GrpcStatus
  
  @js.native
  sealed trait NOT_FOUND
    extends StObject
       with GrpcStatus
  
  @js.native
  sealed trait OK
    extends StObject
       with GrpcStatus
  
  @js.native
  sealed trait OUT_OF_RANGE
    extends StObject
       with GrpcStatus
  
  @js.native
  sealed trait PERMISSION_DENIED
    extends StObject
       with GrpcStatus
  
  @js.native
  sealed trait RESOURCE_EXHAUSTED
    extends StObject
       with GrpcStatus
  
  @js.native
  sealed trait UNAUTHENTICATED
    extends StObject
       with GrpcStatus
  
  @js.native
  sealed trait UNAVAILABLE
    extends StObject
       with GrpcStatus
  
  @js.native
  sealed trait UNIMPLEMENTED
    extends StObject
       with GrpcStatus
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with GrpcStatus
}
