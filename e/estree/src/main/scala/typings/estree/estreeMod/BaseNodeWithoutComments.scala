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
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[BaseNodeWithoutComments]
  }
}

