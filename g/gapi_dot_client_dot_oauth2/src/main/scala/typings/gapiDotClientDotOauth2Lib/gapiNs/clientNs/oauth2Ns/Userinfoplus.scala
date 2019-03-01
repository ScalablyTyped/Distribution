package typings
package gapiDotClientDotOauth2Lib.gapiNs.clientNs.oauth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Userinfoplus extends js.Object {
  /** The user's email address. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** The user's last name. */
  var family_name: js.UndefOr[java.lang.String] = js.undefined
  /** The user's gender. */
  var gender: js.UndefOr[java.lang.String] = js.undefined
  /** The user's first name. */
  var given_name: js.UndefOr[java.lang.String] = js.undefined
  /** The hosted domain e.g. example.com if the user is Google apps user. */
  var hd: js.UndefOr[java.lang.String] = js.undefined
  /** The obfuscated ID of the user. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** URL of the profile page. */
  var link: js.UndefOr[java.lang.String] = js.undefined
  /** The user's preferred locale. */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** The user's full name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** URL of the user's picture image. */
  var picture: js.UndefOr[java.lang.String] = js.undefined
  /** Boolean flag which is true if the email address is verified. Always verified because we only return the user's primary email address. */
  var verified_email: js.UndefOr[scala.Boolean] = js.undefined
}

object Userinfoplus {
  @scala.inline
  def apply(
    email: java.lang.String = null,
    family_name: java.lang.String = null,
    gender: java.lang.String = null,
    given_name: java.lang.String = null,
    hd: java.lang.String = null,
    id: java.lang.String = null,
    link: java.lang.String = null,
    locale: java.lang.String = null,
    name: java.lang.String = null,
    picture: java.lang.String = null,
    verified_email: js.UndefOr[scala.Boolean] = js.undefined
  ): Userinfoplus = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (family_name != null) __obj.updateDynamic("family_name")(family_name)
    if (gender != null) __obj.updateDynamic("gender")(gender)
    if (given_name != null) __obj.updateDynamic("given_name")(given_name)
    if (hd != null) __obj.updateDynamic("hd")(hd)
    if (id != null) __obj.updateDynamic("id")(id)
    if (link != null) __obj.updateDynamic("link")(link)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (name != null) __obj.updateDynamic("name")(name)
    if (picture != null) __obj.updateDynamic("picture")(picture)
    if (!js.isUndefined(verified_email)) __obj.updateDynamic("verified_email")(verified_email)
    __obj.asInstanceOf[Userinfoplus]
  }
}

