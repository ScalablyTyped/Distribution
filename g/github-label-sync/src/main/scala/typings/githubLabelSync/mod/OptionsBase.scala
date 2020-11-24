package typings.githubLabelSync.mod

import typings.githubLabelSync.anon.Diff
import typings.githubLabelSync.anon.Info
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsBase extends js.Object {
  
  var allowAddedLabels: js.UndefOr[Boolean] = js.native
  
  var dryRun: js.UndefOr[Boolean] = js.native
  
  var format: js.UndefOr[Diff] = js.native
  
  var labels: js.Array[LabelInfo] = js.native
  
  var log: js.UndefOr[Info] = js.native
}
object OptionsBase {
  
  @scala.inline
  def apply(labels: js.Array[LabelInfo]): OptionsBase = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsBase]
  }
  
  @scala.inline
  implicit class OptionsBaseOps[Self <: OptionsBase] (val x: Self) extends AnyVal {
    
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
    def setLabelsVarargs(value: LabelInfo*): Self = this.set("labels", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: js.Array[LabelInfo]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowAddedLabels(value: Boolean): Self = this.set("allowAddedLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAddedLabels: Self = this.set("allowAddedLabels", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("dryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("dryRun", js.undefined)
    
    @scala.inline
    def setFormat(value: Diff): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setLog(value: Info): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
  }
}
