package typings.dompurify.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SanitizeElementHookEvent extends _HookEvent {
  var allowedTags: StringDictionary[Boolean]
  var tagName: String
}

object SanitizeElementHookEvent {
  @scala.inline
  def apply(allowedTags: StringDictionary[Boolean], tagName: String): SanitizeElementHookEvent = {
    val __obj = js.Dynamic.literal(allowedTags = allowedTags.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SanitizeElementHookEvent]
  }
}

