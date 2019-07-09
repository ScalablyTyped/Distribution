package typings
package diff2htmlLib.Diff2HtmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var inputFormat: js.UndefOr[diff2htmlLib.diff2htmlLibStrings.diff | diff2htmlLib.diff2htmlLibStrings.json] = js.undefined
  var matchWordsThreshold: js.UndefOr[scala.Double] = js.undefined
  var matching: js.UndefOr[
    diff2htmlLib.diff2htmlLibStrings.lines | diff2htmlLib.diff2htmlLibStrings.words | diff2htmlLib.diff2htmlLibStrings.none
  ] = js.undefined
  var matchingMaxComparisons: js.UndefOr[scala.Double] = js.undefined
  var maxLineLengthHighlight: js.UndefOr[scala.Double] = js.undefined
  var maxLineSizeInBlockForComparison: js.UndefOr[scala.Double] = js.undefined
  var outputFormat: js.UndefOr[
    diff2htmlLib.diff2htmlLibStrings.`line-by-line` | diff2htmlLib.diff2htmlLibStrings.`side-by-side`
  ] = js.undefined
  var rawTemplates: js.UndefOr[js.Object] = js.undefined
  var renderNothingWhenEmpty: js.UndefOr[scala.Boolean] = js.undefined
  var showFiles: js.UndefOr[scala.Boolean] = js.undefined
  var templates: js.UndefOr[js.Object] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    inputFormat: diff2htmlLib.diff2htmlLibStrings.diff | diff2htmlLib.diff2htmlLibStrings.json = null,
    matchWordsThreshold: scala.Int | scala.Double = null,
    matching: diff2htmlLib.diff2htmlLibStrings.lines | diff2htmlLib.diff2htmlLibStrings.words | diff2htmlLib.diff2htmlLibStrings.none = null,
    matchingMaxComparisons: scala.Int | scala.Double = null,
    maxLineLengthHighlight: scala.Int | scala.Double = null,
    maxLineSizeInBlockForComparison: scala.Int | scala.Double = null,
    outputFormat: diff2htmlLib.diff2htmlLibStrings.`line-by-line` | diff2htmlLib.diff2htmlLibStrings.`side-by-side` = null,
    rawTemplates: js.Object = null,
    renderNothingWhenEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    showFiles: js.UndefOr[scala.Boolean] = js.undefined,
    templates: js.Object = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (inputFormat != null) __obj.updateDynamic("inputFormat")(inputFormat.asInstanceOf[js.Any])
    if (matchWordsThreshold != null) __obj.updateDynamic("matchWordsThreshold")(matchWordsThreshold.asInstanceOf[js.Any])
    if (matching != null) __obj.updateDynamic("matching")(matching.asInstanceOf[js.Any])
    if (matchingMaxComparisons != null) __obj.updateDynamic("matchingMaxComparisons")(matchingMaxComparisons.asInstanceOf[js.Any])
    if (maxLineLengthHighlight != null) __obj.updateDynamic("maxLineLengthHighlight")(maxLineLengthHighlight.asInstanceOf[js.Any])
    if (maxLineSizeInBlockForComparison != null) __obj.updateDynamic("maxLineSizeInBlockForComparison")(maxLineSizeInBlockForComparison.asInstanceOf[js.Any])
    if (outputFormat != null) __obj.updateDynamic("outputFormat")(outputFormat.asInstanceOf[js.Any])
    if (rawTemplates != null) __obj.updateDynamic("rawTemplates")(rawTemplates)
    if (!js.isUndefined(renderNothingWhenEmpty)) __obj.updateDynamic("renderNothingWhenEmpty")(renderNothingWhenEmpty)
    if (!js.isUndefined(showFiles)) __obj.updateDynamic("showFiles")(showFiles)
    if (templates != null) __obj.updateDynamic("templates")(templates)
    __obj.asInstanceOf[Options]
  }
}

