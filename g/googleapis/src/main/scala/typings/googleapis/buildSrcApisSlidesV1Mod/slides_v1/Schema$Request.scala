package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single kind of update to apply to a presentation.
  */
@js.native
trait Schema$Request extends js.Object {
  /**
    * Creates an image.
    */
  var createImage: js.UndefOr[Schema$CreateImageRequest] = js.native
  /**
    * Creates a line.
    */
  var createLine: js.UndefOr[Schema$CreateLineRequest] = js.native
  /**
    * Creates bullets for paragraphs.
    */
  var createParagraphBullets: js.UndefOr[Schema$CreateParagraphBulletsRequest] = js.native
  /**
    * Creates a new shape.
    */
  var createShape: js.UndefOr[Schema$CreateShapeRequest] = js.native
  /**
    * Creates an embedded Google Sheets chart.
    */
  var createSheetsChart: js.UndefOr[Schema$CreateSheetsChartRequest] = js.native
  /**
    * Creates a new slide.
    */
  var createSlide: js.UndefOr[Schema$CreateSlideRequest] = js.native
  /**
    * Creates a new table.
    */
  var createTable: js.UndefOr[Schema$CreateTableRequest] = js.native
  /**
    * Creates a video.
    */
  var createVideo: js.UndefOr[Schema$CreateVideoRequest] = js.native
  /**
    * Deletes a page or page element from the presentation.
    */
  var deleteObject: js.UndefOr[Schema$DeleteObjectRequest] = js.native
  /**
    * Deletes bullets from paragraphs.
    */
  var deleteParagraphBullets: js.UndefOr[Schema$DeleteParagraphBulletsRequest] = js.native
  /**
    * Deletes a column from a table.
    */
  var deleteTableColumn: js.UndefOr[Schema$DeleteTableColumnRequest] = js.native
  /**
    * Deletes a row from a table.
    */
  var deleteTableRow: js.UndefOr[Schema$DeleteTableRowRequest] = js.native
  /**
    * Deletes text from a shape or a table cell.
    */
  var deleteText: js.UndefOr[Schema$DeleteTextRequest] = js.native
  /**
    * Duplicates a slide or page element.
    */
  var duplicateObject: js.UndefOr[Schema$DuplicateObjectRequest] = js.native
  /**
    * Groups objects, such as page elements.
    */
  var groupObjects: js.UndefOr[Schema$GroupObjectsRequest] = js.native
  /**
    * Inserts columns into a table.
    */
  var insertTableColumns: js.UndefOr[Schema$InsertTableColumnsRequest] = js.native
  /**
    * Inserts rows into a table.
    */
  var insertTableRows: js.UndefOr[Schema$InsertTableRowsRequest] = js.native
  /**
    * Inserts text into a shape or table cell.
    */
  var insertText: js.UndefOr[Schema$InsertTextRequest] = js.native
  /**
    * Merges cells in a Table.
    */
  var mergeTableCells: js.UndefOr[Schema$MergeTableCellsRequest] = js.native
  /**
    * Refreshes a Google Sheets chart.
    */
  var refreshSheetsChart: js.UndefOr[Schema$RefreshSheetsChartRequest] = js.native
  /**
    * Replaces all shapes matching some criteria with an image.
    */
  var replaceAllShapesWithImage: js.UndefOr[Schema$ReplaceAllShapesWithImageRequest] = js.native
  /**
    * Replaces all shapes matching some criteria with a Google Sheets chart.
    */
  var replaceAllShapesWithSheetsChart: js.UndefOr[Schema$ReplaceAllShapesWithSheetsChartRequest] = js.native
  /**
    * Replaces all instances of specified text.
    */
  var replaceAllText: js.UndefOr[Schema$ReplaceAllTextRequest] = js.native
  /**
    * Replaces an existing image with a new image.
    */
  var replaceImage: js.UndefOr[Schema$ReplaceImageRequest] = js.native
  /**
    * Reroutes a line such that it&#39;s connected at the two closest
    * connection sites on the connected page elements.
    */
  var rerouteLine: js.UndefOr[Schema$RerouteLineRequest] = js.native
  /**
    * Ungroups objects, such as groups.
    */
  var ungroupObjects: js.UndefOr[Schema$UngroupObjectsRequest] = js.native
  /**
    * Unmerges cells in a Table.
    */
  var unmergeTableCells: js.UndefOr[Schema$UnmergeTableCellsRequest] = js.native
  /**
    * Updates the properties of an Image.
    */
  var updateImageProperties: js.UndefOr[Schema$UpdateImagePropertiesRequest] = js.native
  /**
    * Updates the category of a line.
    */
  var updateLineCategory: js.UndefOr[Schema$UpdateLineCategoryRequest] = js.native
  /**
    * Updates the properties of a Line.
    */
  var updateLineProperties: js.UndefOr[Schema$UpdateLinePropertiesRequest] = js.native
  /**
    * Updates the alt text title and/or description of a page element.
    */
  var updatePageElementAltText: js.UndefOr[Schema$UpdatePageElementAltTextRequest] = js.native
  /**
    * Updates the transform of a page element.
    */
  var updatePageElementTransform: js.UndefOr[Schema$UpdatePageElementTransformRequest] = js.native
  /**
    * Updates the Z-order of page elements.
    */
  var updatePageElementsZOrder: js.UndefOr[Schema$UpdatePageElementsZOrderRequest] = js.native
  /**
    * Updates the properties of a Page.
    */
  var updatePageProperties: js.UndefOr[Schema$UpdatePagePropertiesRequest] = js.native
  /**
    * Updates the styling of paragraphs within a Shape or Table.
    */
  var updateParagraphStyle: js.UndefOr[Schema$UpdateParagraphStyleRequest] = js.native
  /**
    * Updates the properties of a Shape.
    */
  var updateShapeProperties: js.UndefOr[Schema$UpdateShapePropertiesRequest] = js.native
  /**
    * Updates the position of a set of slides in the presentation.
    */
  var updateSlidesPosition: js.UndefOr[Schema$UpdateSlidesPositionRequest] = js.native
  /**
    * Updates the properties of the table borders in a Table.
    */
  var updateTableBorderProperties: js.UndefOr[Schema$UpdateTableBorderPropertiesRequest] = js.native
  /**
    * Updates the properties of a TableCell.
    */
  var updateTableCellProperties: js.UndefOr[Schema$UpdateTableCellPropertiesRequest] = js.native
  /**
    * Updates the properties of a Table column.
    */
  var updateTableColumnProperties: js.UndefOr[Schema$UpdateTableColumnPropertiesRequest] = js.native
  /**
    * Updates the properties of a Table row.
    */
  var updateTableRowProperties: js.UndefOr[Schema$UpdateTableRowPropertiesRequest] = js.native
  /**
    * Updates the styling of text within a Shape or Table.
    */
  var updateTextStyle: js.UndefOr[Schema$UpdateTextStyleRequest] = js.native
  /**
    * Updates the properties of a Video.
    */
  var updateVideoProperties: js.UndefOr[Schema$UpdateVideoPropertiesRequest] = js.native
}

