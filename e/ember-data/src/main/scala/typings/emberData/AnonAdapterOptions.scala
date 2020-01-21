package typings.emberData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdapterOptions extends js.Object {
  var adapterOptions: js.UndefOr[js.Object] = js.undefined
}

object AnonAdapterOptions {
  @scala.inline
  def apply(adapterOptions: js.Object = null): AnonAdapterOptions = {
    val __obj = js.Dynamic.literal()
    if (adapterOptions != null) __obj.updateDynamic("adapterOptions")(adapterOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdapterOptions]
  }
}

