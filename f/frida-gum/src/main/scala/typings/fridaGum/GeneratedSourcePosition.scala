package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneratedSourcePosition extends js.Object {
  /**
    * Column number, if available.
    */
  var column: js.UndefOr[Double] = js.undefined
  /**
    * Line number.
    */
  var line: Double
}

object GeneratedSourcePosition {
  @scala.inline
  def apply(line: Double, column: js.UndefOr[Double] = js.undefined): GeneratedSourcePosition = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratedSourcePosition]
  }
}

