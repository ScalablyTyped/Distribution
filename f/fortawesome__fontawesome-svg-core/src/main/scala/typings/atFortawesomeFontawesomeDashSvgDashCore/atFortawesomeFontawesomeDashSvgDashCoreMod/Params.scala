package typings.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var attributes: js.UndefOr[Attributes] = js.undefined
  var classes: js.UndefOr[String | js.Array[String]] = js.undefined
  var styles: js.UndefOr[Styles] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Params {
  @scala.inline
  def apply(
    attributes: Attributes = null,
    classes: String | js.Array[String] = null,
    styles: Styles = null,
    title: String = null
  ): Params = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

