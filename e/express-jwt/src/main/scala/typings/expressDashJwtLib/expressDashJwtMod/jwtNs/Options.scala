package typings
package expressDashJwtLib.expressDashJwtMod.jwtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends /* property */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var credentialsRequired: js.UndefOr[scala.Boolean] = js.undefined
  var getToken: js.UndefOr[GetTokenCallback] = js.undefined
  var isRevoked: js.UndefOr[IsRevokedCallback] = js.undefined
  var requestProperty: js.UndefOr[java.lang.String] = js.undefined
  var secret: secretType | SecretCallback | SecretCallbackLong
  var skip: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var userProperty: js.UndefOr[java.lang.String] = js.undefined
}

