package typings.emberDashData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdapterOptions extends js.Object {
  var adapterOptions: js.UndefOr[js.Object] = js.undefined
}

object Anon_AdapterOptions {
  @scala.inline
  def apply(adapterOptions: js.Object = null): Anon_AdapterOptions = {
    val __obj = js.Dynamic.literal()
    if (adapterOptions != null) __obj.updateDynamic("adapterOptions")(adapterOptions)
    __obj.asInstanceOf[Anon_AdapterOptions]
  }
}

