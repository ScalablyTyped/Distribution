package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonObjectType extends js.Object {
  var content: js.UndefOr[String] = js.native
  var objectType: js.UndefOr[String] = js.native
  var originalContent: js.UndefOr[String] = js.native
}

object AnonObjectType {
  @scala.inline
  def apply(content: String = null, objectType: String = null, originalContent: String = null): AnonObjectType = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (objectType != null) __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    if (originalContent != null) __obj.updateDynamic("originalContent")(originalContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonObjectType]
  }
}

