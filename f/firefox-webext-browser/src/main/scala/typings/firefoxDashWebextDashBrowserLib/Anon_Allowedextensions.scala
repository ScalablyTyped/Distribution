package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Allowedextensions
  extends firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.NativeManifest {
  var allowed_extensions: js.Array[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ExtensionID]
  var description: java.lang.String
  var name: java.lang.String
  var path: java.lang.String
  var `type`: firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.pkcs11 | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.stdio
}

object Anon_Allowedextensions {
  @scala.inline
  def apply(
    allowed_extensions: js.Array[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ExtensionID],
    description: java.lang.String,
    name: java.lang.String,
    path: java.lang.String,
    `type`: firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.pkcs11 | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.stdio
  ): Anon_Allowedextensions = {
    val __obj = js.Dynamic.literal(allowed_extensions = allowed_extensions, description = description, name = name, path = path)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Allowedextensions]
  }
}

