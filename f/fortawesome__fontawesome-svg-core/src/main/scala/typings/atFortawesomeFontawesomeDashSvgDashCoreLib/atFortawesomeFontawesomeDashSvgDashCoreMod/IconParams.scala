package typings
package atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconParams extends Params {
  var mask: js.UndefOr[
    atFortawesomeFontawesomeDashCommonDashTypesLib.atFortawesomeFontawesomeDashCommonDashTypesMod.IconLookup
  ] = js.undefined
  var symbol: js.UndefOr[FaSymbol] = js.undefined
  var transform: js.UndefOr[Transform] = js.undefined
}

object IconParams {
  @scala.inline
  def apply(
    attributes: Attributes = null,
    classes: java.lang.String | js.Array[java.lang.String] = null,
    mask: atFortawesomeFontawesomeDashCommonDashTypesLib.atFortawesomeFontawesomeDashCommonDashTypesMod.IconLookup = null,
    styles: Styles = null,
    symbol: FaSymbol = null,
    title: java.lang.String = null,
    transform: Transform = null
  ): IconParams = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[IconParams]
  }
}

