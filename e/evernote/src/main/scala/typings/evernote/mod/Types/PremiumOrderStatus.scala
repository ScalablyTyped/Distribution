package typings.evernote.mod.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PremiumOrderStatus extends StObject
@JSImport("evernote", "Types.PremiumOrderStatus")
@js.native
object PremiumOrderStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PremiumOrderStatus with Double] = js.native
  
  @js.native
  sealed trait ACTIVE extends PremiumOrderStatus
  /* 2 */ val ACTIVE: typings.evernote.mod.Types.PremiumOrderStatus.ACTIVE with Double = js.native
  
  @js.native
  sealed trait CANCELED extends PremiumOrderStatus
  /* 5 */ val CANCELED: typings.evernote.mod.Types.PremiumOrderStatus.CANCELED with Double = js.native
  
  @js.native
  sealed trait CANCELLATION_PENDING extends PremiumOrderStatus
  /* 4 */ val CANCELLATION_PENDING: typings.evernote.mod.Types.PremiumOrderStatus.CANCELLATION_PENDING with Double = js.native
  
  @js.native
  sealed trait FAILED extends PremiumOrderStatus
  /* 3 */ val FAILED: typings.evernote.mod.Types.PremiumOrderStatus.FAILED with Double = js.native
  
  @js.native
  sealed trait NONE extends PremiumOrderStatus
  /* 0 */ val NONE: typings.evernote.mod.Types.PremiumOrderStatus.NONE with Double = js.native
  
  @js.native
  sealed trait PENDING extends PremiumOrderStatus
  /* 1 */ val PENDING: typings.evernote.mod.Types.PremiumOrderStatus.PENDING with Double = js.native
}
