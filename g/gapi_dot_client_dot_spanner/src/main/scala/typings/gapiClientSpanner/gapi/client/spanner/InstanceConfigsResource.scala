package typings.gapiClientSpanner.gapi.client.spanner

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSpanner.anon.Accesstoken
import typings.gapiClientSpanner.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceConfigsResource extends js.Object {
  /** Gets information about a particular instance configuration. */
  def get(request: Accesstoken): Request[InstanceConfig]
  /** Lists the supported instance configurations for a given project. */
  def list(request: Alt): Request[ListInstanceConfigsResponse]
}

object InstanceConfigsResource {
  @scala.inline
  def apply(get: Accesstoken => Request[InstanceConfig], list: Alt => Request[ListInstanceConfigsResponse]): InstanceConfigsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[InstanceConfigsResource]
  }
}

