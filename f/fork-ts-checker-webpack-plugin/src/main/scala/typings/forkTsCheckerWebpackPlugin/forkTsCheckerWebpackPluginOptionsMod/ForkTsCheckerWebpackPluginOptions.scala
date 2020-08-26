package typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginOptionsMod

import typings.forkTsCheckerWebpackPlugin.esLintReporterOptionsMod.EsLintReporterOptions
import typings.forkTsCheckerWebpackPlugin.formatterOptionsMod.FormatterOptions
import typings.forkTsCheckerWebpackPlugin.issueOptionsMod.IssueOptions
import typings.forkTsCheckerWebpackPlugin.loggerOptionsMod.LoggerOptions
import typings.forkTsCheckerWebpackPlugin.typeScriptReporterOptionsMod.TypeScriptReporterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForkTsCheckerWebpackPluginOptions extends js.Object {
  var async: js.UndefOr[Boolean] = js.native
  var eslint: js.UndefOr[EsLintReporterOptions] = js.native
  var formatter: js.UndefOr[FormatterOptions] = js.native
  var issue: js.UndefOr[IssueOptions] = js.native
  var logger: js.UndefOr[LoggerOptions] = js.native
  var typescript: js.UndefOr[TypeScriptReporterOptions] = js.native
}

object ForkTsCheckerWebpackPluginOptions {
  @scala.inline
  def apply(): ForkTsCheckerWebpackPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForkTsCheckerWebpackPluginOptions]
  }
  @scala.inline
  implicit class ForkTsCheckerWebpackPluginOptionsOps[Self <: ForkTsCheckerWebpackPluginOptions] (val x: Self) extends AnyVal {
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setEslint(value: EsLintReporterOptions): Self = this.set("eslint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEslint: Self = this.set("eslint", js.undefined)
    @scala.inline
    def setFormatter(value: FormatterOptions): Self = this.set("formatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setIssue(value: IssueOptions): Self = this.set("issue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssue: Self = this.set("issue", js.undefined)
    @scala.inline
    def setLogger(value: LoggerOptions): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setTypescript(value: TypeScriptReporterOptions): Self = this.set("typescript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypescript: Self = this.set("typescript", js.undefined)
  }
  
}

