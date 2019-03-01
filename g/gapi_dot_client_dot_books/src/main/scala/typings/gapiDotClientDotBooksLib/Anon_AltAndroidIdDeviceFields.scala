package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltAndroidIdDeviceFields extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** device android_id */
  var androidId: js.UndefOr[java.lang.String] = js.undefined
  /** device device */
  var device: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** device manufacturer */
  var manufacturer: js.UndefOr[java.lang.String] = js.undefined
  /** device model */
  var model: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** device product */
  var product: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** device serial */
  var serial: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltAndroidIdDeviceFields {
  @scala.inline
  def apply(
    alt: java.lang.String = null,
    androidId: java.lang.String = null,
    device: java.lang.String = null,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    manufacturer: java.lang.String = null,
    model: java.lang.String = null,
    oauth_token: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    product: java.lang.String = null,
    quotaUser: java.lang.String = null,
    serial: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltAndroidIdDeviceFields = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (androidId != null) __obj.updateDynamic("androidId")(androidId)
    if (device != null) __obj.updateDynamic("device")(device)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer)
    if (model != null) __obj.updateDynamic("model")(model)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (product != null) __obj.updateDynamic("product")(product)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (serial != null) __obj.updateDynamic("serial")(serial)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltAndroidIdDeviceFields]
  }
}

