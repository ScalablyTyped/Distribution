package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contentscripts extends js.Object {
  /** The Content Security Policy used for content scripts. */
  var content_scripts: js.UndefOr[String] = js.native
  /** The Content Security Policy used for extension pages. */
  var extension_pages: js.UndefOr[String] = js.native
  /**
    * An alias for content_scripts to support Chrome compatibility. Content Security Policy implementations
    * may differ between Firefox and Chrome. If both isolated_world and content_scripts exist, the value from
    * content_scripts will be used.
    */
  var isolated_world: js.UndefOr[String] = js.native
}

object Contentscripts {
  @scala.inline
  def apply(): Contentscripts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contentscripts]
  }
  @scala.inline
  implicit class ContentscriptsOps[Self <: Contentscripts] (val x: Self) extends AnyVal {
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
    def setContent_scripts(value: String): Self = this.set("content_scripts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent_scripts: Self = this.set("content_scripts", js.undefined)
    @scala.inline
    def setExtension_pages(value: String): Self = this.set("extension_pages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtension_pages: Self = this.set("extension_pages", js.undefined)
    @scala.inline
    def setIsolated_world(value: String): Self = this.set("isolated_world", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsolated_world: Self = this.set("isolated_world", js.undefined)
  }
  
}

