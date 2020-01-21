package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapEnrichment extends js.Object {
  /** Destination location for this enrichemt item. */
  var destination: js.UndefOr[Location] = js.undefined
  /** Origin location for this enrichment item. */
  var origin: js.UndefOr[Location] = js.undefined
}

object MapEnrichment {
  @scala.inline
  def apply(destination: Location = null, origin: Location = null): MapEnrichment = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapEnrichment]
  }
}

