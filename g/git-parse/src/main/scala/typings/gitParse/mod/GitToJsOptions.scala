package typings.gitParse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitToJsOptions extends js.Object {
  
  var sinceCommit: js.UndefOr[String] = js.native
}
object GitToJsOptions {
  
  @scala.inline
  def apply(): GitToJsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GitToJsOptions]
  }
  
  @scala.inline
  implicit class GitToJsOptionsOps[Self <: GitToJsOptions] (val x: Self) extends AnyVal {
    
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
    def setSinceCommit(value: String): Self = this.set("sinceCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSinceCommit: Self = this.set("sinceCommit", js.undefined)
  }
}
