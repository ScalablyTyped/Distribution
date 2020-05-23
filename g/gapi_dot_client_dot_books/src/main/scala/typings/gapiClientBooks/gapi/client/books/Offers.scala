package typings.gapiClientBooks.gapi.client.books

import typings.gapiClientBooks.anon.ArtUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Offers extends js.Object {
  /** A list of offers. */
  var items: js.UndefOr[js.Array[ArtUrl]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
}

object Offers {
  @scala.inline
  def apply(items: js.Array[ArtUrl] = null, kind: String = null): Offers = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offers]
  }
}

