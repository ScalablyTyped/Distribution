package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.Management

import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.Experiment
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.Experiments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExperimentsCollection extends js.Object {
  // Returns an experiment to which the user has access.
  def get(accountId: String, webPropertyId: String, profileId: String, experimentId: String): Experiment = js.native
  // Create a new experiment.
  def insert(resource: Experiment, accountId: String, webPropertyId: String, profileId: String): Experiment = js.native
  // Lists experiments to which the user has access.
  def list(accountId: String, webPropertyId: String, profileId: String): Experiments = js.native
  // Lists experiments to which the user has access.
  def list(accountId: String, webPropertyId: String, profileId: String, optionalArgs: js.Object): Experiments = js.native
  // Update an existing experiment. This method supports patch semantics.
  def patch(
    resource: Experiment,
    accountId: String,
    webPropertyId: String,
    profileId: String,
    experimentId: String
  ): Experiment = js.native
  // Delete an experiment.
  def remove(accountId: String, webPropertyId: String, profileId: String, experimentId: String): Unit = js.native
  // Update an existing experiment.
  def update(
    resource: Experiment,
    accountId: String,
    webPropertyId: String,
    profileId: String,
    experimentId: String
  ): Experiment = js.native
}

