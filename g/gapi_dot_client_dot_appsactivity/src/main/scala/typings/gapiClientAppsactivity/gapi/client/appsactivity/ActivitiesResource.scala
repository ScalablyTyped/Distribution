package typings.gapiClientAppsactivity.gapi.client.appsactivity

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAppsactivity.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitiesResource extends js.Object {
  /**
    * Returns a list of activities visible to the current logged in user. Visible activities are determined by the visiblity settings of the object that was
    * acted on, e.g. Drive files a user can see. An activity is a record of past events. Multiple events may be merged if they are similar. A request is
    * scoped to activities from a given Google service using the source parameter.
    */
  def list(request: AnonAlt): Request_[ListActivitiesResponse]
}

object ActivitiesResource {
  @scala.inline
  def apply(list: AnonAlt => Request_[ListActivitiesResponse]): ActivitiesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ActivitiesResource]
  }
}

