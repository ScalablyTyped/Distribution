package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

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

