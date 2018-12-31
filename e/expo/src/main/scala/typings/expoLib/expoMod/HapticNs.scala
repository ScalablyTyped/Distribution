package typings
package expoLib.expoMod

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
  
  def impact(): scala.Unit = js.native
  def impact(impactStyles: ImpactStyles): scala.Unit = js.native
  def notification(): scala.Unit = js.native
  def notification(notificationType: NotificationType): scala.Unit = js.native
  /**
    * Used to let a user know when a selection change has been registered
    */
  def selection(): scala.Unit = js.native
  @js.native
  object ImpactStyles extends js.Object {
    @js.native
    sealed trait Heavy
      extends expoLib.expoMod.HapticNs.ImpactStyles
    
    @js.native
    sealed trait Light
      extends expoLib.expoMod.HapticNs.ImpactStyles
    
    @js.native
    sealed trait Medium
      extends expoLib.expoMod.HapticNs.ImpactStyles
    
    /* "heavy" */ val Heavy: Heavy with java.lang.String = js.native
    /* "light" */ val Light: Light with java.lang.String = js.native
    /* "medium" */ val Medium: Medium with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[expoLib.expoMod.HapticNs.ImpactStyles with java.lang.String] = js.native
  }
  
  @js.native
  object NotificationType extends js.Object {
    @js.native
    sealed trait Error
      extends expoLib.expoMod.HapticNs.NotificationType
    
    @js.native
    sealed trait Success
      extends expoLib.expoMod.HapticNs.NotificationType
    
    @js.native
    sealed trait Warning
      extends expoLib.expoMod.HapticNs.NotificationType
    
    /* "error" */ val Error: Error with java.lang.String = js.native
    /* "success" */ val Success: Success with java.lang.String = js.native
    /* "warning" */ val Warning: Warning with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[expoLib.expoMod.HapticNs.NotificationType with java.lang.String] = js.native
  }
  
}

