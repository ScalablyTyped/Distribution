package typings.expo.buildUpdatesUpdatesMod

import typings.expo.expoNumbers.`false`
import typings.expo.expoNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCheckResult extends js.Object {
  var isAvailable: js.UndefOr[`false` | `true`] = js.undefined
  var manifest: js.UndefOr[Manifest] = js.undefined
}

object UpdateCheckResult {
  @scala.inline
  def apply(isAvailable: `false` = null, manifest: Manifest = null): UpdateCheckResult = {
    val __obj = js.Dynamic.literal()
    if (isAvailable != null) __obj.updateDynamic("isAvailable")(isAvailable)
    if (manifest != null) __obj.updateDynamic("manifest")(manifest)
    __obj.asInstanceOf[UpdateCheckResult]
  }
}

