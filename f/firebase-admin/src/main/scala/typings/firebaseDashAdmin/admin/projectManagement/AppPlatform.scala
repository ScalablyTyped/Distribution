package typings.firebaseDashAdmin.admin.projectManagement

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AppPlatform with String] = js.native
  /* "ANDROID" */ @js.native
  object ANDROID extends TopLevel[ANDROID with String]
  
  /* "IOS" */ @js.native
  object IOS extends TopLevel[IOS with String]
  
  /* "PLATFORM_UNKNOWN" */ @js.native
  object PLATFORM_UNKNOWN extends TopLevel[PLATFORM_UNKNOWN with String]
  
}

