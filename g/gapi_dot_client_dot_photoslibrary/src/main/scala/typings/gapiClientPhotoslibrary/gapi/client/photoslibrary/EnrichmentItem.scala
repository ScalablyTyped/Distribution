package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnrichmentItem extends js.Object {
  /** Identifier of the enrichment item. */
  var id: js.UndefOr[String] = js.undefined
}

object EnrichmentItem {
  @scala.inline
  def apply(id: String = null): EnrichmentItem = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnrichmentItem]
  }
}

