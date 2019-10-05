package typings.gapiDotClientDotAnalytics.gapi.client.analytics

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltExperimentId
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExperimentsResource extends js.Object {
  /** Delete an experiment. */
  def delete(request: Anon_AccountIdAltExperimentId): Request[Unit]
  /** Returns an experiment to which the user has access. */
  def get(request: Anon_AccountIdAltExperimentId): Request[Experiment]
  /** Create a new experiment. */
  def insert(request: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint): Request[Experiment]
  /** Lists experiments to which the user has access. */
  def list(request: Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken): Request[Experiments]
  /** Update an existing experiment. This method supports patch semantics. */
  def patch(request: Anon_AccountIdAltExperimentId): Request[Experiment]
  /** Update an existing experiment. */
  def update(request: Anon_AccountIdAltExperimentId): Request[Experiment]
}

object ExperimentsResource {
  @scala.inline
  def apply(
    delete: Anon_AccountIdAltExperimentId => Request[Unit],
    get: Anon_AccountIdAltExperimentId => Request[Experiment],
    insert: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint => Request[Experiment],
    list: Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken => Request[Experiments],
    patch: Anon_AccountIdAltExperimentId => Request[Experiment],
    update: Anon_AccountIdAltExperimentId => Request[Experiment]
  ): ExperimentsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ExperimentsResource]
  }
}

