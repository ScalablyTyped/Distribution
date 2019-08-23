package typings.expo.buildUpdatesUpdatesMod

import typings.expo.expoNumbers.`false`
import typings.expo.expoNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFetchResult extends js.Object {
  var isNew: js.UndefOr[`false` | `true`] = js.undefined
  var manifest: js.UndefOr[Manifest] = js.undefined
}

object UpdateFetchResult {
  @scala.inline
  def apply(isNew: `false` = null, manifest: Manifest = null): UpdateFetchResult = {
    val __obj = js.Dynamic.literal()
    if (isNew != null) __obj.updateDynamic("isNew")(isNew)
    if (manifest != null) __obj.updateDynamic("manifest")(manifest)
    __obj.asInstanceOf[UpdateFetchResult]
  }
}

