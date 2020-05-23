package typings.fullpageJs.anon

import typings.fullpageJs.fullpageJsStrings.cover
import typings.fullpageJs.fullpageJsStrings.reveal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Percentage extends js.Object {
  var percentage: js.UndefOr[Double] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[cover | reveal] = js.undefined
}

object Percentage {
  @scala.inline
  def apply(
    percentage: js.UndefOr[Double] = js.undefined,
    property: String = null,
    `type`: cover | reveal = null
  ): Percentage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(percentage)) __obj.updateDynamic("percentage")(percentage.get.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Percentage]
  }
}

