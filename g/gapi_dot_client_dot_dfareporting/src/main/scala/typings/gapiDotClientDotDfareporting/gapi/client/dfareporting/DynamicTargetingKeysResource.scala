package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDfareporting.Anon_AdvertiserIdAlt
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKeyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicTargetingKeysResource extends js.Object {
  /** Deletes an existing dynamic targeting key. */
  def delete(request: Anon_AltFieldsKeyName): Request[Unit]
  /**
    * Inserts a new dynamic targeting key. Keys must be created at the advertiser level before being assigned to the advertiser's ads, creatives, or
    * placements. There is a maximum of 1000 keys per advertiser, out of which a maximum of 20 keys can be assigned per ad, creative, or placement.
    */
  def insert(request: Anon_AltFieldsKey): Request[DynamicTargetingKey]
  /** Retrieves a list of dynamic targeting keys. */
  def list(request: Anon_AdvertiserIdAlt): Request[DynamicTargetingKeysListResponse]
}

object DynamicTargetingKeysResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsKeyName => Request[Unit],
    insert: Anon_AltFieldsKey => Request[DynamicTargetingKey],
    list: Anon_AdvertiserIdAlt => Request[DynamicTargetingKeysListResponse]
  ): DynamicTargetingKeysResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[DynamicTargetingKeysResource]
  }
}

