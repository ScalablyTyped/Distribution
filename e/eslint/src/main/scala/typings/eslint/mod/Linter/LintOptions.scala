package typings.eslint.mod.Linter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LintOptions extends js.Object {
  var allowInlineConfig: js.UndefOr[Boolean] = js.native
  var disableFixes: js.UndefOr[Boolean] = js.native
  var filename: js.UndefOr[String] = js.native
  var filterCodeBlock: js.UndefOr[Boolean] = js.native
  var postprocess: js.UndefOr[
    js.Function1[/* problemLists */ js.Array[js.Array[LintMessage]], js.Array[LintMessage]]
  ] = js.native
  var preprocess: js.UndefOr[js.Function1[/* code */ String, js.Array[String]]] = js.native
  var reportUnusedDisableDirectives: js.UndefOr[Boolean] = js.native
}

object LintOptions {
  @scala.inline
  def apply(): LintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LintOptions]
  }
  @scala.inline
  implicit class LintOptionsOps[Self <: LintOptions] (val x: Self) extends AnyVal {
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
    def setAllowInlineConfig(value: Boolean): Self = this.set("allowInlineConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowInlineConfig: Self = this.set("allowInlineConfig", js.undefined)
    @scala.inline
    def setDisableFixes(value: Boolean): Self = this.set("disableFixes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableFixes: Self = this.set("disableFixes", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setFilterCodeBlock(value: Boolean): Self = this.set("filterCodeBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterCodeBlock: Self = this.set("filterCodeBlock", js.undefined)
    @scala.inline
    def setPostprocess(value: /* problemLists */ js.Array[js.Array[LintMessage]] => js.Array[LintMessage]): Self = this.set("postprocess", js.Any.fromFunction1(value))
    @scala.inline
    def deletePostprocess: Self = this.set("postprocess", js.undefined)
    @scala.inline
    def setPreprocess(value: /* code */ String => js.Array[String]): Self = this.set("preprocess", js.Any.fromFunction1(value))
    @scala.inline
    def deletePreprocess: Self = this.set("preprocess", js.undefined)
    @scala.inline
    def setReportUnusedDisableDirectives(value: Boolean): Self = this.set("reportUnusedDisableDirectives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportUnusedDisableDirectives: Self = this.set("reportUnusedDisableDirectives", js.undefined)
  }
  
}

