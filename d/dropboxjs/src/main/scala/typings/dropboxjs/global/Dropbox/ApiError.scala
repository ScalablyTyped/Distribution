package typings.dropboxjs.global.Dropbox

import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Dropbox.ApiError")
@js.native
open class ApiError protected ()
  extends StObject
     with typings.dropboxjs.Dropbox.ApiError {
  def this(xhr: XMLHttpRequest, method: String, url: String) = this()
  
  /* CompleteClass */
  var method: String = js.native
  
  /* CompleteClass */
  var responseText: String = js.native
  
  /* CompleteClass */
  var status: Double = js.native
  
  /* CompleteClass */
  var url: String = js.native
}
object ApiError {
  
  @JSGlobal("Dropbox.ApiError")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Dropbox.ApiError.CONFLICT")
  @js.native
  def CONFLICT: Double = js.native
  inline def CONFLICT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONFLICT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Dropbox.ApiError.INVALID_METHOD")
  @js.native
  def INVALID_METHOD: Double = js.native
  inline def INVALID_METHOD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_METHOD")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Dropbox.ApiError.INVALID_PARAM")
  @js.native
  def INVALID_PARAM: Double = js.native
  inline def INVALID_PARAM_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_PARAM")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Dropbox.ApiError.INVALID_TOKEN")
  @js.native
  def INVALID_TOKEN: Double = js.native
  inline def INVALID_TOKEN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_TOKEN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Dropbox.ApiError.NETWORK_ERROR")
  @js.native
  def NETWORK_ERROR: Double = js.native
  inline def NETWORK_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NETWORK_ERROR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Dropbox.ApiError.NOT_ACCEPTABLE")
  @js.native
  def NOT_ACCEPTABLE: Double = js.native
  inline def NOT_ACCEPTABLE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_ACCEPTABLE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Dropbox.ApiError.NOT_FOUND")
  @js.native
  def NOT_FOUND: Double = js.native
  inline def NOT_FOUND_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_FOUND")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Dropbox.ApiError.NO_CONTENT")
  @js.native
  def NO_CONTENT: Double = js.native
  inline def NO_CONTENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_CONTENT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Dropbox.ApiError.OAUTH_ERROR")
  @js.native
  def OAUTH_ERROR: Double = js.native
  inline def OAUTH_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OAUTH_ERROR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Dropbox.ApiError.OVER_QUOTA")
  @js.native
  def OVER_QUOTA: Double = js.native
  inline def OVER_QUOTA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OVER_QUOTA")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Dropbox.ApiError.RATE_LIMITED")
  @js.native
  def RATE_LIMITED: Double = js.native
  inline def RATE_LIMITED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RATE_LIMITED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Dropbox.ApiError.SERVER_ERROR")
  @js.native
  def SERVER_ERROR: Double = js.native
  inline def SERVER_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SERVER_ERROR")(x.asInstanceOf[js.Any])
}
