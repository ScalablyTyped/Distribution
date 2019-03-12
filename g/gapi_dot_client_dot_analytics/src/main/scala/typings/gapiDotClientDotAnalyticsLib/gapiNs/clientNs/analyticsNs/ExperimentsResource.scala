package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExperimentsResource extends js.Object {
  /** Delete an experiment. */
  def delete(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltExperimentId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Returns an experiment to which the user has access. */
  def get(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltExperimentId): gapiDotClientLib.gapiNs.clientNs.Request[Experiment]
  /** Create a new experiment. */
  def insert(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Experiment]
  /** Lists experiments to which the user has access. */
  def list(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Experiments]
  /** Update an existing experiment. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltExperimentId): gapiDotClientLib.gapiNs.clientNs.Request[Experiment]
  /** Update an existing experiment. */
  def update(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltExperimentId): gapiDotClientLib.gapiNs.clientNs.Request[Experiment]
}

object ExperimentsResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltExperimentId => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltExperimentId => gapiDotClientLib.gapiNs.clientNs.Request[Experiment],
    insert: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint => gapiDotClientLib.gapiNs.clientNs.Request[Experiment],
    list: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[Experiments],
    patch: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltExperimentId => gapiDotClientLib.gapiNs.clientNs.Request[Experiment],
    update: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltExperimentId => gapiDotClientLib.gapiNs.clientNs.Request[Experiment]
  ): ExperimentsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ExperimentsResource]
  }
}

