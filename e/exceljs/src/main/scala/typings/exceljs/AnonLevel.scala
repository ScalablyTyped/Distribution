package typings.exceljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLevel extends js.Object {
  /**
  		 * @default 6
  		 */
  var level: Double
}

object AnonLevel {
  @scala.inline
  def apply(level: Double): AnonLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLevel]
  }
}

