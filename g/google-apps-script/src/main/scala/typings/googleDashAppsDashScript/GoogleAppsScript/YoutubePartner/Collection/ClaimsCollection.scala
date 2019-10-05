package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema.Claim
import typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema.ClaimListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClaimsCollection extends js.Object {
  // Retrieves a specific claim by ID.
  def get(claimId: String): Claim = js.native
  // Retrieves a specific claim by ID.
  def get(claimId: String, optionalArgs: js.Object): Claim = js.native
  // Creates a claim. The video being claimed must have been uploaded to a channel associated with the same content owner as the API user sending the request. You can set the claim's policy in any of the following ways:
  // - Use the claim resource's policy property to identify a saved policy by its unique ID.
  // - Use the claim resource's policy property to specify a custom set of rules.
  def insert(resource: Claim): Claim = js.native
  // Creates a claim. The video being claimed must have been uploaded to a channel associated with the same content owner as the API user sending the request. You can set the claim's policy in any of the following ways:
  // - Use the claim resource's policy property to identify a saved policy by its unique ID.
  // - Use the claim resource's policy property to specify a custom set of rules.
  def insert(resource: Claim, optionalArgs: js.Object): Claim = js.native
  // Retrieves a list of claims administered by the content owner associated with the currently authenticated user. Results are sorted in descending order of creation time.
  def list(): ClaimListResponse = js.native
  // Retrieves a list of claims administered by the content owner associated with the currently authenticated user. Results are sorted in descending order of creation time.
  def list(optionalArgs: js.Object): ClaimListResponse = js.native
  // Updates an existing claim by either changing its policy or its status. You can update a claim's status from active to inactive to effectively release the claim. This method supports patch semantics.
  def patch(resource: Claim, claimId: String): Claim = js.native
  // Updates an existing claim by either changing its policy or its status. You can update a claim's status from active to inactive to effectively release the claim. This method supports patch semantics.
  def patch(resource: Claim, claimId: String, optionalArgs: js.Object): Claim = js.native
  // Updates an existing claim by either changing its policy or its status. You can update a claim's status from active to inactive to effectively release the claim.
  def update(resource: Claim, claimId: String): Claim = js.native
  // Updates an existing claim by either changing its policy or its status. You can update a claim's status from active to inactive to effectively release the claim.
  def update(resource: Claim, claimId: String, optionalArgs: js.Object): Claim = js.native
}

