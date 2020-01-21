package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single row in the confusion matrix.
  */
@js.native
trait SchemaRow extends js.Object {
  /**
    * The original label of this row.
    */
  var actualLabel: js.UndefOr[String] = js.native
  /**
    * Info describing predicted label distribution.
    */
  var entries: js.UndefOr[js.Array[SchemaEntry]] = js.native
}

object SchemaRow {
  @scala.inline
  def apply(actualLabel: String = null, entries: js.Array[SchemaEntry] = null): SchemaRow = {
    val __obj = js.Dynamic.literal()
    if (actualLabel != null) __obj.updateDynamic("actualLabel")(actualLabel.asInstanceOf[js.Any])
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRow]
  }
}

