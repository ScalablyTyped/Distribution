package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidmanagement.AnonAccesstokenAltBearertokenCallbackFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebTokensResource extends js.Object {
  /** Creates a web token to access an embeddable managed Google Play web UI for a given enterprise. */
  def create(request: AnonAccesstokenAltBearertokenCallbackFieldsKey): Request_[WebToken]
}

object WebTokensResource {
  @scala.inline
  def apply(create: AnonAccesstokenAltBearertokenCallbackFieldsKey => Request_[WebToken]): WebTokensResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
  
    __obj.asInstanceOf[WebTokensResource]
  }
}

