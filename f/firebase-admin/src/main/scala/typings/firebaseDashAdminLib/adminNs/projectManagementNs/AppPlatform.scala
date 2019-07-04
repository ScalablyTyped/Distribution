package typings
package firebaseDashAdminLib.adminNs.projectManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppPlatform extends js.Object

/**
  * Platforms with which a Firebase App can be associated.
  */
@JSGlobal("admin.projectManagement.AppPlatform")
@js.native
object AppPlatform extends js.Object {
  /**
    * The Firebase App is associated with Android.
    */
  @js.native
  sealed trait ANDROID
    extends firebaseDashAdminLib.adminNs.projectManagementNs.AppPlatform
  
  /**
    * The Firebase App is associated with iOS.
    */
  @js.native
  sealed trait IOS
    extends firebaseDashAdminLib.adminNs.projectManagementNs.AppPlatform
  
  /**
    * Unknown state. This is only used for distinguishing unset values.
    */
  @js.native
  sealed trait PLATFORM_UNKNOWN
    extends firebaseDashAdminLib.adminNs.projectManagementNs.AppPlatform
  
  /* "ANDROID" */ val ANDROID: ANDROID with java.lang.String = js.native
  /* "IOS" */ val IOS: IOS with java.lang.String = js.native
  /* "PLATFORM_UNKNOWN" */ val PLATFORM_UNKNOWN: PLATFORM_UNKNOWN with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    firebaseDashAdminLib.adminNs.projectManagementNs.AppPlatform with java.lang.String
  ] = js.native
}

