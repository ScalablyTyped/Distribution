package typings.flexmonster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Blocking extends js.Object {
  var blocking: js.UndefOr[Boolean] = js.undefined
  var buttons: js.UndefOr[js.Array[Anon_Handler]] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Anon_Blocking {
  @scala.inline
  def apply(
    blocking: js.UndefOr[Boolean] = js.undefined,
    buttons: js.Array[Anon_Handler] = null,
    message: String = null,
    title: String = null,
    `type`: String = null
  ): Anon_Blocking = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blocking)) __obj.updateDynamic("blocking")(blocking)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (message != null) __obj.updateDynamic("message")(message)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Blocking]
  }
}

