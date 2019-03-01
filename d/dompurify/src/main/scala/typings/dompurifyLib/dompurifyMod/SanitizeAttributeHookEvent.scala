package typings
package dompurifyLib.dompurifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SanitizeAttributeHookEvent extends js.Object {
  var allowedAttributes: js.Array[java.lang.String]
  var attrName: java.lang.String
  var attrValue: java.lang.String
  var keepAttr: scala.Boolean
}

object SanitizeAttributeHookEvent {
  @scala.inline
  def apply(
    allowedAttributes: js.Array[java.lang.String],
    attrName: java.lang.String,
    attrValue: java.lang.String,
    keepAttr: scala.Boolean
  ): SanitizeAttributeHookEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowedAttributes")(allowedAttributes)
    __obj.updateDynamic("attrName")(attrName)
    __obj.updateDynamic("attrValue")(attrValue)
    __obj.updateDynamic("keepAttr")(keepAttr)
    __obj.asInstanceOf[SanitizeAttributeHookEvent]
  }
}

