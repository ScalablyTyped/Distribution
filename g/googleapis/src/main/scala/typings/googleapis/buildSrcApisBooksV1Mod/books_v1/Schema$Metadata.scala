package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.googleapis.Anon_Downloadurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Metadata extends js.Object {
  /**
    * A list of offline dictionary metadata.
    */
  var items: js.UndefOr[js.Array[Anon_Downloadurl]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$Metadata {
  @scala.inline
  def apply(items: js.Array[Anon_Downloadurl] = null, kind: String = null): Schema$Metadata = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Metadata]
  }
}

