package typings.dropboxjs.Dropbox.AuthDriver

import typings.dropboxjs.Dropbox.Client
import typings.dropboxjs.Dropbox.QueryParamsCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Do not use class! TypeScript definition implementation detail : https://github.com/Microsoft/TypeScript/issues/371 */
@js.native
trait IAuthDriver extends js.Object {
  
  def doAuthorize(authUrl: String, stateParam: String, client: Client): Unit = js.native
  def doAuthorize(authUrl: String, stateParam: String, client: Client, callback: QueryParamsCallback): Unit = js.native
}
