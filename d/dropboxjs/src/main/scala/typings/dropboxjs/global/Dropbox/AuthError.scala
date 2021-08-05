package typings.dropboxjs.global.Dropbox

import typings.dropboxjs.Dropbox.QueryParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Dropbox.AuthError")
@js.native
class AuthError protected ()
  extends StObject
     with typings.dropboxjs.Dropbox.AuthError {
  def this(queryString: QueryParams) = this()
  
  /* CompleteClass */
  var code: String = js.native
  
  /* CompleteClass */
  var description: String = js.native
  
  /* CompleteClass */
  var uri: String = js.native
}
object AuthError {
  
  @JSGlobal("Dropbox.AuthError")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Dropbox.AuthError.ACCESS_DENIED")
  @js.native
  def ACCESS_DENIED: String = js.native
  inline def ACCESS_DENIED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACCESS_DENIED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Dropbox.AuthError.INVALID_GRANT")
  @js.native
  def INVALID_GRANT: String = js.native
  inline def INVALID_GRANT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_GRANT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Dropbox.AuthError.INVALID_REQUEST")
  @js.native
  def INVALID_REQUEST: String = js.native
  inline def INVALID_REQUEST_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_REQUEST")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Dropbox.AuthError.INVALID_SCOPE")
  @js.native
  def INVALID_SCOPE: String = js.native
  inline def INVALID_SCOPE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_SCOPE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Dropbox.AuthError.SERVER_ERROR")
  @js.native
  def SERVER_ERROR: String = js.native
  inline def SERVER_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SERVER_ERROR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Dropbox.AuthError.TEMPORARILY_UNAVAILABLE")
  @js.native
  def TEMPORARILY_UNAVAILABLE: String = js.native
  inline def TEMPORARILY_UNAVAILABLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEMPORARILY_UNAVAILABLE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Dropbox.AuthError.UNAUTHORIZED_CLIENT")
  @js.native
  def UNAUTHORIZED_CLIENT: String = js.native
  inline def UNAUTHORIZED_CLIENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNAUTHORIZED_CLIENT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Dropbox.AuthError.UNSUPPORTED_GRANT_TYPE")
  @js.native
  def UNSUPPORTED_GRANT_TYPE: String = js.native
  inline def UNSUPPORTED_GRANT_TYPE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSUPPORTED_GRANT_TYPE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Dropbox.AuthError.UNSUPPORTED_RESPONSE_TYPE")
  @js.native
  def UNSUPPORTED_RESPONSE_TYPE: String = js.native
  inline def UNSUPPORTED_RESPONSE_TYPE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSUPPORTED_RESPONSE_TYPE")(x.asInstanceOf[js.Any])
}
