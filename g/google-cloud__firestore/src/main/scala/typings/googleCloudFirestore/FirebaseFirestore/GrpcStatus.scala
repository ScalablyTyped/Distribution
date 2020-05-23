package typings.googleCloudFirestore.FirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GrpcStatus extends js.Object

@JSGlobal("FirebaseFirestore.GrpcStatus")
@js.native
object GrpcStatus extends js.Object {
  @js.native
  sealed trait ABORTED extends GrpcStatus
  
  @js.native
  sealed trait ALREADY_EXISTS extends GrpcStatus
  
  @js.native
  sealed trait CANCELLED extends GrpcStatus
  
  @js.native
  sealed trait DATA_LOSS extends GrpcStatus
  
  @js.native
  sealed trait DEADLINE_EXCEEDED extends GrpcStatus
  
  @js.native
  sealed trait FAILED_PRECONDITION extends GrpcStatus
  
  @js.native
  sealed trait INTERNAL extends GrpcStatus
  
  @js.native
  sealed trait INVALID_ARGUMENT extends GrpcStatus
  
  @js.native
  sealed trait NOT_FOUND extends GrpcStatus
  
  @js.native
  sealed trait OK extends GrpcStatus
  
  @js.native
  sealed trait OUT_OF_RANGE extends GrpcStatus
  
  @js.native
  sealed trait PERMISSION_DENIED extends GrpcStatus
  
  @js.native
  sealed trait RESOURCE_EXHAUSTED extends GrpcStatus
  
  @js.native
  sealed trait UNAUTHENTICATED extends GrpcStatus
  
  @js.native
  sealed trait UNAVAILABLE extends GrpcStatus
  
  @js.native
  sealed trait UNIMPLEMENTED extends GrpcStatus
  
  @js.native
  sealed trait UNKNOWN extends GrpcStatus
  
}

