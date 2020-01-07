package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single row in the confusion matrix.
  */
@js.native
trait Schema$Row extends js.Object {
  /**
    * The original label of this row.
    */
  var actualLabel: js.UndefOr[String] = js.native
  /**
    * Info describing predicted label distribution.
    */
  var entries: js.UndefOr[js.Array[Schema$Entry]] = js.native
}

object Schema$Row {
  @scala.inline
  def apply(actualLabel: String = null, entries: js.Array[Schema$Entry] = null): Schema$Row = {
    val __obj = js.Dynamic.literal()
    if (actualLabel != null) __obj.updateDynamic("actualLabel")(actualLabel.asInstanceOf[js.Any])
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Row]
  }
}

