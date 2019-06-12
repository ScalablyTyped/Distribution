package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginalSourcePosition extends js.Object {
  /**
    * Column number.
    */
  var column: scala.Double
  /**
    * Line number.
    */
  var line: scala.Double
  /**
    * Identifier, if available.
    */
  var name: java.lang.String | scala.Null
  /**
    * Source file name.
    */
  var source: java.lang.String
}

object OriginalSourcePosition {
  @scala.inline
  def apply(column: scala.Double, line: scala.Double, source: java.lang.String, name: java.lang.String = null): OriginalSourcePosition = {
    val __obj = js.Dynamic.literal(column = column, line = line, source = source)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[OriginalSourcePosition]
  }
}

