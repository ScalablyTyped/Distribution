package typings.gapiDotClientDotAdsense.gapiNs.clientNs.adsenseNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAdsense.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionsResource extends js.Object {
  /** List the metadata for the dimensions available to this AdSense account. */
  def list(request: Anon_AltFieldsKey): Request[Metadata]
}

object DimensionsResource {
  @scala.inline
  def apply(list: Anon_AltFieldsKey => Request[Metadata]): DimensionsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[DimensionsResource]
  }
}

