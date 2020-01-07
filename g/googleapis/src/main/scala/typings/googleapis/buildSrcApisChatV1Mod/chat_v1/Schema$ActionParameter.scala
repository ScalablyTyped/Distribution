package typings.googleapis.buildSrcApisChatV1Mod.chat_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of string parameters to supply when the action method is invoked. For
  * example, consider three snooze buttons: snooze now, snooze 1 day, snooze
  * next week. You might use action method = snooze(), passing the snooze type
  * and snooze time in the list of string parameters.
  */
@js.native
trait Schema$ActionParameter extends js.Object {
  /**
    * The name of the parameter for the action script.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * The value of the parameter.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$ActionParameter {
  @scala.inline
  def apply(key: String = null, value: String = null): Schema$ActionParameter = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ActionParameter]
  }
}

