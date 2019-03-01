package typings
package dompurifyLib.dompurifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SanitizeElementHookEvent extends js.Object {
  var allowedTags: js.Array[java.lang.String]
  var tagName: java.lang.String
}

object SanitizeElementHookEvent {
  @scala.inline
  def apply(allowedTags: js.Array[java.lang.String], tagName: java.lang.String): SanitizeElementHookEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowedTags")(allowedTags)
    __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[SanitizeElementHookEvent]
  }
}

