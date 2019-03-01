package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdditionalProperties extends js.Object {
  /** @deprecated Unknown platform name */
  var additionalProperties: js.UndefOr[java.lang.String] = js.undefined
  var android: js.UndefOr[java.lang.String] = js.undefined
  var chromeos: js.UndefOr[java.lang.String] = js.undefined
  var default: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.KeyName] = js.undefined
  var ios: js.UndefOr[java.lang.String] = js.undefined
  var linux: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.KeyName] = js.undefined
  var mac: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.KeyName] = js.undefined
  var windows: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.KeyName] = js.undefined
}

object Anon_AdditionalProperties {
  @scala.inline
  def apply(
    additionalProperties: java.lang.String = null,
    android: java.lang.String = null,
    chromeos: java.lang.String = null,
    default: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.KeyName = null,
    ios: java.lang.String = null,
    linux: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.KeyName = null,
    mac: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.KeyName = null,
    windows: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.KeyName = null
  ): Anon_AdditionalProperties = {
    val __obj = js.Dynamic.literal()
    if (additionalProperties != null) __obj.updateDynamic("additionalProperties")(additionalProperties)
    if (android != null) __obj.updateDynamic("android")(android)
    if (chromeos != null) __obj.updateDynamic("chromeos")(chromeos)
    if (default != null) __obj.updateDynamic("default")(default)
    if (ios != null) __obj.updateDynamic("ios")(ios)
    if (linux != null) __obj.updateDynamic("linux")(linux)
    if (mac != null) __obj.updateDynamic("mac")(mac)
    if (windows != null) __obj.updateDynamic("windows")(windows)
    __obj.asInstanceOf[Anon_AdditionalProperties]
  }
}

