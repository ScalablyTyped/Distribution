package typings
package diff2htmlLib.Diff2HtmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var inputFormat: js.UndefOr[java.lang.String] = js.undefined
  var matchWordsThreshold: js.UndefOr[scala.Double] = js.undefined
  var matching: js.UndefOr[java.lang.String] = js.undefined
  var matchingMaxComparisons: js.UndefOr[scala.Double] = js.undefined
  var outputFormat: js.UndefOr[java.lang.String] = js.undefined
  var showFiles: js.UndefOr[scala.Boolean] = js.undefined
  var synchronisedScroll: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    inputFormat: java.lang.String = null,
    matchWordsThreshold: scala.Int | scala.Double = null,
    matching: java.lang.String = null,
    matchingMaxComparisons: scala.Int | scala.Double = null,
    outputFormat: java.lang.String = null,
    showFiles: js.UndefOr[scala.Boolean] = js.undefined,
    synchronisedScroll: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (inputFormat != null) __obj.updateDynamic("inputFormat")(inputFormat)
    if (matchWordsThreshold != null) __obj.updateDynamic("matchWordsThreshold")(matchWordsThreshold.asInstanceOf[js.Any])
    if (matching != null) __obj.updateDynamic("matching")(matching)
    if (matchingMaxComparisons != null) __obj.updateDynamic("matchingMaxComparisons")(matchingMaxComparisons.asInstanceOf[js.Any])
    if (outputFormat != null) __obj.updateDynamic("outputFormat")(outputFormat)
    if (!js.isUndefined(showFiles)) __obj.updateDynamic("showFiles")(showFiles)
    if (!js.isUndefined(synchronisedScroll)) __obj.updateDynamic("synchronisedScroll")(synchronisedScroll)
    __obj.asInstanceOf[Options]
  }
}

