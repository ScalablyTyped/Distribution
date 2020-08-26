package typings.eslint.mod.Rule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportDescriptorOptions extends ReportDescriptorOptionsBase {
  var suggest: js.UndefOr[js.Array[SuggestionReportDescriptor] | Null] = js.native
}

object ReportDescriptorOptions {
  @scala.inline
  def apply(): ReportDescriptorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportDescriptorOptions]
  }
  @scala.inline
  implicit class ReportDescriptorOptionsOps[Self <: ReportDescriptorOptions] (val x: Self) extends AnyVal {
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
    def setSuggestVarargs(value: SuggestionReportDescriptor*): Self = this.set("suggest", js.Array(value :_*))
    @scala.inline
    def setSuggest(value: js.Array[SuggestionReportDescriptor]): Self = this.set("suggest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggest: Self = this.set("suggest", js.undefined)
    @scala.inline
    def setSuggestNull: Self = this.set("suggest", null)
  }
  
}

