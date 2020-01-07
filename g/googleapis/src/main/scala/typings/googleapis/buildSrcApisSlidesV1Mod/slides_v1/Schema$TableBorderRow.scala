package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contents of each border row in a table.
  */
@js.native
trait Schema$TableBorderRow extends js.Object {
  /**
    * Properties of each border cell. When a border&#39;s adjacent table cells
    * are merged, it is not included in the response.
    */
  var tableBorderCells: js.UndefOr[js.Array[Schema$TableBorderCell]] = js.native
}

object Schema$TableBorderRow {
  @scala.inline
  def apply(tableBorderCells: js.Array[Schema$TableBorderCell] = null): Schema$TableBorderRow = {
    val __obj = js.Dynamic.literal()
    if (tableBorderCells != null) __obj.updateDynamic("tableBorderCells")(tableBorderCells.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TableBorderRow]
  }
}

