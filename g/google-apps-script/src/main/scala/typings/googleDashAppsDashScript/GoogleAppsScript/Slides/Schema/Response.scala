package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var createImage: js.UndefOr[CreateImageResponse] = js.undefined
  var createLine: js.UndefOr[CreateLineResponse] = js.undefined
  var createShape: js.UndefOr[CreateShapeResponse] = js.undefined
  var createSheetsChart: js.UndefOr[CreateSheetsChartResponse] = js.undefined
  var createSlide: js.UndefOr[CreateSlideResponse] = js.undefined
  var createTable: js.UndefOr[CreateTableResponse] = js.undefined
  var createVideo: js.UndefOr[CreateVideoResponse] = js.undefined
  var duplicateObject: js.UndefOr[DuplicateObjectResponse] = js.undefined
  var groupObjects: js.UndefOr[GroupObjectsResponse] = js.undefined
  var replaceAllShapesWithImage: js.UndefOr[ReplaceAllShapesWithImageResponse] = js.undefined
  var replaceAllShapesWithSheetsChart: js.UndefOr[ReplaceAllShapesWithSheetsChartResponse] = js.undefined
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
    groupObjects: GroupObjectsResponse = null,
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
    if (groupObjects != null) __obj.updateDynamic("groupObjects")(groupObjects.asInstanceOf[js.Any])
    if (replaceAllShapesWithImage != null) __obj.updateDynamic("replaceAllShapesWithImage")(replaceAllShapesWithImage.asInstanceOf[js.Any])
    if (replaceAllShapesWithSheetsChart != null) __obj.updateDynamic("replaceAllShapesWithSheetsChart")(replaceAllShapesWithSheetsChart.asInstanceOf[js.Any])
    if (replaceAllText != null) __obj.updateDynamic("replaceAllText")(replaceAllText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

