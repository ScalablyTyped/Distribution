package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.ValidateAsyncRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.ValidateAsyncResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.ValidateRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.ValidateResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.ValidateStatusRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.ValidateStatusResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidatorCollection extends js.Object {
  // Validate a metadata file.
  def validate(resource: ValidateRequest): ValidateResponse = js.native
  // Validate a metadata file.
  def validate(resource: ValidateRequest, optionalArgs: js.Object): ValidateResponse = js.native
  // Validate a metadata file asynchronously.
  def validateAsync(resource: ValidateAsyncRequest): ValidateAsyncResponse = js.native
  // Validate a metadata file asynchronously.
  def validateAsync(resource: ValidateAsyncRequest, optionalArgs: js.Object): ValidateAsyncResponse = js.native
  // Get the asynchronous validation status.
  def validateAsyncStatus(resource: ValidateStatusRequest): ValidateStatusResponse = js.native
  // Get the asynchronous validation status.
  def validateAsyncStatus(resource: ValidateStatusRequest, optionalArgs: js.Object): ValidateStatusResponse = js.native
}

