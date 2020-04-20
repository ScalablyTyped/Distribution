package typings.fluentuiReactIcons.svgIconStylesMod

import typings.fluentuiReactIcons.PartialISvgIconStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISvgIconStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var styles: js.UndefOr[PartialISvgIconStyles] = js.undefined
}

object ISvgIconStyleProps {
  @scala.inline
  def apply(className: String = null, styles: PartialISvgIconStyles = null): ISvgIconStyleProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISvgIconStyleProps]
  }
}

