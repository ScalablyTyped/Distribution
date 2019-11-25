package typings.atEmotionStyledDashBase.atEmotionStyledDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyledOptions extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var shouldForwardProp: js.UndefOr[js.Function1[/* propName */ String, Boolean]] = js.undefined
  var target: js.UndefOr[String] = js.undefined
}

object StyledOptions {
  @scala.inline
  def apply(
    label: String = null,
    shouldForwardProp: /* propName */ String => Boolean = null,
    target: String = null
  ): StyledOptions = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (shouldForwardProp != null) __obj.updateDynamic("shouldForwardProp")(js.Any.fromFunction1(shouldForwardProp))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyledOptions]
  }
}

