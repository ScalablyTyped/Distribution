package typings.gapiClientFirebaserules.gapi.client.firebaserules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourcePosition extends js.Object {
  /** First column on the source line associated with the source fragment. */
  var column: js.UndefOr[Double] = js.undefined
  /** Name of the `File`. */
  var fileName: js.UndefOr[String] = js.undefined
  /** Line number of the source fragment. 1-based. */
  var line: js.UndefOr[Double] = js.undefined
}

object SourcePosition {
  @scala.inline
  def apply(
    column: js.UndefOr[Double] = js.undefined,
    fileName: String = null,
    line: js.UndefOr[Double] = js.undefined
  ): SourcePosition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.get.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (!js.isUndefined(line)) __obj.updateDynamic("line")(line.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourcePosition]
  }
}

