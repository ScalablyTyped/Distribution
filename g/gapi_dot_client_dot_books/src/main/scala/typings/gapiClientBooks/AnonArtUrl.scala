package typings.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArtUrl extends js.Object {
  var artUrl: js.UndefOr[String] = js.undefined
  var gservicesKey: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[AnonAuthor]] = js.undefined
}

object AnonArtUrl {
  @scala.inline
  def apply(
    artUrl: String = null,
    gservicesKey: String = null,
    id: String = null,
    items: js.Array[AnonAuthor] = null
  ): AnonArtUrl = {
    val __obj = js.Dynamic.literal()
    if (artUrl != null) __obj.updateDynamic("artUrl")(artUrl.asInstanceOf[js.Any])
    if (gservicesKey != null) __obj.updateDynamic("gservicesKey")(gservicesKey.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArtUrl]
  }
}

