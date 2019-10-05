package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDfareporting.Anon_AdvertiserId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeAssetsResource extends js.Object {
  /** Inserts a new creative asset. */
  def insert(request: Anon_AdvertiserId): Request[CreativeAssetMetadata]
}

object CreativeAssetsResource {
  @scala.inline
  def apply(insert: Anon_AdvertiserId => Request[CreativeAssetMetadata]): CreativeAssetsResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert))
  
    __obj.asInstanceOf[CreativeAssetsResource]
  }
}

