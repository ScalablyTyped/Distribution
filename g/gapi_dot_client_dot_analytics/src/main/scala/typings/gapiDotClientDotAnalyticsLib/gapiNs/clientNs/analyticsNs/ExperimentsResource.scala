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

