package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseNodeWithoutComments extends js.Object {
  var loc: js.UndefOr[SourceLocation | Null] = js.undefined
  var range: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  // Every leaf interface that extends BaseNode must specify a type property.
  // The type property should be a string literal. For example, Identifier
  // has: `type: "Identifier"`
  var `type`: String
}

object BaseNodeWithoutComments {
  @scala.inline
  def apply(`type`: String, loc: SourceLocation = null, range: js.Tuple2[Double, Double] = null): BaseNodeWithoutComments = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseNodeWithoutComments]
  }
}

