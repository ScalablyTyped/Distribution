package typings.gapiDotClientDotDoubleclicksearch.gapi.client.doubleclicksearch

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDoubleclicksearch.Anon_AdGroupIdAdId
import typings.gapiDotClientDotDoubleclicksearch.Anon_AdvertiserId
import typings.gapiDotClientDotDoubleclicksearch.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionResource extends js.Object {
  /** Retrieves a list of conversions from a DoubleClick Search engine account. */
  def get(request: Anon_AdGroupIdAdId): Request[ConversionList]
  /** Inserts a batch of new conversions into DoubleClick Search. */
  def insert(request: Anon_Alt): Request[ConversionList]
  /** Updates a batch of conversions in DoubleClick Search. This method supports patch semantics. */
  def patch(request: Anon_AdvertiserId): Request[ConversionList]
  /** Updates a batch of conversions in DoubleClick Search. */
  def update(request: Anon_Alt): Request[ConversionList]
  /** Updates the availabilities of a batch of floodlight activities in DoubleClick Search. */
  def updateAvailability(request: Anon_Alt): Request[UpdateAvailabilityResponse]
}

object ConversionResource {
  @scala.inline
  def apply(
    get: Anon_AdGroupIdAdId => Request[ConversionList],
    insert: Anon_Alt => Request[ConversionList],
    patch: Anon_AdvertiserId => Request[ConversionList],
    update: Anon_Alt => Request[ConversionList],
    updateAvailability: Anon_Alt => Request[UpdateAvailabilityResponse]
  ): ConversionResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update), updateAvailability = js.Any.fromFunction1(updateAvailability))
  
    __obj.asInstanceOf[ConversionResource]
  }
}

