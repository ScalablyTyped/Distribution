package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonAccountIdAltExperimentId
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyMaxresultsOauthtoken
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExperimentsResource extends js.Object {
  /** Delete an experiment. */
  def delete(request: AnonAccountIdAltExperimentId): Request_[Unit]
  /** Returns an experiment to which the user has access. */
  def get(request: AnonAccountIdAltExperimentId): Request_[Experiment]
  /** Create a new experiment. */
  def insert(request: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrint): Request_[Experiment]
  /** Lists experiments to which the user has access. */
  def list(request: AnonAccountIdAltFieldsKeyMaxresultsOauthtoken): Request_[Experiments]
  /** Update an existing experiment. This method supports patch semantics. */
  def patch(request: AnonAccountIdAltExperimentId): Request_[Experiment]
  /** Update an existing experiment. */
  def update(request: AnonAccountIdAltExperimentId): Request_[Experiment]
}

object ExperimentsResource {
  @scala.inline
  def apply(
    delete: AnonAccountIdAltExperimentId => Request_[Unit],
    get: AnonAccountIdAltExperimentId => Request_[Experiment],
    insert: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrint => Request_[Experiment],
    list: AnonAccountIdAltFieldsKeyMaxresultsOauthtoken => Request_[Experiments],
    patch: AnonAccountIdAltExperimentId => Request_[Experiment],
    update: AnonAccountIdAltExperimentId => Request_[Experiment]
  ): ExperimentsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ExperimentsResource]
  }
}

