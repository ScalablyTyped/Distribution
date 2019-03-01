package typings
package atFeathersjsAuthenticationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Algorithm extends js.Object {
  var algorithm: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The resource server where the token is processed
    */
  var audience: js.UndefOr[java.lang.String] = js.undefined
  var expiresIn: js.UndefOr[java.lang.String] = js.undefined
  /**
    * By default is an access token
    */
  var header: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
    * The issuing server, application or resource
    */
  var issuer: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Typically the entity id associated with the JWT
    */
  var subject: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Algorithm {
  @scala.inline
  def apply(
    algorithm: java.lang.String = null,
    audience: java.lang.String = null,
    expiresIn: java.lang.String = null,
    header: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    issuer: java.lang.String = null,
    subject: java.lang.String = null
  ): Anon_Algorithm = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (audience != null) __obj.updateDynamic("audience")(audience)
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn)
    if (header != null) __obj.updateDynamic("header")(header)
    if (issuer != null) __obj.updateDynamic("issuer")(issuer)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[Anon_Algorithm]
  }
}

