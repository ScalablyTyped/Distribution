package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var createImage: js.UndefOr[CreateImageRequest] = js.undefined
  var createLine: js.UndefOr[CreateLineRequest] = js.undefined
  var createParagraphBullets: js.UndefOr[CreateParagraphBulletsRequest] = js.undefined
  var createShape: js.UndefOr[CreateShapeRequest] = js.undefined
  var createSheetsChart: js.UndefOr[CreateSheetsChartRequest] = js.undefined
  var createSlide: js.UndefOr[CreateSlideRequest] = js.undefined
  var createTable: js.UndefOr[CreateTableRequest] = js.undefined
  var createVideo: js.UndefOr[CreateVideoRequest] = js.undefined
  var deleteObject: js.UndefOr[DeleteObjectRequest] = js.undefined
  var deleteParagraphBullets: js.UndefOr[DeleteParagraphBulletsRequest] = js.undefined
  var deleteTableColumn: js.UndefOr[DeleteTableColumnRequest] = js.undefined
  var deleteTableRow: js.UndefOr[DeleteTableRowRequest] = js.undefined
  var deleteText: js.UndefOr[DeleteTextRequest] = js.undefined
  var duplicateObject: js.UndefOr[DuplicateObjectRequest] = js.undefined
  var groupObjects: js.UndefOr[GroupObjectsRequest] = js.undefined
  var insertTableColumns: js.UndefOr[InsertTableColumnsRequest] = js.undefined
  var insertTableRows: js.UndefOr[InsertTableRowsRequest] = js.undefined
  var insertText: js.UndefOr[InsertTextRequest] = js.undefined
  var mergeTableCells: js.UndefOr[MergeTableCellsRequest] = js.undefined
  var refreshSheetsChart: js.UndefOr[RefreshSheetsChartRequest] = js.undefined
  var replaceAllShapesWithImage: js.UndefOr[ReplaceAllShapesWithImageRequest] = js.undefined
  var replaceAllShapesWithSheetsChart: js.UndefOr[ReplaceAllShapesWithSheetsChartRequest] = js.undefined
  var replaceAllText: js.UndefOr[ReplaceAllTextRequest] = js.undefined
  var replaceImage: js.UndefOr[ReplaceImageRequest] = js.undefined
  var rerouteLine: js.UndefOr[RerouteLineRequest] = js.undefined
  var ungroupObjects: js.UndefOr[UngroupObjectsRequest] = js.undefined
  var unmergeTableCells: js.UndefOr[UnmergeTableCellsRequest] = js.undefined
  var updateImageProperties: js.UndefOr[UpdateImagePropertiesRequest] = js.undefined
  var updateLineCategory: js.UndefOr[UpdateLineCategoryRequest] = js.undefined
  var updateLineProperties: js.UndefOr[UpdateLinePropertiesRequest] = js.undefined
  var updatePageElementAltText: js.UndefOr[UpdatePageElementAltTextRequest] = js.undefined
  var updatePageElementTransform: js.UndefOr[UpdatePageElementTransformRequest] = js.undefined
  var updatePageElementsZOrder: js.UndefOr[UpdatePageElementsZOrderRequest] = js.undefined
  var updatePageProperties: js.UndefOr[UpdatePagePropertiesRequest] = js.undefined
  var updateParagraphStyle: js.UndefOr[UpdateParagraphStyleRequest] = js.undefined
  var updateShapeProperties: js.UndefOr[UpdateShapePropertiesRequest] = js.undefined
  var updateSlidesPosition: js.UndefOr[UpdateSlidesPositionRequest] = js.undefined
  var updateTableBorderProperties: js.UndefOr[UpdateTableBorderPropertiesRequest] = js.undefined
  var updateTableCellProperties: js.UndefOr[UpdateTableCellPropertiesRequest] = js.undefined
  var updateTableColumnProperties: js.UndefOr[UpdateTableColumnPropertiesRequest] = js.undefined
  var updateTableRowProperties: js.UndefOr[UpdateTableRowPropertiesRequest] = js.undefined
  var updateTextStyle: js.UndefOr[UpdateTextStyleRequest] = js.undefined
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
    groupObjects: GroupObjectsRequest = null,
    insertTableColumns: InsertTableColumnsRequest = null,
    insertTableRows: InsertTableRowsRequest = null,
    insertText: InsertTextRequest = null,
    mergeTableCells: MergeTableCellsRequest = null,
    refreshSheetsChart: RefreshSheetsChartRequest = null,
    replaceAllShapesWithImage: ReplaceAllShapesWithImageRequest = null,
    replaceAllShapesWithSheetsChart: ReplaceAllShapesWithSheetsChartRequest = null,
    replaceAllText: ReplaceAllTextRequest = null,
    replaceImage: ReplaceImageRequest = null,
    rerouteLine: RerouteLineRequest = null,
    ungroupObjects: UngroupObjectsRequest = null,
    unmergeTableCells: UnmergeTableCellsRequest = null,
    updateImageProperties: UpdateImagePropertiesRequest = null,
    updateLineCategory: UpdateLineCategoryRequest = null,
    updateLineProperties: UpdateLinePropertiesRequest = null,
    updatePageElementAltText: UpdatePageElementAltTextRequest = null,
    updatePageElementTransform: UpdatePageElementTransformRequest = null,
    updatePageElementsZOrder: UpdatePageElementsZOrderRequest = null,
    updatePageProperties: UpdatePagePropertiesRequest = null,
    updateParagraphStyle: UpdateParagraphStyleRequest = null,
    updateShapeProperties: UpdateShapePropertiesRequest = null,
    updateSlidesPosition: UpdateSlidesPositionRequest = null,
    updateTableBorderProperties: UpdateTableBorderPropertiesRequest = null,
    updateTableCellProperties: UpdateTableCellPropertiesRequest = null,
    updateTableColumnProperties: UpdateTableColumnPropertiesRequest = null,
    updateTableRowProperties: UpdateTableRowPropertiesRequest = null,
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
    __obj.asInstanceOf[Request]
  }
}

