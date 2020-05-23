package typings.googleapisCommon.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scopes extends js.Object {
  var scopes: StringDictionary[Description]
}

object Scopes {
  @scala.inline
  def apply(scopes: StringDictionary[Description]): Scopes = {
    val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scopes]
  }
}

