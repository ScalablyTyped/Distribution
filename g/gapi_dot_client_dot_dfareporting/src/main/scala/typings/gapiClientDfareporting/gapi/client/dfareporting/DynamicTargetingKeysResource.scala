package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Key
import typings.gapiClientDfareporting.anon.Name
import typings.gapiClientDfareporting.anon.Names
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicTargetingKeysResource extends js.Object {
  /** Deletes an existing dynamic targeting key. */
  def delete(request: Name): Request[Unit]
  /**
    * Inserts a new dynamic targeting key. Keys must be created at the advertiser level before being assigned to the advertiser's ads, creatives, or
    * placements. There is a maximum of 1000 keys per advertiser, out of which a maximum of 20 keys can be assigned per ad, creative, or placement.
    */
  def insert(request: Key): Request[DynamicTargetingKey]
  /** Retrieves a list of dynamic targeting keys. */
  def list(request: Names): Request[DynamicTargetingKeysListResponse]
}

object DynamicTargetingKeysResource {
  @scala.inline
  def apply(
    delete: Name => Request[Unit],
    insert: Key => Request[DynamicTargetingKey],
    list: Names => Request[DynamicTargetingKeysListResponse]
  ): DynamicTargetingKeysResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[DynamicTargetingKeysResource]
  }
}

