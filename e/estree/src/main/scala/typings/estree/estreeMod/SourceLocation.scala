package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLocation extends js.Object {
  var end: Position
  var source: js.UndefOr[String | Null] = js.undefined
  var start: Position
}

object SourceLocation {
  @scala.inline
  def apply(end: Position, start: Position, source: String = null): SourceLocation = {
    val __obj = js.Dynamic.literal(end = end, start = start)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[SourceLocation]
  }
}

