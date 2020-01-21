package typings.getRange.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  /**
  		End of the range.
  		*/
  val end: Double
  /**
  		Start of the range.
  		@default 0
  		*/
  val start: js.UndefOr[Double] = js.undefined
  /**
  		Distance between numbers.
  		Minimum: `1`.
  		@default 1
  		*/
  val step: js.UndefOr[Double] = js.undefined
}

object Range {
  @scala.inline
  def apply(end: Double, start: Int | Double = null, step: Int | Double = null): Range = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
}

