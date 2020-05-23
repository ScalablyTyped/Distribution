package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToPNGOptions extends js.Object {
  /**
    * Defaults to 1.0.
    */
  var scaleFactor: js.UndefOr[Double] = js.undefined
}

object ToPNGOptions {
  @scala.inline
  def apply(scaleFactor: js.UndefOr[Double] = js.undefined): ToPNGOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(scaleFactor)) __obj.updateDynamic("scaleFactor")(scaleFactor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToPNGOptions]
  }
}

