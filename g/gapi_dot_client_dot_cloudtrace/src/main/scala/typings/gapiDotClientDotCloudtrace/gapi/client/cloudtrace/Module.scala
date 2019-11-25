package typings.gapiDotClientDotCloudtrace.gapi.client.cloudtrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Module extends js.Object {
  /**
    * A unique identifier for the module, usually a hash of its
    * contents (up to 128 bytes).
    */
  var buildId: js.UndefOr[TruncatableString] = js.undefined
  /**
    * For example: main binary, kernel modules, and dynamic libraries
    * such as libc.so, sharedlib.so (up to 256 bytes).
    */
  var module: js.UndefOr[TruncatableString] = js.undefined
}

object Module {
  @scala.inline
  def apply(buildId: TruncatableString = null, module: TruncatableString = null): Module = {
    val __obj = js.Dynamic.literal()
    if (buildId != null) __obj.updateDynamic("buildId")(buildId.asInstanceOf[js.Any])
    if (module != null) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
}

