package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.googleapis.Anon_ArtUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Offers extends js.Object {
  /**
    * A list of offers.
    */
  var items: js.UndefOr[js.Array[Anon_ArtUrl]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$Offers {
  @scala.inline
  def apply(items: js.Array[Anon_ArtUrl] = null, kind: String = null): Schema$Offers = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Offers]
  }
}

