package typings.gapiDotClientDotFirebaseremoteconfig.gapi.client.firebaseremoteconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteConfigCondition extends js.Object {
  /** Required. */
  var expression: js.UndefOr[String] = js.undefined
  /**
    * Required.
    * A non empty and unique name of this condition.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Optional.
    * The display (tag) color of this condition. This serves as part of a tag
    * (in the future, we may add tag text as well as tag color, but that is not
    * yet implemented in the UI).
    * This value has no affect on the semantics of the delivered config and it
    * is ignored by the backend, except for passing it through write/read
    * requests.
    * Not having this value or having the "CONDITION_DISPLAY_COLOR_UNSPECIFIED"
    * value (0) have the same meaning:  Let the UI choose any valid color when
    * displaying the condition.
    */
  var tagColor: js.UndefOr[String] = js.undefined
}

object RemoteConfigCondition {
  @scala.inline
  def apply(expression: String = null, name: String = null, tagColor: String = null): RemoteConfigCondition = {
    val __obj = js.Dynamic.literal()
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (name != null) __obj.updateDynamic("name")(name)
    if (tagColor != null) __obj.updateDynamic("tagColor")(tagColor)
    __obj.asInstanceOf[RemoteConfigCondition]
  }
}

