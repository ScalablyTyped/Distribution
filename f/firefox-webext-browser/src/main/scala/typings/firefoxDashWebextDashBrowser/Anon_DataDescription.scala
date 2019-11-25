package typings.firefoxDashWebextDashBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.firefoxDashWebextDashBrowser.browser._manifest.ExtensionID
import typings.firefoxDashWebextDashBrowser.browser._manifest.NativeManifest
import typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataDescription extends NativeManifest {
  var data: StringDictionary[js.Any]
  var description: String
  var name: ExtensionID
  var `type`: storage
}

object Anon_DataDescription {
  @scala.inline
  def apply(data: StringDictionary[js.Any], description: String, name: ExtensionID, `type`: storage): Anon_DataDescription = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataDescription]
  }
}

