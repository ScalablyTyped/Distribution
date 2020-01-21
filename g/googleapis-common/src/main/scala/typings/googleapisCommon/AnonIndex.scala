package typings.googleapisCommon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndex extends js.Object {
  var scopes: StringDictionary[AnonDescription]
}

object AnonIndex {
  @scala.inline
  def apply(scopes: StringDictionary[AnonDescription]): AnonIndex = {
    val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIndex]
  }
}

