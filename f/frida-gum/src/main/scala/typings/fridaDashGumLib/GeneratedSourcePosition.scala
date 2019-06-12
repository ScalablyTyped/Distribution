package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneratedSourcePosition extends js.Object {
  /**
    * Column number, if available.
    */
  var column: js.UndefOr[scala.Double] = js.undefined
  /**
    * Line number.
    */
  var line: scala.Double
}

object GeneratedSourcePosition {
  @scala.inline
  def apply(line: scala.Double, column: scala.Int | scala.Double = null): GeneratedSourcePosition = {
    val __obj = js.Dynamic.literal(line = line)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratedSourcePosition]
  }
}

