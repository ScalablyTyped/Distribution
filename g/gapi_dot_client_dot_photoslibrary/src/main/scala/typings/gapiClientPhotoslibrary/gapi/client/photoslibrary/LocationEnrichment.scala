package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationEnrichment extends js.Object {
  /** Location for this enrichment item. */
  var location: js.UndefOr[Location] = js.undefined
}

object LocationEnrichment {
  @scala.inline
  def apply(location: Location = null): LocationEnrichment = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationEnrichment]
  }
}

