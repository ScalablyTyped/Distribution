package typings.forgeDashApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Range extends js.Object {
  var range: js.UndefOr[Double] = js.undefined
}

object Anon_Range {
  @scala.inline
  def apply(range: Int | Double = null): Anon_Range = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Range]
  }
}

