package typings
package atEmotionStyledDashBaseLib.atEmotionStyledDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyledOptions extends js.Object {
  var label: js.UndefOr[java.lang.String] = js.undefined
  var shouldForwardProp: js.UndefOr[js.Function1[/* propName */ java.lang.String, scala.Boolean]] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
}

object StyledOptions {
  @scala.inline
  def apply(
    label: java.lang.String = null,
    shouldForwardProp: /* propName */ java.lang.String => scala.Boolean = null,
    target: java.lang.String = null
  ): StyledOptions = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    if (shouldForwardProp != null) __obj.updateDynamic("shouldForwardProp")(js.Any.fromFunction1(shouldForwardProp))
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[StyledOptions]
  }
}

