package typings
package atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var attributes: js.UndefOr[Attributes] = js.undefined
  var classes: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var styles: js.UndefOr[Styles] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Params {
  @scala.inline
  def apply(
    attributes: Attributes = null,
    classes: java.lang.String | js.Array[java.lang.String] = null,
    styles: Styles = null,
    title: java.lang.String = null
  ): Params = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Params]
  }
}

