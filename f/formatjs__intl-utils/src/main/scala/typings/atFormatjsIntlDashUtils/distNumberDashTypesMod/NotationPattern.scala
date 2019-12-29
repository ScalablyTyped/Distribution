package typings.atFormatjsIntlDashUtils.distNumberDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotationPattern extends js.Object {
  var compactLong: SignPattern
  var compactShort: SignPattern
  var scientific: SignPattern
  var standard: SignPattern
}

object NotationPattern {
  @scala.inline
  def apply(
    compactLong: SignPattern,
    compactShort: SignPattern,
    scientific: SignPattern,
    standard: SignPattern
  ): NotationPattern = {
    val __obj = js.Dynamic.literal(compactLong = compactLong.asInstanceOf[js.Any], compactShort = compactShort.asInstanceOf[js.Any], scientific = scientific.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NotationPattern]
  }
}

