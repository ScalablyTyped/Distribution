package typings.diff2html.Diff2Html

import typings.diff2html.diff2htmlStrings.`line-by-line`
import typings.diff2html.diff2htmlStrings.`side-by-side`
import typings.diff2html.diff2htmlStrings.diff
import typings.diff2html.diff2htmlStrings.json
import typings.diff2html.diff2htmlStrings.lines
import typings.diff2html.diff2htmlStrings.none
import typings.diff2html.diff2htmlStrings.words
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var inputFormat: js.UndefOr[diff | json] = js.undefined
  var matchWordsThreshold: js.UndefOr[Double] = js.undefined
  var matching: js.UndefOr[lines | words | none] = js.undefined
  var matchingMaxComparisons: js.UndefOr[Double] = js.undefined
  var maxLineLengthHighlight: js.UndefOr[Double] = js.undefined
  var maxLineSizeInBlockForComparison: js.UndefOr[Double] = js.undefined
  var outputFormat: js.UndefOr[`line-by-line` | `side-by-side`] = js.undefined
  var rawTemplates: js.UndefOr[js.Object] = js.undefined
  var renderNothingWhenEmpty: js.UndefOr[Boolean] = js.undefined
  var showFiles: js.UndefOr[Boolean] = js.undefined
  var templates: js.UndefOr[js.Object] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    inputFormat: diff | json = null,
    matchWordsThreshold: js.UndefOr[Double] = js.undefined,
    matching: lines | words | none = null,
    matchingMaxComparisons: js.UndefOr[Double] = js.undefined,
    maxLineLengthHighlight: js.UndefOr[Double] = js.undefined,
    maxLineSizeInBlockForComparison: js.UndefOr[Double] = js.undefined,
    outputFormat: `line-by-line` | `side-by-side` = null,
    rawTemplates: js.Object = null,
    renderNothingWhenEmpty: js.UndefOr[Boolean] = js.undefined,
    showFiles: js.UndefOr[Boolean] = js.undefined,
    templates: js.Object = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (inputFormat != null) __obj.updateDynamic("inputFormat")(inputFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(matchWordsThreshold)) __obj.updateDynamic("matchWordsThreshold")(matchWordsThreshold.get.asInstanceOf[js.Any])
    if (matching != null) __obj.updateDynamic("matching")(matching.asInstanceOf[js.Any])
    if (!js.isUndefined(matchingMaxComparisons)) __obj.updateDynamic("matchingMaxComparisons")(matchingMaxComparisons.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLineLengthHighlight)) __obj.updateDynamic("maxLineLengthHighlight")(maxLineLengthHighlight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLineSizeInBlockForComparison)) __obj.updateDynamic("maxLineSizeInBlockForComparison")(maxLineSizeInBlockForComparison.get.asInstanceOf[js.Any])
    if (outputFormat != null) __obj.updateDynamic("outputFormat")(outputFormat.asInstanceOf[js.Any])
    if (rawTemplates != null) __obj.updateDynamic("rawTemplates")(rawTemplates.asInstanceOf[js.Any])
    if (!js.isUndefined(renderNothingWhenEmpty)) __obj.updateDynamic("renderNothingWhenEmpty")(renderNothingWhenEmpty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showFiles)) __obj.updateDynamic("showFiles")(showFiles.get.asInstanceOf[js.Any])
    if (templates != null) __obj.updateDynamic("templates")(templates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

