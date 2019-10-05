package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser._manifest.KeyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdditionalProperties extends js.Object {
  /** @deprecated Unknown platform name */
  var additionalProperties: js.UndefOr[String] = js.undefined
  var android: js.UndefOr[String] = js.undefined
  var chromeos: js.UndefOr[String] = js.undefined
  var default: js.UndefOr[KeyName] = js.undefined
  var ios: js.UndefOr[String] = js.undefined
  var linux: js.UndefOr[KeyName] = js.undefined
  var mac: js.UndefOr[KeyName] = js.undefined
  var windows: js.UndefOr[KeyName] = js.undefined
}

object Anon_AdditionalProperties {
  @scala.inline
  def apply(
    additionalProperties: String = null,
    android: String = null,
    chromeos: String = null,
    default: KeyName = null,
    ios: String = null,
    linux: KeyName = null,
    mac: KeyName = null,
    windows: KeyName = null
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

