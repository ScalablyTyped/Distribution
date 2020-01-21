package typings.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDoubleclicksearch.AnonAdGroupIdAdId
import typings.gapiClientDoubleclicksearch.AnonAdvertiserId
import typings.gapiClientDoubleclicksearch.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionResource extends js.Object {
  /** Retrieves a list of conversions from a DoubleClick Search engine account. */
  def get(request: AnonAdGroupIdAdId): Request_[ConversionList]
  /** Inserts a batch of new conversions into DoubleClick Search. */
  def insert(request: AnonAlt): Request_[ConversionList]
  /** Updates a batch of conversions in DoubleClick Search. This method supports patch semantics. */
  def patch(request: AnonAdvertiserId): Request_[ConversionList]
  /** Updates a batch of conversions in DoubleClick Search. */
  def update(request: AnonAlt): Request_[ConversionList]
  /** Updates the availabilities of a batch of floodlight activities in DoubleClick Search. */
  def updateAvailability(request: AnonAlt): Request_[UpdateAvailabilityResponse]
}

object ConversionResource {
  @scala.inline
  def apply(
    get: AnonAdGroupIdAdId => Request_[ConversionList],
    insert: AnonAlt => Request_[ConversionList],
    patch: AnonAdvertiserId => Request_[ConversionList],
    update: AnonAlt => Request_[ConversionList],
    updateAvailability: AnonAlt => Request_[UpdateAvailabilityResponse]
  ): ConversionResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update), updateAvailability = js.Any.fromFunction1(updateAvailability))
  
    __obj.asInstanceOf[ConversionResource]
  }
}

