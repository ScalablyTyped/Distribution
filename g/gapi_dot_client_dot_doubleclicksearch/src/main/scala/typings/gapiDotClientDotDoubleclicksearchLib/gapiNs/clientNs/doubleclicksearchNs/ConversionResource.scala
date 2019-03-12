package typings
package gapiDotClientDotDoubleclicksearchLib.gapiNs.clientNs.doubleclicksearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionResource extends js.Object {
  /** Retrieves a list of conversions from a DoubleClick Search engine account. */
  def get(request: gapiDotClientDotDoubleclicksearchLib.Anon_AdGroupIdAdId): gapiDotClientLib.gapiNs.clientNs.Request[ConversionList]
  /** Inserts a batch of new conversions into DoubleClick Search. */
  def insert(request: gapiDotClientDotDoubleclicksearchLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[ConversionList]
  /** Updates a batch of conversions in DoubleClick Search. This method supports patch semantics. */
  def patch(request: gapiDotClientDotDoubleclicksearchLib.Anon_AdvertiserId): gapiDotClientLib.gapiNs.clientNs.Request[ConversionList]
  /** Updates a batch of conversions in DoubleClick Search. */
  def update(request: gapiDotClientDotDoubleclicksearchLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[ConversionList]
  /** Updates the availabilities of a batch of floodlight activities in DoubleClick Search. */
  def updateAvailability(request: gapiDotClientDotDoubleclicksearchLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[UpdateAvailabilityResponse]
}

object ConversionResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotDoubleclicksearchLib.Anon_AdGroupIdAdId => gapiDotClientLib.gapiNs.clientNs.Request[ConversionList],
    insert: gapiDotClientDotDoubleclicksearchLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[ConversionList],
    patch: gapiDotClientDotDoubleclicksearchLib.Anon_AdvertiserId => gapiDotClientLib.gapiNs.clientNs.Request[ConversionList],
    update: gapiDotClientDotDoubleclicksearchLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[ConversionList],
    updateAvailability: gapiDotClientDotDoubleclicksearchLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[UpdateAvailabilityResponse]
  ): ConversionResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update), updateAvailability = js.Any.fromFunction1(updateAvailability))
  
    __obj.asInstanceOf[ConversionResource]
  }
}

