package typings
package foundationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Button extends js.Object {
  var button: js.UndefOr[java.lang.String] = js.undefined
  var expose: js.UndefOr[java.lang.String] = js.undefined
  var expose_cover: js.UndefOr[java.lang.String] = js.undefined
  var link: js.UndefOr[java.lang.String] = js.undefined
  var modal: js.UndefOr[java.lang.String] = js.undefined
  var prev_button: js.UndefOr[java.lang.String] = js.undefined
  var timer: js.UndefOr[java.lang.String] = js.undefined
  var tip: js.UndefOr[java.lang.String] = js.undefined
  var wrapper: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Button {
  @scala.inline
  def apply(
    button: java.lang.String = null,
    expose: java.lang.String = null,
    expose_cover: java.lang.String = null,
    link: java.lang.String = null,
    modal: java.lang.String = null,
    prev_button: java.lang.String = null,
    timer: java.lang.String = null,
    tip: java.lang.String = null,
    wrapper: java.lang.String = null
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

