package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginalSourcePosition extends js.Object {
  /**
    * Column number.
    */
  var column: Double
  /**
    * Line number.
    */
  var line: Double
  /**
    * Identifier, if available.
    */
  var name: String | Null
  /**
    * Source file name.
    */
  var source: String
}

object OriginalSourcePosition {
  @scala.inline
  def apply(column: Double, line: Double, source: String, name: String = null): OriginalSourcePosition = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalSourcePosition]
  }
}

