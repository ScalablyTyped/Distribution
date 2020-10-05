package typings.expo.anon

import typings.expo.expoBooleans.`true`
import typings.expo.updatesMod.UpdateCheckResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Manifest extends UpdateCheckResult {
  var isAvailable: `true` = js.native
  var manifest: typings.expo.updatesMod.Manifest = js.native
}

object Manifest {
  @scala.inline
  def apply(isAvailable: `true`, manifest: typings.expo.updatesMod.Manifest): Manifest = {
    val __obj = js.Dynamic.literal(isAvailable = isAvailable.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest]
  }
  @scala.inline
  implicit class ManifestOps[Self <: Manifest] (val x: Self) extends AnyVal {
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
    def setIsAvailable(value: `true`): Self = this.set("isAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def setManifest(value: typings.expo.updatesMod.Manifest): Self = this.set("manifest", value.asInstanceOf[js.Any])
  }
  
}

