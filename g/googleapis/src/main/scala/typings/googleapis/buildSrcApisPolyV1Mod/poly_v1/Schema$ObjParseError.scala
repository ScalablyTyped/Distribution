package typings.googleapis.buildSrcApisPolyV1Mod.poly_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of an error resulting from parsing an OBJ file
  */
@js.native
trait Schema$ObjParseError extends js.Object {
  /**
    * The type of problem found (required).
    */
  var code: js.UndefOr[String] = js.native
  /**
    * The ending character index at which the problem was found.
    */
  var endIndex: js.UndefOr[Double] = js.native
  /**
    * The file path in which the problem was found.
    */
  var filePath: js.UndefOr[String] = js.native
  /**
    * The text of the line. Note that this may be truncated if the line was
    * very long. This may not include the error if it occurs after line
    * truncation.
    */
  var line: js.UndefOr[String] = js.native
  /**
    * Line number at which the problem was found.
    */
  var lineNumber: js.UndefOr[Double] = js.native
  /**
    * The starting character index at which the problem was found.
    */
  var startIndex: js.UndefOr[Double] = js.native
}

object Schema$ObjParseError {
  @scala.inline
  def apply(
    code: String = null,
    endIndex: Int | Double = null,
    filePath: String = null,
    line: String = null,
    lineNumber: Int | Double = null,
    startIndex: Int | Double = null
  ): Schema$ObjParseError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (lineNumber != null) __obj.updateDynamic("lineNumber")(lineNumber.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ObjParseError]
  }
}

