package typings
package firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a native manifest file */
trait NativeManifest extends js.Object {
  var allowed_extensions: js.UndefOr[js.Array[ExtensionID]] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[ExtensionID | java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[
    firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.pkcs11 | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.stdio | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.storage
  ] = js.undefined
}

object NativeManifest {
  @scala.inline
  def apply(
    allowed_extensions: js.Array[ExtensionID] = null,
    data: js.Any = null,
    description: java.lang.String = null,
    name: java.lang.String = null,
    path: java.lang.String = null,
    `type`: firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.pkcs11 | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.stdio = null
  ): NativeManifest = {
    val __obj = js.Dynamic.literal()
    if (allowed_extensions != null) __obj.updateDynamic("allowed_extensions")(allowed_extensions)
    if (data != null) __obj.updateDynamic("data")(data)
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeManifest]
  }
}

