package typings.expo

import typings.expo.expoBooleans.`true`
import typings.expo.updatesMod.Manifest
import typings.expo.updatesMod.UpdateFetchResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsNewManifest extends UpdateFetchResult {
  var isNew: `true`
  var manifest: Manifest
}

object AnonIsNewManifest {
  @scala.inline
  def apply(isNew: `true`, manifest: Manifest): AnonIsNewManifest = {
    val __obj = js.Dynamic.literal(isNew = isNew.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsNewManifest]
  }
}

