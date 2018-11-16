package typings
package gapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GoogleApiOAuth2TokenObject extends js.Object {
  /**
       * The OAuth 2.0 token. Only present in successful responses
       */
  var access_token: java.lang.String
  /**
       * Details about the error. Only present in error responses
       */
  var error: java.lang.String
  /**
       * The duration, in seconds, the token is valid for. Only present in successful responses
       */
  var expires_in: java.lang.String
  /**
       * The Google API scopes related to this token
       */
  var state: java.lang.String
}

