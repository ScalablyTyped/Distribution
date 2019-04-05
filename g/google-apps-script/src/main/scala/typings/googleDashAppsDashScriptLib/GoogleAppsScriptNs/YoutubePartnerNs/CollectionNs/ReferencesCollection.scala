package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferencesCollection extends js.Object {
  // Retrieves information about the specified reference.
  def get(referenceId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Reference = js.native
  // Retrieves information about the specified reference.
  def get(referenceId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Reference = js.native
  // Creates a reference in one of the following ways:
  // - If your request is uploading a reference file, YouTube creates the reference from the provided content. You can provide either a video/audio file or a pre-generated fingerprint. If you are providing a pre-generated fingerprint, set the reference resource's fpDirect property to true in the request body. In this flow, you can use either the multipart or resumable upload flows to provide the reference content.
  // - If you want to create a reference using a claimed video as the reference content, use the claimId parameter to identify the claim.
  def insert(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Reference): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Reference = js.native
  // Creates a reference in one of the following ways:
  // - If your request is uploading a reference file, YouTube creates the reference from the provided content. You can provide either a video/audio file or a pre-generated fingerprint. If you are providing a pre-generated fingerprint, set the reference resource's fpDirect property to true in the request body. In this flow, you can use either the multipart or resumable upload flows to provide the reference content.
  // - If you want to create a reference using a claimed video as the reference content, use the claimId parameter to identify the claim.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Reference,
    mediaData: js.Any
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Reference = js.native
  // Creates a reference in one of the following ways:
  // - If your request is uploading a reference file, YouTube creates the reference from the provided content. You can provide either a video/audio file or a pre-generated fingerprint. If you are providing a pre-generated fingerprint, set the reference resource's fpDirect property to true in the request body. In this flow, you can use either the multipart or resumable upload flows to provide the reference content.
  // - If you want to create a reference using a claimed video as the reference content, use the claimId parameter to identify the claim.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Reference,
    mediaData: js.Any,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Reference = js.native
  // Retrieves a list of references by ID or the list of references for the specified asset.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.ReferenceListResponse = js.native
  // Retrieves a list of references by ID or the list of references for the specified asset.
  def list(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.ReferenceListResponse = js.native
  // Updates a reference. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Reference,
    referenceId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Reference = js.native
  // Updates a reference. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Reference,
    referenceId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Reference = js.native
  // Updates a reference.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Reference,
    referenceId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Reference = js.native
  // Updates a reference.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Reference,
    referenceId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Reference = js.native
}

