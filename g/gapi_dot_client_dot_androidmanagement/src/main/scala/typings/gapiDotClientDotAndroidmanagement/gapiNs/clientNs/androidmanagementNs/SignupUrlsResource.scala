package typings.gapiDotClientDotAndroidmanagement.gapiNs.clientNs.androidmanagementNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAndroidmanagement.Anon_AccesstokenAltBearertokenCallbackCallbackUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignupUrlsResource extends js.Object {
  /** Creates an enterprise signup URL. */
  def create(request: Anon_AccesstokenAltBearertokenCallbackCallbackUrl): Request[SignupUrl]
}

object SignupUrlsResource {
  @scala.inline
  def apply(create: Anon_AccesstokenAltBearertokenCallbackCallbackUrl => Request[SignupUrl]): SignupUrlsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
  
    __obj.asInstanceOf[SignupUrlsResource]
  }
}

