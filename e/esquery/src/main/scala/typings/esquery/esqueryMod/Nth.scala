package typings.esquery.esqueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nth extends Selector {
  var index: NumericLiteral
}

object Nth {
  @scala.inline
  def apply(index: NumericLiteral, `type`: String, subject: js.UndefOr[Boolean] = js.undefined): Nth = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nth]
  }
}

