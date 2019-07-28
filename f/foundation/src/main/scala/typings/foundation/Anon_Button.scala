package typings.foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Button extends js.Object {
  var button: js.UndefOr[String] = js.undefined
  var expose: js.UndefOr[String] = js.undefined
  var expose_cover: js.UndefOr[String] = js.undefined
  var link: js.UndefOr[String] = js.undefined
  var modal: js.UndefOr[String] = js.undefined
  var prev_button: js.UndefOr[String] = js.undefined
  var timer: js.UndefOr[String] = js.undefined
  var tip: js.UndefOr[String] = js.undefined
  var wrapper: js.UndefOr[String] = js.undefined
}

object Anon_Button {
  @scala.inline
  def apply(
    button: String = null,
    expose: String = null,
    expose_cover: String = null,
    link: String = null,
    modal: String = null,
    prev_button: String = null,
    timer: String = null,
    tip: String = null,
    wrapper: String = null
  ): Anon_Button = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button)
    if (expose != null) __obj.updateDynamic("expose")(expose)
    if (expose_cover != null) __obj.updateDynamic("expose_cover")(expose_cover)
    if (link != null) __obj.updateDynamic("link")(link)
    if (modal != null) __obj.updateDynamic("modal")(modal)
    if (prev_button != null) __obj.updateDynamic("prev_button")(prev_button)
    if (timer != null) __obj.updateDynamic("timer")(timer)
    if (tip != null) __obj.updateDynamic("tip")(tip)
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper)
    __obj.asInstanceOf[Anon_Button]
  }
}

