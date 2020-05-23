package typings.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDoubleclicksearch.anon.AdId
import typings.gapiClientDoubleclicksearch.anon.AdvertiserId
import typings.gapiClientDoubleclicksearch.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionResource extends js.Object {
  /** Retrieves a list of conversions from a DoubleClick Search engine account. */
  def get(request: AdId): Request[ConversionList]
  /** Inserts a batch of new conversions into DoubleClick Search. */
  def insert(request: Alt): Request[ConversionList]
  /** Updates a batch of conversions in DoubleClick Search. This method supports patch semantics. */
  def patch(request: AdvertiserId): Request[ConversionList]
  /** Updates a batch of conversions in DoubleClick Search. */
  def update(request: Alt): Request[ConversionList]
  /** Updates the availabilities of a batch of floodlight activities in DoubleClick Search. */
  def updateAvailability(request: Alt): Request[UpdateAvailabilityResponse]
}

object ConversionResource {
  @scala.inline
  def apply(
    get: AdId => Request[ConversionList],
    insert: Alt => Request[ConversionList],
    patch: AdvertiserId => Request[ConversionList],
    update: Alt => Request[ConversionList],
    updateAvailability: Alt => Request[UpdateAvailabilityResponse]
  ): ConversionResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update), updateAvailability = js.Any.fromFunction1(updateAvailability))
    __obj.asInstanceOf[ConversionResource]
  }
}

