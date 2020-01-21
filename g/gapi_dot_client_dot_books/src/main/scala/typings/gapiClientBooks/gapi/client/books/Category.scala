package typings.gapiClientBooks.gapi.client.books

import typings.gapiClientBooks.AnonBadgeUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category extends js.Object {
  /** A list of onboarding categories. */
  var items: js.UndefOr[js.Array[AnonBadgeUrl]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
}

object Category {
  @scala.inline
  def apply(items: js.Array[AnonBadgeUrl] = null, kind: String = null): Category = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
}

