package typings
package flexmonsterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Blocking extends js.Object {
  var blocking: js.UndefOr[scala.Boolean] = js.undefined
  var buttons: js.UndefOr[js.Array[Anon_Handler]] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Blocking {
  @scala.inline
  def apply(
    blocking: js.UndefOr[scala.Boolean] = js.undefined,
    buttons: js.Array[Anon_Handler] = null,
    message: java.lang.String = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null
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

