package typings
package gapiDotClientDotAppsactivityLib.gapiNs.clientNs.appsactivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ActivitiesResource extends js.Object {
  /**
               * Returns a list of activities visible to the current logged in user. Visible activities are determined by the visiblity settings of the object that was
               * acted on, e.g. Drive files a user can see. An activity is a record of past events. Multiple events may be merged if they are similar. A request is
               * scoped to activities from a given Google service using the source parameter.
               */
  def list(request: gapiDotClientDotAppsactivityLib.Anon_Source): gapiDotClientLib.gapiNs.clientNs.Request[ListActivitiesResponse]
}

