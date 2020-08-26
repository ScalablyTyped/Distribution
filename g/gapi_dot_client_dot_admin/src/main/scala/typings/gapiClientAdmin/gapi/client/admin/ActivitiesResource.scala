package typings.gapiClientAdmin.gapi.client.admin

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdmin.anon.ActorIpAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivitiesResource extends js.Object {
  /** Retrieves a list of activities for a specific customer and application. */
  def list(request: ActorIpAddress): Request[Activities] = js.native
  /** Push changes to activities */
  def watch(request: ActorIpAddress): Request[Channel] = js.native
}

object ActivitiesResource {
  @scala.inline
  def apply(list: ActorIpAddress => Request[Activities], watch: ActorIpAddress => Request[Channel]): ActivitiesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), watch = js.Any.fromFunction1(watch))
    __obj.asInstanceOf[ActivitiesResource]
  }
  @scala.inline
  implicit class ActivitiesResourceOps[Self <: ActivitiesResource] (val x: Self) extends AnyVal {
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
    def setList(value: ActorIpAddress => Request[Activities]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setWatch(value: ActorIpAddress => Request[Channel]): Self = this.set("watch", js.Any.fromFunction1(value))
  }
  
}

