package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArtUrl extends js.Object {
  var artUrl: js.UndefOr[java.lang.String] = js.undefined
  var gservicesKey: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[js.Array[Anon_Author]] = js.undefined
}

object Anon_ArtUrl {
  @scala.inline
  def apply(
    artUrl: java.lang.String = null,
    gservicesKey: java.lang.String = null,
    id: java.lang.String = null,
    items: js.Array[Anon_Author] = null
  ): Anon_ArtUrl = {
    val __obj = js.Dynamic.literal()
    if (artUrl != null) __obj.updateDynamic("artUrl")(artUrl)
    if (gservicesKey != null) __obj.updateDynamic("gservicesKey")(gservicesKey)
    if (id != null) __obj.updateDynamic("id")(id)
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[Anon_ArtUrl]
  }
}

