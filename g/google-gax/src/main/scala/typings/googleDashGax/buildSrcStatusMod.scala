package typings.googleDashGax

import org.scalablytyped.runtime.TopLevel
import typings.googleDashGax.buildSrcStatusMod.Status
import typings.googleDashGax.buildSrcStatusMod.Status.ABORTED
import typings.googleDashGax.buildSrcStatusMod.Status.ALREADY_EXISTS
import typings.googleDashGax.buildSrcStatusMod.Status.CANCELLED
import typings.googleDashGax.buildSrcStatusMod.Status.DATA_LOSS
import typings.googleDashGax.buildSrcStatusMod.Status.DEADLINE_EXCEEDED
import typings.googleDashGax.buildSrcStatusMod.Status.FAILED_PRECONDITION
import typings.googleDashGax.buildSrcStatusMod.Status.INTERNAL
import typings.googleDashGax.buildSrcStatusMod.Status.INVALID_ARGUMENT
import typings.googleDashGax.buildSrcStatusMod.Status.NOT_FOUND
import typings.googleDashGax.buildSrcStatusMod.Status.OK
import typings.googleDashGax.buildSrcStatusMod.Status.OUT_OF_RANGE
import typings.googleDashGax.buildSrcStatusMod.Status.PERMISSION_DENIED
import typings.googleDashGax.buildSrcStatusMod.Status.RESOURCE_EXHAUSTED
import typings.googleDashGax.buildSrcStatusMod.Status.UNAUTHENTICATED
import typings.googleDashGax.buildSrcStatusMod.Status.UNAVAILABLE
import typings.googleDashGax.buildSrcStatusMod.Status.UNIMPLEMENTED
import typings.googleDashGax.buildSrcStatusMod.Status.UNKNOWN
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    /* 10 */ @js.native
    object ABORTED extends TopLevel[ABORTED with Double]
    
    /* 6 */ @js.native
    object ALREADY_EXISTS extends TopLevel[ALREADY_EXISTS with Double]
    
    /* 1 */ @js.native
    object CANCELLED extends TopLevel[CANCELLED with Double]
    
    /* 15 */ @js.native
    object DATA_LOSS extends TopLevel[DATA_LOSS with Double]
    
    /* 4 */ @js.native
    object DEADLINE_EXCEEDED extends TopLevel[DEADLINE_EXCEEDED with Double]
    
    /* 9 */ @js.native
    object FAILED_PRECONDITION extends TopLevel[FAILED_PRECONDITION with Double]
    
    /* 13 */ @js.native
    object INTERNAL extends TopLevel[INTERNAL with Double]
    
    /* 3 */ @js.native
    object INVALID_ARGUMENT extends TopLevel[INVALID_ARGUMENT with Double]
    
    /* 5 */ @js.native
    object NOT_FOUND extends TopLevel[NOT_FOUND with Double]
    
    /* 0 */ @js.native
    object OK extends TopLevel[OK with Double]
    
    /* 11 */ @js.native
    object OUT_OF_RANGE extends TopLevel[OUT_OF_RANGE with Double]
    
    /* 7 */ @js.native
    object PERMISSION_DENIED extends TopLevel[PERMISSION_DENIED with Double]
    
    /* 8 */ @js.native
    object RESOURCE_EXHAUSTED extends TopLevel[RESOURCE_EXHAUSTED with Double]
    
    /* 16 */ @js.native
    object UNAUTHENTICATED extends TopLevel[UNAUTHENTICATED with Double]
    
    /* 14 */ @js.native
    object UNAVAILABLE extends TopLevel[UNAVAILABLE with Double]
    
    /* 12 */ @js.native
    object UNIMPLEMENTED extends TopLevel[UNIMPLEMENTED with Double]
    
    /* 2 */ @js.native
    object UNKNOWN extends TopLevel[UNKNOWN with Double]
    
  }
  
}

