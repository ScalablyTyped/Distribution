package typings.gapiDotClientDotAndroidmanagement.gapi.client.androidmanagement

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAndroidmanagement.Anon_AccesstokenAltBearertokenCallbackFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebTokensResource extends js.Object {
  /** Creates a web token to access an embeddable managed Google Play web UI for a given enterprise. */
  def create(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[WebToken]
}

object WebTokensResource {
  @scala.inline
  def apply(create: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[WebToken]): WebTokensResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
  
    __obj.asInstanceOf[WebTokensResource]
  }
}

