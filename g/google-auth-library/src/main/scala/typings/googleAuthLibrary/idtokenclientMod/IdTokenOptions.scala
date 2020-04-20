package typings.googleAuthLibrary.idtokenclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdTokenOptions extends js.Object {
  /**
    * The client to make the request to fetch an ID token.
    */
  var idTokenProvider: IdTokenProvider
  /**
    * The audience to use when requesting an ID token.
    */
  var targetAudience: String
}

object IdTokenOptions {
  @scala.inline
  def apply(idTokenProvider: IdTokenProvider, targetAudience: String): IdTokenOptions = {
    val __obj = js.Dynamic.literal(idTokenProvider = idTokenProvider.asInstanceOf[js.Any], targetAudience = targetAudience.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdTokenOptions]
  }
}

