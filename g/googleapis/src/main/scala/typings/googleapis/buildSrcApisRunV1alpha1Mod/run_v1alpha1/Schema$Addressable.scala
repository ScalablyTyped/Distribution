package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information for connecting over HTTP(s).
  */
@js.native
trait Schema$Addressable extends js.Object {
  var hostname: js.UndefOr[String] = js.native
}

object Schema$Addressable {
  @scala.inline
  def apply(hostname: String = null): Schema$Addressable = {
    val __obj = js.Dynamic.literal()
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Addressable]
  }
}

