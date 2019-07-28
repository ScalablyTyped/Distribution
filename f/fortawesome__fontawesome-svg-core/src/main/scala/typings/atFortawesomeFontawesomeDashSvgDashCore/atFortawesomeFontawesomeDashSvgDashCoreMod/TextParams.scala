package typings.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextParams extends Params {
  var transform: js.UndefOr[Transform] = js.undefined
}

object TextParams {
  @scala.inline
  def apply(
    attributes: Attributes = null,
    classes: String | js.Array[String] = null,
    styles: Styles = null,
    title: String = null,
    transform: Transform = null
  ): TextParams = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (title != null) __obj.updateDynamic("title")(title)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[TextParams]
  }
}

