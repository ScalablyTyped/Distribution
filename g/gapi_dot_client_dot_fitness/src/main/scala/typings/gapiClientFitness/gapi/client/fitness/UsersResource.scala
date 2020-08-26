package typings.gapiClientFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersResource extends js.Object {
  var dataSources: DataSourcesResource = js.native
  var dataset: DatasetResource = js.native
  var sessions: SessionsResource = js.native
}

object UsersResource {
  @scala.inline
  def apply(dataSources: DataSourcesResource, dataset: DatasetResource, sessions: SessionsResource): UsersResource = {
    val __obj = js.Dynamic.literal(dataSources = dataSources.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersResource]
  }
  @scala.inline
  implicit class UsersResourceOps[Self <: UsersResource] (val x: Self) extends AnyVal {
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
    def setDataSources(value: DataSourcesResource): Self = this.set("dataSources", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataset(value: DatasetResource): Self = this.set("dataset", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessions(value: SessionsResource): Self = this.set("sessions", value.asInstanceOf[js.Any])
  }
  
}

