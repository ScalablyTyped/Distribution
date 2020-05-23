package typings.dropboxjs.Dropbox.AuthDriver

import typings.dropboxjs.Dropbox.Client
import typings.dropboxjs.Dropbox.QueryParamsCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Redirect extends js.Object {
  def doAuthorize(authUrl: String, stateParam: String, client: Client): Unit
  def resumeAuthorize(stateParam: String, client: Client, callback: QueryParamsCallback): Unit
  def url(): String
}

object Redirect {
  @scala.inline
  def apply(
    doAuthorize: (String, String, Client) => Unit,
    resumeAuthorize: (String, Client, QueryParamsCallback) => Unit,
    url: () => String
  ): Redirect = {
    val __obj = js.Dynamic.literal(doAuthorize = js.Any.fromFunction3(doAuthorize), resumeAuthorize = js.Any.fromFunction3(resumeAuthorize), url = js.Any.fromFunction0(url))
    __obj.asInstanceOf[Redirect]
  }
}

