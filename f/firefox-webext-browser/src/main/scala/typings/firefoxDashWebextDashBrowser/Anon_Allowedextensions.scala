package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser._manifest.ExtensionID
import typings.firefoxDashWebextDashBrowser.browser._manifest.NativeManifest
import typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.pkcs11
import typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.stdio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Allowedextensions extends NativeManifest {
  var allowed_extensions: js.Array[ExtensionID]
  var description: String
  var name: String
  var path: String
  var `type`: pkcs11 | stdio
}

object Anon_Allowedextensions {
  @scala.inline
  def apply(
    allowed_extensions: js.Array[ExtensionID],
    description: String,
    name: String,
    path: String,
    `type`: pkcs11 | stdio
  ): Anon_Allowedextensions = {
    val __obj = js.Dynamic.literal(allowed_extensions = allowed_extensions.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Allowedextensions]
  }
}

