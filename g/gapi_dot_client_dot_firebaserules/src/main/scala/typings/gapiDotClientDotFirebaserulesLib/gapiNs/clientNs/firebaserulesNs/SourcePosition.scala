package typings
package gapiDotClientDotFirebaserulesLib.gapiNs.clientNs.firebaserulesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourcePosition extends js.Object {
  /** First column on the source line associated with the source fragment. */
  var column: js.UndefOr[scala.Double] = js.undefined
  /** Name of the `File`. */
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  /** Line number of the source fragment. 1-based. */
  var line: js.UndefOr[scala.Double] = js.undefined
}

object SourcePosition {
  @scala.inline
  def apply(
    column: scala.Int | scala.Double = null,
    fileName: java.lang.String = null,
    line: scala.Int | scala.Double = null
  ): SourcePosition = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourcePosition]
  }
}

