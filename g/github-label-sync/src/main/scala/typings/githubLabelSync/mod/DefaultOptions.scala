package typings.githubLabelSync.mod

import typings.githubLabelSync.anon.Diff
import typings.githubLabelSync.anon.Info
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Required<github-label-sync.github-label-sync.OptionsBase> */
@js.native
trait DefaultOptions extends js.Object {
  
  var accessToken: Null = js.native
  
  var allowAddedLabels: Boolean = js.native
  
  var dryRun: Boolean = js.native
  
  var endpoint: Null = js.native
  
  var format: Diff = js.native
  
  var labels: js.Array[LabelInfo] = js.native
  
  var log: Info = js.native
  
  var repo: Null = js.native
}
object DefaultOptions {
  
  @scala.inline
  def apply(
    accessToken: Null,
    allowAddedLabels: Boolean,
    dryRun: Boolean,
    endpoint: Null,
    format: Diff,
    labels: js.Array[LabelInfo],
    log: Info,
    repo: Null
  ): DefaultOptions = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], allowAddedLabels = allowAddedLabels.asInstanceOf[js.Any], dryRun = dryRun.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultOptions]
  }
  
  @scala.inline
  implicit class DefaultOptionsOps[Self <: DefaultOptions] (val x: Self) extends AnyVal {
    
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
    def setAccessToken(value: Null): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowAddedLabels(value: Boolean): Self = this.set("allowAddedLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("dryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpoint(value: Null): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: Diff): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsVarargs(value: LabelInfo*): Self = this.set("labels", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: js.Array[LabelInfo]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog(value: Info): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: Null): Self = this.set("repo", value.asInstanceOf[js.Any])
  }
}
