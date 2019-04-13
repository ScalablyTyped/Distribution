package typings
package gmLib.gmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetterOptions extends js.Object {
  var bufferStream: js.UndefOr[scala.Boolean] = js.undefined
}

object GetterOptions {
  @scala.inline
  def apply(bufferStream: js.UndefOr[scala.Boolean] = js.undefined): GetterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bufferStream)) __obj.updateDynamic("bufferStream")(bufferStream)
    __obj.asInstanceOf[GetterOptions]
  }
}

