package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.googleapis.Anon_BadgeUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Category extends js.Object {
  /**
    * A list of onboarding categories.
    */
  var items: js.UndefOr[js.Array[Anon_BadgeUrl]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$Category {
  @scala.inline
  def apply(items: js.Array[Anon_BadgeUrl] = null, kind: String = null): Schema$Category = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Category]
  }
}

