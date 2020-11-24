package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection

import typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.MetadataHistoryListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataHistoryCollection extends js.Object {
  
  // Retrieves a list of all metadata provided for an asset, regardless of which content owner provided the data.
  def list(assetId: String): MetadataHistoryListResponse = js.native
  // Retrieves a list of all metadata provided for an asset, regardless of which content owner provided the data.
  def list(assetId: String, optionalArgs: js.Object): MetadataHistoryListResponse = js.native
}
