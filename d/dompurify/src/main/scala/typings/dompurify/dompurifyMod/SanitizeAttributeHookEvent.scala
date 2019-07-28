package typings.dompurify.dompurifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SanitizeAttributeHookEvent extends _HookEvent {
  var allowedAttributes: js.Array[String]
  var attrName: String
  var attrValue: String
  var keepAttr: Boolean
}

object SanitizeAttributeHookEvent {
  @scala.inline
  def apply(allowedAttributes: js.Array[String], attrName: String, attrValue: String, keepAttr: Boolean): SanitizeAttributeHookEvent = {
    val __obj = js.Dynamic.literal(allowedAttributes = allowedAttributes, attrName = attrName, attrValue = attrValue, keepAttr = keepAttr)
  
    __obj.asInstanceOf[SanitizeAttributeHookEvent]
  }
}

