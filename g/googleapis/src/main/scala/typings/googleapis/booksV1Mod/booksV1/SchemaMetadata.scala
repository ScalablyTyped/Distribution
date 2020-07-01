package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.anon.Downloadurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaMetadata extends js.Object {
  /**
    * A list of offline dictionary metadata.
    */
  var items: js.UndefOr[js.Array[Downloadurl]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaMetadata {
  @scala.inline
  def apply(items: js.Array[Downloadurl] = null, kind: String = null): SchemaMetadata = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMetadata]
  }
}

