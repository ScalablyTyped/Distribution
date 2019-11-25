package typings.googleDashGax.googleDashGaxMod

import typings.googleDashAuthDashLibrary.TypeofClassDefaultTransporter
import typings.googleDashAuthDashLibrary.buildSrcAuthGoogleauthMod.GoogleAuthOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "GoogleAuth")
@js.native
class GoogleAuth ()
  extends typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.GoogleAuth {
  def this(opts: GoogleAuthOptions) = this()
}

/* static members */
@JSImport("google-gax", "GoogleAuth")
@js.native
object GoogleAuth extends js.Object {
  /**
    * Export DefaultTransporter as a static property of the class.
    */
  var DefaultTransporter: TypeofClassDefaultTransporter = js.native
}

