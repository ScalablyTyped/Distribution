package typings.fullpageJs

import typings.fullpageJs.fullpageJsStrings.cover
import typings.fullpageJs.fullpageJsStrings.reveal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPercentage extends js.Object {
  var percentage: js.UndefOr[Double] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[cover | reveal] = js.undefined
}

object AnonPercentage {
  @scala.inline
  def apply(percentage: Int | Double = null, property: String = null, `type`: cover | reveal = null): AnonPercentage = {
    val __obj = js.Dynamic.literal()
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPercentage]
  }
}

