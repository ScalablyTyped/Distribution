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

@js.native
trait Options extends js.Object {
  var inputFormat: js.UndefOr[diff | json] = js.native
  var matchWordsThreshold: js.UndefOr[Double] = js.native
  var matching: js.UndefOr[lines | words | none] = js.native
  var matchingMaxComparisons: js.UndefOr[Double] = js.native
  var maxLineLengthHighlight: js.UndefOr[Double] = js.native
  var maxLineSizeInBlockForComparison: js.UndefOr[Double] = js.native
  var outputFormat: js.UndefOr[`line-by-line` | `side-by-side`] = js.native
  var rawTemplates: js.UndefOr[js.Object] = js.native
  var renderNothingWhenEmpty: js.UndefOr[Boolean] = js.native
  var showFiles: js.UndefOr[Boolean] = js.native
  var templates: js.UndefOr[js.Object] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInputFormat(value: diff | json): Self = this.set("inputFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputFormat: Self = this.set("inputFormat", js.undefined)
    @scala.inline
    def setMatchWordsThreshold(value: Double): Self = this.set("matchWordsThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchWordsThreshold: Self = this.set("matchWordsThreshold", js.undefined)
    @scala.inline
    def setMatching(value: lines | words | none): Self = this.set("matching", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatching: Self = this.set("matching", js.undefined)
    @scala.inline
    def setMatchingMaxComparisons(value: Double): Self = this.set("matchingMaxComparisons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchingMaxComparisons: Self = this.set("matchingMaxComparisons", js.undefined)
    @scala.inline
    def setMaxLineLengthHighlight(value: Double): Self = this.set("maxLineLengthHighlight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLineLengthHighlight: Self = this.set("maxLineLengthHighlight", js.undefined)
    @scala.inline
    def setMaxLineSizeInBlockForComparison(value: Double): Self = this.set("maxLineSizeInBlockForComparison", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLineSizeInBlockForComparison: Self = this.set("maxLineSizeInBlockForComparison", js.undefined)
    @scala.inline
    def setOutputFormat(value: `line-by-line` | `side-by-side`): Self = this.set("outputFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputFormat: Self = this.set("outputFormat", js.undefined)
    @scala.inline
    def setRawTemplates(value: js.Object): Self = this.set("rawTemplates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawTemplates: Self = this.set("rawTemplates", js.undefined)
    @scala.inline
    def setRenderNothingWhenEmpty(value: Boolean): Self = this.set("renderNothingWhenEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderNothingWhenEmpty: Self = this.set("renderNothingWhenEmpty", js.undefined)
    @scala.inline
    def setShowFiles(value: Boolean): Self = this.set("showFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowFiles: Self = this.set("showFiles", js.undefined)
    @scala.inline
    def setTemplates(value: js.Object): Self = this.set("templates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplates: Self = this.set("templates", js.undefined)
  }
  
}

