package typings.dotenvDashFlow.dotenvDashFlowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotenvReadFileOptions extends js.Object {
  /**
    * Encoding for reading the `.env*` files.
    */
  var encoding: js.UndefOr[String] = js.undefined
}

object DotenvReadFileOptions {
  @scala.inline
  def apply(encoding: String = null): DotenvReadFileOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotenvReadFileOptions]
  }
}

