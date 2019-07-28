package typings.firebaseDashAdmin.adminNs.projectManagementNs

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
  sealed trait ANDROID extends AppPlatform
  
  /**
    * The Firebase App is associated with iOS.
    */
  @js.native
  sealed trait IOS extends AppPlatform
  
  /**
    * Unknown state. This is only used for distinguishing unset values.
    */
  @js.native
  sealed trait PLATFORM_UNKNOWN extends AppPlatform
  
  /* "ANDROID" */ val ANDROID: typings.firebaseDashAdmin.adminNs.projectManagementNs.AppPlatform.ANDROID with String = js.native
  /* "IOS" */ val IOS: typings.firebaseDashAdmin.adminNs.projectManagementNs.AppPlatform.IOS with String = js.native
  /* "PLATFORM_UNKNOWN" */ val PLATFORM_UNKNOWN: typings.firebaseDashAdmin.adminNs.projectManagementNs.AppPlatform.PLATFORM_UNKNOWN with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AppPlatform with String] = js.native
}

