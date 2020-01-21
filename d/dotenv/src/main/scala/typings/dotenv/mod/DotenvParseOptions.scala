package typings.dotenv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotenvParseOptions extends js.Object {
  /**
    * You may turn on logging to help debug why certain keys or values are not being set as you expect.
    */
  var debug: js.UndefOr[Boolean] = js.undefined
}

object DotenvParseOptions {
  @scala.inline
  def apply(debug: js.UndefOr[Boolean] = js.undefined): DotenvParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotenvParseOptions]
  }
}

