package typings.gapiClientAppsactivity.gapi.client.appsactivity

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAppsactivity.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivitiesResource extends js.Object {
  /**
    * Returns a list of activities visible to the current logged in user. Visible activities are determined by the visiblity settings of the object that was
    * acted on, e.g. Drive files a user can see. An activity is a record of past events. Multiple events may be merged if they are similar. A request is
    * scoped to activities from a given Google service using the source parameter.
    */
  def list(request: Alt): Request[ListActivitiesResponse] = js.native
}

object ActivitiesResource {
  @scala.inline
  def apply(list: Alt => Request[ListActivitiesResponse]): ActivitiesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
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
    def setList(value: Alt => Request[ListActivitiesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