object Schema$Request {
  @scala.inline
  def apply(
    createImage: Schema$CreateImageRequest = null,
    createLine: Schema$CreateLineRequest = null,
    createParagraphBullets: Schema$CreateParagraphBulletsRequest = null,
    createShape: Schema$CreateShapeRequest = null,
    createSheetsChart: Schema$CreateSheetsChartRequest = null,
    createSlide: Schema$CreateSlideRequest = null,
    createTable: Schema$CreateTableRequest = null,
    createVideo: Schema$CreateVideoRequest = null,
    deleteObject: Schema$DeleteObjectRequest = null,
    deleteParagraphBullets: Schema$DeleteParagraphBulletsRequest = null,
    deleteTableColumn: Schema$DeleteTableColumnRequest = null,
    deleteTableRow: Schema$DeleteTableRowRequest = null,
    deleteText: Schema$DeleteTextRequest = null,
    duplicateObject: Schema$DuplicateObjectRequest = null,
    groupObjects: Schema$GroupObjectsRequest = null,
    insertTableColumns: Schema$InsertTableColumnsRequest = null,
    insertTableRows: Schema$InsertTableRowsRequest = null,
    insertText: Schema$InsertTextRequest = null,
    mergeTableCells: Schema$MergeTableCellsRequest = null,
    refreshSheetsChart: Schema$RefreshSheetsChartRequest = null,
    replaceAllShapesWithImage: Schema$ReplaceAllShapesWithImageRequest = null,
    replaceAllShapesWithSheetsChart: Schema$ReplaceAllShapesWithSheetsChartRequest = null,
    replaceAllText: Schema$ReplaceAllTextRequest = null,
    replaceImage: Schema$ReplaceImageRequest = null,
    rerouteLine: Schema$RerouteLineRequest = null,
    ungroupObjects: Schema$UngroupObjectsRequest = null,
    unmergeTableCells: Schema$UnmergeTableCellsRequest = null,
    updateImageProperties: Schema$UpdateImagePropertiesRequest = null,
    updateLineCategory: Schema$UpdateLineCategoryRequest = null,
    updateLineProperties: Schema$UpdateLinePropertiesRequest = null,
    updatePageElementAltText: Schema$UpdatePageElementAltTextRequest = null,
    updatePageElementTransform: Schema$UpdatePageElementTransformRequest = null,
    updatePageElementsZOrder: Schema$UpdatePageElementsZOrderRequest = null,
    updatePageProperties: Schema$UpdatePagePropertiesRequest = null,
    updateParagraphStyle: Schema$UpdateParagraphStyleRequest = null,
    updateShapeProperties: Schema$UpdateShapePropertiesRequest = null,
    updateSlidesPosition: Schema$UpdateSlidesPositionRequest = null,
    updateTableBorderProperties: Schema$UpdateTableBorderPropertiesRequest = null,
    updateTableCellProperties: Schema$UpdateTableCellPropertiesRequest = null,
    updateTableColumnProperties: Schema$UpdateTableColumnPropertiesRequest = null,
    updateTableRowProperties: Schema$UpdateTableRowPropertiesRequest = null,
    updateTextStyle: Schema$UpdateTextStyleRequest = null,
    updateVideoProperties: Schema$UpdateVideoPropertiesRequest = null
  ): Schema$Request = {
    val __obj = js.Dynamic.literal()
    if (createImage != null) __obj.updateDynamic("createImage")(createImage.asInstanceOf[js.Any])
    if (createLine != null) __obj.updateDynamic("createLine")(createLine.asInstanceOf[js.Any])
    if (createParagraphBullets != null) __obj.updateDynamic("createParagraphBullets")(createParagraphBullets.asInstanceOf[js.Any])
    if (createShape != null) __obj.updateDynamic("createShape")(createShape.asInstanceOf[js.Any])
    if (createSheetsChart != null) __obj.updateDynamic("createSheetsChart")(createSheetsChart.asInstanceOf[js.Any])
    if (createSlide != null) __obj.updateDynamic("createSlide")(createSlide.asInstanceOf[js.Any])
    if (createTable != null) __obj.updateDynamic("createTable")(createTable.asInstanceOf[js.Any])
    if (createVideo != null) __obj.updateDynamic("createVideo")(createVideo.asInstanceOf[js.Any])
    if (deleteObject != null) __obj.updateDynamic("deleteObject")(deleteObject.asInstanceOf[js.Any])
    if (deleteParagraphBullets != null) __obj.updateDynamic("deleteParagraphBullets")(deleteParagraphBullets.asInstanceOf[js.Any])
    if (deleteTableColumn != null) __obj.updateDynamic("deleteTableColumn")(deleteTableColumn.asInstanceOf[js.Any])
    if (deleteTableRow != null) __obj.updateDynamic("deleteTableRow")(deleteTableRow.asInstanceOf[js.Any])
    if (deleteText != null) __obj.updateDynamic("deleteText")(deleteText.asInstanceOf[js.Any])
    if (duplicateObject != null) __obj.updateDynamic("duplicateObject")(duplicateObject.asInstanceOf[js.Any])
    if (groupObjects != null) __obj.updateDynamic("groupObjects")(groupObjects.asInstanceOf[js.Any])
    if (insertTableColumns != null) __obj.updateDynamic("insertTableColumns")(insertTableColumns.asInstanceOf[js.Any])
    if (insertTableRows != null) __obj.updateDynamic("insertTableRows")(insertTableRows.asInstanceOf[js.Any])
    if (insertText != null) __obj.updateDynamic("insertText")(insertText.asInstanceOf[js.Any])
    if (mergeTableCells != null) __obj.updateDynamic("mergeTableCells")(mergeTableCells.asInstanceOf[js.Any])
    if (refreshSheetsChart != null) __obj.updateDynamic("refreshSheetsChart")(refreshSheetsChart.asInstanceOf[js.Any])
    if (replaceAllShapesWithImage != null) __obj.updateDynamic("replaceAllShapesWithImage")(replaceAllShapesWithImage.asInstanceOf[js.Any])
    if (replaceAllShapesWithSheetsChart != null) __obj.updateDynamic("replaceAllShapesWithSheetsChart")(replaceAllShapesWithSheetsChart.asInstanceOf[js.Any])
    if (replaceAllText != null) __obj.updateDynamic("replaceAllText")(replaceAllText.asInstanceOf[js.Any])
    if (replaceImage != null) __obj.updateDynamic("replaceImage")(replaceImage.asInstanceOf[js.Any])
    if (rerouteLine != null) __obj.updateDynamic("rerouteLine")(rerouteLine.asInstanceOf[js.Any])
    if (ungroupObjects != null) __obj.updateDynamic("ungroupObjects")(ungroupObjects.asInstanceOf[js.Any])
    if (unmergeTableCells != null) __obj.updateDynamic("unmergeTableCells")(unmergeTableCells.asInstanceOf[js.Any])
    if (updateImageProperties != null) __obj.updateDynamic("updateImageProperties")(updateImageProperties.asInstanceOf[js.Any])
    if (updateLineCategory != null) __obj.updateDynamic("updateLineCategory")(updateLineCategory.asInstanceOf[js.Any])
    if (updateLineProperties != null) __obj.updateDynamic("updateLineProperties")(updateLineProperties.asInstanceOf[js.Any])
    if (updatePageElementAltText != null) __obj.updateDynamic("updatePageElementAltText")(updatePageElementAltText.asInstanceOf[js.Any])
    if (updatePageElementTransform != null) __obj.updateDynamic("updatePageElementTransform")(updatePageElementTransform.asInstanceOf[js.Any])
    if (updatePageElementsZOrder != null) __obj.updateDynamic("updatePageElementsZOrder")(updatePageElementsZOrder.asInstanceOf[js.Any])
    if (updatePageProperties != null) __obj.updateDynamic("updatePageProperties")(updatePageProperties.asInstanceOf[js.Any])
    if (updateParagraphStyle != null) __obj.updateDynamic("updateParagraphStyle")(updateParagraphStyle.asInstanceOf[js.Any])
    if (updateShapeProperties != null) __obj.updateDynamic("updateShapeProperties")(updateShapeProperties.asInstanceOf[js.Any])
    if (updateSlidesPosition != null) __obj.updateDynamic("updateSlidesPosition")(updateSlidesPosition.asInstanceOf[js.Any])
    if (updateTableBorderProperties != null) __obj.updateDynamic("updateTableBorderProperties")(updateTableBorderProperties.asInstanceOf[js.Any])
    if (updateTableCellProperties != null) __obj.updateDynamic("updateTableCellProperties")(updateTableCellProperties.asInstanceOf[js.Any])
    if (updateTableColumnProperties != null) __obj.updateDynamic("updateTableColumnProperties")(updateTableColumnProperties.asInstanceOf[js.Any])
    if (updateTableRowProperties != null) __obj.updateDynamic("updateTableRowProperties")(updateTableRowProperties.asInstanceOf[js.Any])
    if (updateTextStyle != null) __obj.updateDynamic("updateTextStyle")(updateTextStyle.asInstanceOf[js.Any])
    if (updateVideoProperties != null) __obj.updateDynamic("updateVideoProperties")(updateVideoProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Request]
  }
}

