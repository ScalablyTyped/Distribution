package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contentscripts extends js.Object {
  /** The Content Security Policy used for content scripts. */
  var content_scripts: js.UndefOr[String] = js.undefined
  /** The Content Security Policy used for extension pages. */
  var extension_pages: js.UndefOr[String] = js.undefined
  /**
    * An alias for content_scripts to support Chrome compatibility. Content Security Policy implementations
    * may differ between Firefox and Chrome. If both isolated_world and content_scripts exist, the value from
    * content_scripts will be used.
    */
  var isolated_world: js.UndefOr[String] = js.undefined
}

object Contentscripts {
  @scala.inline
  def apply(content_scripts: String = null, extension_pages: String = null, isolated_world: String = null): Contentscripts = {
    val __obj = js.Dynamic.literal()
    if (content_scripts != null) __obj.updateDynamic("content_scripts")(content_scripts.asInstanceOf[js.Any])
    if (extension_pages != null) __obj.updateDynamic("extension_pages")(extension_pages.asInstanceOf[js.Any])
    if (isolated_world != null) __obj.updateDynamic("isolated_world")(isolated_world.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contentscripts]
  }
}

