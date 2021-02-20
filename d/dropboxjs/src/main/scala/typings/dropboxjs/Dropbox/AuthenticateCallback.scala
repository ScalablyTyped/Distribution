package typings.dropboxjs.Dropbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Callbacks */
@js.native
trait AuthenticateCallback extends StObject {
  
  def apply(err: ApiError, client: Client): Unit = js.native
  def apply(err: AuthError, client: Client): Unit = js.native
}
