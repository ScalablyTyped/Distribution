package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidmanagement.AnonAccesstokenAltBearertokenCallbackCallbackUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignupUrlsResource extends js.Object {
  /** Creates an enterprise signup URL. */
  def create(request: AnonAccesstokenAltBearertokenCallbackCallbackUrl): Request_[SignupUrl]
}

object SignupUrlsResource {
  @scala.inline
  def apply(create: AnonAccesstokenAltBearertokenCallbackCallbackUrl => Request_[SignupUrl]): SignupUrlsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
  
    __obj.asInstanceOf[SignupUrlsResource]
  }
}

