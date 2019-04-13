package typings
package firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a native manifest file */
@js.native
trait NativeManifest extends js.Object {
  var allowed_extensions: js.UndefOr[js.Array[ExtensionID]] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var description: js.UndefOr[java.lang.String] = js.native
  var name: js.UndefOr[ExtensionID | java.lang.String] = js.native
  var path: js.UndefOr[java.lang.String] = js.native
  var `type`: js.UndefOr[
    firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.pkcs11 | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.stdio | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.storage
  ] = js.native
}

