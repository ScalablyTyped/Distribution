package typings.gapiDotClientDotBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArtUrl extends js.Object {
  var artUrl: js.UndefOr[String] = js.undefined
  var gservicesKey: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[Anon_Author]] = js.undefined
}

object Anon_ArtUrl {
  @scala.inline
  def apply(
    artUrl: String = null,
    gservicesKey: String = null,
    id: String = null,
    items: js.Array[Anon_Author] = null
  ): Anon_ArtUrl = {
    val __obj = js.Dynamic.literal()
    if (artUrl != null) __obj.updateDynamic("artUrl")(artUrl.asInstanceOf[js.Any])
    if (gservicesKey != null) __obj.updateDynamic("gservicesKey")(gservicesKey.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArtUrl]
  }
}

