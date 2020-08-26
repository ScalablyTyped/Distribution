package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.manifest.ExtensionID
import typings.firefoxWebextBrowser.browser.manifest.NativeManifest
import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.pkcs11
import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.stdio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Allowedextensions extends NativeManifest {
  var allowed_extensions: js.Array[ExtensionID] = js.native
  var description: String = js.native
  var name: String = js.native
  var path: String = js.native
  var `type`: pkcs11 | stdio = js.native
}

object Allowedextensions {
  @scala.inline
  def apply(
    allowed_extensions: js.Array[ExtensionID],
    description: String,
    name: String,
    path: String,
    `type`: pkcs11 | stdio
  ): Allowedextensions = {
    val __obj = js.Dynamic.literal(allowed_extensions = allowed_extensions.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allowedextensions]
  }
  @scala.inline
  implicit class AllowedextensionsOps[Self <: Allowedextensions] (val x: Self) extends AnyVal {
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
    def setAllowed_extensionsVarargs(value: ExtensionID*): Self = this.set("allowed_extensions", js.Array(value :_*))
    @scala.inline
    def setAllowed_extensions(value: js.Array[ExtensionID]): Self = this.set("allowed_extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: pkcs11 | stdio): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

