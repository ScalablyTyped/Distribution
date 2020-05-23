package typings.firebaseAdmin.admin.projectManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppPlatform extends js.Object

/**
  * Platforms with which a Firebase App can be associated.
  */
@JSImport("firebase-admin/lib/project-management", "admin.projectManagement.AppPlatform")
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
  
}

