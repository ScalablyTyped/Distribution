package typings.googleGax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusMod {
  
  @js.native
  sealed trait Status extends StObject
  @JSImport("google-gax/build/src/status", "Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait ABORTED extends Status
    /* 10 */ val ABORTED: typings.googleGax.statusMod.Status.ABORTED with Double = js.native
    
    @js.native
    sealed trait ALREADY_EXISTS extends Status
    /* 6 */ val ALREADY_EXISTS: typings.googleGax.statusMod.Status.ALREADY_EXISTS with Double = js.native
    
    @js.native
    sealed trait CANCELLED extends Status
    /* 1 */ val CANCELLED: typings.googleGax.statusMod.Status.CANCELLED with Double = js.native
    
    @js.native
    sealed trait DATA_LOSS extends Status
    /* 15 */ val DATA_LOSS: typings.googleGax.statusMod.Status.DATA_LOSS with Double = js.native
    
    @js.native
    sealed trait DEADLINE_EXCEEDED extends Status
    /* 4 */ val DEADLINE_EXCEEDED: typings.googleGax.statusMod.Status.DEADLINE_EXCEEDED with Double = js.native
    
    @js.native
    sealed trait FAILED_PRECONDITION extends Status
    /* 9 */ val FAILED_PRECONDITION: typings.googleGax.statusMod.Status.FAILED_PRECONDITION with Double = js.native
    
    @js.native
    sealed trait INTERNAL extends Status
    /* 13 */ val INTERNAL: typings.googleGax.statusMod.Status.INTERNAL with Double = js.native
    
    @js.native
    sealed trait INVALID_ARGUMENT extends Status
    /* 3 */ val INVALID_ARGUMENT: typings.googleGax.statusMod.Status.INVALID_ARGUMENT with Double = js.native
    
    @js.native
    sealed trait NOT_FOUND extends Status
    /* 5 */ val NOT_FOUND: typings.googleGax.statusMod.Status.NOT_FOUND with Double = js.native
    
    @js.native
    sealed trait OK extends Status
    /* 0 */ val OK: typings.googleGax.statusMod.Status.OK with Double = js.native
    
    @js.native
    sealed trait OUT_OF_RANGE extends Status
    /* 11 */ val OUT_OF_RANGE: typings.googleGax.statusMod.Status.OUT_OF_RANGE with Double = js.native
    
    @js.native
    sealed trait PERMISSION_DENIED extends Status
    /* 7 */ val PERMISSION_DENIED: typings.googleGax.statusMod.Status.PERMISSION_DENIED with Double = js.native
    
    @js.native
    sealed trait RESOURCE_EXHAUSTED extends Status
    /* 8 */ val RESOURCE_EXHAUSTED: typings.googleGax.statusMod.Status.RESOURCE_EXHAUSTED with Double = js.native
    
    @js.native
    sealed trait UNAUTHENTICATED extends Status
    /* 16 */ val UNAUTHENTICATED: typings.googleGax.statusMod.Status.UNAUTHENTICATED with Double = js.native
    
    @js.native
    sealed trait UNAVAILABLE extends Status
    /* 14 */ val UNAVAILABLE: typings.googleGax.statusMod.Status.UNAVAILABLE with Double = js.native
    
    @js.native
    sealed trait UNIMPLEMENTED extends Status
    /* 12 */ val UNIMPLEMENTED: typings.googleGax.statusMod.Status.UNIMPLEMENTED with Double = js.native
    
    @js.native
    sealed trait UNKNOWN extends Status
    /* 2 */ val UNKNOWN: typings.googleGax.statusMod.Status.UNKNOWN with Double = js.native
  }
}
