package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StringDictionary
import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.pkcs11
import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.stdio
import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a native manifest file */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.anon.Allowedextensions
  - typings.firefoxWebextBrowser.anon.DataDescription
*/
trait NativeManifest extends js.Object

object NativeManifest {
  @scala.inline
  def Allowedextensions(
    allowed_extensions: js.Array[ExtensionID],
    description: String,
    name: String,
    path: String,
    `type`: pkcs11 | stdio
  ): NativeManifest = {
    val __obj = js.Dynamic.literal(allowed_extensions = allowed_extensions.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeManifest]
  }
  @scala.inline
  def DataDescription(data: StringDictionary[js.Any], description: String, name: ExtensionID, `type`: storage): NativeManifest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeManifest]
  }
}

