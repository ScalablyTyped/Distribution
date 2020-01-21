package typings.dompurify.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SanitizeAttributeHookEvent extends _HookEvent {
  var allowedAttributes: StringDictionary[Boolean]
  var attrName: String
  var attrValue: String
  var keepAttr: Boolean
}

object SanitizeAttributeHookEvent {
  @scala.inline
  def apply(
    allowedAttributes: StringDictionary[Boolean],
    attrName: String,
    attrValue: String,
    keepAttr: Boolean
  ): SanitizeAttributeHookEvent = {
    val __obj = js.Dynamic.literal(allowedAttributes = allowedAttributes.asInstanceOf[js.Any], attrName = attrName.asInstanceOf[js.Any], attrValue = attrValue.asInstanceOf[js.Any], keepAttr = keepAttr.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SanitizeAttributeHookEvent]
  }
}

