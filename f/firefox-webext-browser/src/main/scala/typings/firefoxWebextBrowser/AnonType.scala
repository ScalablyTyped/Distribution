package typings.firefoxWebextBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.firefoxWebextBrowser.browser.manifest.ExtensionID
import typings.firefoxWebextBrowser.browser.manifest.NativeManifest
import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends NativeManifest {
  var data: StringDictionary[js.Any]
  var description: String
  var name: ExtensionID
  var `type`: storage
}

object AnonType {
  @scala.inline
  def apply(data: StringDictionary[js.Any], description: String, name: ExtensionID, `type`: storage): AnonType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

