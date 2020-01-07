package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The contents and style of a cell in a Table.
  */
@js.native
trait Schema$TableCell extends js.Object {
  /**
    * The content of the cell.
    */
  var content: js.UndefOr[js.Array[Schema$StructuralElement]] = js.native
  /**
    * The zero-based end index of this cell, exclusive, in UTF-16 code units.
    */
  var endIndex: js.UndefOr[Double] = js.native
  /**
    * The zero-based start index of this cell, in UTF-16 code units.
    */
  var startIndex: js.UndefOr[Double] = js.native
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested insertion IDs. A TableCell may have multiple insertion IDs
    * if it is a nested suggested change. If empty, then this is not a
    * suggested insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested changes to the table cell style, keyed by suggestion ID.
    */
  var suggestedTableCellStyleChanges: js.UndefOr[StringDictionary[Schema$SuggestedTableCellStyle]] = js.native
  /**
    * The style of the cell.
    */
  var tableCellStyle: js.UndefOr[Schema$TableCellStyle] = js.native
}

object Schema$TableCell {
  @scala.inline
  def apply(
    content: js.Array[Schema$StructuralElement] = null,
    endIndex: Int | Double = null,
    startIndex: Int | Double = null,
    suggestedDeletionIds: js.Array[String] = null,
    suggestedInsertionIds: js.Array[String] = null,
    suggestedTableCellStyleChanges: StringDictionary[Schema$SuggestedTableCellStyle] = null,
    tableCellStyle: Schema$TableCellStyle = null
  ): Schema$TableCell = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds.asInstanceOf[js.Any])
    if (suggestedInsertionIds != null) __obj.updateDynamic("suggestedInsertionIds")(suggestedInsertionIds.asInstanceOf[js.Any])
    if (suggestedTableCellStyleChanges != null) __obj.updateDynamic("suggestedTableCellStyleChanges")(suggestedTableCellStyleChanges.asInstanceOf[js.Any])
    if (tableCellStyle != null) __obj.updateDynamic("tableCellStyle")(tableCellStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TableCell]
  }
}

