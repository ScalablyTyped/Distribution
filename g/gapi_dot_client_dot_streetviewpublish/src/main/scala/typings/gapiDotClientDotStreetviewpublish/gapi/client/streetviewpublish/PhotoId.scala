package typings.gapiDotClientDotStreetviewpublish.gapi.client.streetviewpublish

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhotoId extends js.Object {
  /** Required. A unique identifier for a photo. */
  var id: js.UndefOr[String] = js.undefined
}

object PhotoId {
  @scala.inline
  def apply(id: String = null): PhotoId = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[PhotoId]
  }
}

