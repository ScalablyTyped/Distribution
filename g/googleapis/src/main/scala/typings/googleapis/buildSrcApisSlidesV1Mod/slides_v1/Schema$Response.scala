package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single response from an update.
  */
@js.native
trait Schema$Response extends js.Object {
  /**
    * The result of creating an image.
    */
  var createImage: js.UndefOr[Schema$CreateImageResponse] = js.native
  /**
    * The result of creating a line.
    */
  var createLine: js.UndefOr[Schema$CreateLineResponse] = js.native
  /**
    * The result of creating a shape.
    */
  var createShape: js.UndefOr[Schema$CreateShapeResponse] = js.native
  /**
    * The result of creating a Google Sheets chart.
    */
  var createSheetsChart: js.UndefOr[Schema$CreateSheetsChartResponse] = js.native
  /**
    * The result of creating a slide.
    */
  var createSlide: js.UndefOr[Schema$CreateSlideResponse] = js.native
  /**
    * The result of creating a table.
    */
  var createTable: js.UndefOr[Schema$CreateTableResponse] = js.native
  /**
    * The result of creating a video.
    */
  var createVideo: js.UndefOr[Schema$CreateVideoResponse] = js.native
  /**
    * The result of duplicating an object.
    */
  var duplicateObject: js.UndefOr[Schema$DuplicateObjectResponse] = js.native
  /**
    * The result of grouping objects.
    */
  var groupObjects: js.UndefOr[Schema$GroupObjectsResponse] = js.native
  /**
    * The result of replacing all shapes matching some criteria with an image.
    */
  var replaceAllShapesWithImage: js.UndefOr[Schema$ReplaceAllShapesWithImageResponse] = js.native
  /**
    * The result of replacing all shapes matching some criteria with a Google
    * Sheets chart.
    */
  var replaceAllShapesWithSheetsChart: js.UndefOr[Schema$ReplaceAllShapesWithSheetsChartResponse] = js.native
  /**
    * The result of replacing text.
    */
  var replaceAllText: js.UndefOr[Schema$ReplaceAllTextResponse] = js.native
}

object Schema$Response {
  @scala.inline
  def apply(
    createImage: Schema$CreateImageResponse = null,
    createLine: Schema$CreateLineResponse = null,
    createShape: Schema$CreateShapeResponse = null,
    createSheetsChart: Schema$CreateSheetsChartResponse = null,
    createSlide: Schema$CreateSlideResponse = null,
    createTable: Schema$CreateTableResponse = null,
    createVideo: Schema$CreateVideoResponse = null,
    duplicateObject: Schema$DuplicateObjectResponse = null,
    groupObjects: Schema$GroupObjectsResponse = null,
    replaceAllShapesWithImage: Schema$ReplaceAllShapesWithImageResponse = null,
    replaceAllShapesWithSheetsChart: Schema$ReplaceAllShapesWithSheetsChartResponse = null,
    replaceAllText: Schema$ReplaceAllTextResponse = null
  ): Schema$Response = {
    val __obj = js.Dynamic.literal()
    if (createImage != null) __obj.updateDynamic("createImage")(createImage.asInstanceOf[js.Any])
    if (createLine != null) __obj.updateDynamic("createLine")(createLine.asInstanceOf[js.Any])
    if (createShape != null) __obj.updateDynamic("createShape")(createShape.asInstanceOf[js.Any])
    if (createSheetsChart != null) __obj.updateDynamic("createSheetsChart")(createSheetsChart.asInstanceOf[js.Any])
    if (createSlide != null) __obj.updateDynamic("createSlide")(createSlide.asInstanceOf[js.Any])
    if (createTable != null) __obj.updateDynamic("createTable")(createTable.asInstanceOf[js.Any])
    if (createVideo != null) __obj.updateDynamic("createVideo")(createVideo.asInstanceOf[js.Any])
    if (duplicateObject != null) __obj.updateDynamic("duplicateObject")(duplicateObject.asInstanceOf[js.Any])
    if (groupObjects != null) __obj.updateDynamic("groupObjects")(groupObjects.asInstanceOf[js.Any])
    if (replaceAllShapesWithImage != null) __obj.updateDynamic("replaceAllShapesWithImage")(replaceAllShapesWithImage.asInstanceOf[js.Any])
    if (replaceAllShapesWithSheetsChart != null) __obj.updateDynamic("replaceAllShapesWithSheetsChart")(replaceAllShapesWithSheetsChart.asInstanceOf[js.Any])
    if (replaceAllText != null) __obj.updateDynamic("replaceAllText")(replaceAllText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Response]
  }
}

