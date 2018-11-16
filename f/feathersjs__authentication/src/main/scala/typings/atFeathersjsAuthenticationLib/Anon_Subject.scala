package typings
package atFeathersjsAuthenticationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Subject extends js.Object {
  var algorithm: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The resource server where the token is processed
           */
  var audience: js.UndefOr[java.lang.String] = js.undefined
  var expiresIn: js.UndefOr[java.lang.String] = js.undefined
  /**
           * By default is an access token
           */
  var header: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
           * The issuing server, application or resource
           */
  var issuer: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Typically the entity id associated with the JWT
           */
  var subject: js.UndefOr[java.lang.String] = js.undefined
}

