package typings.expo.anon

import typings.expo.expoBooleans.`true`
import typings.expo.updatesMod.UpdateFetchResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsNewManifest extends UpdateFetchResult {
  var isNew: `true`
  var manifest: typings.expo.updatesMod.Manifest
}

object IsNewManifest {
  @scala.inline
  def apply(isNew: `true`, manifest: typings.expo.updatesMod.Manifest): IsNewManifest = {
    val __obj = js.Dynamic.literal(isNew = isNew.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsNewManifest]
  }
}

