package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extension extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/extension
  var id: String = js.native
  /**
    * Copy of the extension's manifest data.
    */
  var manifest: js.Any = js.native
  var name: String = js.native
  /**
    * The extension's file path.
    */
  var path: String = js.native
  /**
    * The extension's `chrome-extension://` URL.
    */
  var url: String = js.native
  var version: String = js.native
}

object Extension {
  @scala.inline
  def apply(id: String, manifest: js.Any, name: String, path: String, url: String, version: String): Extension = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension]
  }
  @scala.inline
  implicit class ExtensionOps[Self <: Extension] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setManifest(value: js.Any): Self = this.set("manifest", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

