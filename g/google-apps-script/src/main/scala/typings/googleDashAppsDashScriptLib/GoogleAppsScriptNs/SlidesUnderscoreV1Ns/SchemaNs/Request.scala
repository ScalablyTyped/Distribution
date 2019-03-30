package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

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
    if (createImage != null) __obj.updateDynamic("createImage")(createImage)
    if (createLine != null) __obj.updateDynamic("createLine")(createLine)
    if (createParagraphBullets != null) __obj.updateDynamic("createParagraphBullets")(createParagraphBullets)
    if (createShape != null) __obj.updateDynamic("createShape")(createShape)
    if (createSheetsChart != null) __obj.updateDynamic("createSheetsChart")(createSheetsChart)
    if (createSlide != null) __obj.updateDynamic("createSlide")(createSlide)
    if (createTable != null) __obj.updateDynamic("createTable")(createTable)
    if (createVideo != null) __obj.updateDynamic("createVideo")(createVideo)
    if (deleteObject != null) __obj.updateDynamic("deleteObject")(deleteObject)
    if (deleteParagraphBullets != null) __obj.updateDynamic("deleteParagraphBullets")(deleteParagraphBullets)
    if (deleteTableColumn != null) __obj.updateDynamic("deleteTableColumn")(deleteTableColumn)
    if (deleteTableRow != null) __obj.updateDynamic("deleteTableRow")(deleteTableRow)
    if (deleteText != null) __obj.updateDynamic("deleteText")(deleteText)
    if (duplicateObject != null) __obj.updateDynamic("duplicateObject")(duplicateObject)
    if (groupObjects != null) __obj.updateDynamic("groupObjects")(groupObjects)
    if (insertTableColumns != null) __obj.updateDynamic("insertTableColumns")(insertTableColumns)
    if (insertTableRows != null) __obj.updateDynamic("insertTableRows")(insertTableRows)
    if (insertText != null) __obj.updateDynamic("insertText")(insertText)
    if (mergeTableCells != null) __obj.updateDynamic("mergeTableCells")(mergeTableCells)
    if (refreshSheetsChart != null) __obj.updateDynamic("refreshSheetsChart")(refreshSheetsChart)
    if (replaceAllShapesWithImage != null) __obj.updateDynamic("replaceAllShapesWithImage")(replaceAllShapesWithImage)
    if (replaceAllShapesWithSheetsChart != null) __obj.updateDynamic("replaceAllShapesWithSheetsChart")(replaceAllShapesWithSheetsChart)
    if (replaceAllText != null) __obj.updateDynamic("replaceAllText")(replaceAllText)
    if (replaceImage != null) __obj.updateDynamic("replaceImage")(replaceImage)
    if (rerouteLine != null) __obj.updateDynamic("rerouteLine")(rerouteLine)
    if (ungroupObjects != null) __obj.updateDynamic("ungroupObjects")(ungroupObjects)
    if (unmergeTableCells != null) __obj.updateDynamic("unmergeTableCells")(unmergeTableCells)
    if (updateImageProperties != null) __obj.updateDynamic("updateImageProperties")(updateImageProperties)
    if (updateLineCategory != null) __obj.updateDynamic("updateLineCategory")(updateLineCategory)
    if (updateLineProperties != null) __obj.updateDynamic("updateLineProperties")(updateLineProperties)
    if (updatePageElementAltText != null) __obj.updateDynamic("updatePageElementAltText")(updatePageElementAltText)
    if (updatePageElementTransform != null) __obj.updateDynamic("updatePageElementTransform")(updatePageElementTransform)
    if (updatePageElementsZOrder != null) __obj.updateDynamic("updatePageElementsZOrder")(updatePageElementsZOrder)
    if (updatePageProperties != null) __obj.updateDynamic("updatePageProperties")(updatePageProperties)
    if (updateParagraphStyle != null) __obj.updateDynamic("updateParagraphStyle")(updateParagraphStyle)
    if (updateShapeProperties != null) __obj.updateDynamic("updateShapeProperties")(updateShapeProperties)
    if (updateSlidesPosition != null) __obj.updateDynamic("updateSlidesPosition")(updateSlidesPosition)
    if (updateTableBorderProperties != null) __obj.updateDynamic("updateTableBorderProperties")(updateTableBorderProperties)
    if (updateTableCellProperties != null) __obj.updateDynamic("updateTableCellProperties")(updateTableCellProperties)
    if (updateTableColumnProperties != null) __obj.updateDynamic("updateTableColumnProperties")(updateTableColumnProperties)
    if (updateTableRowProperties != null) __obj.updateDynamic("updateTableRowProperties")(updateTableRowProperties)
    if (updateTextStyle != null) __obj.updateDynamic("updateTextStyle")(updateTextStyle)
    if (updateVideoProperties != null) __obj.updateDynamic("updateVideoProperties")(updateVideoProperties)
    __obj.asInstanceOf[Request]
  }
}

