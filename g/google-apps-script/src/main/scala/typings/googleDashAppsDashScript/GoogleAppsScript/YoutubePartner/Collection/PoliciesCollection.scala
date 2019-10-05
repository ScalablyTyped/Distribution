package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema.Policy
import typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema.PolicyList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PoliciesCollection extends js.Object {
  // Retrieves the specified saved policy.
  def get(policyId: String): Policy = js.native
  // Retrieves the specified saved policy.
  def get(policyId: String, optionalArgs: js.Object): Policy = js.native
  // Creates a saved policy.
  def insert(resource: Policy): Policy = js.native
  // Creates a saved policy.
  def insert(resource: Policy, optionalArgs: js.Object): Policy = js.native
  // Retrieves a list of the content owner's saved policies.
  def list(): PolicyList = js.native
  // Retrieves a list of the content owner's saved policies.
  def list(optionalArgs: js.Object): PolicyList = js.native
  // Updates the specified saved policy. This method supports patch semantics.
  def patch(resource: Policy, policyId: String): Policy = js.native
  // Updates the specified saved policy. This method supports patch semantics.
  def patch(resource: Policy, policyId: String, optionalArgs: js.Object): Policy = js.native
  // Updates the specified saved policy.
  def update(resource: Policy, policyId: String): Policy = js.native
  // Updates the specified saved policy.
  def update(resource: Policy, policyId: String, optionalArgs: js.Object): Policy = js.native
}

