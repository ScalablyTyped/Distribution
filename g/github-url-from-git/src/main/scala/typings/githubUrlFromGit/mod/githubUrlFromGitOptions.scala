package typings.githubUrlFromGit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait githubUrlFromGitOptions extends js.Object {
  
  /**
    * additional URLs that should be treated as GitHub repos
    */
  var extraBaseUrls: js.UndefOr[js.Array[String]] = js.native
}
object githubUrlFromGitOptions {
  
  @scala.inline
  def apply(): githubUrlFromGitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[githubUrlFromGitOptions]
  }
  
  @scala.inline
  implicit class githubUrlFromGitOptionsOps[Self <: githubUrlFromGitOptions] (val x: Self) extends AnyVal {
    
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
    def setExtraBaseUrlsVarargs(value: String*): Self = this.set("extraBaseUrls", js.Array(value :_*))
    
    @scala.inline
    def setExtraBaseUrls(value: js.Array[String]): Self = this.set("extraBaseUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraBaseUrls: Self = this.set("extraBaseUrls", js.undefined)
  }
}
