package typings.evernote.mod.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PremiumOrderStatus extends StObject
@JSImport("evernote", "Types.PremiumOrderStatus")
@js.native
object PremiumOrderStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PremiumOrderStatus & Double] = js.native
  
  @js.native
  sealed trait ACTIVE
    extends StObject
       with PremiumOrderStatus
  /* 2 */ val ACTIVE: typings.evernote.mod.Types.PremiumOrderStatus.ACTIVE & Double = js.native
  
  @js.native
  sealed trait CANCELED
    extends StObject
       with PremiumOrderStatus
  /* 5 */ val CANCELED: typings.evernote.mod.Types.PremiumOrderStatus.CANCELED & Double = js.native
  
  @js.native
  sealed trait CANCELLATION_PENDING
    extends StObject
       with PremiumOrderStatus
  /* 4 */ val CANCELLATION_PENDING: typings.evernote.mod.Types.PremiumOrderStatus.CANCELLATION_PENDING & Double = js.native
  
  @js.native
  sealed trait FAILED
    extends StObject
       with PremiumOrderStatus
  /* 3 */ val FAILED: typings.evernote.mod.Types.PremiumOrderStatus.FAILED & Double = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with PremiumOrderStatus
  /* 0 */ val NONE: typings.evernote.mod.Types.PremiumOrderStatus.NONE & Double = js.native
  
  @js.native
  sealed trait PENDING
    extends StObject
       with PremiumOrderStatus
  /* 1 */ val PENDING: typings.evernote.mod.Types.PremiumOrderStatus.PENDING & Double = js.native
}
