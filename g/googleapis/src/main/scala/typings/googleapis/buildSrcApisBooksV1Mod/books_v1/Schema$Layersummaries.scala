package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Layersummaries extends js.Object {
  /**
    * A list of layer summary items.
    */
  var items: js.UndefOr[js.Array[Schema$Layersummary]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The total number of layer summaries found.
    */
  var totalItems: js.UndefOr[Double] = js.native
}

object Schema$Layersummaries {
  @scala.inline
  def apply(items: js.Array[Schema$Layersummary] = null, kind: String = null, totalItems: Int | Double = null): Schema$Layersummaries = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Layersummaries]
  }
}

