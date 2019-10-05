package typings.firefoxDashWebextDashBrowser.browser._manifest

import org.scalablytyped.runtime.StringDictionary
import typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.pkcs11
import typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.stdio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a native manifest file */
trait NativeManifest extends js.Object {
  var allowed_extensions: js.UndefOr[js.Array[ExtensionID]] = js.undefined
  var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[ExtensionID | String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[
    pkcs11 | stdio | typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.storage
  ] = js.undefined
}

object NativeManifest {
  @scala.inline
  def apply(
    allowed_extensions: js.Array[ExtensionID] = null,
    data: StringDictionary[js.Any] = null,
    description: String = null,
    name: String = null,
    path: String = null,
    `type`: pkcs11 | stdio = null
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

