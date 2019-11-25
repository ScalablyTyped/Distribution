package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  /** Creates an image. */
  var createImage: js.UndefOr[CreateImageRequest] = js.undefined
  /** Creates a line. */
  var createLine: js.UndefOr[CreateLineRequest] = js.undefined
  /** Creates bullets for paragraphs. */
  var createParagraphBullets: js.UndefOr[CreateParagraphBulletsRequest] = js.undefined
  /** Creates a new shape. */
  var createShape: js.UndefOr[CreateShapeRequest] = js.undefined
  /** Creates an embedded Google Sheets chart. */
  var createSheetsChart: js.UndefOr[CreateSheetsChartRequest] = js.undefined
  /** Creates a new slide. */
  var createSlide: js.UndefOr[CreateSlideRequest] = js.undefined
  /** Creates a new table. */
  var createTable: js.UndefOr[CreateTableRequest] = js.undefined
  /** Creates a video. */
  var createVideo: js.UndefOr[CreateVideoRequest] = js.undefined
  /** Deletes a page or page element from the presentation. */
  var deleteObject: js.UndefOr[DeleteObjectRequest] = js.undefined
  /** Deletes bullets from paragraphs. */
  var deleteParagraphBullets: js.UndefOr[DeleteParagraphBulletsRequest] = js.undefined
  /** Deletes a column from a table. */
  var deleteTableColumn: js.UndefOr[DeleteTableColumnRequest] = js.undefined
  /** Deletes a row from a table. */
  var deleteTableRow: js.UndefOr[DeleteTableRowRequest] = js.undefined
  /** Deletes text from a shape or a table cell. */
  var deleteText: js.UndefOr[DeleteTextRequest] = js.undefined
  /** Duplicates a slide or page element. */
  var duplicateObject: js.UndefOr[DuplicateObjectRequest] = js.undefined
  /** Inserts columns into a table. */
  var insertTableColumns: js.UndefOr[InsertTableColumnsRequest] = js.undefined
  /** Inserts rows into a table. */
  var insertTableRows: js.UndefOr[InsertTableRowsRequest] = js.undefined
  /** Inserts text into a shape or table cell. */
  var insertText: js.UndefOr[InsertTextRequest] = js.undefined
  /** Refreshes a Google Sheets chart. */
  var refreshSheetsChart: js.UndefOr[RefreshSheetsChartRequest] = js.undefined
  /** Replaces all shapes matching some criteria with an image. */
  var replaceAllShapesWithImage: js.UndefOr[ReplaceAllShapesWithImageRequest] = js.undefined
  /** Replaces all shapes matching some criteria with a Google Sheets chart. */
  var replaceAllShapesWithSheetsChart: js.UndefOr[ReplaceAllShapesWithSheetsChartRequest] = js.undefined
  /** Replaces all instances of specified text. */
  var replaceAllText: js.UndefOr[ReplaceAllTextRequest] = js.undefined
  /** Updates the properties of an Image. */
  var updateImageProperties: js.UndefOr[UpdateImagePropertiesRequest] = js.undefined
  /** Updates the properties of a Line. */
  var updateLineProperties: js.UndefOr[UpdateLinePropertiesRequest] = js.undefined
  /** Updates the transform of a page element. */
  var updatePageElementTransform: js.UndefOr[UpdatePageElementTransformRequest] = js.undefined
  /** Updates the properties of a Page. */
  var updatePageProperties: js.UndefOr[UpdatePagePropertiesRequest] = js.undefined
  /** Updates the styling of paragraphs within a Shape or Table. */
  var updateParagraphStyle: js.UndefOr[UpdateParagraphStyleRequest] = js.undefined
  /** Updates the properties of a Shape. */
  var updateShapeProperties: js.UndefOr[UpdateShapePropertiesRequest] = js.undefined
  /** Updates the position of a set of slides in the presentation. */
  var updateSlidesPosition: js.UndefOr[UpdateSlidesPositionRequest] = js.undefined
  /** Updates the properties of a TableCell. */
  var updateTableCellProperties: js.UndefOr[UpdateTableCellPropertiesRequest] = js.undefined
  /** Updates the styling of text within a Shape or Table. */
  var updateTextStyle: js.UndefOr[UpdateTextStyleRequest] = js.undefined
  /** Updates the properties of a Video. */
  var updateVideoProperties: js.UndefOr[UpdateVideoPropertiesRequest] = js.undefined
}

