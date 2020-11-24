package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection

import typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ValidateAsyncRequest
import typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ValidateAsyncResponse
import typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ValidateRequest
import typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ValidateResponse
import typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ValidateStatusRequest
import typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ValidateStatusResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
