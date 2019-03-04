package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLocation extends js.Object {
  var end: Position
  var source: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var start: Position
}

object SourceLocation {
  @scala.inline
  def apply(end: Position, start: Position, source: java.lang.String = null): SourceLocation = {
    val __obj = js.Dynamic.literal(end = end, start = start)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[SourceLocation]
  }
}

