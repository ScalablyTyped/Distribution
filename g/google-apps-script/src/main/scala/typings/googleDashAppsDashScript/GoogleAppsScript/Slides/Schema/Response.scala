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
    if (createImage != null) __obj.updateDynamic("createImage")(createImage)
    if (createLine != null) __obj.updateDynamic("createLine")(createLine)
    if (createShape != null) __obj.updateDynamic("createShape")(createShape)
    if (createSheetsChart != null) __obj.updateDynamic("createSheetsChart")(createSheetsChart)
    if (createSlide != null) __obj.updateDynamic("createSlide")(createSlide)
    if (createTable != null) __obj.updateDynamic("createTable")(createTable)
    if (createVideo != null) __obj.updateDynamic("createVideo")(createVideo)
    if (duplicateObject != null) __obj.updateDynamic("duplicateObject")(duplicateObject)
    if (groupObjects != null) __obj.updateDynamic("groupObjects")(groupObjects)
    if (replaceAllShapesWithImage != null) __obj.updateDynamic("replaceAllShapesWithImage")(replaceAllShapesWithImage)
    if (replaceAllShapesWithSheetsChart != null) __obj.updateDynamic("replaceAllShapesWithSheetsChart")(replaceAllShapesWithSheetsChart)
    if (replaceAllText != null) __obj.updateDynamic("replaceAllText")(replaceAllText)
    __obj.asInstanceOf[Response]
  }
}

