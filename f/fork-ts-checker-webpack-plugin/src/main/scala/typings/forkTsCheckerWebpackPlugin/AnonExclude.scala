package typings.forkTsCheckerWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExclude extends js.Object {
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  var typeCheck: js.UndefOr[Boolean] = js.undefined
}

object AnonExclude {
  @scala.inline
  def apply(exclude: js.Array[String] = null, typeCheck: js.UndefOr[Boolean] = js.undefined): AnonExclude = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (!js.isUndefined(typeCheck)) __obj.updateDynamic("typeCheck")(typeCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExclude]
  }
}

