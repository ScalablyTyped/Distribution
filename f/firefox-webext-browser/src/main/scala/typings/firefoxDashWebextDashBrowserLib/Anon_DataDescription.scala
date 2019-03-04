package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataDescription
  extends firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.NativeManifest {
  var data: js.Any
  var description: java.lang.String
  var name: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ExtensionID
  var `type`: firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.storage
}

object Anon_DataDescription {
  @scala.inline
  def apply(
    data: js.Any,
    description: java.lang.String,
    name: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ExtensionID,
    `type`: firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.storage
  ): Anon_DataDescription = {
    val __obj = js.Dynamic.literal(data = data, description = description, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_DataDescription]
  }
}

