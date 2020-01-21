package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.AnonBadgeUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCategory extends js.Object {
  /**
    * A list of onboarding categories.
    */
  var items: js.UndefOr[js.Array[AnonBadgeUrl]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaCategory {
  @scala.inline
  def apply(items: js.Array[AnonBadgeUrl] = null, kind: String = null): SchemaCategory = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCategory]
  }
}

