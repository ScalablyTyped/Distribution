package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeAssetsResource extends js.Object {
  /** Inserts a new creative asset. */
  def insert(request: AnonPrettyPrint): Request_[CreativeAssetMetadata]
}

object CreativeAssetsResource {
  @scala.inline
  def apply(insert: AnonPrettyPrint => Request_[CreativeAssetMetadata]): CreativeAssetsResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert))
  
    __obj.asInstanceOf[CreativeAssetsResource]
  }
}

