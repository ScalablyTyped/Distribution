package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StringDictionary
import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.pkcs11
import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.stdio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a native manifest file */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.anon.Allowedextensions
  - typings.firefoxWebextBrowser.anon.Data
*/
trait NativeManifest extends StObject
object NativeManifest {
  
  @scala.inline
  def Allowedextensions(
    allowed_extensions: js.Array[ExtensionID],
    description: String,
    name: String,
    path: String,
    `type`: pkcs11 | stdio
  ): typings.firefoxWebextBrowser.anon.Allowedextensions = {
    val __obj = js.Dynamic.literal(allowed_extensions = allowed_extensions.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firefoxWebextBrowser.anon.Allowedextensions]
  }
  
  @scala.inline
  def Data(data: StringDictionary[js.Any], description: String, name: ExtensionID): typings.firefoxWebextBrowser.anon.Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("storage")
    __obj.asInstanceOf[typings.firefoxWebextBrowser.anon.Data]
  }
}
