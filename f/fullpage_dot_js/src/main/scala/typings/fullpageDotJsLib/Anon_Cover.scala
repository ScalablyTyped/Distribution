package typings
package fullpageDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cover extends js.Object {
  var percentage: js.UndefOr[scala.Double] = js.undefined
  var property: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[
    fullpageDotJsLib.fullpageDotJsLibStrings.cover | fullpageDotJsLib.fullpageDotJsLibStrings.reveal
  ] = js.undefined
}

object Anon_Cover {
  @scala.inline
  def apply(
    percentage: scala.Int | scala.Double = null,
    property: java.lang.String = null,
    `type`: fullpageDotJsLib.fullpageDotJsLibStrings.cover | fullpageDotJsLib.fullpageDotJsLibStrings.reveal = null
  ): Anon_Cover = {
    val __obj = js.Dynamic.literal()
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cover]
  }
}

