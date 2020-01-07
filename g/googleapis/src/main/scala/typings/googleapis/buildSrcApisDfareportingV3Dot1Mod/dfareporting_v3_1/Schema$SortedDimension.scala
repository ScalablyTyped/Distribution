package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a sorted dimension.
  */
@js.native
trait Schema$SortedDimension extends js.Object {
  /**
    * The kind of resource this is, in this case dfareporting#sortedDimension.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the dimension.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * An optional sort order for the dimension column.
    */
  var sortOrder: js.UndefOr[String] = js.native
}

object Schema$SortedDimension {
  @scala.inline
  def apply(kind: String = null, name: String = null, sortOrder: String = null): Schema$SortedDimension = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SortedDimension]
  }
}

