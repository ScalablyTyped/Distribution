package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.anon.ArtUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOffers extends js.Object {
  /**
    * A list of offers.
    */
  var items: js.UndefOr[js.Array[ArtUrl]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaOffers {
  @scala.inline
  def apply(items: js.Array[ArtUrl] = null, kind: String = null): SchemaOffers = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOffers]
  }
}

