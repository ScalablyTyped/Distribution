package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A StructuralElement representing a table.
  */
@js.native
trait Schema$Table extends js.Object {
  /**
    * Number of columns in the table.  It is possible for a table to be
    * non-rectangular, so some rows may have a different number of cells.
    */
  var columns: js.UndefOr[Double] = js.native
  /**
    * Number of rows in the table.
    */
  var rows: js.UndefOr[Double] = js.native
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested insertion IDs. A Table may have multiple insertion IDs if
    * it is a nested suggested change. If empty, then this is not a suggested
    * insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The contents and style of each row.
    */
  var tableRows: js.UndefOr[js.Array[Schema$TableRow]] = js.native
  /**
    * The style of the table.
    */
  var tableStyle: js.UndefOr[Schema$TableStyle] = js.native
}

object Schema$Table {
  @scala.inline
  def apply(
    columns: Int | Double = null,
    rows: Int | Double = null,
    suggestedDeletionIds: js.Array[String] = null,
    suggestedInsertionIds: js.Array[String] = null,
    tableRows: js.Array[Schema$TableRow] = null,
    tableStyle: Schema$TableStyle = null
  ): Schema$Table = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds.asInstanceOf[js.Any])
    if (suggestedInsertionIds != null) __obj.updateDynamic("suggestedInsertionIds")(suggestedInsertionIds.asInstanceOf[js.Any])
    if (tableRows != null) __obj.updateDynamic("tableRows")(tableRows.asInstanceOf[js.Any])
    if (tableStyle != null) __obj.updateDynamic("tableStyle")(tableStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Table]
  }
}

