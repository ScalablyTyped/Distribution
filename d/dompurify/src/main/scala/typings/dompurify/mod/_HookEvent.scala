package typings.dompurify.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _HookEvent extends js.Object

object _HookEvent {
  @scala.inline
  def SanitizeElementHookEvent(allowedTags: StringDictionary[Boolean], tagName: String): _HookEvent = {
    val __obj = js.Dynamic.literal(allowedTags = allowedTags.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[_HookEvent]
  }
  @scala.inline
  def SanitizeAttributeHookEvent(
    allowedAttributes: StringDictionary[Boolean],
    attrName: String,
    attrValue: String,
    keepAttr: Boolean
  ): _HookEvent = {
    val __obj = js.Dynamic.literal(allowedAttributes = allowedAttributes.asInstanceOf[js.Any], attrName = attrName.asInstanceOf[js.Any], attrValue = attrValue.asInstanceOf[js.Any], keepAttr = keepAttr.asInstanceOf[js.Any])
    __obj.asInstanceOf[_HookEvent]
  }
}

