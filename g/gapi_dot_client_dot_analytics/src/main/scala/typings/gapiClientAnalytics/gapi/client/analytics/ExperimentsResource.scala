package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonExperimentId
import typings.gapiClientAnalytics.AnonProfileId
import typings.gapiClientAnalytics.AnonStartindex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExperimentsResource extends js.Object {
  /** Delete an experiment. */
  def delete(request: AnonExperimentId): Request_[Unit]
  /** Returns an experiment to which the user has access. */
  def get(request: AnonExperimentId): Request_[Experiment]
  /** Create a new experiment. */
  def insert(request: AnonProfileId): Request_[Experiment]
  /** Lists experiments to which the user has access. */
  def list(request: AnonStartindex): Request_[Experiments]
  /** Update an existing experiment. This method supports patch semantics. */
  def patch(request: AnonExperimentId): Request_[Experiment]
  /** Update an existing experiment. */
  def update(request: AnonExperimentId): Request_[Experiment]
}

object ExperimentsResource {
  @scala.inline
  def apply(
    delete: AnonExperimentId => Request_[Unit],
    get: AnonExperimentId => Request_[Experiment],
    insert: AnonProfileId => Request_[Experiment],
    list: AnonStartindex => Request_[Experiments],
    patch: AnonExperimentId => Request_[Experiment],
    update: AnonExperimentId => Request_[Experiment]
  ): ExperimentsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ExperimentsResource]
  }
}

