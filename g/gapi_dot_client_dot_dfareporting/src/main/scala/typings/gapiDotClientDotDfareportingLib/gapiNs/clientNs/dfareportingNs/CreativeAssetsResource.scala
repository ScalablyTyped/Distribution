package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeAssetsResource extends js.Object {
  /** Inserts a new creative asset. */
  def insert(request: gapiDotClientDotDfareportingLib.Anon_AdvertiserId): gapiDotClientLib.gapiNs.clientNs.Request[CreativeAssetMetadata]
}

object CreativeAssetsResource {
  @scala.inline
  def apply(
    insert: gapiDotClientDotDfareportingLib.Anon_AdvertiserId => gapiDotClientLib.gapiNs.clientNs.Request[CreativeAssetMetadata]
  ): CreativeAssetsResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert))
  
    __obj.asInstanceOf[CreativeAssetsResource]
  }
}

