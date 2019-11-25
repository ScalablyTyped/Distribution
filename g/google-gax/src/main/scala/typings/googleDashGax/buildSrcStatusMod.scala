package typings.googleDashGax

import typings.googleDashGax.buildSrcStatusMod.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/status", JSImport.Namespace)
@js.native
object buildSrcStatusMod extends js.Object {
  @js.native
  sealed trait Status extends js.Object
  
  @js.native
  object Status extends js.Object {
    @js.native
    sealed trait ABORTED extends Status
    
    @js.native
    sealed trait ALREADY_EXISTS extends Status
    
    @js.native
    sealed trait CANCELLED extends Status
    
    @js.native
    sealed trait DATA_LOSS extends Status
    
    @js.native
    sealed trait DEADLINE_EXCEEDED extends Status
    
    @js.native
    sealed trait FAILED_PRECONDITION extends Status
    
    @js.native
    sealed trait INTERNAL extends Status
    
    @js.native
    sealed trait INVALID_ARGUMENT extends Status
    
    @js.native
    sealed trait NOT_FOUND extends Status
    
    @js.native
    sealed trait OK extends Status
    
    @js.native
    sealed trait OUT_OF_RANGE extends Status
    
    @js.native
    sealed trait PERMISSION_DENIED extends Status
    
    @js.native
    sealed trait RESOURCE_EXHAUSTED extends Status
    
    @js.native
    sealed trait UNAUTHENTICATED extends Status
    
    @js.native
    sealed trait UNAVAILABLE extends Status
    
    @js.native
    sealed trait UNIMPLEMENTED extends Status
    
    @js.native
    sealed trait UNKNOWN extends Status
    
    /* 10 */ val ABORTED: typings.googleDashGax.buildSrcStatusMod.Status.ABORTED with Double = js.native
    /* 6 */ val ALREADY_EXISTS: typings.googleDashGax.buildSrcStatusMod.Status.ALREADY_EXISTS with Double = js.native
    /* 1 */ val CANCELLED: typings.googleDashGax.buildSrcStatusMod.Status.CANCELLED with Double = js.native
    /* 15 */ val DATA_LOSS: typings.googleDashGax.buildSrcStatusMod.Status.DATA_LOSS with Double = js.native
    /* 4 */ val DEADLINE_EXCEEDED: typings.googleDashGax.buildSrcStatusMod.Status.DEADLINE_EXCEEDED with Double = js.native
    /* 9 */ val FAILED_PRECONDITION: typings.googleDashGax.buildSrcStatusMod.Status.FAILED_PRECONDITION with Double = js.native
    /* 13 */ val INTERNAL: typings.googleDashGax.buildSrcStatusMod.Status.INTERNAL with Double = js.native
    /* 3 */ val INVALID_ARGUMENT: typings.googleDashGax.buildSrcStatusMod.Status.INVALID_ARGUMENT with Double = js.native
    /* 5 */ val NOT_FOUND: typings.googleDashGax.buildSrcStatusMod.Status.NOT_FOUND with Double = js.native
    /* 0 */ val OK: typings.googleDashGax.buildSrcStatusMod.Status.OK with Double = js.native
    /* 11 */ val OUT_OF_RANGE: typings.googleDashGax.buildSrcStatusMod.Status.OUT_OF_RANGE with Double = js.native
    /* 7 */ val PERMISSION_DENIED: typings.googleDashGax.buildSrcStatusMod.Status.PERMISSION_DENIED with Double = js.native
    /* 8 */ val RESOURCE_EXHAUSTED: typings.googleDashGax.buildSrcStatusMod.Status.RESOURCE_EXHAUSTED with Double = js.native
    /* 16 */ val UNAUTHENTICATED: typings.googleDashGax.buildSrcStatusMod.Status.UNAUTHENTICATED with Double = js.native
    /* 14 */ val UNAVAILABLE: typings.googleDashGax.buildSrcStatusMod.Status.UNAVAILABLE with Double = js.native
    /* 12 */ val UNIMPLEMENTED: typings.googleDashGax.buildSrcStatusMod.Status.UNIMPLEMENTED with Double = js.native
    /* 2 */ val UNKNOWN: typings.googleDashGax.buildSrcStatusMod.Status.UNKNOWN with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
  }
  
}

