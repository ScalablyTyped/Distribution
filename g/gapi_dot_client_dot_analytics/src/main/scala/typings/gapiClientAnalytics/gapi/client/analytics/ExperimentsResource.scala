package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.ExperimentId
import typings.gapiClientAnalytics.anon.ProfileId
import typings.gapiClientAnalytics.anon.Startindex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExperimentsResource extends js.Object {
  /** Delete an experiment. */
  def delete(request: ExperimentId): Request[Unit] = js.native
  /** Returns an experiment to which the user has access. */
  def get(request: ExperimentId): Request[Experiment] = js.native
  /** Create a new experiment. */
  def insert(request: ProfileId): Request[Experiment] = js.native
  /** Lists experiments to which the user has access. */
  def list(request: Startindex): Request[Experiments] = js.native
  /** Update an existing experiment. This method supports patch semantics. */
  def patch(request: ExperimentId): Request[Experiment] = js.native
  /** Update an existing experiment. */
  def update(request: ExperimentId): Request[Experiment] = js.native
}

object ExperimentsResource {
  @scala.inline
  def apply(
    delete: ExperimentId => Request[Unit],
    get: ExperimentId => Request[Experiment],
    insert: ProfileId => Request[Experiment],
    list: Startindex => Request[Experiments],
    patch: ExperimentId => Request[Experiment],
    update: ExperimentId => Request[Experiment]
  ): ExperimentsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ExperimentsResource]
  }
  @scala.inline
  implicit class ExperimentsResourceOps[Self <: ExperimentsResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: ExperimentId => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: ExperimentId => Request[Experiment]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: ProfileId => Request[Experiment]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Startindex => Request[Experiments]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: ExperimentId => Request[Experiment]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: ExperimentId => Request[Experiment]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

