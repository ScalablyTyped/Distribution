package typings.googleGax.mod

import typings.googleAuthLibrary.anon.TypeofDefaultTransporter
import typings.googleAuthLibrary.buildSrcAuthAuthclientMod.AuthClient
import typings.googleAuthLibrary.buildSrcAuthGoogleauthMod.GoogleAuthOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "GoogleAuth")
@js.native
open class GoogleAuth[T /* <: AuthClient */] ()
  extends typings.googleAuthLibrary.mod.GoogleAuth[T] {
  def this(opts: GoogleAuthOptions[T]) = this()
}
/* static members */
object GoogleAuth {
  
  @JSImport("google-gax", "GoogleAuth")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Export DefaultTransporter as a static property of the class.
    */
  @JSImport("google-gax", "GoogleAuth.DefaultTransporter")
  @js.native
  def DefaultTransporter: TypeofDefaultTransporter = js.native
  inline def DefaultTransporter_=(x: TypeofDefaultTransporter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTransporter")(x.asInstanceOf[js.Any])
}
