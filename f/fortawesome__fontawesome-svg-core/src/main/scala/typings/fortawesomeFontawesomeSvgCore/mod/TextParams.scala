package typings.fortawesomeFontawesomeSvgCore.mod

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
    titleId: String = null,
    transform: Transform = null
  ): TextParams = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleId != null) __obj.updateDynamic("titleId")(titleId.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextParams]
  }
}

