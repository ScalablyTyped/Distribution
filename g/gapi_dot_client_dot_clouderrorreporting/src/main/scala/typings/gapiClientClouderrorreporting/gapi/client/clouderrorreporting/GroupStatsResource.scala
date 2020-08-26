package typings.gapiClientClouderrorreporting.gapi.client.clouderrorreporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientClouderrorreporting.anon.Alignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupStatsResource extends js.Object {
  /** Lists the specified groups. */
  def list(request: Alignment): Request[ListGroupStatsResponse] = js.native
}

object GroupStatsResource {
  @scala.inline
  def apply(list: Alignment => Request[ListGroupStatsResponse]): GroupStatsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[GroupStatsResource]
  }
  @scala.inline
  implicit class GroupStatsResourceOps[Self <: GroupStatsResource] (val x: Self) extends AnyVal {
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
    def setList(value: Alignment => Request[ListGroupStatsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

