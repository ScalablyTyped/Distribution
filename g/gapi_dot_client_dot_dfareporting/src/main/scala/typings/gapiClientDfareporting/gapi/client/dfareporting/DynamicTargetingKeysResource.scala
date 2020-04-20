package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonKey
import typings.gapiClientDfareporting.AnonName
import typings.gapiClientDfareporting.AnonNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicTargetingKeysResource extends js.Object {
  /** Deletes an existing dynamic targeting key. */
  def delete(request: AnonName): Request_[Unit]
  /**
    * Inserts a new dynamic targeting key. Keys must be created at the advertiser level before being assigned to the advertiser's ads, creatives, or
    * placements. There is a maximum of 1000 keys per advertiser, out of which a maximum of 20 keys can be assigned per ad, creative, or placement.
    */
  def insert(request: AnonKey): Request_[DynamicTargetingKey]
  /** Retrieves a list of dynamic targeting keys. */
  def list(request: AnonNames): Request_[DynamicTargetingKeysListResponse]
}

object DynamicTargetingKeysResource {
  @scala.inline
  def apply(
    delete: AnonName => Request_[Unit],
    insert: AnonKey => Request_[DynamicTargetingKey],
    list: AnonNames => Request_[DynamicTargetingKeysListResponse]
  ): DynamicTargetingKeysResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[DynamicTargetingKeysResource]
  }
}

