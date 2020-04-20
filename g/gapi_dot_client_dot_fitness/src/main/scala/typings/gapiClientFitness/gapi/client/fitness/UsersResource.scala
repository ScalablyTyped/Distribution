package typings.gapiClientFitness.gapi.client.fitness

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
    val __obj = js.Dynamic.literal(dataSources = dataSources.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersResource]
  }
}

