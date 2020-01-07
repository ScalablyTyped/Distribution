package typings.googleapis.buildSrcApisFirebaserulesV1Mod.firebaserules_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Position in the `Source` content including its line, column number, and an
  * index of the `File` in the `Source` message. Used for debug purposes.
  */
@js.native
trait Schema$SourcePosition extends js.Object {
  /**
    * First column on the source line associated with the source fragment.
    */
  var column: js.UndefOr[Double] = js.native
  /**
    * Name of the `File`.
    */
  var fileName: js.UndefOr[String] = js.native
  /**
    * Line number of the source fragment. 1-based.
    */
  var line: js.UndefOr[Double] = js.native
}

object Schema$SourcePosition {
  @scala.inline
  def apply(column: Int | Double = null, fileName: String = null, line: Int | Double = null): Schema$SourcePosition = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SourcePosition]
  }
}

