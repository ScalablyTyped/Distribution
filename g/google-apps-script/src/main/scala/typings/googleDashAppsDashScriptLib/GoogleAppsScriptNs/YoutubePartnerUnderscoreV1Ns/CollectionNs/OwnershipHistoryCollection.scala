package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OwnershipHistoryCollection extends js.Object {
  // Retrieves a list of the ownership data for an asset, regardless of which content owner provided the data. The list only includes the most recent ownership data for each content owner. However, if the content owner has submitted ownership data through multiple data sources (API, content feeds, etc.), the list will contain the most recent data for each content owner and data source.
  def list(assetId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.OwnershipHistoryListResponse = js.native
  // Retrieves a list of the ownership data for an asset, regardless of which content owner provided the data. The list only includes the most recent ownership data for each content owner. However, if the content owner has submitted ownership data through multiple data sources (API, content feeds, etc.), the list will contain the most recent data for each content owner and data source.
  def list(assetId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.OwnershipHistoryListResponse = js.native
}

