package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicTargetingKeysResource extends js.Object {
  /** Deletes an existing dynamic targeting key. */
  def delete(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyName): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /**
    * Inserts a new dynamic targeting key. Keys must be created at the advertiser level before being assigned to the advertiser's ads, creatives, or
    * placements. There is a maximum of 1000 keys per advertiser, out of which a maximum of 20 keys can be assigned per ad, creative, or placement.
    */
  def insert(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[DynamicTargetingKey]
  /** Retrieves a list of dynamic targeting keys. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AdvertiserIdAlt): gapiDotClientLib.gapiNs.clientNs.Request[DynamicTargetingKeysListResponse]
}

object DynamicTargetingKeysResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyName, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    insert: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[DynamicTargetingKey]
    ],
    list: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AdvertiserIdAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[DynamicTargetingKeysListResponse]
    ]
  ): DynamicTargetingKeysResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[DynamicTargetingKeysResource]
  }
}

