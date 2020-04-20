package typings.googleapisCommon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScopes extends js.Object {
  var scopes: StringDictionary[AnonDescription]
}

object AnonScopes {
  @scala.inline
  def apply(scopes: StringDictionary[AnonDescription]): AnonScopes = {
    val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScopes]
  }
}

