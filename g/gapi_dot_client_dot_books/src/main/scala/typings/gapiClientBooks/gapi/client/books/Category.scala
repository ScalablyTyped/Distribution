package typings.gapiClientBooks.gapi.client.books

import typings.gapiClientBooks.anon.BadgeUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category extends js.Object {
  /** A list of onboarding categories. */
  var items: js.UndefOr[js.Array[BadgeUrl]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
}

object Category {
  @scala.inline
  def apply(items: js.Array[BadgeUrl] = null, kind: String = null): Category = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
}

