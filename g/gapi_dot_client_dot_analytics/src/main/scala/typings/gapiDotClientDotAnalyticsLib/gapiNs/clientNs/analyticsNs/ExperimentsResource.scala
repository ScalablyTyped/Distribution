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
    delete: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltExperimentId, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltExperimentId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Experiment]
    ],
    insert: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Experiment]
    ],
    list: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Experiments]
    ],
    patch: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltExperimentId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Experiment]
    ],
    update: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltExperimentId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Experiment]
    ]
  ): ExperimentsResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, insert = insert, list = list, patch = patch, update = update)
  
    __obj.asInstanceOf[ExperimentsResource]
  }
}

