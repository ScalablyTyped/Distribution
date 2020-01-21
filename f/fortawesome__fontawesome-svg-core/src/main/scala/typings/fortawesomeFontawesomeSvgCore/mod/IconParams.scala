package typings.fortawesomeFontawesomeSvgCore.mod

import typings.fortawesomeFontawesomeCommonTypes.mod.IconLookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconParams extends Params {
  var mask: js.UndefOr[IconLookup] = js.undefined
  var symbol: js.UndefOr[FaSymbol] = js.undefined
  var transform: js.UndefOr[Transform] = js.undefined
}

object IconParams {
  @scala.inline
  def apply(
    attributes: Attributes = null,
    classes: String | js.Array[String] = null,
    mask: IconLookup = null,
    styles: Styles = null,
    symbol: FaSymbol = null,
    title: String = null,
    transform: Transform = null
  ): IconParams = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconParams]
  }
}

