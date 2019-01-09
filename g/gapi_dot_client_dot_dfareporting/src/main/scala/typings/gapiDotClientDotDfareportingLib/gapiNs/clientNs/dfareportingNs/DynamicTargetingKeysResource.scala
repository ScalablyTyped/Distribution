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

