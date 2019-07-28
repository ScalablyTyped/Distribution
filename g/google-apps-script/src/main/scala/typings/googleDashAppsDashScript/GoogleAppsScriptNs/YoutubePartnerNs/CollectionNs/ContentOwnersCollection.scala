package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.ContentOwner
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.ContentOwnerListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentOwnersCollection extends js.Object {
  // Retrieves information about the specified content owner.
  def get(contentOwnerId: String): ContentOwner = js.native
  // Retrieves information about the specified content owner.
  def get(contentOwnerId: String, optionalArgs: js.Object): ContentOwner = js.native
  // Retrieves a list of content owners that match the request criteria.
  def list(): ContentOwnerListResponse = js.native
  // Retrieves a list of content owners that match the request criteria.
  def list(optionalArgs: js.Object): ContentOwnerListResponse = js.native
}

