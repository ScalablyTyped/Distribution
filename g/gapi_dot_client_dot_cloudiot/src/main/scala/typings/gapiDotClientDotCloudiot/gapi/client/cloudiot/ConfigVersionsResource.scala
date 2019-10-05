package typings.gapiDotClientDotCloudiot.gapi.client.cloudiot

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCloudiot.Anon_Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigVersionsResource extends js.Object {
  /**
    * Lists the last few versions of the device configuration in descending
    * order (i.e.: newest first).
    */
  def list(request: Anon_Accesstoken): Request[ListDeviceConfigVersionsResponse]
}

object ConfigVersionsResource {
  @scala.inline
  def apply(list: Anon_Accesstoken => Request[ListDeviceConfigVersionsResponse]): ConfigVersionsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ConfigVersionsResource]
  }
}

