package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

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

