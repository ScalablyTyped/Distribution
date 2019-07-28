package typings.expo.expoMod

import typings.expo.expoMod.HapticNs.ImpactStyles
import typings.expo.expoMod.HapticNs.NotificationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Haptic")
@js.native
object HapticNs extends js.Object {
  @js.native
  sealed trait ImpactStyles extends js.Object
  
  @js.native
  sealed trait NotificationType extends js.Object
  
  def impact(): Unit = js.native
  def impact(impactStyles: ImpactStyles): Unit = js.native
  def notification(): Unit = js.native
  def notification(notificationType: NotificationType): Unit = js.native
  /**
    * Used to let a user know when a selection change has been registered
    */
  def selection(): Unit = js.native
  @js.native
  object ImpactStyles extends js.Object {
    @js.native
    sealed trait Heavy extends ImpactStyles
    
    @js.native
    sealed trait Light extends ImpactStyles
    
    @js.native
    sealed trait Medium extends ImpactStyles
    
    /* "heavy" */ val Heavy: typings.expo.expoMod.HapticNs.ImpactStyles.Heavy with String = js.native
    /* "light" */ val Light: typings.expo.expoMod.HapticNs.ImpactStyles.Light with String = js.native
    /* "medium" */ val Medium: typings.expo.expoMod.HapticNs.ImpactStyles.Medium with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ImpactStyles with String] = js.native
  }
  
  @js.native
  object NotificationType extends js.Object {
    @js.native
    sealed trait Error extends NotificationType
    
    @js.native
    sealed trait Success extends NotificationType
    
    @js.native
    sealed trait Warning extends NotificationType
    
    /* "error" */ val Error: typings.expo.expoMod.HapticNs.NotificationType.Error with String = js.native
    /* "success" */ val Success: typings.expo.expoMod.HapticNs.NotificationType.Success with String = js.native
    /* "warning" */ val Warning: typings.expo.expoMod.HapticNs.NotificationType.Warning with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[NotificationType with String] = js.native
  }
  
}

