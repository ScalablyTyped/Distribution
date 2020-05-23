package typings.emberData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdapterOptions extends js.Object {
  var adapterOptions: js.UndefOr[js.Object] = js.undefined
}

object AdapterOptions {
  @scala.inline
  def apply(adapterOptions: js.Object = null): AdapterOptions = {
    val __obj = js.Dynamic.literal()
    if (adapterOptions != null) __obj.updateDynamic("adapterOptions")(adapterOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdapterOptions]
  }
}

