package typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs

import typings.gapiDotClientDotBooks.Anon_BadgeUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category extends js.Object {
  /** A list of onboarding categories. */
  var items: js.UndefOr[js.Array[Anon_BadgeUrl]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
}

object Category {
  @scala.inline
  def apply(items: js.Array[Anon_BadgeUrl] = null, kind: String = null): Category = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Category]
  }
}

