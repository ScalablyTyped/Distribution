package typings.expo.anon

import typings.expo.expoBooleans.`true`
import typings.expo.updatesMod.UpdateFetchResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsNewManifest extends UpdateFetchResult {
  var isNew: `true` = js.native
  var manifest: typings.expo.updatesMod.Manifest = js.native
}

object IsNewManifest {
  @scala.inline
  def apply(isNew: `true`, manifest: typings.expo.updatesMod.Manifest): IsNewManifest = {
    val __obj = js.Dynamic.literal(isNew = isNew.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsNewManifest]
  }
  @scala.inline
  implicit class IsNewManifestOps[Self <: IsNewManifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsNew(value: `true`): Self = this.set("isNew", value.asInstanceOf[js.Any])
    @scala.inline
    def setManifest(value: typings.expo.updatesMod.Manifest): Self = this.set("manifest", value.asInstanceOf[js.Any])
  }
  
}

