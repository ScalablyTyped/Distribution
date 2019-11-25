package typings.figlet.figletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontOptions extends js.Object {
  var baseline: Double
  var codeTagCount: Double | Null
  var fittingRules: FittingRules
  var fullLayout: Double | Null
  var hardBlank: String
  var height: Double
  var maxLength: Double
  var numCommentLines: Double
  var oldLayout: Double
  var printDirection: PrintDirection
}

object FontOptions {
  @scala.inline
  def apply(
    baseline: Double,
    fittingRules: FittingRules,
    hardBlank: String,
    height: Double,
    maxLength: Double,
    numCommentLines: Double,
    oldLayout: Double,
    printDirection: PrintDirection,
    codeTagCount: Int | Double = null,
    fullLayout: Int | Double = null
  ): FontOptions = {
    val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], fittingRules = fittingRules.asInstanceOf[js.Any], hardBlank = hardBlank.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], numCommentLines = numCommentLines.asInstanceOf[js.Any], oldLayout = oldLayout.asInstanceOf[js.Any], printDirection = printDirection.asInstanceOf[js.Any])
    if (codeTagCount != null) __obj.updateDynamic("codeTagCount")(codeTagCount.asInstanceOf[js.Any])
    if (fullLayout != null) __obj.updateDynamic("fullLayout")(fullLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontOptions]
  }
}

