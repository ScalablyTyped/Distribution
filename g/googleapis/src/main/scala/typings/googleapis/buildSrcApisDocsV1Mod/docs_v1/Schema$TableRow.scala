package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The contents and style of a row in a Table.
  */
@js.native
trait Schema$TableRow extends js.Object {
  /**
    * The zero-based end index of this row, exclusive, in UTF-16 code units.
    */
  var endIndex: js.UndefOr[Double] = js.native
  /**
    * The zero-based start index of this row, in UTF-16 code units.
    */
  var startIndex: js.UndefOr[Double] = js.native
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested insertion IDs. A TableRow may have multiple insertion IDs
    * if it is a nested suggested change. If empty, then this is not a
    * suggested insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested style changes to this row, keyed by suggestion ID.
    */
  var suggestedTableRowStyleChanges: js.UndefOr[StringDictionary[Schema$SuggestedTableRowStyle]] = js.native
  /**
    * The contents and style of each cell in this row.  It is possible for a
    * table to be non-rectangular, so some rows may have a different number of
    * cells than other rows in the same table.
    */
  var tableCells: js.UndefOr[js.Array[Schema$TableCell]] = js.native
  /**
    * The style of the table row.
    */
  var tableRowStyle: js.UndefOr[Schema$TableRowStyle] = js.native
}

object Schema$TableRow {
  @scala.inline
  def apply(
    endIndex: Int | Double = null,
    startIndex: Int | Double = null,
    suggestedDeletionIds: js.Array[String] = null,
    suggestedInsertionIds: js.Array[String] = null,
    suggestedTableRowStyleChanges: StringDictionary[Schema$SuggestedTableRowStyle] = null,
    tableCells: js.Array[Schema$TableCell] = null,
    tableRowStyle: Schema$TableRowStyle = null
  ): Schema$TableRow = {
    val __obj = js.Dynamic.literal()
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds.asInstanceOf[js.Any])
    if (suggestedInsertionIds != null) __obj.updateDynamic("suggestedInsertionIds")(suggestedInsertionIds.asInstanceOf[js.Any])
    if (suggestedTableRowStyleChanges != null) __obj.updateDynamic("suggestedTableRowStyleChanges")(suggestedTableRowStyleChanges.asInstanceOf[js.Any])
    if (tableCells != null) __obj.updateDynamic("tableCells")(tableCells.asInstanceOf[js.Any])
    if (tableRowStyle != null) __obj.updateDynamic("tableRowStyle")(tableRowStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TableRow]
  }
}

