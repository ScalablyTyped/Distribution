package typings.gapiDotClientDotSpanner.gapi.client.spanner

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotSpanner.Anon_Accesstoken
import typings.gapiDotClientDotSpanner.Anon_AccesstokenAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceConfigsResource extends js.Object {
  /** Gets information about a particular instance configuration. */
  def get(request: Anon_Accesstoken): Request[InstanceConfig]
  /** Lists the supported instance configurations for a given project. */
  def list(request: Anon_AccesstokenAlt): Request[ListInstanceConfigsResponse]
}

object InstanceConfigsResource {
  @scala.inline
  def apply(
    get: Anon_Accesstoken => Request[InstanceConfig],
    list: Anon_AccesstokenAlt => Request[ListInstanceConfigsResponse]
  ): InstanceConfigsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[InstanceConfigsResource]
  }
}

