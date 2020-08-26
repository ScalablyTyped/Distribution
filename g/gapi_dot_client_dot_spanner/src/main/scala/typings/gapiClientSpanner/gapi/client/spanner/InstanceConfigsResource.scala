package typings.gapiClientSpanner.gapi.client.spanner

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSpanner.anon.Accesstoken
import typings.gapiClientSpanner.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceConfigsResource extends js.Object {
  /** Gets information about a particular instance configuration. */
  def get(request: Accesstoken): Request[InstanceConfig] = js.native
  /** Lists the supported instance configurations for a given project. */
  def list(request: Alt): Request[ListInstanceConfigsResponse] = js.native
}

object InstanceConfigsResource {
  @scala.inline
  def apply(get: Accesstoken => Request[InstanceConfig], list: Alt => Request[ListInstanceConfigsResponse]): InstanceConfigsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[InstanceConfigsResource]
  }
  @scala.inline
  implicit class InstanceConfigsResourceOps[Self <: InstanceConfigsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: Accesstoken => Request[InstanceConfig]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Alt => Request[ListInstanceConfigsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

