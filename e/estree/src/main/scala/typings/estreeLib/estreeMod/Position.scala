package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  /** >= 0 */
  var column: scala.Double
  /** >= 1 */
  var line: scala.Double
}

object Position {
  @scala.inline
  def apply(column: scala.Double, line: scala.Double): Position = {
    val __obj = js.Dynamic.literal(column = column, line = line)
  
    __obj.asInstanceOf[Position]
  }
}

