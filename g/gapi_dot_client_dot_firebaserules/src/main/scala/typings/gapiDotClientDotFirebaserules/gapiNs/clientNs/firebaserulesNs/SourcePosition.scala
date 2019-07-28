package typings.gapiDotClientDotFirebaserules.gapiNs.clientNs.firebaserulesNs

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
  def apply(column: Int | Double = null, fileName: String = null, line: Int | Double = null): SourcePosition = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourcePosition]
  }
}

