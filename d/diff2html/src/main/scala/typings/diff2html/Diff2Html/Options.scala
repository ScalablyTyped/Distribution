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
    matchWordsThreshold: Int | Double = null,
    matching: lines | words | none = null,
    matchingMaxComparisons: Int | Double = null,
    maxLineLengthHighlight: Int | Double = null,
    maxLineSizeInBlockForComparison: Int | Double = null,
    outputFormat: `line-by-line` | `side-by-side` = null,
    rawTemplates: js.Object = null,
    renderNothingWhenEmpty: js.UndefOr[Boolean] = js.undefined,
    showFiles: js.UndefOr[Boolean] = js.undefined,
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
    if (rawTemplates != null) __obj.updateDynamic("rawTemplates")(rawTemplates.asInstanceOf[js.Any])
    if (!js.isUndefined(renderNothingWhenEmpty)) __obj.updateDynamic("renderNothingWhenEmpty")(renderNothingWhenEmpty.asInstanceOf[js.Any])
    if (!js.isUndefined(showFiles)) __obj.updateDynamic("showFiles")(showFiles.asInstanceOf[js.Any])
    if (templates != null) __obj.updateDynamic("templates")(templates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

