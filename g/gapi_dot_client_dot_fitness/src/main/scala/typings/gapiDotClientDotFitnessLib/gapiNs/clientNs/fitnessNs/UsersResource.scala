package typings
package gapiDotClientDotFitnessLib.gapiNs.clientNs.fitnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  var dataSources: DataSourcesResource
  var dataset: DatasetResource
  var sessions: SessionsResource
}

object UsersResource {
  @scala.inline
  def apply(dataSources: DataSourcesResource, dataset: DatasetResource, sessions: SessionsResource): UsersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataSources")(dataSources)
    __obj.updateDynamic("dataset")(dataset)
    __obj.updateDynamic("sessions")(sessions)
    __obj.asInstanceOf[UsersResource]
  }
}