object Request {
  @scala.inline
  def apply(
    createImage: CreateImageRequest = null,
    createLine: CreateLineRequest = null,
    createParagraphBullets: CreateParagraphBulletsRequest = null,
    createShape: CreateShapeRequest = null,
    createSheetsChart: CreateSheetsChartRequest = null,
    createSlide: CreateSlideRequest = null,
    createTable: CreateTableRequest = null,
    createVideo: CreateVideoRequest = null,
    deleteObject: DeleteObjectRequest = null,
    deleteParagraphBullets: DeleteParagraphBulletsRequest = null,
    deleteTableColumn: DeleteTableColumnRequest = null,
    deleteTableRow: DeleteTableRowRequest = null,
    deleteText: DeleteTextRequest = null,
    duplicateObject: DuplicateObjectRequest = null,
    insertTableColumns: InsertTableColumnsRequest = null,
    insertTableRows: InsertTableRowsRequest = null,
    insertText: InsertTextRequest = null,
    refreshSheetsChart: RefreshSheetsChartRequest = null,
    replaceAllShapesWithImage: ReplaceAllShapesWithImageRequest = null,
    replaceAllShapesWithSheetsChart: ReplaceAllShapesWithSheetsChartRequest = null,
    replaceAllText: ReplaceAllTextRequest = null,
    updateImageProperties: UpdateImagePropertiesRequest = null,
    updateLineProperties: UpdateLinePropertiesRequest = null,
    updatePageElementTransform: UpdatePageElementTransformRequest = null,
    updatePageProperties: UpdatePagePropertiesRequest = null,
    updateParagraphStyle: UpdateParagraphStyleRequest = null,
    updateShapeProperties: UpdateShapePropertiesRequest = null,
    updateSlidesPosition: UpdateSlidesPositionRequest = null,
    updateTableCellProperties: UpdateTableCellPropertiesRequest = null,
    updateTextStyle: UpdateTextStyleRequest = null,
    updateVideoProperties: UpdateVideoPropertiesRequest = null
  ): Request = {
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
    if (insertTableColumns != null) __obj.updateDynamic("insertTableColumns")(insertTableColumns.asInstanceOf[js.Any])
    if (insertTableRows != null) __obj.updateDynamic("insertTableRows")(insertTableRows.asInstanceOf[js.Any])
    if (insertText != null) __obj.updateDynamic("insertText")(insertText.asInstanceOf[js.Any])
    if (refreshSheetsChart != null) __obj.updateDynamic("refreshSheetsChart")(refreshSheetsChart.asInstanceOf[js.Any])
    if (replaceAllShapesWithImage != null) __obj.updateDynamic("replaceAllShapesWithImage")(replaceAllShapesWithImage.asInstanceOf[js.Any])
    if (replaceAllShapesWithSheetsChart != null) __obj.updateDynamic("replaceAllShapesWithSheetsChart")(replaceAllShapesWithSheetsChart.asInstanceOf[js.Any])
    if (replaceAllText != null) __obj.updateDynamic("replaceAllText")(replaceAllText.asInstanceOf[js.Any])
    if (updateImageProperties != null) __obj.updateDynamic("updateImageProperties")(updateImageProperties.asInstanceOf[js.Any])
    if (updateLineProperties != null) __obj.updateDynamic("updateLineProperties")(updateLineProperties.asInstanceOf[js.Any])
    if (updatePageElementTransform != null) __obj.updateDynamic("updatePageElementTransform")(updatePageElementTransform.asInstanceOf[js.Any])
    if (updatePageProperties != null) __obj.updateDynamic("updatePageProperties")(updatePageProperties.asInstanceOf[js.Any])
    if (updateParagraphStyle != null) __obj.updateDynamic("updateParagraphStyle")(updateParagraphStyle.asInstanceOf[js.Any])
    if (updateShapeProperties != null) __obj.updateDynamic("updateShapeProperties")(updateShapeProperties.asInstanceOf[js.Any])
    if (updateSlidesPosition != null) __obj.updateDynamic("updateSlidesPosition")(updateSlidesPosition.asInstanceOf[js.Any])
    if (updateTableCellProperties != null) __obj.updateDynamic("updateTableCellProperties")(updateTableCellProperties.asInstanceOf[js.Any])
    if (updateTextStyle != null) __obj.updateDynamic("updateTextStyle")(updateTextStyle.asInstanceOf[js.Any])
    if (updateVideoProperties != null) __obj.updateDynamic("updateVideoProperties")(updateVideoProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

