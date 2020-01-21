package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  /** The result of creating an image. */
  var createImage: js.UndefOr[CreateImageResponse] = js.undefined
  /** The result of creating a line. */
  var createLine: js.UndefOr[CreateLineResponse] = js.undefined
  /** The result of creating a shape. */
  var createShape: js.UndefOr[CreateShapeResponse] = js.undefined
  /** The result of creating a Google Sheets chart. */
  var createSheetsChart: js.UndefOr[CreateSheetsChartResponse] = js.undefined
  /** The result of creating a slide. */
  var createSlide: js.UndefOr[CreateSlideResponse] = js.undefined
  /** The result of creating a table. */
  var createTable: js.UndefOr[CreateTableResponse] = js.undefined
  /** The result of creating a video. */
  var createVideo: js.UndefOr[CreateVideoResponse] = js.undefined
  /** The result of duplicating an object. */
  var duplicateObject: js.UndefOr[DuplicateObjectResponse] = js.undefined
  /**
    * The result of replacing all shapes matching some criteria with an
    * image.
    */
  var replaceAllShapesWithImage: js.UndefOr[ReplaceAllShapesWithImageResponse] = js.undefined
  /**
    * The result of replacing all shapes matching some criteria with a Google
    * Sheets chart.
    */
  var replaceAllShapesWithSheetsChart: js.UndefOr[ReplaceAllShapesWithSheetsChartResponse] = js.undefined
  /** The result of replacing text. */
  var replaceAllText: js.UndefOr[ReplaceAllTextResponse] = js.undefined
}

object Response {
  @scala.inline
  def apply(
    createImage: CreateImageResponse = null,
    createLine: CreateLineResponse = null,
    createShape: CreateShapeResponse = null,
    createSheetsChart: CreateSheetsChartResponse = null,
    createSlide: CreateSlideResponse = null,
    createTable: CreateTableResponse = null,
    createVideo: CreateVideoResponse = null,
    duplicateObject: DuplicateObjectResponse = null,
    replaceAllShapesWithImage: ReplaceAllShapesWithImageResponse = null,
    replaceAllShapesWithSheetsChart: ReplaceAllShapesWithSheetsChartResponse = null,
    replaceAllText: ReplaceAllTextResponse = null
  ): Response = {
    val __obj = js.Dynamic.literal()
    if (createImage != null) __obj.updateDynamic("createImage")(createImage.asInstanceOf[js.Any])
    if (createLine != null) __obj.updateDynamic("createLine")(createLine.asInstanceOf[js.Any])
    if (createShape != null) __obj.updateDynamic("createShape")(createShape.asInstanceOf[js.Any])
    if (createSheetsChart != null) __obj.updateDynamic("createSheetsChart")(createSheetsChart.asInstanceOf[js.Any])
    if (createSlide != null) __obj.updateDynamic("createSlide")(createSlide.asInstanceOf[js.Any])
    if (createTable != null) __obj.updateDynamic("createTable")(createTable.asInstanceOf[js.Any])
    if (createVideo != null) __obj.updateDynamic("createVideo")(createVideo.asInstanceOf[js.Any])
    if (duplicateObject != null) __obj.updateDynamic("duplicateObject")(duplicateObject.asInstanceOf[js.Any])
    if (replaceAllShapesWithImage != null) __obj.updateDynamic("replaceAllShapesWithImage")(replaceAllShapesWithImage.asInstanceOf[js.Any])
    if (replaceAllShapesWithSheetsChart != null) __obj.updateDynamic("replaceAllShapesWithSheetsChart")(replaceAllShapesWithSheetsChart.asInstanceOf[js.Any])
    if (replaceAllText != null) __obj.updateDynamic("replaceAllText")(replaceAllText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

