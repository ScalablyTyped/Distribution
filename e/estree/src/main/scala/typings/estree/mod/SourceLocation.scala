package typings.estree.mod

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
  def apply(end: Position, start: Position, source: js.UndefOr[Null | String] = js.undefined): SourceLocation = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (!js.isUndefined(source)) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceLocation]
  }
}

