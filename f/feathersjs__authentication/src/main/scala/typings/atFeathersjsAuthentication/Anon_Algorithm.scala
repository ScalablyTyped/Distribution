package typings.atFeathersjsAuthentication

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Algorithm extends js.Object {
  var algorithm: js.UndefOr[String] = js.undefined
  /**
    * The resource server where the token is processed
    */
  var audience: js.UndefOr[String] = js.undefined
  var expiresIn: js.UndefOr[String] = js.undefined
  /**
    * By default is an access token
    */
  var header: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * The issuing server, application or resource
    */
  var issuer: js.UndefOr[String] = js.undefined
  /**
    * Typically the entity id associated with the JWT
    */
  var subject: js.UndefOr[String] = js.undefined
}

object Anon_Algorithm {
  @scala.inline
  def apply(
    algorithm: String = null,
    audience: String = null,
    expiresIn: String = null,
    header: StringDictionary[js.Any] = null,
    issuer: String = null,
    subject: String = null
  ): Anon_Algorithm = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Algorithm]
  }
}

