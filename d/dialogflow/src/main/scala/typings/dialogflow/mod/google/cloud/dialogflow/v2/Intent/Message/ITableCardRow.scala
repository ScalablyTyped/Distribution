package typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a TableCardRow. */
trait ITableCardRow extends js.Object {
  /** TableCardRow cells */
  var cells: js.UndefOr[js.Array[ITableCardCell] | Null] = js.undefined
  /** TableCardRow dividerAfter */
  var dividerAfter: js.UndefOr[Boolean | Null] = js.undefined
}

object ITableCardRow {
  @scala.inline
  def apply(
    cells: js.UndefOr[Null | js.Array[ITableCardCell]] = js.undefined,
    dividerAfter: js.UndefOr[Null | Boolean] = js.undefined
  ): ITableCardRow = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cells)) __obj.updateDynamic("cells")(cells.asInstanceOf[js.Any])
    if (!js.isUndefined(dividerAfter)) __obj.updateDynamic("dividerAfter")(dividerAfter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableCardRow]
  }
}

