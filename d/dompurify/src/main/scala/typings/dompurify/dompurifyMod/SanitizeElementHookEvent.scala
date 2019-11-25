package typings.dompurify.dompurifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SanitizeElementHookEvent extends _HookEvent {
  var allowedTags: js.Array[String]
  var tagName: String
}

object SanitizeElementHookEvent {
  @scala.inline
  def apply(allowedTags: js.Array[String], tagName: String): SanitizeElementHookEvent = {
    val __obj = js.Dynamic.literal(allowedTags = allowedTags.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SanitizeElementHookEvent]
  }
}

