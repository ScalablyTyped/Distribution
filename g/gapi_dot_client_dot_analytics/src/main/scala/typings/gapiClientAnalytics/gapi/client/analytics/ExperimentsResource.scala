package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.ExperimentId
import typings.gapiClientAnalytics.anon.ProfileId
import typings.gapiClientAnalytics.anon.Startindex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExperimentsResource extends js.Object {
  /** Delete an experiment. */
  def delete(request: ExperimentId): Request[Unit]
  /** Returns an experiment to which the user has access. */
  def get(request: ExperimentId): Request[Experiment]
  /** Create a new experiment. */
  def insert(request: ProfileId): Request[Experiment]
  /** Lists experiments to which the user has access. */
  def list(request: Startindex): Request[Experiments]
  /** Update an existing experiment. This method supports patch semantics. */
  def patch(request: ExperimentId): Request[Experiment]
  /** Update an existing experiment. */
  def update(request: ExperimentId): Request[Experiment]
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
}

